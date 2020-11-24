package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConfiguracoesDAO {
    public boolean VerificarConta (String Email, String CPF, String RG, String Telefone, String ID, String Senha){
        String SQL = "SELECT * FROM tb_usuario WHERE email = ? and id != ?";
        String SQL0 = "SELECT * FROM tb_usuario WHERE cpf = ? and id != ?";
        String SQL1 = "SELECT * FROM tb_usuario WHERE rg = ? and id != ?";
        String SQL2 = "SELECT * FROM tb_usuario WHERE id = ?";
        
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(SQL);
            stmt.setString(1, Email);
            stmt.setString(2, ID);
            
            ResultSet res = stmt.executeQuery();
            if(res.next()){
                JOptionPane.showMessageDialog(null, "E-Mail em uso!", "Erro", JOptionPane.WARNING_MESSAGE);
            } else {
                PreparedStatement stmt0 = this.getConexao().prepareStatement(SQL0);
                stmt0.setString(1, CPF);
                stmt0.setString(2, ID);

                ResultSet res0 = stmt0.executeQuery();
                if(res0.next()){
                    JOptionPane.showMessageDialog(null, "CPF em uso!", "Erro", JOptionPane.WARNING_MESSAGE);
                } else {
                    PreparedStatement stmt1 = this.getConexao().prepareStatement(SQL1);
                    stmt1.setString(1, RG);
                    stmt1.setString(2, ID);

                    ResultSet res1 = stmt1.executeQuery();
                    if(res1.next()){
                        JOptionPane.showMessageDialog(null, "RG em uso!", "Erro", JOptionPane.WARNING_MESSAGE);
                    } else {
                        PreparedStatement stmt2 = this.getConexao().prepareStatement(SQL2);
                        stmt2.setString(1, ID);
                        
                        ResultSet res2 = stmt2.executeQuery();
                        if(res2.next()){
                            if(res2.getString("senha").equals(Senha)){
                                stmt.close();
                                stmt0.close();
                                stmt1.close();
                                stmt2.close();
                                return true;
                            } else {
                                JOptionPane.showMessageDialog(null, "Senha inválida!", "Erro", JOptionPane.WARNING_MESSAGE);
                            }
                        }
                    }
                }
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return false;
    }
    
    public boolean AtualizarInfos(String Email, String NomeCompleto, String CPF, String RG, String Endereco, String Telefone, String ID) {
        String SQL = "UPDATE tb_usuario SET email = ?, nome_completo = ?, cpf = ?, rg = ?, endereco = ?, telefone = ? WHERE ID = ?";
        
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(SQL);
            stmt.setString(1, Email);
            stmt.setString(2, NomeCompleto);
            stmt.setString(3, CPF);
            stmt.setString(4, RG);
            stmt.setString(5, Endereco);
            stmt.setString(6, Telefone);
            stmt.setString(7, ID);

            stmt.execute();
            stmt.close();

            return true;
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    public boolean ColetarInfos(String ID){
            String SQL = "SELECT * FROM tb_usuario WHERE id = ?";

            try {
                PreparedStatement stmt = this.getConexao().prepareStatement(SQL);
                stmt.setString(1, ID);

                ResultSet res = stmt.executeQuery();

                if(res.next()){
                    MODEL.Configuracoes Configuracoes = new MODEL.Configuracoes();
                    Configuracoes.setEmail(res.getString("email"));
                    Configuracoes.setNomeCompleto(res.getString("nome_completo"));
                    Configuracoes.setCPF(res.getString("cpf"));
                    Configuracoes.setRG(res.getString("rg"));
                    Configuracoes.setEndereco(res.getString("endereco"));
                    Configuracoes.setTelefone(res.getString("telefone"));
                    return true;
                }else{
                    return false;
                }
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