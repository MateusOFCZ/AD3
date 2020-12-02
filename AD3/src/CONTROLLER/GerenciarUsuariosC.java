package CONTROLLER;

import javax.swing.table.DefaultTableModel;

public class GerenciarUsuariosC {
    
    public boolean Salvar(int Score, int NivelAcesso, int ID){
        MODEL.GerenciarUsuariosM GerenciaUsuariosM = new MODEL.GerenciarUsuariosM();
        MODEL.LoginM LoginM = new MODEL.LoginM();
        
        int Usuario = Integer.parseInt(LoginM.getID());
        
        boolean Atualizado = GerenciaUsuariosM.Salvar(Score, NivelAcesso, ID, Usuario);
        
        if(Atualizado == true){
            return true;
        } else {
            return false;
        }
    }
    
    public DefaultTableModel ListarUsuarios () {
        MODEL.GerenciarUsuariosM GerenciaUsuariosM = new MODEL.GerenciarUsuariosM();
        MODEL.LoginM LoginM = new MODEL.LoginM();
        
        int Usuario = Integer.parseInt(LoginM.getID());
        
        DefaultTableModel Model = GerenciaUsuariosM.ListarUsuarios(Usuario);
        return Model;
    }
    
    public DefaultTableModel ListarUsuarios (String Procurar, String Filtro, String Selecionado) {
        MODEL.GerenciarUsuariosM GerenciaUsuariosM = new MODEL.GerenciarUsuariosM();
        
        DefaultTableModel Model = GerenciaUsuariosM.ListarUsuarios(Procurar, Filtro, Selecionado);
        return Model;
    }
}