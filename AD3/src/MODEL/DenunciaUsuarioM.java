package MODEL;

public class DenunciaUsuarioM {
    public boolean Denunciar (String Estado, String Cidade, String Bairro, String Prioridade, String Descricao) {
        DAO.DenunciaUsuarioDAO DenunciaUsuarioDAO = new DAO.DenunciaUsuarioDAO();
        MODEL.LoginM LoginM = new MODEL.LoginM();
        
        int Usuario = Integer.parseInt(LoginM.getID());
        int NewPrioridade = 1;
        String Endereco = Cidade + ", " + Bairro + ", " + Estado;
        
        if(Prioridade.equals("Baixo")){
            NewPrioridade = 1;
        }
        if(Prioridade.equals("Médio")){
            NewPrioridade = 2;
        }
        if(Prioridade.equals("Alto")){
            NewPrioridade = 3;
        }
        
        boolean Denunciado = DenunciaUsuarioDAO.Denunciar(Endereco, NewPrioridade, Descricao, Usuario);
        
        if (Denunciado == true){
            return true;
        } else{
            return false;
        }
    }
}