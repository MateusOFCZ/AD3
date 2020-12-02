package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginDAO {    
    public boolean Entrar(String Email, String Senha) {
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
                
                if(res.getInt("nivel_acesso") == 0){
                    JOptionPane.showMessageDialog(null, "Conta suspendida por um colaborador!", "Erro", JOptionPane.WARNING_MESSAGE);
                    return false;
                } else{
                    return true;
                }
            }else{
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválido!", "Erro", JOptionPane.WARNING_MESSAGE);
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