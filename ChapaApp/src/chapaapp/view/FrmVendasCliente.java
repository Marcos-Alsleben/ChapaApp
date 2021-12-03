/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapaapp.view;

/**
 *
 * @author usuario
 */
public class FrmVendasCliente extends javax.swing.JFrame {

    /**
     * Creates new form FrmVendasCliente
     */
    public FrmVendasCliente() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_vendascliente = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        btn_novoCliente = new javax.swing.JButton();
        btn_alterarCliente = new javax.swing.JButton();
        btn_excluirCliente = new javax.swing.JButton();
        btn_limparCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(65, 65, 65));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro Vendas/Cliente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tb_vendascliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cod", "Motivo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_vendascliente);
        if (tb_vendascliente.getColumnModel().getColumnCount() > 0) {
            tb_vendascliente.getColumnModel().getColumn(0).setMinWidth(0);
            tb_vendascliente.getColumnModel().getColumn(0).setPreferredWidth(0);
            tb_vendascliente.getColumnModel().getColumn(0).setMaxWidth(0);
            tb_vendascliente.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        jPanel2.setBackground(new java.awt.Color(65, 65, 65));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setText("jTextField1");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setText("jTextField1");

        btn_novoCliente.setBackground(new java.awt.Color(22, 22, 22));
        btn_novoCliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_novoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Adicionar_32px.png"))); // NOI18N
        btn_novoCliente.setToolTipText("Adicionar novo!");
        btn_novoCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_novoCliente.setBorderPainted(false);
        btn_novoCliente.setEnabled(false);
        btn_novoCliente.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_novoCliente.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_novoCliente.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_novoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoClienteActionPerformed(evt);
            }
        });

        btn_alterarCliente.setBackground(new java.awt.Color(22, 22, 22));
        btn_alterarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Alterar_32px.png"))); // NOI18N
        btn_alterarCliente.setToolTipText("Alterar!");
        btn_alterarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_alterarCliente.setBorderPainted(false);
        btn_alterarCliente.setEnabled(false);
        btn_alterarCliente.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_alterarCliente.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_alterarCliente.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_alterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarClienteActionPerformed(evt);
            }
        });

        btn_excluirCliente.setBackground(new java.awt.Color(22, 22, 22));
        btn_excluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Remover_32px.png"))); // NOI18N
        btn_excluirCliente.setToolTipText("Excluir!");
        btn_excluirCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_excluirCliente.setBorderPainted(false);
        btn_excluirCliente.setEnabled(false);
        btn_excluirCliente.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_excluirCliente.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_excluirCliente.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_excluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirClienteActionPerformed(evt);
            }
        });

        btn_limparCliente.setBackground(new java.awt.Color(22, 22, 22));
        btn_limparCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Limpar_32px.png"))); // NOI18N
        btn_limparCliente.setToolTipText("Limpar!");
        btn_limparCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limparCliente.setBorderPainted(false);
        btn_limparCliente.setEnabled(false);
        btn_limparCliente.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_limparCliente.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_limparCliente.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_limparCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(btn_novoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_alterarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_excluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_limparCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_alterarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limparCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_novoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_novoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoClienteActionPerformed
        // Criar novo registro Cliente
        Clientes obj = new Clientes();

        obj.setNomeCliente(txt_nomeCliente.getText());

        ClientesDAO dao = new ClientesDAO();
        dao.CadastrarClientes(obj);

        txt_idCliente.setText("");
        txt_nomeCliente.setText("");

        btn_novoCliente.setEnabled(false);
        btn_alterarCliente.setEnabled(false);
        btn_excluirCliente.setEnabled(false);
        btn_limparCliente.setEnabled(false);

        AtualizarcbClientes();
    }//GEN-LAST:event_btn_novoClienteActionPerformed

    private void btn_alterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarClienteActionPerformed
        // Alterar novo registro Cliente
        Clientes obj = new Clientes();

        obj.setNomeCliente(txt_nomeCliente.getText());
        obj.setId(Integer.parseInt(txt_idCliente.getText()));

        ClientesDAO dao = new ClientesDAO();
        dao.alterarClientes(obj);

        txt_idCliente.setText("");
        txt_nomeCliente.setText("");

        btn_novoCliente.setEnabled(false);
        btn_alterarCliente.setEnabled(false);
        btn_excluirCliente.setEnabled(false);
        btn_limparCliente.setEnabled(false);

        AtualizarcbClientes();
    }//GEN-LAST:event_btn_alterarClienteActionPerformed

    private void btn_excluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirClienteActionPerformed
        // botao Excluir Clientes
        Clientes obj = new Clientes();

        obj.setId(Integer.parseInt(txt_idCliente.getText()));

        ClientesDAO dao = new ClientesDAO();

        dao.excluirClientes(obj);

        //Limpa os paineis
        txt_idCliente.setText("");
        txt_nomeCliente.setText("");

        //desabilita botões
        btn_novoCliente.setEnabled(false);
        btn_alterarCliente.setEnabled(false);
        btn_excluirCliente.setEnabled(false);
        btn_limparCliente.setEnabled(false);

        AtualizarcbClientes();
    }//GEN-LAST:event_btn_excluirClienteActionPerformed

    private void btn_limparClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparClienteActionPerformed
        // TODO add your handling code here:
        txt_idCliente.setText("");
        txt_nomeCliente.setText("");

        btn_novoCliente.setEnabled(false);
        btn_alterarCliente.setEnabled(false);
        btn_excluirCliente.setEnabled(false);
        btn_limparCliente.setEnabled(false);
    }//GEN-LAST:event_btn_limparClienteActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVendasCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVendasCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVendasCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVendasCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVendasCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterarCliente;
    private javax.swing.JButton btn_excluirCliente;
    private javax.swing.JButton btn_limparCliente;
    private javax.swing.JButton btn_novoCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tb_vendascliente;
    // End of variables declaration//GEN-END:variables
}
