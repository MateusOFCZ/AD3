package MODEL;

import javax.swing.JOptionPane;

public class RegistroM {
    DAO.RegistroDAO RegistroDAO = new DAO.RegistroDAO();
    
    public boolean VerificarConta (String EMail, String CPF, String RG) {
        boolean Verificado = RegistroDAO.VerificarConta(EMail, CPF, RG, CPF);
        
        if(Verificado == true) {
            return true;
        } else {
            return false;
        }
    }
    
    public int VerificarCodigo (String Codigo) {
        int NivelAcesso = RegistroDAO.VerificarCodigo(Codigo);
        
        if(NivelAcesso > 0) {
            return NivelAcesso;
        } else {
            return 1;
        }
    }
    
    public boolean Registrar (String NomeCompleto, String EMail, String RG, String CPF, String Endereco, String Telefone, String Senha, int NivelAcesso){
        boolean Registrado = RegistroDAO.Registrar(EMail, Senha, NomeCompleto, CPF, RG, Endereco, Telefone, NivelAcesso);
        return Registrado;
    }
    
    public boolean Registrar (String NomeCompleto, String EMail, String RG, String CPF, String Endereco, String Telefone, String Senha){
        boolean Registrado = RegistroDAO.Registrar(EMail, Senha, NomeCompleto, CPF, RG, Endereco, Telefone);
        return Registrado;
    }
}