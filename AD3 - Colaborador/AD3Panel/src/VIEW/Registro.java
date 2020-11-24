/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class Registro extends javax.swing.JFrame {
    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fundo_Titulo = new javax.swing.JPanel();
        Texto_Titulo = new javax.swing.JLabel();
        Texto_Titulo_InformacoesLogin = new javax.swing.JLabel();
        Campo_NomeCompleto = new javax.swing.JTextField();
        Texto_NomeCompleto = new javax.swing.JLabel();
        Texto_EMail = new javax.swing.JLabel();
        Campo_Email = new javax.swing.JTextField();
        Texto_Senha = new javax.swing.JLabel();
        Campo_Senha = new javax.swing.JPasswordField();
        Separador = new javax.swing.JSeparator();
        Texto_Titulo_InformacoesPessoais = new javax.swing.JLabel();
        Texto_CPF = new javax.swing.JLabel();
        Campo_CPF = new javax.swing.JFormattedTextField();
        Texto_RG = new javax.swing.JLabel();
        Campo_RG = new javax.swing.JFormattedTextField();
        Texto_Endereco = new javax.swing.JLabel();
        Campo_Endereco = new javax.swing.JTextField();
        Texto_Telefone = new javax.swing.JLabel();
        Campo_Telefone = new javax.swing.JFormattedTextField();
        Campo_Codigo = new javax.swing.JFormattedTextField();
        Texto_Codigo = new javax.swing.JLabel();
        Botao_RegistrarSe = new javax.swing.JButton();
        Botao_Entrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        Fundo_Titulo.setBackground(new java.awt.Color(76, 175, 80));

        Texto_Titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Texto_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Texto_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto_Titulo.setText("REGISTRO");

        javax.swing.GroupLayout Fundo_TituloLayout = new javax.swing.GroupLayout(Fundo_Titulo);
        Fundo_Titulo.setLayout(Fundo_TituloLayout);
        Fundo_TituloLayout.setHorizontalGroup(
            Fundo_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(Fundo_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Fundo_TituloLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Texto_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        Fundo_TituloLayout.setVerticalGroup(
            Fundo_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
            .addGroup(Fundo_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Fundo_TituloLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Texto_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(Fundo_Titulo);
        Fundo_Titulo.setBounds(0, 0, 600, 55);

        Texto_Titulo_InformacoesLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Texto_Titulo_InformacoesLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto_Titulo_InformacoesLogin.setText("Informações de Login");
        getContentPane().add(Texto_Titulo_InformacoesLogin);
        Texto_Titulo_InformacoesLogin.setBounds(50, 80, 210, 22);

        Campo_NomeCompleto.setToolTipText("Nome Completo");
        getContentPane().add(Campo_NomeCompleto);
        Campo_NomeCompleto.setBounds(30, 140, 250, 30);

        Texto_NomeCompleto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Texto_NomeCompleto.setText("Nome Completo");
        getContentPane().add(Texto_NomeCompleto);
        Texto_NomeCompleto.setBounds(30, 120, 160, 22);

        Texto_EMail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Texto_EMail.setText("E-Mail");
        getContentPane().add(Texto_EMail);
        Texto_EMail.setBounds(30, 200, 70, 22);

        Campo_Email.setToolTipText("E-Mail");
        getContentPane().add(Campo_Email);
        Campo_Email.setBounds(30, 220, 250, 30);

        Texto_Senha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Texto_Senha.setText("Senha");
        getContentPane().add(Texto_Senha);
        Texto_Senha.setBounds(30, 280, 70, 22);

        Campo_Senha.setToolTipText("Senha");
        getContentPane().add(Campo_Senha);
        Campo_Senha.setBounds(30, 300, 250, 30);

        Separador.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Separador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Separador);
        Separador.setBounds(290, 80, 10, 410);

        Texto_Titulo_InformacoesPessoais.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Texto_Titulo_InformacoesPessoais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto_Titulo_InformacoesPessoais.setText("Informações Pessoais");
        getContentPane().add(Texto_Titulo_InformacoesPessoais);
        Texto_Titulo_InformacoesPessoais.setBounds(340, 80, 210, 22);

        Texto_CPF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Texto_CPF.setText("CPF");
        getContentPane().add(Texto_CPF);
        Texto_CPF.setBounds(330, 120, 160, 22);

        try {
            Campo_CPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Campo_CPF.setToolTipText("CPF");
        getContentPane().add(Campo_CPF);
        Campo_CPF.setBounds(330, 140, 250, 30);

        Texto_RG.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Texto_RG.setText("RG");
        getContentPane().add(Texto_RG);
        Texto_RG.setBounds(330, 200, 70, 22);

        try {
            Campo_RG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Campo_RG.setToolTipText("RG");
        getContentPane().add(Campo_RG);
        Campo_RG.setBounds(330, 220, 250, 30);

        Texto_Endereco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Texto_Endereco.setText("Endereço");
        getContentPane().add(Texto_Endereco);
        Texto_Endereco.setBounds(330, 279, 100, 22);

        Campo_Endereco.setToolTipText("Endereço");
        getContentPane().add(Campo_Endereco);
        Campo_Endereco.setBounds(330, 300, 250, 30);

        Texto_Telefone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Texto_Telefone.setText("Telefone");
        getContentPane().add(Texto_Telefone);
        Texto_Telefone.setBounds(330, 350, 100, 22);

        try {
            Campo_Telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+55 (##) 9 ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Campo_Telefone.setToolTipText("RG");
        getContentPane().add(Campo_Telefone);
        Campo_Telefone.setBounds(330, 370, 250, 30);

        try {
            Campo_Codigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Campo_Codigo.setToolTipText("Código de Registro");
        getContentPane().add(Campo_Codigo);
        Campo_Codigo.setBounds(330, 450, 250, 30);

        Texto_Codigo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Texto_Codigo.setText("Código de Registro");
        Texto_Codigo.setToolTipText("");
        getContentPane().add(Texto_Codigo);
        Texto_Codigo.setBounds(330, 430, 180, 22);

        Botao_RegistrarSe.setBackground(new java.awt.Color(76, 175, 80));
        Botao_RegistrarSe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Botao_RegistrarSe.setForeground(new java.awt.Color(255, 255, 255));
        Botao_RegistrarSe.setText("REGISTRAR-SE");
        Botao_RegistrarSe.setBorderPainted(false);
        Botao_RegistrarSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_RegistrarSeActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_RegistrarSe);
        Botao_RegistrarSe.setBounds(50, 420, 210, 25);

        Botao_Entrar.setBackground(new java.awt.Color(244, 67, 54));
        Botao_Entrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Botao_Entrar.setForeground(new java.awt.Color(255, 255, 255));
        Botao_Entrar.setText("JÁ TENHO UMA CONTA");
        Botao_Entrar.setBorderPainted(false);
        Botao_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_EntrarActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_Entrar);
        Botao_Entrar.setBounds(50, 450, 210, 25);

        setSize(new java.awt.Dimension(616, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Botao_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_EntrarActionPerformed
        Entrar Entrar = new Entrar();
        this.dispose();
        Entrar.show();
    }//GEN-LAST:event_Botao_EntrarActionPerformed

    private void Botao_RegistrarSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_RegistrarSeActionPerformed
        MODEL.Registro Registro = new MODEL.Registro();
        String Email = Campo_Email.getText().toString();
        String Senha = Campo_Senha.getText().toString();
        String NomeCompleto = Campo_NomeCompleto.getText().toString();
        String CPF = Campo_CPF.getText().toString();
        String RG = Campo_RG.getText().toString();
        String Endereco = Campo_Endereco.getText().toString();
        String Telefone = Campo_Telefone.getText().toString();
        String Codigo = Campo_Codigo.getText().toString();
        if(Email.equals("") || Senha.equals("") || NomeCompleto.equals("") || CPF.equals("") || RG.equals("") || Endereco.equals("") || Telefone.equals("") || Codigo.equals("")){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Erro", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Aguarde as informações serem verificadas!", "Verificando Informações...", JOptionPane.WARNING_MESSAGE);
            boolean ContaVerificada = Registro.Conta(Email, CPF, RG, Telefone);
            if(ContaVerificada == true){
                boolean Registrado = Registro.Registrar(Email, Senha, NomeCompleto, CPF, RG, Endereco, Telefone, Codigo);
                if(Registrado == true){
                    this.dispose();
                    Entrar Entrar = new Entrar();
                    Entrar.show();
                }
            }
        }
    }//GEN-LAST:event_Botao_RegistrarSeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_Entrar;
    private javax.swing.JButton Botao_RegistrarSe;
    public javax.swing.JFormattedTextField Campo_CPF;
    public javax.swing.JFormattedTextField Campo_Codigo;
    public javax.swing.JTextField Campo_Email;
    public javax.swing.JTextField Campo_Endereco;
    public javax.swing.JTextField Campo_NomeCompleto;
    public javax.swing.JFormattedTextField Campo_RG;
    public javax.swing.JPasswordField Campo_Senha;
    public javax.swing.JFormattedTextField Campo_Telefone;
    private javax.swing.JPanel Fundo_Titulo;
    private javax.swing.JSeparator Separador;
    private javax.swing.JLabel Texto_CPF;
    private javax.swing.JLabel Texto_Codigo;
    private javax.swing.JLabel Texto_EMail;
    private javax.swing.JLabel Texto_Endereco;
    private javax.swing.JLabel Texto_NomeCompleto;
    private javax.swing.JLabel Texto_RG;
    private javax.swing.JLabel Texto_Senha;
    private javax.swing.JLabel Texto_Telefone;
    private javax.swing.JLabel Texto_Titulo;
    private javax.swing.JLabel Texto_Titulo_InformacoesLogin;
    private javax.swing.JLabel Texto_Titulo_InformacoesPessoais;
    // End of variables declaration//GEN-END:variables
}
