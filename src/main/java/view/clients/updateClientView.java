/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.clients;

/**
 *
 * @author El Rey
 */
public class updateClientView extends javax.swing.JFrame {

    /**
     * Creates new form updateClientView
     */
    public updateClientView() {
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

        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        updateClientButton1 = new javax.swing.JButton();
        idClientField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        lastNameClientField = new javax.swing.JTextField();
        clientNameField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        celClientField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        backButtonUpdateClient = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(196, 196, 196));
        jPanel2.setMaximumSize(new java.awt.Dimension(900, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(900, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel2.setLayout(null);

        jTextField2.setBackground(new java.awt.Color(196, 196, 196));
        jTextField2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setText("Actualizar cliente por ID");
        jTextField2.setBorder(null);
        jTextField2.setMaximumSize(new java.awt.Dimension(0, 0));
        jTextField2.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextField2.setPreferredSize(new java.awt.Dimension(0, 0));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(270, 40, 420, 70);

        jTextField17.setBackground(new java.awt.Color(196, 196, 196));
        jTextField17.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(0, 0, 0));
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("Developed by jviedman dev - enriquez dev");
        jTextField17.setBorder(null);
        jPanel2.add(jTextField17);
        jTextField17.setBounds(250, 560, 520, 19);

        updateClientButton1.setBackground(new java.awt.Color(131, 131, 131));
        updateClientButton1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        updateClientButton1.setText("Actualizar");
        updateClientButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        updateClientButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateClientButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(updateClientButton1);
        updateClientButton1.setBounds(380, 460, 210, 60);

        idClientField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        idClientField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idClientFieldActionPerformed(evt);
            }
        });
        jPanel2.add(idClientField);
        idClientField.setBounds(450, 140, 180, 40);

        jLabel4.setBackground(new java.awt.Color(196, 196, 196));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("<html>ID</html>");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel4.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel4.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel4.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel2.add(jLabel4);
        jLabel4.setBounds(320, 130, 90, 60);

        jTextField5.setBackground(new java.awt.Color(196, 196, 196));
        jTextField5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 0));
        jTextField5.setText("Ingrese los datos a ser actualizados");
        jTextField5.setBorder(null);
        jTextField5.setMaximumSize(new java.awt.Dimension(0, 0));
        jTextField5.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextField5.setPreferredSize(new java.awt.Dimension(0, 0));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField5);
        jTextField5.setBounds(180, 190, 660, 50);

        lastNameClientField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lastNameClientField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameClientFieldActionPerformed(evt);
            }
        });
        jPanel2.add(lastNameClientField);
        lastNameClientField.setBounds(450, 310, 180, 40);

        clientNameField.setForeground(new java.awt.Color(204, 204, 204));
        clientNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        clientNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientNameFieldActionPerformed(evt);
            }
        });
        jPanel2.add(clientNameField);
        clientNameField.setBounds(450, 250, 180, 40);

        jLabel7.setBackground(new java.awt.Color(196, 196, 196));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("<html>Apellido</html>");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel7.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel7.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel7.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel2.add(jLabel7);
        jLabel7.setBounds(300, 300, 100, 70);

        jLabel8.setBackground(new java.awt.Color(196, 196, 196));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("<html>Nombre</html>");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel8.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel8.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel8.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel2.add(jLabel8);
        jLabel8.setBounds(300, 240, 110, 70);

        celClientField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        celClientField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celClientFieldActionPerformed(evt);
            }
        });
        jPanel2.add(celClientField);
        celClientField.setBounds(450, 370, 180, 40);

        jLabel5.setBackground(new java.awt.Color(196, 196, 196));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("<html>Celular</html>");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel5.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel5.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel5.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel2.add(jLabel5);
        jLabel5.setBounds(300, 360, 90, 60);

        backButtonUpdateClient.setBackground(new java.awt.Color(131, 131, 131));
        backButtonUpdateClient.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        backButtonUpdateClient.setText("Volver");
        backButtonUpdateClient.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), java.awt.Color.black));
        backButtonUpdateClient.setMaximumSize(new java.awt.Dimension(170, 75));
        backButtonUpdateClient.setMinimumSize(new java.awt.Dimension(170, 75));
        backButtonUpdateClient.setPreferredSize(new java.awt.Dimension(170, 75));
        backButtonUpdateClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonUpdateClientActionPerformed(evt);
            }
        });
        jPanel2.add(backButtonUpdateClient);
        backButtonUpdateClient.setBounds(40, 50, 160, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 970, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void updateClientButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateClientButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateClientButton1ActionPerformed

    private void idClientFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idClientFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idClientFieldActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void lastNameClientFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameClientFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameClientFieldActionPerformed

    private void clientNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientNameFieldActionPerformed

    private void celClientFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celClientFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celClientFieldActionPerformed

    private void backButtonUpdateClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonUpdateClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonUpdateClientActionPerformed

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
            java.util.logging.Logger.getLogger(updateClientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateClientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateClientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateClientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateClientView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton backButtonUpdateClient;
    public javax.swing.JTextField celClientField;
    public javax.swing.JTextField clientNameField;
    public javax.swing.JTextField idClientField;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    public javax.swing.JTextField lastNameClientField;
    public javax.swing.JButton updateClientButton1;
    // End of variables declaration//GEN-END:variables
}
