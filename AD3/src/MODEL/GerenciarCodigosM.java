package MODEL;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerenciarCodigosM {
    
    public boolean Verificar (String Codigo){
        DAO.GerenciarCodigosDAO GerenciarCodigosDAO = new DAO.GerenciarCodigosDAO();
        
        boolean Verificado = GerenciarCodigosDAO.Verificar(Codigo);
        
        if(Verificado == true){
            return true;
        } else{
            return false;
        }
    }
    
    public boolean Adicionar (int Usos, int NivelAcesso, String Codigo){
        DAO.GerenciarCodigosDAO GerenciarCodigosDAO = new DAO.GerenciarCodigosDAO();
        
        boolean Verificado = this.Verificar(Codigo);
        if(Verificado == true){
            boolean Adicionado = GerenciarCodigosDAO.RegistrarCodigo(Usos, NivelAcesso, Codigo);
        
            if(Adicionado == true){
                return true;
            } else{
                return false;
            }
        } else{
            return false;
        }
    }
    
    public boolean Deletar (int ID){
        DAO.GerenciarCodigosDAO GerenciarCodigosDAO = new DAO.GerenciarCodigosDAO();
        boolean Deletado = GerenciarCodigosDAO.Deletar(ID);
        
        if(Deletado == true){
            return true;
        } else{
            return false;
        }
    }
    
    public boolean Salvar (int Usos, int NivelAcesso, int ID, String Codigo){
        DAO.GerenciarCodigosDAO GerenciarCodigosDAO = new DAO.GerenciarCodigosDAO();
        
        boolean Atualizado = GerenciarCodigosDAO.Salvar(Usos, NivelAcesso, ID, Codigo);
        
        if(Atualizado == true){
            return true;
        } else{
            return false;
        }
    }
    
    public DefaultTableModel ListarCodigos () {
        DAO.GerenciarCodigosDAO GerenciaCodigosDAO = new DAO.GerenciarCodigosDAO();
        
        DefaultTableModel Model = GerenciaCodigosDAO.ListarCodigos();
        return Model;
    }
    
    public DefaultTableModel ListarCodigos (String Procurar, String Filtro) {
        LoginM LoginM = new LoginM();
        DAO.GerenciarCodigosDAO GerenciaCodigosDAO = new DAO.GerenciarCodigosDAO();
        String SQL = null;
        
        int Usuario = Integer.parseInt(LoginM.getID());

        if(Procurar.equals("")){
            SQL = "SELECT * FROM tb_registro_codigos";
        }
            
        if(Filtro.equals("ID") && !Procurar.equals("")){
            SQL = "SELECT * FROM tb_registro_codigos WHERE id = " + Procurar;
        }

        if(Filtro.equals("Nivel de Acesso") && !Procurar.equals("")){
            SQL = "SELECT * FROM tb_registro_codigos WHERE nivel_acesso = " + Procurar;
        }
            
        if(Filtro.equals("Usos") && !Procurar.equals("")){
            SQL = "SELECT * FROM tb_registro_codigos WHERE usos = " + Procurar;
        }
            
        if(Filtro.equals("Código") && !Procurar.equals("")){
            SQL = "SELECT * FROM tb_registro_codigos WHERE codigo LIKE '" + Procurar + "%'";
        }
        
        DefaultTableModel Model = GerenciaCodigosDAO.ListarCodigos(SQL);
        return Model;
    }
}