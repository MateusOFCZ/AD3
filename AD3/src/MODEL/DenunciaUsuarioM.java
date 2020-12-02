package MODEL;

public class DenunciaUsuarioM {
    public boolean Denunciar (String Estado, String Cidade, String Bairro, String Prioridade, String Descricao) {
        DAO.DenunciaUsuarioDAO DenunciaUsuarioDAO = new DAO.DenunciaUsuarioDAO();
        MODEL.LoginM LoginM = new MODEL.LoginM();
        
        Cidade = Cidade.replaceAll(",", "");
        Bairro = Bairro.replaceAll(",", "");
        
        int Usuario = Integer.parseInt(LoginM.getID());
        String Endereco = Cidade + ", " + Bairro + ", " + Estado;
        
        boolean Denunciado = DenunciaUsuarioDAO.Denunciar(Endereco, Prioridade, Descricao, Usuario);
        
        if (Denunciado == true){
            return true;
        } else{
            return false;
        }
    }
}