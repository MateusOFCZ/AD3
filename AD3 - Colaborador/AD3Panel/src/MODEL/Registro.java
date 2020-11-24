package MODEL;

import javax.swing.JOptionPane;

public class Registro {
    DAO.RegistroDAO RegistroDAO = new DAO.RegistroDAO();
    VIEW.Registro Registro = new VIEW.Registro();
    
    public boolean Conta (String Email, String CPF, String RG, String Telefone){
        CPF = CPF.replaceAll("\\.","");
        CPF = CPF.replaceAll("-","");
        RG = RG.replaceAll("\\.","");
        
        boolean Verificar = RegistroDAO.VerificarConta(Email, CPF, RG, Telefone);
        return Verificar;
    }
    
    public boolean Registrar (String Email, String Senha, String NomeCompleto, String CPF, String RG, String Endereco, String Telefone, String Codigo){
        CPF = CPF.replaceAll("\\.","");
        CPF = CPF.replaceAll("-","");
        RG = RG.replaceAll("\\.","");
        Codigo = Codigo.replaceAll("-","");
        int CodigoAtivo = RegistroDAO.VerificarCodigo(Codigo);
        if(CodigoAtivo > 0){
            boolean Registrado = RegistroDAO.Registrar(Email, Senha, NomeCompleto, CPF, RG, Endereco, Telefone, CodigoAtivo);
            if(Registrado == true){
                RegistroConcluido();
                return true;
            } else{
               return false;
            }
        }
        return false;
    }
    
    public void RegistroConcluido (){
        Registro.Campo_NomeCompleto.setText("");
        Registro.Campo_Email.setText("");
        Registro.Campo_Senha.setText("");
        Registro.Campo_CPF.setText("");
        Registro.Campo_RG.setText("");
        Registro.Campo_Endereco.setText("");
        Registro.Campo_Telefone.setText("");
        Registro.Campo_Codigo.setText("");
        
        JOptionPane.showMessageDialog(null, "Registrado com sucesso!", "Status", JOptionPane.INFORMATION_MESSAGE);
    }
}