/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author El Rey
 */
public class addItemView extends javax.swing.JFrame {

    /**
     * Creates new form chooseOption
     */
    public addItemView() {
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

        jPanel3 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addClientButton = new javax.swing.JButton();
        addDealerButton = new javax.swing.JButton();
        addProductButon = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(195, 195, 195));
        jPanel3.setMaximumSize(new java.awt.Dimension(950, 600));
        jPanel3.setMinimumSize(new java.awt.Dimension(950, 600));
        jPanel3.setLayout(null);

        jTextField3.setBackground(new java.awt.Color(196, 196, 196));
        jTextField3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Developed by jviedman dev - enriquez dev");
        jTextField3.setBorder(null);
        jPanel3.add(jTextField3);
        jTextField3.setBounds(220, 570, 520, 19);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("¿Qué ítem desea agregar?");
        jLabel6.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel6.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel6.setPreferredSize(new java.awt.Dimension(435, 90));
        jPanel3.add(jLabel6);
        jLabel6.setBounds(170, 120, 610, 50);

        addClientButton.setBackground(new java.awt.Color(131, 131, 131));
        addClientButton.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        addClientButton.setText("Cliente");
        addClientButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), java.awt.Color.black));
        addClientButton.setMaximumSize(new java.awt.Dimension(170, 75));
        addClientButton.setMinimumSize(new java.awt.Dimension(170, 75));
        addClientButton.setPreferredSize(new java.awt.Dimension(170, 75));
        addClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClientButtonActionPerformed(evt);
            }
        });
        jPanel3.add(addClientButton);
        addClientButton.setBounds(140, 330, 170, 50);

        addDealerButton.setBackground(new java.awt.Color(131, 131, 131));
        addDealerButton.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        addDealerButton.setText("Distribuidor");
        addDealerButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), java.awt.Color.black));
        addDealerButton.setMaximumSize(new java.awt.Dimension(170, 75));
        addDealerButton.setMinimumSize(new java.awt.Dimension(170, 75));
        addDealerButton.setPreferredSize(new java.awt.Dimension(170, 75));
        addDealerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDealerButtonActionPerformed(evt);
            }
        });
        jPanel3.add(addDealerButton);
        addDealerButton.setBounds(360, 330, 250, 50);

        addProductButon.setBackground(new java.awt.Color(131, 131, 131));
        addProductButon.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        addProductButon.setText("Producto");
        addProductButon.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), java.awt.Color.black));
        addProductButon.setMaximumSize(new java.awt.Dimension(170, 75));
        addProductButon.setMinimumSize(new java.awt.Dimension(170, 75));
        addProductButon.setPreferredSize(new java.awt.Dimension(170, 75));
        addProductButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductButonActionPerformed(evt);
            }
        });
        jPanel3.add(addProductButon);
        addProductButon.setBounds(650, 330, 180, 50);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Universidad del Valle");
        jLabel7.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel7.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel7.setPreferredSize(new java.awt.Dimension(435, 90));
        jPanel3.add(jLabel7);
        jLabel7.setBounds(270, 40, 435, 90);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClientButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addClientButtonActionPerformed

    private void addDealerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDealerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDealerButtonActionPerformed

    private void addProductButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductButonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addProductButonActionPerformed

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
            java.util.logging.Logger.getLogger(addItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addItemView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addClientButton;
    public javax.swing.JButton addDealerButton;
    public javax.swing.JButton addProductButon;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
