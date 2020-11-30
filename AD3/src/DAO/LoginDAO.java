package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginDAO {
    public String Entrar(String Email, String Senha) {
        String SQL = "SELECT * FROM tb_usuario WHERE email = ? and Senha = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(SQL);
            stmt.setString(1, Email);
            stmt.setString(2, Senha);

            ResultSet res = stmt.executeQuery();
            
            if(res.next()){
                if(res.getString("nivel_acesso").equals("") || res.getString("nivel_acesso").equals("0") || res.getString("nivel_acesso") == null || res.getString("nivel_acesso") == "1"){
                    JOptionPane.showMessageDialog(null, "Esta conta não tem permissão para acessar o sistema!", "Erro", JOptionPane.WARNING_MESSAGE);
                    return null;
                } else {
                    /*MODEL.AD3Panel AD3Panel = new MODEL.AD3Panel();
                    AD3Panel.setNivelAcesso(res.getInt("nivel_acesso"));
                    AD3Panel.setEMail(res.getString("email"));
                    AD3Panel.setID(res.getString("id"));*/
                    return res.getString("id");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Usuário ou Senha inválido!", "Erro", JOptionPane.WARNING_MESSAGE);
                return null;
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
                JOptionPane.showMessageDialog(null, "Erro: CN001", "Status", JOptionPane.ERROR_MESSAGE); // Não Foi Possível Conectar
            }

            return connection;

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro: CN002", "Status", JOptionPane.ERROR_MESSAGE); // Driver Não Encontrado
            return null;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: CN003", "Status", JOptionPane.ERROR_MESSAGE); // Driver Não Foi Possível Conectar
            return null;
        }
    }
}