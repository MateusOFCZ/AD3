package MODEL;

import DAO.MinhasDenunciasDAO;
import javax.swing.table.DefaultTableModel;

public class MinhasDenunciasM {
    
    public boolean Salvar (String Prioridade, String Cidade, String Bairro, String Estado, String Descricao, int Usuario, int ID){
        DAO.MinhasDenunciasDAO MinhasDenunciasDAO = new DAO.MinhasDenunciasDAO();
        
        Cidade = Cidade.replaceAll(",", "");
        Bairro = Bairro.replaceAll(",", "");
        
        String Endereco = Cidade + ", " + Bairro + ", " + Estado;
        
        boolean Atualizado = MinhasDenunciasDAO.Salvar(Prioridade, Endereco, Descricao, Usuario, ID);
        
        if(Atualizado == true){
            return true;
        } else{
            return false;
        }
    }
    
    public DefaultTableModel ListarDenuncias (int ID) {
        DAO.MinhasDenunciasDAO MinhasDenunciasDAO = new MinhasDenunciasDAO();
        
        DefaultTableModel Model = MinhasDenunciasDAO.ListarDenuncias(ID);
        return Model;
    }
}