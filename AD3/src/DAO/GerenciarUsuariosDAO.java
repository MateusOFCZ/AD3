package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerenciarUsuariosDAO {
    
    public boolean Salvar(int Score, int NivelAcesso, int ID, int Colaborador) {
        String SQL = "UPDATE tb_usuario SET score = ?, nivel_acesso = ? WHERE id = ? and ID != ?";
        
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(SQL);
            stmt.setInt(1, Score);
            stmt.setInt(2, NivelAcesso);
            stmt.setInt(3, ID);
            stmt.setInt(4, Colaborador);

            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    public DefaultTableModel ListarUsuarios(String SQL) {
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(SQL);
            
            ResultSet res = stmt.executeQuery();

            ResultSetMetaData metaData = res.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            Vector columnNames = new Vector();

            for (int column = 0; column < numberOfColumns; column++) {
                columnNames.addElement(metaData.getColumnLabel(column + 1));
            }

            Vector rows = new Vector();

            while (res.next()) {
                Vector newRow = new Vector();

                for (int i = 1; i <= numberOfColumns; i++) {
                    newRow.addElement(res.getObject(i));
                }

                rows.addElement(newRow);
            }

            return new DefaultTableModel(rows, columnNames);
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    public DefaultTableModel ListarUsuarios(int Colaborador) {
            String SQL = "SELECT id, email, nome_completo, cpf, rg, endereco, telefone, score, nivel_acesso FROM tb_usuario WHERE nivel_acesso <= 1 and ID != ?";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(SQL);
            stmt.setInt(1, Colaborador);
            
            ResultSet res = stmt.executeQuery();

            ResultSetMetaData metaData = res.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            Vector columnNames = new Vector();

            for (int column = 0; column < numberOfColumns; column++) {
                columnNames.addElement(metaData.getColumnLabel(column + 1));
            }

            Vector rows = new Vector();

            while (res.next()) {
                Vector newRow = new Vector();

                for (int i = 1; i <= numberOfColumns; i++) {
                    newRow.addElement(res.getObject(i));
                }

                rows.addElement(newRow);
            }

            return new DefaultTableModel(rows, columnNames);
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