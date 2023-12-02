/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.products;

/**
 *
 * @author El Rey
 */
public class addProductView extends javax.swing.JFrame {

    /**
     * Creates new form addProduct
     */
    public addProductView() {
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
        addProductButton = new javax.swing.JButton();
        productBrandField = new javax.swing.JTextField();
        productNameField = new javax.swing.JTextField();
        productPriceField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        productQuantityField = new javax.swing.JTextField();
        productIdDField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(196, 196, 196));
        jPanel1.setLayout(null);

        jTextField1.setBackground(new java.awt.Color(196, 196, 196));
        jTextField1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setText("Ingrese los datos del producto");
        jTextField1.setBorder(null);
        jTextField1.setMaximumSize(new java.awt.Dimension(0, 0));
        jTextField1.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextField1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(220, 50, 560, 100);

        jTextField17.setBackground(new java.awt.Color(196, 196, 196));
        jTextField17.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(0, 0, 0));
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("Developed by jviedman dev - enriquez dev");
        jTextField17.setBorder(null);
        jPanel1.add(jTextField17);
        jTextField17.setBounds(230, 560, 520, 19);

        addProductButton.setBackground(new java.awt.Color(131, 131, 131));
        addProductButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        addProductButton.setText("Guardar producto");
        addProductButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        addProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addProductButton);
        addProductButton.setBounds(390, 480, 210, 60);

        productBrandField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        productBrandField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productBrandFieldActionPerformed(evt);
            }
        });
        jPanel1.add(productBrandField);
        productBrandField.setBounds(450, 230, 180, 40);

        productNameField.setForeground(new java.awt.Color(204, 204, 204));
        productNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        productNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(productNameField);
        productNameField.setBounds(450, 170, 180, 40);

        productPriceField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        productPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productPriceFieldActionPerformed(evt);
            }
        });
        jPanel1.add(productPriceField);
        productPriceField.setBounds(450, 290, 180, 40);

        jLabel4.setBackground(new java.awt.Color(196, 196, 196));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("<html>Precio</html>");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel4.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel4.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel4.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(320, 280, 90, 60);

        jLabel7.setBackground(new java.awt.Color(196, 196, 196));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("<html>Marca</html>");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel7.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel7.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel7.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(320, 210, 90, 70);

        jLabel8.setBackground(new java.awt.Color(196, 196, 196));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("<html>Nombre</html>");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel8.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel8.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel8.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(320, 150, 110, 70);

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

        jLabel9.setBackground(new java.awt.Color(196, 196, 196));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("<html>ID</html>");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel9.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel9.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel9.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(320, 400, 60, 40);

        productQuantityField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        productQuantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productQuantityFieldActionPerformed(evt);
            }
        });
        jPanel1.add(productQuantityField);
        productQuantityField.setBounds(450, 350, 180, 40);

        productIdDField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        productIdDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productIdDFieldActionPerformed(evt);
            }
        });
        jPanel1.add(productIdDField);
        productIdDField.setBounds(450, 400, 180, 40);

        jLabel10.setBackground(new java.awt.Color(196, 196, 196));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("<html>Cantidad</html>");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel10.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel10.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel10.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(320, 330, 110, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addProductButtonActionPerformed

    private void productBrandFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productBrandFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productBrandFieldActionPerformed

    private void productNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameFieldActionPerformed

    private void productPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productPriceFieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed

    private void productQuantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productQuantityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productQuantityFieldActionPerformed

    private void productIdDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productIdDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productIdDFieldActionPerformed

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
            java.util.logging.Logger.getLogger(addProductView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addProductView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addProductView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addProductView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addProductView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addProductButton;
    public javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField17;
    public javax.swing.JTextField productBrandField;
    public javax.swing.JTextField productIdDField;
    public javax.swing.JTextField productNameField;
    public javax.swing.JTextField productPriceField;
    public javax.swing.JTextField productQuantityField;
    // End of variables declaration//GEN-END:variables
}