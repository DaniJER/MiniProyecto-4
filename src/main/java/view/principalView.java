/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author El Rey
 */
public class principalView extends javax.swing.JFrame {

    /**
     * Creates new form principalView
     */
    public principalView() {
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
        deleteItemProduct = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addItemButton = new javax.swing.JButton();
        updateItemProduct = new javax.swing.JButton();
        searchItemButton = new javax.swing.JButton();
        sellButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        buyProducts = new javax.swing.JButton();
        backUpButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(195, 195, 195));
        jPanel3.setMaximumSize(new java.awt.Dimension(950, 600));
        jPanel3.setMinimumSize(new java.awt.Dimension(950, 600));
        jPanel3.setLayout(null);

        deleteItemProduct.setBackground(new java.awt.Color(131, 131, 131));
        deleteItemProduct.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        deleteItemProduct.setText("Eliminar");
        deleteItemProduct.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), java.awt.Color.black));
        deleteItemProduct.setMaximumSize(new java.awt.Dimension(170, 75));
        deleteItemProduct.setMinimumSize(new java.awt.Dimension(170, 75));
        deleteItemProduct.setPreferredSize(new java.awt.Dimension(170, 75));
        deleteItemProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemProductActionPerformed(evt);
            }
        });
        jPanel3.add(deleteItemProduct);
        deleteItemProduct.setBounds(50, 420, 250, 50);

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
        jLabel6.setText("Módulo de gestión de mercado");
        jLabel6.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel6.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel6.setPreferredSize(new java.awt.Dimension(435, 90));
        jPanel3.add(jLabel6);
        jLabel6.setBounds(140, 100, 610, 50);

        addItemButton.setBackground(new java.awt.Color(131, 131, 131));
        addItemButton.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        addItemButton.setText("Agregar");
        addItemButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), java.awt.Color.black));
        addItemButton.setMaximumSize(new java.awt.Dimension(170, 75));
        addItemButton.setMinimumSize(new java.awt.Dimension(170, 75));
        addItemButton.setPreferredSize(new java.awt.Dimension(170, 75));
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });
        jPanel3.add(addItemButton);
        addItemButton.setBounds(50, 210, 250, 50);

        updateItemProduct.setBackground(new java.awt.Color(131, 131, 131));
        updateItemProduct.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        updateItemProduct.setText("Editar");
        updateItemProduct.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), java.awt.Color.black));
        updateItemProduct.setMaximumSize(new java.awt.Dimension(170, 75));
        updateItemProduct.setMinimumSize(new java.awt.Dimension(170, 75));
        updateItemProduct.setPreferredSize(new java.awt.Dimension(170, 75));
        updateItemProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateItemProductActionPerformed(evt);
            }
        });
        jPanel3.add(updateItemProduct);
        updateItemProduct.setBounds(50, 350, 250, 50);

        searchItemButton.setBackground(new java.awt.Color(131, 131, 131));
        searchItemButton.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        searchItemButton.setText("Buscar");
        searchItemButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), java.awt.Color.black));
        searchItemButton.setMaximumSize(new java.awt.Dimension(170, 75));
        searchItemButton.setMinimumSize(new java.awt.Dimension(170, 75));
        searchItemButton.setPreferredSize(new java.awt.Dimension(170, 75));
        searchItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchItemButtonActionPerformed(evt);
            }
        });
        jPanel3.add(searchItemButton);
        searchItemButton.setBounds(50, 280, 250, 50);

        sellButton.setBackground(new java.awt.Color(131, 131, 131));
        sellButton.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        sellButton.setText("Vender");
        sellButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), java.awt.Color.black));
        sellButton.setMaximumSize(new java.awt.Dimension(170, 75));
        sellButton.setMinimumSize(new java.awt.Dimension(170, 75));
        sellButton.setPreferredSize(new java.awt.Dimension(170, 75));
        sellButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellButtonActionPerformed(evt);
            }
        });
        jPanel3.add(sellButton);
        sellButton.setBounds(360, 300, 170, 80);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Universidad del Valle");
        jLabel7.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel7.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel7.setPreferredSize(new java.awt.Dimension(435, 90));
        jPanel3.add(jLabel7);
        jLabel7.setBounds(240, 10, 435, 90);

        buyProducts.setBackground(new java.awt.Color(131, 131, 131));
        buyProducts.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        buyProducts.setText("Comprar");
        buyProducts.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), java.awt.Color.black));
        buyProducts.setMaximumSize(new java.awt.Dimension(170, 75));
        buyProducts.setMinimumSize(new java.awt.Dimension(170, 75));
        buyProducts.setPreferredSize(new java.awt.Dimension(170, 75));
        buyProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyProductsActionPerformed(evt);
            }
        });
        jPanel3.add(buyProducts);
        buyProducts.setBounds(540, 300, 170, 80);

        backUpButton.setBackground(new java.awt.Color(131, 131, 131));
        backUpButton.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        backUpButton.setText("BackUp");
        backUpButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), java.awt.Color.black));
        backUpButton.setMaximumSize(new java.awt.Dimension(170, 75));
        backUpButton.setMinimumSize(new java.awt.Dimension(170, 75));
        backUpButton.setPreferredSize(new java.awt.Dimension(170, 75));
        backUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backUpButtonActionPerformed(evt);
            }
        });
        jPanel3.add(backUpButton);
        backUpButton.setBounds(50, 490, 250, 50);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Mega\\Univalle\\III semestre\\POE\\Projects\\MiniProyecto-4\\src\\main\\java\\resources\\LogoUnivalle.jpeg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(750, 30, 200, 260);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteItemProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteItemProductActionPerformed

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addItemButtonActionPerformed

    private void updateItemProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateItemProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateItemProductActionPerformed

    private void searchItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchItemButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchItemButtonActionPerformed

    private void sellButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellButtonActionPerformed

    private void buyProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyProductsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buyProductsActionPerformed

    private void backUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backUpButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backUpButtonActionPerformed

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
            java.util.logging.Logger.getLogger(principalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addItemButton;
    public javax.swing.JButton backUpButton;
    public javax.swing.JButton buyProducts;
    public javax.swing.JButton deleteItemProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField3;
    public javax.swing.JButton searchItemButton;
    public javax.swing.JButton sellButton;
    public javax.swing.JButton updateItemProduct;
    // End of variables declaration//GEN-END:variables
}
