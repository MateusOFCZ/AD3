package MODEL;

public class Configuracoes {
    DAO.ConfiguracoesDAO ConfiguracoesDAO = new DAO.ConfiguracoesDAO();
    VIEW.Configuracoes Configuracoes = new VIEW.Configuracoes();
    private static String Email, NomeCompleto, CPF, RG, Endereco, Telefone;

    public static String getEmail() {
        return Email;
    }

    public static void setEmail(String aEmail) {
        Email = aEmail;
    }

    public static String getNomeCompleto() {
        return NomeCompleto;
    }

    public static void setNomeCompleto(String aNomeCompleto) {
        NomeCompleto = aNomeCompleto;
    }

    public static String getCPF() {
        return CPF;
    }

    public static void setCPF(String aCPF) {
        CPF = aCPF;
    }

    public static String getRG() {
        return RG;
    }

    public static void setRG(String aRG) {
        RG = aRG;
    }

    public static String getEndereco() {
        return Endereco;
    }

    public static void setEndereco(String aEndereco) {
        Endereco = aEndereco;
    }

    public static String getTelefone() {
        return Telefone;
    }

    public static void setTelefone(String aTelefone) {
        Telefone = aTelefone;
    }
    
    public boolean VerificarInfos (String Email, String CPF, String RG, String Telefone, String ID, String Senha){
        CPF = CPF.replaceAll("\\.","");
        CPF = CPF.replaceAll("-","");
        RG = RG.replaceAll("\\.","");
        boolean Verificar = ConfiguracoesDAO.VerificarConta(Email, CPF, RG, Telefone, ID, Senha);
        return Verificar;
    }
    
    public boolean AtualizarInfos (String NomeCompleto, String EMail, String CPF, String RG, String Endereco, String Telefone, String ID) {
        CPF = CPF.replaceAll("\\.","");
        CPF = CPF.replaceAll("-","");
        RG = RG.replaceAll("\\.","");
        boolean Atualizado = ConfiguracoesDAO.AtualizarInfos(EMail, NomeCompleto, CPF, RG, Endereco, Telefone, ID);
        if(Atualizado == true){
            return true;
        } else{
            return false;
        }
    }
    
    public boolean SetarInfos (){
        DAO.ConfiguracoesDAO ConfiguracoesDAO = new DAO.ConfiguracoesDAO();
        MODEL.AD3Panel AD3Panel = new MODEL.AD3Panel();
        boolean Coletado = ConfiguracoesDAO.ColetarInfos(AD3Panel.getID());
        if(Coletado == true){
            return true;
        } else {
            return false;
        }
    }
}