package CONTROLLER;

import javax.swing.table.DefaultTableModel;

public class GerenciarCodigosC {
    
    public boolean Adicionar(int Usos, int NivelAcesso, String Codigo){
        MODEL.GerenciarCodigosM GerenciarCodigosM = new MODEL.GerenciarCodigosM();
        
        boolean Adicionado = GerenciarCodigosM.Adicionar(Usos, NivelAcesso, Codigo);
        
        if(Adicionado == true){
            return true;
        } else{
            return false;
        }
    }
    
    public boolean Deletar (int ID){
        MODEL.GerenciarCodigosM GerenciaCodigosM = new MODEL.GerenciarCodigosM();
        boolean Deletado = GerenciaCodigosM.Deletar(ID);
        
        if(Deletado == true){
            return true;
        } else{
            return false;
        }
    }
    
    public boolean Salvar(int Usos, int NivelAcesso, int ID, String Codigo){
        MODEL.GerenciarCodigosM GerenciaCodigosM = new MODEL.GerenciarCodigosM();
        
        boolean Atualizado = GerenciaCodigosM.Salvar(Usos, NivelAcesso, ID, Codigo);
        
        if(Atualizado == true){
            return true;
        } else {
            return false;
        }
    }
    
    public DefaultTableModel ListarCodigos () {
        MODEL.GerenciarCodigosM GerenciaCodigosM = new MODEL.GerenciarCodigosM();
        
        DefaultTableModel Model = GerenciaCodigosM.ListarCodigos();
        return Model;
    }
    
    public DefaultTableModel ListarCodigos (String Procurar, String Filtro) {
        MODEL.GerenciarCodigosM GerenciaCodigosM = new MODEL.GerenciarCodigosM();
        
        DefaultTableModel Model = GerenciaCodigosM.ListarCodigos(Procurar, Filtro);
        return Model;
    }
}