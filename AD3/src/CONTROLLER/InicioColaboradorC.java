package CONTROLLER;

public class InicioColaboradorC extends ConfiguracoesC {
    public boolean AtualizarDados () {
        MODEL.LoginM LoginM = new MODEL.LoginM();
        String EMail = LoginM.getEMail();
        String Senha = LoginM.getSenha();
        
        boolean Atualizado = super.AtualizarDados(EMail, Senha);
        
        if(Atualizado == true){
            return true;
        } else{
            return false;
        }
    }
}
