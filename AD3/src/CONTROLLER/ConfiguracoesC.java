package CONTROLLER;

public class ConfiguracoesC {
    MODEL.ConfiguracoesM ConfiguracoesM = new MODEL.ConfiguracoesM();
    
    public boolean Atualizar (String NomeCompleto, String EMail, String RG, String CPF, String Endereco, String Telefone, String Senha){
        boolean ContaVerificada = ConfiguracoesM.VerificarConta(EMail, CPF, RG);
        
        if(ContaVerificada == true){
            boolean SenhaVerificada = ConfiguracoesM.VerificarSenha(Senha);
            
            if(SenhaVerificada == true){
                boolean Atualizado = ConfiguracoesM.Salvar(NomeCompleto, EMail, RG, CPF, Endereco, Telefone, Senha);
                
                if(Atualizado == true){
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
    
    public boolean AtualizarDados(String EMail, String Senha){
        DAO.ConfiguracoesDAO ConfiguracoesDAO = new DAO.ConfiguracoesDAO();
        boolean Atualizado = ConfiguracoesDAO.AtualizarDados(EMail, Senha);
        if(Atualizado == true){
            return true;
        } else{
            return false;
        }
    }
}