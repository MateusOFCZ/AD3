package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AD3PanelDAO {
    
        public boolean ColetarInfos(String ID){
            String SQL = "SELECT * FROM tb_usuario WHERE id = ?";

            try {
                PreparedStatement stmt = this.getConexao().prepareStatement(SQL);
                stmt.setString(1, ID);

                ResultSet res = stmt.executeQuery();

                if(res.next()){
                    MODEL.AD3Panel Principal = new MODEL.AD3Panel();
                    Principal.setEMail(res.getString("email"));
                    Principal.setNomeCompleto(res.getString("nome_completo"));
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
