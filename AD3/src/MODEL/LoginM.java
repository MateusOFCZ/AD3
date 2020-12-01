package MODEL;

import DAO.LoginDAO;

public class LoginM {
    private static String ID;
    private static String EMail;
    private static String Senha;
    private static String NomeCompleto;
    private static String CPF;
    private static String RG;
    private static String Endereco;
    private static String Telefone;
    private static String Score;
    private static String NivelAcesso;

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

    public static String getSenha() {
        return Senha;
    }

    public static void setSenha(String aSenha) {
        Senha = aSenha;
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

    public static String getScore() {
        return Score;
    }

    public static void setScore(String aScore) {
        Score = aScore;
    }

    public static String getNivelAcesso() {
        return NivelAcesso;
    }

    public static void setNivelAcesso(String aNivelAcesso) {
        NivelAcesso = aNivelAcesso;
    }
    
    public boolean Logar(String EMail, String Senha) {
        DAO.LoginDAO LoginDAO = new LoginDAO();
        boolean Logado = LoginDAO.Entrar(EMail, Senha);
        if(Logado == true){
            return true;
        } else{
            return false;
        }
    }
}