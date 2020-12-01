package CONTROLLER;

public class RegistroC {
    Model.RegistroM RegistroM = new Model.RegistroM();
    
    public boolean Registrar (String NomeCompleto, String EMail, String RG, String CPF, String Endereco, String Telefone, String Senha, String Codigo, int NivelAcesso){
        boolean ContaVerificada = RegistroM.VerificarConta(EMail, CPF, RG);
        
        if(ContaVerificada == true && !Codigo.equals("")){
            NivelAcesso = RegistroM.VerificarCodigo(Codigo);
            
            if(NivelAcesso > 1) {
                boolean Registrado = RegistroM.Registrar(NomeCompleto, EMail, RG, CPF, Endereco, Telefone, Senha, NivelAcesso);
                return Registrado;
            }
            
        } else if(ContaVerificada == true && Codigo.equals("")){
            boolean Registrado = RegistroM.Registrar(NomeCompleto, EMail, RG, CPF, Endereco, Telefone, Senha);
            return Registrado;
        }
        return false;
    }
}