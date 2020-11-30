package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class RegistroDAO {
    public boolean VerificarConta (String Email, String CPF, String RG, String Telefone){
        String SQL = "SELECT * FROM tb_usuario WHERE email = ?";
        String SQL0 = "SELECT * FROM tb_usuario WHERE cpf = ?";
        String SQL1 = "SELECT * FROM tb_usuario WHERE rg = ?";
        
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(SQL);
            stmt.setString(1, Email);
            
            ResultSet res = stmt.executeQuery();
            if(res.next()){
                JOptionPane.showMessageDialog(null, "E-Mail em uso!", "Erro", JOptionPane.WARNING_MESSAGE);
            } else {
                PreparedStatement stmt0 = this.getConexao().prepareStatement(SQL0);
                stmt0.setString(1, CPF);

                ResultSet res0 = stmt0.executeQuery();
                if(res0.next()){
                    JOptionPane.showMessageDialog(null, "CPF em uso!", "Erro", JOptionPane.WARNING_MESSAGE);
                } else {
                    PreparedStatement stmt1 = this.getConexao().prepareStatement(SQL1);
                    stmt1.setString(1, RG);

                    ResultSet res1 = stmt1.executeQuery();
                    if(res1.next()){
                        JOptionPane.showMessageDialog(null, "RG em uso!", "Erro", JOptionPane.WARNING_MESSAGE);
                    } else {
                        stmt.close();
                        stmt0.close();
                        stmt1.close();
                        return true;
                    }
                }
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return false;
    }
    
    public int VerificarCodigo(String Codigo) {
        String SQL = "SELECT * FROM tb_registro_codigos WHERE codigo = ?";
        String SQL0 = "UPDATE tb_registro_codigos set usos = ? WHERE id = ?";
        
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(SQL);
            stmt.setString(1, Codigo);

            ResultSet res = stmt.executeQuery();
            
            if(res.next()){
                if(res.getString("usos").equals("") || res.getString("usos").equals("0") || res.getString("usos").equals(null)){
                    JOptionPane.showMessageDialog(null, "Código Inválido ou Limite Excedido!", "Erro", JOptionPane.WARNING_MESSAGE);
                    return 0;
                } else {
                    try {
                        PreparedStatement stmt0 = this.getConexao().prepareStatement(SQL0);
                        stmt0.setInt(1, res.getInt("usos") - 1);
                        stmt0.setString(2, res.getString("id"));

                        stmt0.execute();
                        return res.getInt("nivel_acesso");
                    } catch (SQLException erro) {
                        throw new RuntimeException(erro);
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Código Inválido!", "Erro", JOptionPane.WARNING_MESSAGE);
                return 0;
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    public boolean Registrar(String Email, String Senha, String NomeCompleto, String CPF, String RG, String Endereco, String Telefone, int NivelAcesso) {
        String SQL = "INSERT INTO tb_usuario (email, senha, nome_completo, cpf, rg, endereco, telefone, nivel_acesso) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(SQL);
            stmt.setString(1, Email);
            stmt.setString(2, Senha);
            stmt.setString(3, NomeCompleto);
            stmt.setString(4, CPF);
            stmt.setString(5, RG);
            stmt.setString(6, Endereco);
            stmt.setString(7, Telefone);
            stmt.setInt(8, NivelAcesso);

            stmt.execute();
            stmt.close();

            return true;
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    public Connection getConexao() {

        Connection connection = null;

        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            String server = "213.190.6.127";
            String database = "u810777998_ad3";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "u810777998_ad3";
            String password = "f8SOsIilOL";

            connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Status: CN000"); // Conectado
            } else {
                JOptionPane.showConfirmDialog(null, "Erro: CN001", "Status", JOptionPane.ERROR_MESSAGE); // Não Foi Possível Conectar
            }

            return connection;

        } catch (ClassNotFoundException e) {
            JOptionPane.showConfirmDialog(null, "Erro: CN002", "Status", JOptionPane.ERROR_MESSAGE); // Driver Não Encontrado
            return null;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Erro: CN003", "Status", JOptionPane.ERROR_MESSAGE); // Driver Não Foi Possível Conectar
            return null;
        }
    }
}