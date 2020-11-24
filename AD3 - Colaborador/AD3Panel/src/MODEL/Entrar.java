package MODEL;

public class Entrar {
    DAO.EntrarDAO EntrarDAO = new DAO.EntrarDAO();
    
    public String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    public String Entrar (String Email, String Senha){        
        this.setID(EntrarDAO.Entrar(Email, Senha));
        return getID();
    }
}