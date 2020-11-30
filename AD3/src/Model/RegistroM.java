package Model;

import javax.swing.JOptionPane;

public class RegistroM {
    DAO.RegistroDAO RegistroDAO = new DAO.RegistroDAO();
    
    public void Registrar (String Email, String Senha, String NomeCompleto, String CPF, String RG, String Endereco, String Telefone, String Codigo, int NivelAcesso) {
        CPF = CPF.replaceAll("\\.","");
        CPF = CPF.replaceAll("-","");
        RG = RG.replaceAll("\\.","");
        Codigo = Codigo.replaceAll("-","");
        
        boolean Verificado = RegistroDAO.VerificarConta(Email, CPF, RG, Telefone);
        
        if(Verificado == true && Codigo.equals("")) {
            Registrar2(Email, Senha, NomeCompleto, CPF, RG, Endereco, Telefone, Codigo, 1);
        } else if (Verificado == false && !Codigo.equals("")){
            Registrar1(Email, Senha, NomeCompleto, CPF, RG, Endereco, Telefone, Codigo, NivelAcesso);
        }
    }
    
    public void Registrar1 (String Email, String Senha, String NomeCompleto, String CPF, String RG, String Endereco, String Telefone, String Codigo, int NivelAcesso) {
        int Verificado = RegistroDAO.VerificarCodigo(Codigo);
        
        if(Verificado > 0) {
            Registrar2(Email, Senha, NomeCompleto, CPF, RG, Endereco, Telefone, Codigo, Verificado);
        } else {
            
        }
    }
    
    public void Registrar2 (String Email, String Senha, String NomeCompleto, String CPF, String RG, String Endereco, String Telefone, String Codigo, int NivelAcesso){
        int CodigoAtivo = RegistroDAO.VerificarCodigo(Codigo);

        boolean Registrado = RegistroDAO.Registrar(Email, Senha, NomeCompleto, CPF, RG, Endereco, Telefone, CodigoAtivo);
        
        if(Registrado == true){
            JOptionPane.showMessageDialog(null, "Registrado com sucesso!", "Registro", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro, tente novamente mais tarde!", "Registro", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}