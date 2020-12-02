package MODEL;

import DAO.GerenciarDenunciasDAO;
import javax.swing.table.DefaultTableModel;

public class GerenciarDenunciasM {
    
    public boolean Salvar (String Prioridade, String Status, int Usuario, int ID){
        DAO.GerenciarDenunciasDAO GerenciarDenunciasDAO = new DAO.GerenciarDenunciasDAO();
        
        boolean Atualizado = GerenciarDenunciasDAO.Salvar(Prioridade, Status, Usuario, ID);
        
        if(Atualizado == true){
            return true;
        } else{
            return false;
        }
    }
    
    public DefaultTableModel ListarDenuncias (String Prioridade, String Status) {
        DAO.GerenciarDenunciasDAO GerenciarDenunciasDAO = new GerenciarDenunciasDAO();
        String SQL = null;
        
        if(Prioridade.equals("Todas") && Status.equals("Todos")) {
            System.out.println("Prioridade: " + Prioridade + "\nStatus: " + Status);
            SQL = "SELECT id, usuario, endereco, descricao, prioridade, status FROM tb_denuncia WHERE prioridade IN ('Baixa', 'Média', 'Alta') and status IN ('Verificado', 'Não Verificado', 'Descartado') ORDER BY id DESC";
        }
        
        if(Prioridade.equals("Baixa") || Prioridade.equals("Média") || Prioridade.equals("Alta") && Status.equals("Todos")) {
            System.out.println("Prioridade: " + Prioridade + "\nStatus: " + Status);
            SQL = "SELECT id, usuario, endereco, descricao, prioridade, status FROM tb_denuncia WHERE prioridade = '" + Prioridade + "' and status IN ('Verificado', 'Não Verificado', 'Descartado') ORDER BY id DESC";
        }
        
        if(Status.equals("Verificado") || Status.equals("Não Verificado") || Status.equals("Descartado") && Prioridade.equals("Todas")) {
            System.out.println("Prioridade: " + Prioridade + "\nStatus: " + Status);
            SQL = "SELECT id, usuario, endereco, descricao, prioridade, status FROM tb_denuncia WHERE prioridade IN ('Baixa', 'Média', 'Alta') and status = '" + Status + "' ORDER BY id DESC";
        }
        
        if(!Prioridade.equals("Todas") && !Status.equals("Todos")) {
            System.out.println("Prioridade: " + Prioridade + "\nStatus: " + Status);
            SQL = "SELECT id, usuario, endereco, descricao, prioridade, status FROM tb_denuncia WHERE prioridade = '" + Prioridade + "' and status = '" + Status + "' ORDER BY id DESC";
        }
        
        DefaultTableModel Model = GerenciarDenunciasDAO.ListarDenuncias(SQL);
        return Model;
    }
}