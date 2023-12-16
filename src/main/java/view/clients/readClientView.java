/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.clients;

/**
 *
 * @author El Rey
 */
public class readClientView extends javax.swing.JFrame {

    /**
     * Creates new form readClientView
     */
    public readClientView() {
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
        searchClientButton = new javax.swing.JButton();
        idClientField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        backButtonReadClients = new javax.swing.JButton();
        menuPrincipalButtonClients = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(196, 196, 196));
        jPanel1.setLayout(null);

        jTextField1.setBackground(new java.awt.Color(196, 196, 196));
        jTextField1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setText("Buscar Cliente por ID");
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
        jTextField1.setBounds(320, 100, 380, 100);

        jTextField17.setBackground(new java.awt.Color(196, 196, 196));
        jTextField17.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(0, 0, 0));
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("Developed by jviedman dev - enriquez dev");
        jTextField17.setBorder(null);
        jPanel1.add(jTextField17);
        jTextField17.setBounds(270, 560, 520, 19);

        searchClientButton.setBackground(new java.awt.Color(131, 131, 131));
        searchClientButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        searchClientButton.setText("Buscar cliente");
        searchClientButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        searchClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchClientButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchClientButton);
        searchClientButton.setBounds(390, 470, 210, 60);

        idClientField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        idClientField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idClientFieldActionPerformed(evt);
            }
        });
        idClientField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idClientFieldKeyTyped(evt);
            }
        });
        jPanel1.add(idClientField);
        idClientField.setBounds(440, 300, 180, 40);

        jLabel4.setBackground(new java.awt.Color(196, 196, 196));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("<html>ID</html>");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel4.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel4.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel4.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(390, 290, 90, 60);

        backButtonReadClients.setBackground(new java.awt.Color(131, 131, 131));
        backButtonReadClients.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        backButtonReadClients.setText("Volver");
        backButtonReadClients.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        backButtonReadClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonReadClientsActionPerformed(evt);
            }
        });
        jPanel1.add(backButtonReadClients);
        backButtonReadClients.setBounds(270, 470, 110, 60);

        menuPrincipalButtonClients.setBackground(new java.awt.Color(131, 131, 131));
        menuPrincipalButtonClients.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        menuPrincipalButtonClients.setText("Menu principal");
        menuPrincipalButtonClients.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        menuPrincipalButtonClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrincipalButtonClientsActionPerformed(evt);
            }
        });
        jPanel1.add(menuPrincipalButtonClients);
        menuPrincipalButtonClients.setBounds(610, 470, 190, 60);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Mega\\Univalle\\III semestre\\POE\\Projects\\MiniProyecto-4\\src\\main\\java\\resources\\LogoUnivalle.jpeg")); // NOI18N
        jLabel3.setText("jLabel1");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(780, 40, 200, 260);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\Mega\\Univalle\\III semestre\\POE\\Projects\\MiniProyecto-4\\src\\main\\java\\resources\\LogoUnivalle.jpeg")); // NOI18N
        jLabel5.setText("jLabel1");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 30, 200, 260);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void searchClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchClientButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchClientButtonActionPerformed

    private void idClientFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idClientFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idClientFieldActionPerformed

    private void idClientFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idClientFieldKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros){
            
            evt.consume();
        }

        if (idClientField.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_idClientFieldKeyTyped

    private void backButtonReadClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonReadClientsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonReadClientsActionPerformed

    private void menuPrincipalButtonClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrincipalButtonClientsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuPrincipalButtonClientsActionPerformed

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
            java.util.logging.Logger.getLogger(readClientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(readClientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(readClientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(readClientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new readClientView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton backButtonReadClients;
    public javax.swing.JTextField idClientField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField17;
    public javax.swing.JButton menuPrincipalButtonClients;
    public javax.swing.JButton searchClientButton;
    // End of variables declaration//GEN-END:variables
}
