package CONTROLLER;

public class RegistroC {
    Model.RegistroM RegistroM = new Model.RegistroM();
    
    public void Registrar(String Email, String Senha, String NomeCompleto, String CPF, String RG, String Endereco, String Telefone, String Codigo, int NivelAcesso){
        RegistroM.Registrar(Email, Senha, NomeCompleto, CPF, RG, Endereco, Telefone, Codigo, NivelAcesso);
       
    }
}