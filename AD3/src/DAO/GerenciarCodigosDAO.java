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

public class GerenciarCodigosDAO {
    
    public boolean RegistrarCodigo(int Usos, int NivelAcesso, String Codigo) {
        String SQL = "INSERT INTO tb_registro_codigos (usos, nivel_acesso, codigo) VALUES (?, ?, ?)";
        
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(SQL);
            stmt.setInt(1, Usos);
            stmt.setInt(2, NivelAcesso);
            stmt.setString(3, Codigo);

            stmt.execute();
            stmt.close();

            return true;
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    public boolean Verificar(String Codigo) {
            String SQL = "SELECT * FROM tb_registro_codigos WHERE codigo = '" + Codigo + "'";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(SQL);
            
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Código já existente!", "Erro", JOptionPane.WARNING_MESSAGE);
            } else {
                stmt.execute();
                stmt.close();
                return true;
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return false;
    }
    
    public boolean Deletar(int ID) {
        String SQL = "DELETE FROM tb_registro_codigos WHERE id = ?";
        
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(SQL);
            stmt.setInt(1, ID);

            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    public boolean Salvar(int Usos, int NivelAcesso, int ID, String Codigo) {
        String SQL = "UPDATE tb_registro_codigos SET usos = ?, nivel_acesso = ?, codigo = ? WHERE id = ?";
        
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(SQL);
            stmt.setInt(1, Usos);
            stmt.setInt(2, NivelAcesso);
            stmt.setString(3, Codigo);
            stmt.setInt(4, ID);

            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    public DefaultTableModel ListarCodigos(String SQL) {
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
    
    public DefaultTableModel ListarCodigos() {
            String SQL = "SELECT * FROM tb_registro_codigos";
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