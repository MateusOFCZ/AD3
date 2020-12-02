package VIEW;

import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerenciarDenuncias extends javax.swing.JFrame {

    /**
     * Creates new form Denuncia
     */
    public GerenciarDenuncias() {
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
        jLabel1 = new javax.swing.JLabel();
        c_estado = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        c_prioridade5 = new javax.swing.JComboBox<>();
        c_descricao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        b_voltar = new javax.swing.JButton();
        c_cidade = new javax.swing.JTextField();
        c_bairro = new javax.swing.JTextField();
        b_cancelar = new javax.swing.JButton();
        b_salvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_denuncias = new javax.swing.JTable();
        c_status = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        c_prioridade_filtro = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        c_status_filtro = new javax.swing.JComboBox<>();
        b_procurar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

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
        jLabel3.setText("Gerenciar Denúncias");
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

        jLabel1.setText("Estado");

        c_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Santa Catarina", "São Paulo", "Paraná", "Rio Grande do Sul" }));
        c_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_estadoActionPerformed(evt);
            }
        });

        jLabel2.setText("Cidade");

        jLabel4.setText("Bairro");

        jLabel5.setText("Prioridade");

        c_prioridade5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baixa", "Média", "Alta" }));
        c_prioridade5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_prioridadeActionPerformed(evt);
            }
        });

        c_descricao.setEditable(false);
        c_descricao.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        c_descricao.setToolTipText("");
        c_descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_descricaoActionPerformed(evt);
            }
        });

        jLabel6.setText("Descrição da Situação");

        b_voltar.setText("Voltar");
        b_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_voltarActionPerformed(evt);
            }
        });

        c_cidade.setEditable(false);

        c_bairro.setEditable(false);

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

        tb_denuncias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Usuário", "Endereço", "Descrição", "Prioridade", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_denuncias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_denunciasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_denuncias);
        if (tb_denuncias.getColumnModel().getColumnCount() > 0) {
            tb_denuncias.getColumnModel().getColumn(0).setResizable(false);
            tb_denuncias.getColumnModel().getColumn(1).setResizable(false);
            tb_denuncias.getColumnModel().getColumn(2).setResizable(false);
            tb_denuncias.getColumnModel().getColumn(3).setResizable(false);
            tb_denuncias.getColumnModel().getColumn(4).setResizable(false);
            tb_denuncias.getColumnModel().getColumn(5).setResizable(false);
        }

        c_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não Verificado", "Verificado", "Descartado" }));
        c_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_statusc_prioridadeActionPerformed(evt);
            }
        });

        jLabel7.setText("Status");

        c_prioridade_filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas", "Baixa", "Média", "Alta" }));
        c_prioridade_filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_prioridade_filtroc_prioridadeActionPerformed(evt);
            }
        });

        jLabel8.setText("Prioridade");

        jLabel9.setText("Status");

        c_status_filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Não Verificado", "Verificado", "Descartado" }));
        c_status_filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_status_filtroc_prioridadeActionPerformed(evt);
            }
        });

        b_procurar.setText("Procurar");
        b_procurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_procurarActionPerformed(evt);
            }
        });

        jMenu1.setText("Menu");

        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sobre");
        jMenuBar1.add(jMenu2);

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
                        .addGap(348, 375, Short.MAX_VALUE)
                        .addComponent(b_salvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(15, 42, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_prioridade5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(c_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(c_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(c_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_prioridade_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c_status_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(b_procurar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_prioridade_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_status_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_procurar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c_prioridade5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(c_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_voltar)
                    .addComponent(b_cancelar)
                    .addComponent(b_salvar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void c_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_estadoActionPerformed

    private void c_descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_descricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_descricaoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void b_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_voltarActionPerformed
        InicioColaborador InicioColaborador = new InicioColaborador();
        this.dispose();
        InicioColaborador.setVisible(true);
    }//GEN-LAST:event_b_voltarActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        int Linha = tb_denuncias.getSelectedRow();

        String Cidade = (String) tb_denuncias.getValueAt(Linha, 2);
        String[] NewCidade = Cidade.split(",");

        c_estado.setSelectedItem(0);
        
        c_cidade.setText(NewCidade[0]);
        c_bairro.setText(NewCidade[1]);
        
        c_descricao.setText((String) tb_denuncias.getValueAt(Linha, 3));
        c_prioridade5.setSelectedItem(tb_denuncias.getValueAt(Linha, 4));
        c_status.setSelectedItem(tb_denuncias.getValueAt(Linha, 5));
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        CONTROLLER.GerenciarDenunciasC GerenciarDenunciasC = new CONTROLLER.GerenciarDenunciasC();
        
        String PrioridadeFiltro = (String) c_prioridade_filtro.getSelectedItem();
        String StatusFiltro = (String) c_status_filtro.getSelectedItem();
        
        tb_denuncias.setModel(GerenciarDenunciasC.ListarDenuncias(PrioridadeFiltro, StatusFiltro));
    }//GEN-LAST:event_formWindowOpened

    private void tb_denunciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_denunciasMouseClicked
        int Linha = tb_denuncias.getSelectedRow();

        String Cidade = (String) tb_denuncias.getValueAt(Linha, 2);
        String[] NewCidade = Cidade.split(",");

        c_estado.setSelectedItem(0);
        
        c_cidade.setText(NewCidade[0]);
        c_bairro.setText(NewCidade[1]);
        
        c_descricao.setText((String) tb_denuncias.getValueAt(Linha, 3));
        c_prioridade5.setSelectedItem(tb_denuncias.getValueAt(Linha, 4));
        c_status.setSelectedItem(tb_denuncias.getValueAt(Linha, 5));
    }//GEN-LAST:event_tb_denunciasMouseClicked

    private void c_prioridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_prioridadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_prioridadeActionPerformed

    private void b_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salvarActionPerformed
        CONTROLLER.GerenciarDenunciasC GerenciarDenunciasC = new CONTROLLER.GerenciarDenunciasC();
        int Linha = tb_denuncias.getSelectedRow();
        
        String Status = (String) c_status.getSelectedItem();
        String Prioridade = (String) c_prioridade5.getSelectedItem();
        int Usuario = (int) tb_denuncias.getValueAt(Linha, 1);
        int ID = (int) tb_denuncias.getValueAt(Linha, 0);
        
        boolean Atualizado = GerenciarDenunciasC.Salvar(Prioridade, Status, Usuario, ID);
        
        String PrioridadeFiltro = (String) c_prioridade_filtro.getSelectedItem();
        String StatusFiltro = (String) c_status_filtro.getSelectedItem();
        
        if(Atualizado == true){
            tb_denuncias.setModel(GerenciarDenunciasC.ListarDenuncias(PrioridadeFiltro, StatusFiltro));
            c_bairro.setText("");
            c_cidade.setText("");
            c_descricao.setText("");
            c_estado.setSelectedItem("Santa Catarina");
            c_prioridade5.setSelectedItem("Baixa");
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!", "Atualizado", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_b_salvarActionPerformed

    private void c_statusc_prioridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_statusc_prioridadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_statusc_prioridadeActionPerformed

    private void c_prioridade_filtroc_prioridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_prioridade_filtroc_prioridadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_prioridade_filtroc_prioridadeActionPerformed

    private void c_status_filtroc_prioridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_status_filtroc_prioridadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_status_filtroc_prioridadeActionPerformed

    private void b_procurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_procurarActionPerformed
        CONTROLLER.GerenciarDenunciasC GerenciarDenunciasC = new CONTROLLER.GerenciarDenunciasC();
        
        String PrioridadeFiltro = (String) c_prioridade_filtro.getSelectedItem();
        String StatusFiltro = (String) c_status_filtro.getSelectedItem();
        
        tb_denuncias.setModel(GerenciarDenunciasC.ListarDenuncias(PrioridadeFiltro, StatusFiltro));
    }//GEN-LAST:event_b_procurarActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciarDenuncias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarDenuncias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarDenuncias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarDenuncias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new GerenciarDenuncias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cancelar;
    private javax.swing.JButton b_procurar;
    private javax.swing.JButton b_salvar;
    private javax.swing.JButton b_voltar;
    private javax.swing.JTextField c_bairro;
    private javax.swing.JTextField c_cidade;
    private javax.swing.JTextField c_descricao;
    private javax.swing.JComboBox<String> c_estado;
    private javax.swing.JComboBox<String> c_prioridade5;
    private javax.swing.JComboBox<String> c_prioridade_filtro;
    private javax.swing.JComboBox<String> c_status;
    private javax.swing.JComboBox<String> c_status_filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_denuncias;
    // End of variables declaration//GEN-END:variables
}
