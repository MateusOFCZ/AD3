package MODEL;

import java.sql.ResultSet;

public class Inicio {
    
    public ResultSet Tabela(int Quantidade){
        DAO.InicioDAO InicioDAO = new DAO.InicioDAO();
        ResultSet res = InicioDAO.getInfos(Quantidade);
        return res;
    }
}