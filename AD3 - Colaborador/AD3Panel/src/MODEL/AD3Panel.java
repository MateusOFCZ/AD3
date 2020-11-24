package MODEL;

public class AD3Panel {
    private static String ID;
    private static String EMail;
    private static String NomeCompleto;
    
    public boolean SetarInfos (){
        DAO.AD3PanelDAO PrincipalDAO = new DAO.AD3PanelDAO();
        boolean Coletado = PrincipalDAO.ColetarInfos(getID());
        if(Coletado == true){
            return true;
        } else {
            return false;
        }
    }

    public static String getID() {
        return ID;
    }

    public static void setID(String aID) {
        ID = aID;
    }

    public static String getEMail() {
        return EMail;
    }

    public static void setEMail(String aEMail) {
        EMail = aEMail;
    }

    public static String getNomeCompleto() {
        return NomeCompleto;
    }

    public static void setNomeCompleto(String aNomeCompleto) {
        NomeCompleto = aNomeCompleto;
    }
}
