/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.dealers;

/**
 *
 * @author El Rey
 */
public class createDealerView extends javax.swing.JFrame {

    /**
     * Creates new form createDealer
     */
    public createDealerView() {
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
        jTextField1 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        addDealerButton = new javax.swing.JButton();
        lastNameClientField = new javax.swing.JTextField();
        clientNameField = new javax.swing.JTextField();
        idClientField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        idClientField1 = new javax.swing.JTextField();
        celDealerField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(196, 196, 196));
        jPanel1.setLayout(null);

        jTextField1.setBackground(new java.awt.Color(196, 196, 196));
        jTextField1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setText("Ingrese los datos del distribuidor");
        jTextField1.setBorder(null);
        jTextField1.setMaximumSize(new java.awt.Dimension(0, 0));
        jTextField1.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextField1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(230, 50, 560, 100);

        jTextField17.setBackground(new java.awt.Color(196, 196, 196));
        jTextField17.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(0, 0, 0));
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("Developed by jviedman dev - enriquez dev");
        jTextField17.setBorder(null);
        jPanel1.add(jTextField17);
        jTextField17.setBounds(260, 610, 520, 19);

        addDealerButton.setBackground(new java.awt.Color(131, 131, 131));
        addDealerButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        addDealerButton.setText("Guardar distribuidor");
        addDealerButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        addDealerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDealerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addDealerButton);
        addDealerButton.setBounds(410, 510, 230, 60);

        lastNameClientField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lastNameClientField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameClientFieldActionPerformed(evt);
            }
        });
        jPanel1.add(lastNameClientField);
        lastNameClientField.setBounds(460, 250, 180, 40);

        clientNameField.setForeground(new java.awt.Color(204, 204, 204));
        clientNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        clientNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientNameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(clientNameField);
        clientNameField.setBounds(460, 190, 180, 40);

        idClientField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        idClientField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idClientFieldActionPerformed(evt);
            }
        });
        jPanel1.add(idClientField);
        idClientField.setBounds(460, 310, 180, 40);

        jLabel4.setBackground(new java.awt.Color(196, 196, 196));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("<html>ID</html>");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel4.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel4.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel4.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(340, 300, 90, 60);

        jLabel7.setBackground(new java.awt.Color(196, 196, 196));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("<html>Apellido</html>");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel7.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel7.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel7.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(340, 230, 100, 70);

        jLabel8.setBackground(new java.awt.Color(196, 196, 196));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("<html>Nombre</html>");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel8.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel8.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel8.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(340, 170, 110, 70);

        backButton.setBackground(new java.awt.Color(196, 196, 196));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/close.png"))); // NOI18N
        backButton.setBorder(null);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton);
        backButton.setBounds(40, 50, 100, 90);

        jLabel5.setBackground(new java.awt.Color(196, 196, 196));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("<html>Marca</html>");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel5.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel5.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel5.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(340, 360, 90, 60);

        idClientField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        idClientField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idClientField1ActionPerformed(evt);
            }
        });
        jPanel1.add(idClientField1);
        idClientField1.setBounds(460, 370, 180, 40);

        celDealerField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        celDealerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celDealerFieldActionPerformed(evt);
            }
        });
        jPanel1.add(celDealerField);
        celDealerField.setBounds(460, 420, 180, 40);

        jLabel6.setBackground(new java.awt.Color(196, 196, 196));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("<html>Celular</html>");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel6.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel6.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel6.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(340, 410, 90, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addDealerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDealerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDealerButtonActionPerformed

    private void lastNameClientFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameClientFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameClientFieldActionPerformed

    private void clientNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientNameFieldActionPerformed

    private void idClientFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idClientFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idClientFieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed

    private void idClientField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idClientField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idClientField1ActionPerformed

    private void celDealerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celDealerFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celDealerFieldActionPerformed

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
            java.util.logging.Logger.getLogger(createDealerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createDealerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createDealerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createDealerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createDealerView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addDealerButton;
    public javax.swing.JButton backButton;
    public javax.swing.JTextField celDealerField;
    public javax.swing.JTextField clientNameField;
    public javax.swing.JTextField idClientField;
    public javax.swing.JTextField idClientField1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField17;
    public javax.swing.JTextField lastNameClientField;
    // End of variables declaration//GEN-END:variables
}