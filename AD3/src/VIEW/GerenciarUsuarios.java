package VIEW;

import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerenciarUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form Denuncia
     */
    public GerenciarUsuarios() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        c_nivelacesso = new javax.swing.JComboBox<>();
        b_voltar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();
        b_salvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_usuarios = new javax.swing.JTable();
        c_infos_filtro = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        b_procurar = new javax.swing.JButton();
        c_procurar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        c_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        c_nomecompleto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        c_cpf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        c_rg = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        c_telefone = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        c_score = new javax.swing.JTextField();
        txt_score = new javax.swing.JLabel();
        c_endereco = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        c_tipo_filtro = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Gerenciar Usuários");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jLabel5.setText("Nivel de Acesso");

        c_nivelacesso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        c_nivelacesso.setEnabled(false);
        c_nivelacesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_prioridadeActionPerformed(evt);
            }
        });

        b_voltar.setText("Voltar");
        b_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_voltarActionPerformed(evt);
            }
        });

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        b_salvar.setText("Salvar");
        b_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_salvarActionPerformed(evt);
            }
        });

        tb_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "E-Mail", "Nome Completo", "CPF", "RG", "Endereço", "Telefone", "Score", "Nivel de Acesso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_usuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_usuarios);
        if (tb_usuarios.getColumnModel().getColumnCount() > 0) {
            tb_usuarios.getColumnModel().getColumn(0).setResizable(false);
            tb_usuarios.getColumnModel().getColumn(1).setResizable(false);
            tb_usuarios.getColumnModel().getColumn(2).setResizable(false);
            tb_usuarios.getColumnModel().getColumn(3).setResizable(false);
            tb_usuarios.getColumnModel().getColumn(4).setResizable(false);
            tb_usuarios.getColumnModel().getColumn(5).setResizable(false);
            tb_usuarios.getColumnModel().getColumn(6).setResizable(false);
            tb_usuarios.getColumnModel().getColumn(7).setResizable(false);
            tb_usuarios.getColumnModel().getColumn(8).setResizable(false);
        }

        c_infos_filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "E-Mail", "Nome Completo", "CPF", "RG", "Endereço", "Telefone" }));
        c_infos_filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_infos_filtroc_prioridadeActionPerformed(evt);
            }
        });

        jLabel8.setText("Procurar Por");

        b_procurar.setText("Procurar");
        b_procurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_procurarActionPerformed(evt);
            }
        });

        jLabel10.setText("Procurar");

        c_email.setEditable(false);

        jLabel6.setText("E-Mail");

        c_nomecompleto.setEditable(false);

        jLabel7.setText("Nome Completo");

        c_cpf.setEditable(false);

        jLabel9.setText("CPF");

        c_rg.setEditable(false);

        jLabel11.setText("RG");

        c_telefone.setEditable(false);

        jLabel12.setText("Telefone");

        txt_score.setText("Score");

        c_endereco.setEditable(false);

        jLabel14.setText("Endereço");

        c_tipo_filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuários", "Colaboradores" }));
        c_tipo_filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_tipo_filtroc_prioridadeActionPerformed(evt);
            }
        });

        jLabel15.setText("Tipo");

        jMenu1.setText("Menu");

        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_procurar, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(c_infos_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(c_tipo_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_procurar)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(348, 375, Short.MAX_VALUE)
                                .addComponent(b_salvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b_cancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(c_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(c_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(c_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(c_email, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(c_nomecompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(c_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_nivelacesso, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_score)
                            .addComponent(c_score, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b_procurar)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(c_infos_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c_procurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_tipo_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c_nomecompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt_score)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(7, 7, 7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c_nivelacesso)
                    .addComponent(c_score))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_voltar)
                    .addComponent(b_cancelar)
                    .addComponent(b_salvar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Login Login = new Login();
        this.dispose();
        Login.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void b_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_voltarActionPerformed
        InicioColaborador InicioColaborador = new InicioColaborador();
        this.dispose();
        InicioColaborador.setVisible(true);
    }//GEN-LAST:event_b_voltarActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        int Linha = tb_usuarios.getSelectedRow();
        
        c_email.setText((String) tb_usuarios.getValueAt(Linha, 1));
        c_nomecompleto.setText((String) tb_usuarios.getValueAt(Linha, 2));
        c_cpf.setText((String) tb_usuarios.getValueAt(Linha, 3));
        c_rg.setText((String) tb_usuarios.getValueAt(Linha, 4));
        c_endereco.setText((String) tb_usuarios.getValueAt(Linha, 5));
        c_telefone.setText((String) tb_usuarios.getValueAt(Linha, 6));
        c_score.setText(tb_usuarios.getValueAt(Linha, 7).toString());
        c_nivelacesso.setSelectedItem(tb_usuarios.getValueAt(Linha, 8).toString());
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        CONTROLLER.GerenciarUsuariosC GerenciaUsuariosC = new CONTROLLER.GerenciarUsuariosC();
        MODEL.LoginM LoginM = new MODEL.LoginM();
        
        int NivelAcessoColaborador = LoginM.getNivelAcesso();
        
        if(NivelAcessoColaborador > 3){
            c_nivelacesso.setEnabled(true);
        } else{
            c_nivelacesso.setEnabled(false);
        }
        
        tb_usuarios.setModel(GerenciaUsuariosC.ListarUsuarios());
    }//GEN-LAST:event_formWindowOpened

    private void tb_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_usuariosMouseClicked
        int Linha = tb_usuarios.getSelectedRow();
        
        c_email.setText((String) tb_usuarios.getValueAt(Linha, 1));
        c_nomecompleto.setText((String) tb_usuarios.getValueAt(Linha, 2));
        c_cpf.setText((String) tb_usuarios.getValueAt(Linha, 3));
        c_rg.setText((String) tb_usuarios.getValueAt(Linha, 4));
        c_endereco.setText((String) tb_usuarios.getValueAt(Linha, 5));
        c_telefone.setText((String) tb_usuarios.getValueAt(Linha, 6));
        c_score.setText((String) tb_usuarios.getValueAt(Linha, 7).toString());
        c_nivelacesso.setSelectedItem(tb_usuarios.getValueAt(Linha, 8).toString());
    }//GEN-LAST:event_tb_usuariosMouseClicked

    private void c_prioridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_prioridadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_prioridadeActionPerformed

    private void b_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salvarActionPerformed
        CONTROLLER.GerenciarUsuariosC GerenciarUsuariosC = new CONTROLLER.GerenciarUsuariosC();
        int Linha = tb_usuarios.getSelectedRow();
        
        
        String Score = c_score.getText().toString();
        String NivelAcesso = c_nivelacesso.getSelectedItem().toString();
        String ID = tb_usuarios.getValueAt(Linha, 0).toString();
        
        if (Score.length() > 3 || Score.equals("") || Integer.parseInt(Score) > 100 || Integer.parseInt(Score) < 0){
            JOptionPane.showMessageDialog(null, "O score deve ter até 3 digítos entre 0 e 100!", "Erro", JOptionPane.INFORMATION_MESSAGE);
        } else{
            boolean Atualizado = GerenciarUsuariosC.Salvar(Integer.parseInt(Score), Integer.parseInt(NivelAcesso), Integer.parseInt(ID));
        
            if(Atualizado == true){
                String Procurar = c_procurar.getText().toString();
                String Filtro = c_infos_filtro.getSelectedItem().toString();
                String Selecionado = c_tipo_filtro.getSelectedItem().toString();
                
                c_email.setText("");
                c_nomecompleto.setText("");
                c_cpf.setText("");
                c_rg.setText("");
                c_endereco.setText("");
                c_telefone.setText("");
                c_score.setText("");
                c_nivelacesso.setSelectedItem("0");

                tb_usuarios.setModel(GerenciarUsuariosC.ListarUsuarios(Procurar, Filtro, Selecionado));
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso!", "Atualizado", JOptionPane.INFORMATION_MESSAGE);
            } else{
                JOptionPane.showMessageDialog(null, "Erro ao atualizar, tente novamente mais tarde!", "Erro", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_b_salvarActionPerformed

    private void c_infos_filtroc_prioridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_infos_filtroc_prioridadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_infos_filtroc_prioridadeActionPerformed

    private void b_procurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_procurarActionPerformed
        CONTROLLER.GerenciarUsuariosC GerenciarUsuariosC = new CONTROLLER.GerenciarUsuariosC();
        
        String Procurar = c_procurar.getText().toString();
        String Filtro = c_infos_filtro.getSelectedItem().toString();
        String Selecionado = c_tipo_filtro.getSelectedItem().toString();
        
        tb_usuarios.setModel(GerenciarUsuariosC.ListarUsuarios(Procurar, Filtro, Selecionado));
    }//GEN-LAST:event_b_procurarActionPerformed

    private void c_tipo_filtroc_prioridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_tipo_filtroc_prioridadeActionPerformed
        String Selecionado = c_tipo_filtro.getSelectedItem().toString();
        
        if(Selecionado.equals("Usuários")){
            c_email.setText("");
            c_nomecompleto.setText("");
            c_cpf.setText("");
            c_rg.setText("");
            c_endereco.setText("");
            c_telefone.setText("");
            c_score.setText("");
            c_nivelacesso.setSelectedItem("0");
            
            txt_score.setVisible(true);
            c_score.setVisible(true);
        } else {
            c_email.setText("");
            c_nomecompleto.setText("");
            c_cpf.setText("");
            c_rg.setText("");
            c_endereco.setText("");
            c_telefone.setText("");
            c_score.setText("");
            c_nivelacesso.setSelectedItem("0");
            
            txt_score.setVisible(false);
            c_score.setVisible(false);
        }
    }//GEN-LAST:event_c_tipo_filtroc_prioridadeActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cancelar;
    private javax.swing.JButton b_procurar;
    private javax.swing.JButton b_salvar;
    private javax.swing.JButton b_voltar;
    private javax.swing.JTextField c_cpf;
    private javax.swing.JTextField c_email;
    private javax.swing.JTextField c_endereco;
    private javax.swing.JComboBox<String> c_infos_filtro;
    private javax.swing.JComboBox<String> c_nivelacesso;
    private javax.swing.JTextField c_nomecompleto;
    private javax.swing.JTextField c_procurar;
    private javax.swing.JTextField c_rg;
    private javax.swing.JTextField c_score;
    private javax.swing.JTextField c_telefone;
    private javax.swing.JComboBox<String> c_tipo_filtro;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_usuarios;
    private javax.swing.JLabel txt_score;
    // End of variables declaration//GEN-END:variables
}
