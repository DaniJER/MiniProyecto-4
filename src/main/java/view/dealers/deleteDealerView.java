/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.dealers;

/**
 *
 * @author Juan
 */
public class deleteDealerView extends javax.swing.JFrame {

    /**
     * Creates new form deleteDealerView
     */
    public deleteDealerView() {
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
        DealerField = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        deleteDealerButton = new javax.swing.JButton();
        idDealerField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        backButtonDeleteDealer = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(196, 196, 196));
        jPanel1.setMaximumSize(new java.awt.Dimension(950, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(950, 600));
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(null);

        DealerField.setBackground(new java.awt.Color(196, 196, 196));
        DealerField.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        DealerField.setForeground(new java.awt.Color(0, 0, 0));
        DealerField.setText("Eliminar proovedor por ID");
        DealerField.setBorder(null);
        DealerField.setMaximumSize(new java.awt.Dimension(0, 0));
        DealerField.setMinimumSize(new java.awt.Dimension(0, 0));
        DealerField.setPreferredSize(new java.awt.Dimension(0, 0));
        DealerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DealerFieldActionPerformed(evt);
            }
        });
        jPanel1.add(DealerField);
        DealerField.setBounds(250, 80, 450, 100);

        jTextField17.setBackground(new java.awt.Color(196, 196, 196));
        jTextField17.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(0, 0, 0));
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("Developed by jviedman dev - enriquez dev");
        jTextField17.setBorder(null);
        jPanel1.add(jTextField17);
        jTextField17.setBounds(250, 560, 520, 19);

        deleteDealerButton.setBackground(new java.awt.Color(131, 131, 131));
        deleteDealerButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        deleteDealerButton.setText("Eliminar ");
        deleteDealerButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        deleteDealerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDealerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteDealerButton);
        deleteDealerButton.setBounds(380, 390, 210, 60);

        idDealerField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        idDealerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idDealerFieldActionPerformed(evt);
            }
        });
        jPanel1.add(idDealerField);
        idDealerField.setBounds(400, 260, 180, 40);

        jLabel4.setBackground(new java.awt.Color(196, 196, 196));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("<html>ID</html>");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel4.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel4.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel4.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(340, 250, 90, 60);

        backButtonDeleteDealer.setBackground(new java.awt.Color(131, 131, 131));
        backButtonDeleteDealer.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        backButtonDeleteDealer.setText("Volver");
        backButtonDeleteDealer.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), java.awt.Color.black));
        backButtonDeleteDealer.setMaximumSize(new java.awt.Dimension(170, 75));
        backButtonDeleteDealer.setMinimumSize(new java.awt.Dimension(170, 75));
        backButtonDeleteDealer.setPreferredSize(new java.awt.Dimension(170, 75));
        backButtonDeleteDealer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonDeleteDealerActionPerformed(evt);
            }
        });
        jPanel1.add(backButtonDeleteDealer);
        backButtonDeleteDealer.setBounds(730, 480, 160, 50);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Mega\\Univalle\\III semestre\\POE\\Projects\\MiniProyecto-4\\src\\main\\java\\resources\\LogoUnivalle.jpeg")); // NOI18N
        jLabel3.setText("jLabel1");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(720, 40, 200, 260);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\Mega\\Univalle\\III semestre\\POE\\Projects\\MiniProyecto-4\\src\\main\\java\\resources\\LogoUnivalle.jpeg")); // NOI18N
        jLabel5.setText("jLabel1");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 30, 200, 260);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 950, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DealerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DealerFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DealerFieldActionPerformed

    private void deleteDealerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDealerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteDealerButtonActionPerformed

    private void idDealerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idDealerFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idDealerFieldActionPerformed

    private void backButtonDeleteDealerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonDeleteDealerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonDeleteDealerActionPerformed

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
            java.util.logging.Logger.getLogger(deleteDealerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deleteDealerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deleteDealerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deleteDealerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deleteDealerView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DealerField;
    public javax.swing.JButton backButtonDeleteDealer;
    public javax.swing.JButton deleteDealerButton;
    public javax.swing.JTextField idDealerField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField17;
    // End of variables declaration//GEN-END:variables
}
