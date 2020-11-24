/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;

/**
 *
 * @author Mateus
 */
public class Inicio extends javax.swing.JInternalFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
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
        Tabela = new javax.swing.JScrollPane();
        Tabela_TOP10 = new javax.swing.JTable();
        Texto_BemVindo_2 = new javax.swing.JLabel();
        Texto_BemVindo_1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Inicio");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        getContentPane().setLayout(null);

        Fundo_Titulo.setBackground(new java.awt.Color(76, 175, 80));
        Fundo_Titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        Texto_Titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Texto_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Texto_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto_Titulo.setText("INÍCIO");
        Texto_Titulo.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout Fundo_TituloLayout = new javax.swing.GroupLayout(Fundo_Titulo);
        Fundo_Titulo.setLayout(Fundo_TituloLayout);
        Fundo_TituloLayout.setHorizontalGroup(
            Fundo_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(Fundo_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Fundo_TituloLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Texto_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        Fundo_TituloLayout.setVerticalGroup(
            Fundo_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
            .addGroup(Fundo_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Fundo_TituloLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Texto_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(Fundo_Titulo);
        Fundo_Titulo.setBounds(0, 0, 400, 40);

        Tabela_TOP10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null},
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
                "ID", "Endereço", "Descrição", "Status", "Priorirade", "Usuário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela_TOP10.setPreferredSize(new java.awt.Dimension(400, 159));
        Tabela_TOP10.setSelectionBackground(new java.awt.Color(76, 175, 80));
        Tabela_TOP10.getTableHeader().setResizingAllowed(false);
        Tabela_TOP10.getTableHeader().setReorderingAllowed(false);
        Tabela.setViewportView(Tabela_TOP10);

        getContentPane().add(Tabela);
        Tabela.setBounds(10, 160, 380, 190);

        Texto_BemVindo_2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Texto_BemVindo_2.setText("Confira abaixo as 10 últimas denúncias não atualizadas!");
        getContentPane().add(Texto_BemVindo_2);
        Texto_BemVindo_2.setBounds(20, 80, 370, 15);

        Texto_BemVindo_1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Texto_BemVindo_1.setText("Seja bem vido(a) de volta NOMECOMPLETO!");
        getContentPane().add(Texto_BemVindo_1);
        Texto_BemVindo_1.setBounds(20, 60, 370, 15);

        jButton1.setBackground(new java.awt.Color(76, 175, 80));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Atualizar");
        jButton1.setBorderPainted(false);
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 360, 80, 21);

        setBounds(1, 1, 410, 485);
    }// </editor-fold>//GEN-END:initComponents

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        
    }//GEN-LAST:event_formPropertyChange

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        MODEL.Inicio Inicio = new MODEL.Inicio();
        ResultSet res = Inicio.Tabela(10);
        Tabela_TOP10.setModel(DbUtils.resultSetToTableModel(res));
        
        MODEL.AD3Panel AD3Panel = new MODEL.AD3Panel();
        String Texto = Texto_BemVindo_1.getText();
        String NewTexto = Texto.replaceAll("NOMECOMPLETO",AD3Panel.getNomeCompleto());
        Texto_BemVindo_1.setText(NewTexto);
    }//GEN-LAST:event_formInternalFrameOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fundo_Titulo;
    private javax.swing.JScrollPane Tabela;
    public javax.swing.JTable Tabela_TOP10;
    public javax.swing.JLabel Texto_BemVindo_1;
    private javax.swing.JLabel Texto_BemVindo_2;
    private javax.swing.JLabel Texto_Titulo;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
