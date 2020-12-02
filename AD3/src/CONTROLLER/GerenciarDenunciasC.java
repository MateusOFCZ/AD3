package CONTROLLER;

import javax.swing.table.DefaultTableModel;

public class GerenciarDenunciasC {
    
    public boolean Salvar(String Prioridade, String Status, int Usuario, int ID){
        MODEL.GerenciarDenunciasM GerenciarDenunciasM = new MODEL.GerenciarDenunciasM();
        
        boolean Atualizado = GerenciarDenunciasM.Salvar(Prioridade, Status, Usuario, ID);
        
        if(Atualizado == true){
            return true;
        } else{
            return false;
        }
    }
    
    public DefaultTableModel ListarDenuncias (String Prioridade, String Status) {
        MODEL.GerenciarDenunciasM GerenciarDenunciasM = new MODEL.GerenciarDenunciasM();
        
        DefaultTableModel Model = GerenciarDenunciasM.ListarDenuncias(Prioridade, Status);
        return Model;
    }
}