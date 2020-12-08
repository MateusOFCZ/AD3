package MODEL;

import javax.swing.table.DefaultTableModel;

public class GerenciarUsuariosM {
    
    public boolean Salvar (int Score, int NivelAcesso, int ID, int Usuario){
        DAO.GerenciarUsuariosDAO GerenciarUsuariosDAO = new DAO.GerenciarUsuariosDAO();
        
        boolean Atualizado = GerenciarUsuariosDAO.Salvar(Score, NivelAcesso, ID, Usuario);
        
        if(Atualizado == true){
            return true;
        } else{
            return false;
        }
    }
    
    public DefaultTableModel ListarUsuarios (int Usuario) {
        DAO.GerenciarUsuariosDAO GerenciaUsuariosDAO = new DAO.GerenciarUsuariosDAO();
        
        DefaultTableModel Model = GerenciaUsuariosDAO.ListarUsuarios(Usuario);
        return Model;
    }
    
    public DefaultTableModel ListarUsuarios (String Procurar, String Filtro, String Selecionado) {
        LoginM LoginM = new LoginM();
        DAO.GerenciarUsuariosDAO GerenciaUsuariosDAO = new DAO.GerenciarUsuariosDAO();
        String SQL = null;
        
        int Usuario = Integer.parseInt(LoginM.getID());
        
        if(Selecionado.equals("Usuários")){
            
            if(Procurar.equals("")){
                SQL = "SELECT id, email, nome_completo, cpf, rg, endereco, telefone, score, nivel_acesso FROM tb_usuario WHERE nivel_acesso <= 1 and id != " + Usuario;
            }
            
            if(Filtro.equals("ID") && !Procurar.equals("")){
                SQL = "SELECT id, email, nome_completo, cpf, rg, endereco, telefone, score, nivel_acesso FROM tb_usuario WHERE nivel_acesso <= 1 and id = " + Procurar + " and id != " + Usuario;
            }

            if(Filtro.equals("E-Mail") && !Procurar.equals("")){
                SQL = "SELECT id, email, nome_completo, cpf, rg, endereco, telefone, score, nivel_acesso FROM tb_usuario WHERE  nivel_acesso <= 1 and email LIKE '" + Procurar + "%'" + " and id != " + Usuario;
            }
            
            if(Filtro.equals("Nome Completo") && !Procurar.equals("")){
                SQL = "SELECT id, email, nome_completo, cpf, rg, endereco, telefone, score, nivel_acesso FROM tb_usuario WHERE  nivel_acesso <= 1 and nome_completo LIKE '" + Procurar + "%'" + " and id != " + Usuario;
            }
            
            if(Filtro.equals("CPF") && !Procurar.equals("")){
                SQL = "SELECT id, email, nome_completo, cpf, rg, endereco, telefone, score, nivel_acesso FROM tb_usuario WHERE  nivel_acesso <= 1 and cpf LIKE '" + Procurar + "%'" + " and id != " + Usuario;
            }
            
            if(Filtro.equals("RG") && !Procurar.equals("")){
                SQL = "SELECT id, email, nome_completo, cpf, rg, endereco, telefone, score, nivel_acesso FROM tb_usuario WHERE  nivel_acesso <= 1 and rg LIKE '" + Procurar + "%'" + " and id != " + Usuario;
            }
            
            if(Filtro.equals("Endereço") && !Procurar.equals("")){
                SQL = "SELECT id, email, nome_completo, cpf, rg, endereco, telefone, score, nivel_acesso FROM tb_usuario WHERE  nivel_acesso <= 1 and endereco LIKE '" + Procurar + "%'" + " and id != " + Usuario;
            }
            
            if(Filtro.equals("Telefone") && !Procurar.equals("")){
                SQL = "SELECT id, email, nome_completo, cpf, rg, endereco, telefone, score, nivel_acesso FROM tb_usuario WHERE  nivel_acesso <= 1 and telefone LIKE '" + Procurar + "%'" + " and id != " + Usuario;
            }
        }
        
        if(Selecionado.equals("Colaboradores")){
            
            if(Procurar.equals("")){
                SQL = "SELECT id, email, nome_completo, cpf, rg, endereco, telefone, nivel_acesso FROM tb_usuario WHERE nivel_acesso >= 2 and id != " + Usuario;
            }
            
            if(Filtro.equals("ID") && !Procurar.equals("")){
                SQL = "SELECT id, email, nome_completo, cpf, rg, endereco, telefone, nivel_acesso FROM tb_usuario WHERE nivel_acesso >= 2 and id = " + Procurar + " and id != " + Usuario;
            }

            if(Filtro.equals("E-Mail") && !Procurar.equals("")){
                SQL = "SELECT id, email, nome_completo, cpf, rg, endereco, telefone, nivel_acesso FROM tb_usuario WHERE  nivel_acesso >= 2 and email LIKE '" + Procurar + "%'" + " and id != " + Usuario;
            }
            
            if(Filtro.equals("Nome Completo") && !Procurar.equals("")){
                SQL = "SELECT id, email, nome_completo, cpf, rg, endereco, telefone, nivel_acesso FROM tb_usuario WHERE  nivel_acesso >= 2 and nome_completo LIKE '" + Procurar + "%'" + " and id != " + Usuario;
            }
            
            if(Filtro.equals("CPF") && !Procurar.equals("")){
                SQL = "SELECT id, email, nome_completo, cpf, rg, endereco, telefone, nivel_acesso FROM tb_usuario WHERE  nivel_acesso >= 2 and cpf LIKE '" + Procurar + "%'" + " and id != " + Usuario;
            }
            
            if(Filtro.equals("RG") && !Procurar.equals("")){
                SQL = "SELECT id, email, nome_completo, cpf, rg, endereco, telefone, nivel_acesso FROM tb_usuario WHERE  nivel_acesso >= 2 and rg LIKE '" + Procurar + "%'" + " and id != " + Usuario;
            }
            
            if(Filtro.equals("Endereço") && !Procurar.equals("")){
                SQL = "SELECT id, email, nome_completo, cpf, rg, endereco, telefone, nivel_acesso FROM tb_usuario WHERE  nivel_acesso >= 2 and endereco LIKE '" + Procurar + "%'" + " and id != " + Usuario;
            }
            
            if(Filtro.equals("Telefone") && !Procurar.equals("")){
                SQL = "SELECT id, email, nome_completo, cpf, rg, endereco, telefone, nivel_acesso FROM tb_usuario WHERE  nivel_acesso >= 2 and telefone LIKE '" + Procurar + "%'" + " and id != " + Usuario;
            }
        }
        
        DefaultTableModel Model = GerenciaUsuariosDAO.ListarUsuarios(SQL);
        return Model;
    }
}