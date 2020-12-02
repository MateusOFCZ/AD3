package CONTROLLER;

import MODEL.LoginM;
import javax.swing.table.DefaultTableModel;

public class MinhasDenunciasC {
    
    public boolean Salvar(String Prioridade, String Cidade, String Bairro, String Estado, String Descricao, int ID){
        MODEL.MinhasDenunciasM MinhasDenunciasM = new MODEL.MinhasDenunciasM();
        MODEL.LoginM LoginM = new MODEL.LoginM();
        
        int Usuario = Integer.parseInt(LoginM.getID());
        
        boolean Atualizado = MinhasDenunciasM.Salvar(Prioridade, Cidade, Bairro, Estado, Descricao, Usuario, ID);
        
        if(Atualizado == true){
            return true;
        } else{
            return false;
        }
    }
    
    public DefaultTableModel ListarDenuncias () {
        MODEL.MinhasDenunciasM MinhasDenunciasM = new MODEL.MinhasDenunciasM();
        int ID = Integer.parseInt(LoginM.getID());
        
        DefaultTableModel Model = MinhasDenunciasM.ListarDenuncias(ID);
        return Model;
    }
}