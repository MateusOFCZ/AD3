package CONTROLLER;

public class LoginC {
    MODEL.LoginM LoginM = new MODEL.LoginM();
    
    public boolean Logar(String EMail, String Senha){
        boolean Logado = LoginM.Logar(EMail, Senha);
        
        if(Logado == true){
            return true;
        } else{
            return false;
        }
    }
}
