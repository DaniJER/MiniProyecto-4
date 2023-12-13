/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.buy;

/**
 *
 * @author Juan
 */
public class buyView extends javax.swing.JFrame {

    /**
     * Creates new form buyView
     */
    public buyView() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        quantityProduct = new javax.swing.JTextField();
        idDealer = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        buyProduct = new javax.swing.JButton();
        backButtonBuy = new javax.swing.JButton();
        principalMenuButtonBuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(195, 195, 195));
        jPanel1.setMaximumSize(new java.awt.Dimension(950, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(950, 600));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingrese la cantidad a comprar");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 300, 250, 80);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seleccione un producto");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 210, 210, 80);

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(510, 230, 180, 40);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingrese el ID del proveedor");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(220, 140, 220, 80);

        quantityProduct.setForeground(new java.awt.Color(204, 204, 204));
        quantityProduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        quantityProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityProductActionPerformed(evt);
            }
        });
        jPanel1.add(quantityProduct);
        quantityProduct.setBounds(510, 310, 180, 40);

        idDealer.setForeground(new java.awt.Color(0, 0, 0));
        idDealer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        idDealer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idDealerActionPerformed(evt);
            }
        });
        jPanel1.add(idDealer);
        idDealer.setBounds(510, 160, 180, 40);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Comprar productos");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(190, 70, 570, 50);

        buyProduct.setBackground(new java.awt.Color(131, 131, 131));
        buyProduct.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        buyProduct.setText("Comprar producto");
        buyProduct.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        buyProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyProductActionPerformed(evt);
            }
        });
        jPanel1.add(buyProduct);
        buyProduct.setBounds(400, 450, 210, 60);

        backButtonBuy.setBackground(new java.awt.Color(131, 131, 131));
        backButtonBuy.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        backButtonBuy.setText("Volver");
        backButtonBuy.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        backButtonBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonBuyActionPerformed(evt);
            }
        });
        jPanel1.add(backButtonBuy);
        backButtonBuy.setBounds(250, 450, 120, 60);

        principalMenuButtonBuy.setBackground(new java.awt.Color(131, 131, 131));
        principalMenuButtonBuy.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        principalMenuButtonBuy.setText("Menu principal");
        principalMenuButtonBuy.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        principalMenuButtonBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                principalMenuButtonBuyActionPerformed(evt);
            }
        });
        jPanel1.add(principalMenuButtonBuy);
        principalMenuButtonBuy.setBounds(640, 450, 210, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 950, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quantityProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityProductActionPerformed

    private void idDealerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idDealerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idDealerActionPerformed

    private void buyProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buyProductActionPerformed

    private void backButtonBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonBuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonBuyActionPerformed

    private void principalMenuButtonBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_principalMenuButtonBuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_principalMenuButtonBuyActionPerformed

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
            java.util.logging.Logger.getLogger(buyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buyView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton backButtonBuy;
    public javax.swing.JButton buyProduct;
    public javax.swing.JTextField idDealer;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton principalMenuButtonBuy;
    public javax.swing.JTextField quantityProduct;
    // End of variables declaration//GEN-END:variables
}
