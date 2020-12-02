package CONTROLLER;

public class DenunciaUsuariosC {
    public boolean Denunciar (String Estado, String Cidade, String Bairro, String Prioridade, String Descricao){
        MODEL.DenunciaUsuarioM DenunciaUsuarioM = new MODEL.DenunciaUsuarioM();
        
        boolean Denunciado = DenunciaUsuarioM.Denunciar(Estado, Cidade, Bairro, Prioridade, Descricao);
        
        if (Denunciado == true){
            return true;
        } else{
            return false;
        }
    }
}