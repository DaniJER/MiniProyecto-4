/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.dealers;

/**
 *
 * @author El Rey
 */
public class updateDealerView extends javax.swing.JFrame {

    /**
     * Creates new form udpateDealerView
     */
    public updateDealerView() {
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
        updateDealerButton = new javax.swing.JButton();
        idDealerField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dealerNameField = new javax.swing.JTextField();
        dealerLastNameField = new javax.swing.JTextField();
        dealerCelField = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        backButtonUpdateDealer = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(950, 600));
        setMinimumSize(new java.awt.Dimension(950, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(196, 196, 196));
        jPanel1.setMaximumSize(new java.awt.Dimension(950, 600));
        jPanel1.setLayout(null);

        jTextField1.setBackground(new java.awt.Color(196, 196, 196));
        jTextField1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setText("Actualizar distribuidor por ID");
        jTextField1.setBorder(null);
        jTextField1.setMaximumSize(new java.awt.Dimension(0, 0));
        jTextField1.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextField1.setPreferredSize(new java.awt.Dimension(0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(250, 50, 550, 60);

        jTextField17.setBackground(new java.awt.Color(196, 196, 196));
        jTextField17.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(0, 0, 0));
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("Developed by jviedman dev - enriquez dev");
        jTextField17.setBorder(null);
        jPanel1.add(jTextField17);
        jTextField17.setBounds(220, 550, 520, 19);

        updateDealerButton.setBackground(new java.awt.Color(131, 131, 131));
        updateDealerButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        updateDealerButton.setText("Actualizar ");
        updateDealerButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        updateDealerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDealerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateDealerButton);
        updateDealerButton.setBounds(390, 470, 230, 60);

        idDealerField.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        idDealerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idDealerFieldActionPerformed(evt);
            }
        });
        jPanel1.add(idDealerField);
        idDealerField.setBounds(450, 130, 180, 40);

        jLabel4.setBackground(new java.awt.Color(196, 196, 196));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("<html>ID</html>");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel4.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel4.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel4.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 120, 90, 60);

        jLabel8.setBackground(new java.awt.Color(196, 196, 196));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("<html>Nombre</html>");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel8.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel8.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel8.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(300, 260, 110, 70);

        jLabel7.setBackground(new java.awt.Color(196, 196, 196));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("<html>Apellido</html>");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel7.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel7.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel7.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(300, 320, 100, 70);

        jLabel5.setBackground(new java.awt.Color(196, 196, 196));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("<html>Celular</html>");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel5.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel5.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel5.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(300, 380, 90, 60);

        dealerNameField.setForeground(new java.awt.Color(204, 204, 204));
        dealerNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        dealerNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealerNameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(dealerNameField);
        dealerNameField.setBounds(450, 270, 180, 40);

        dealerLastNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        dealerLastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealerLastNameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(dealerLastNameField);
        dealerLastNameField.setBounds(450, 330, 180, 40);

        dealerCelField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        dealerCelField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealerCelFieldActionPerformed(evt);
            }
        });
        jPanel1.add(dealerCelField);
        dealerCelField.setBounds(450, 390, 180, 40);

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
        jPanel1.add(jTextField5);
        jTextField5.setBounds(210, 200, 660, 50);

        backButtonUpdateDealer.setBackground(new java.awt.Color(131, 131, 131));
        backButtonUpdateDealer.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        backButtonUpdateDealer.setText("Volver");
        backButtonUpdateDealer.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), java.awt.Color.black));
        backButtonUpdateDealer.setMaximumSize(new java.awt.Dimension(170, 75));
        backButtonUpdateDealer.setMinimumSize(new java.awt.Dimension(170, 75));
        backButtonUpdateDealer.setPreferredSize(new java.awt.Dimension(170, 75));
        backButtonUpdateDealer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonUpdateDealerActionPerformed(evt);
            }
        });
        jPanel1.add(backButtonUpdateDealer);
        backButtonUpdateDealer.setBounds(740, 480, 160, 50);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Mega\\Univalle\\III semestre\\POE\\Projects\\MiniProyecto-4\\src\\main\\java\\resources\\LogoUnivalle.jpeg")); // NOI18N
        jLabel3.setText("jLabel1");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 30, 200, 260);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 950, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void updateDealerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDealerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateDealerButtonActionPerformed

    private void idDealerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idDealerFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idDealerFieldActionPerformed

    private void dealerNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealerNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dealerNameFieldActionPerformed

    private void dealerLastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealerLastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dealerLastNameFieldActionPerformed

    private void dealerCelFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealerCelFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dealerCelFieldActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void backButtonUpdateDealerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonUpdateDealerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonUpdateDealerActionPerformed

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
            java.util.logging.Logger.getLogger(updateDealerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateDealerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateDealerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateDealerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateDealerView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton backButtonUpdateDealer;
    public javax.swing.JTextField dealerCelField;
    public javax.swing.JTextField dealerLastNameField;
    public javax.swing.JTextField dealerNameField;
    public javax.swing.JTextField idDealerField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField5;
    public javax.swing.JButton updateDealerButton;
    // End of variables declaration//GEN-END:variables
}
