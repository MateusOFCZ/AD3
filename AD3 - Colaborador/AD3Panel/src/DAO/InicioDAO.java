package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class InicioDAO {
    
    public ResultSet getInfos(int Quantidade){
        VIEW.Inicio Inicio = new VIEW.Inicio();
        String SQL = "SELECT * FROM tb_denuncia WHERE status = 1 ORDER BY prioridade DESC, id ASC LIMIT ?";
        
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(SQL);
            stmt.setInt(1, Quantidade);
            
            ResultSet res = stmt.executeQuery();
            
            if(res.next()){
                return res;
            } else {
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