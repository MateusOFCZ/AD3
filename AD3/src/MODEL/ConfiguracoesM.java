package MODEL;

import javax.swing.JOptionPane;

public class ConfiguracoesM {
    public boolean VerificarConta (String EMail, String CPF, String RG) {
        DAO.ConfiguracoesDAO ConfiguracoesDAO = new DAO.ConfiguracoesDAO();
        MODEL.LoginM LoginM = new MODEL.LoginM();
        int ID = Integer.parseInt(LoginM.getID());
        
        boolean Verificado = ConfiguracoesDAO.VerificarConta(EMail, CPF, RG, CPF, ID);
        
        if(Verificado == true) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean VerificarSenha (String Senha) {
        DAO.ConfiguracoesDAO ConfiguracoesDAO = new DAO.ConfiguracoesDAO();
        MODEL.LoginM LoginM = new MODEL.LoginM();
        
        boolean Verificado = ConfiguracoesDAO.VerificarSenha(LoginM.getEMail(), Senha);
        
        if(Verificado == true){
            return true;
        } else{
            return false;
        }
    }
    
    public boolean Salvar (String NomeCompleto, String EMail, String RG, String CPF, String Endereco, String Telefone, String Senha) {
        DAO.ConfiguracoesDAO ConfiguracoesDAO = new DAO.ConfiguracoesDAO();
        MODEL.LoginM LoginM = new MODEL.LoginM();
        int ID = Integer.parseInt(LoginM.getID());
        
        boolean Atualizado = ConfiguracoesDAO.Salvar(EMail, CPF, NomeCompleto, CPF, RG, Endereco, Telefone, ID);
        
        if(Atualizado == true){
            boolean DadosAtualizados = ConfiguracoesDAO.AtualizarDados(EMail, Senha);
            if (DadosAtualizados == true){
                JOptionPane.showMessageDialog(null, "Informações atualizadas com sucesso!", "Status", JOptionPane.INFORMATION_MESSAGE);
                return true;
            } else{
                return false;
            }
        } else {
            return false;
        }
    }
}