package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConfiguracoesDAO {
    
    public boolean VerificarConta (String Email, String CPF, String RG, String Telefone, int ID){
        String SQL = "SELECT * FROM tb_usuario WHERE email = ? and id != ?";
        String SQL0 = "SELECT * FROM tb_usuario WHERE cpf = ? and id != ?";
        String SQL1 = "SELECT * FROM tb_usuario WHERE rg = ? and id != ?";
        
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(SQL);
            stmt.setString(1, Email);
            stmt.setInt(2, ID);
            
            ResultSet res = stmt.executeQuery();
            if(res.next()){
                JOptionPane.showMessageDialog(null, "E-Mail em uso!", "Erro", JOptionPane.WARNING_MESSAGE);
            } else {
                PreparedStatement stmt0 = this.getConexao().prepareStatement(SQL0);
                stmt0.setString(1, CPF);
                stmt0.setInt(2, ID);

                ResultSet res0 = stmt0.executeQuery();
                if(res0.next()){
                    JOptionPane.showMessageDialog(null, "CPF em uso!", "Erro", JOptionPane.WARNING_MESSAGE);
                } else {
                    PreparedStatement stmt1 = this.getConexao().prepareStatement(SQL1);
                    stmt1.setString(1, RG);
                    stmt1.setInt(2, ID);

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
    
    public boolean VerificarSenha (String Email, String Senha) {
        MODEL.LoginM LoginM = new MODEL.LoginM();
        String SQL = "SELECT * FROM tb_usuario WHERE email = ? and Senha = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(SQL);
            stmt.setString(1, Email);
            stmt.setString(2, Senha);

            ResultSet res = stmt.executeQuery();
            
            if(res.next()){
                LoginM.setID(res.getString("id"));
                LoginM.setEMail(res.getString("email"));
                LoginM.setSenha(res.getString("senha"));
                LoginM.setNomeCompleto(res.getString("nome_completo"));
                LoginM.setCPF(res.getString("cpf"));
                LoginM.setRG(res.getString("rg"));
                LoginM.setEndereco(res.getString("endereco"));
                LoginM.setTelefone(res.getString("telefone"));
                LoginM.setScore(res.getString("score"));
                LoginM.setNivelAcesso(res.getInt("nivel_acesso"));
                
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Senha inválida!", "Erro", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    public boolean Salvar(String Email, String Senha, String NomeCompleto, String CPF, String RG, String Endereco, String Telefone, int ID) {
        String SQL = "UPDATE tb_usuario SET email= ?, nome_completo = ?, cpf = ?, rg = ?, endereco = ?, telefone= ? WHERE id = ?";
        
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(SQL);
            stmt.setString(1, Email);
            stmt.setString(2, NomeCompleto);
            stmt.setString(3, CPF);
            stmt.setString(4, RG);
            stmt.setString(5, Endereco);
            stmt.setString(6, Telefone);
            stmt.setInt(7, ID);

            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    public boolean AtualizarDados(String Email, String Senha) {
        MODEL.LoginM LoginM = new MODEL.LoginM();
        String SQL = "SELECT * FROM tb_usuario WHERE email = ? and Senha = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(SQL);
            stmt.setString(1, Email);
            stmt.setString(2, Senha);

            ResultSet res = stmt.executeQuery();
            
            if(res.next()){
                LoginM.setID(res.getString("id"));
                LoginM.setEMail(res.getString("email"));
                LoginM.setSenha(res.getString("senha"));
                LoginM.setNomeCompleto(res.getString("nome_completo"));
                LoginM.setCPF(res.getString("cpf"));
                LoginM.setRG(res.getString("rg"));
                LoginM.setEndereco(res.getString("endereco"));
                LoginM.setTelefone(res.getString("telefone"));
                LoginM.setScore(res.getString("score"));
                LoginM.setNivelAcesso(res.getInt("nivel_acesso"));
                
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Usuário ou Senha inválido!", "Erro", JOptionPane.WARNING_MESSAGE);
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
                System.out.println("Status: Conectado");
            } else {
                JOptionPane.showMessageDialog(null, "Erro: Não foi possível conectar!", "Status", JOptionPane.ERROR_MESSAGE);
            }

            return connection;

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro: Driver não encontrado!", "Status", JOptionPane.ERROR_MESSAGE);
            return null;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: Driver Não Foi Possível Conectar", "Status", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}