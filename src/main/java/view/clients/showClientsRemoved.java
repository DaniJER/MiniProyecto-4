/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.clients;

/**
 *
 * @author El Rey
 */
public class showClientsRemoved extends javax.swing.JFrame {

    /**
     * Creates new form showClientsRemoved
     */
    public showClientsRemoved() {
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
        jTextField17 = new javax.swing.JTextField();
        backButtonClients = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        principalMenuButton = new javax.swing.JButton();
        nameClientRemoved = new javax.swing.JLabel();
        lastNameClientRemoved = new javax.swing.JLabel();
        idClientRemoved = new javax.swing.JLabel();
        celClientRemoved = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(196, 196, 196));
        jPanel1.setLayout(null);

        jTextField17.setBackground(new java.awt.Color(196, 196, 196));
        jTextField17.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(0, 0, 0));
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("Developed by jviedman dev - enriquez dev");
        jTextField17.setBorder(null);
        jPanel1.add(jTextField17);
        jTextField17.setBounds(260, 600, 520, 19);

        backButtonClients.setBackground(new java.awt.Color(131, 131, 131));
        backButtonClients.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        backButtonClients.setText("Volver");
        backButtonClients.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        backButtonClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonClientsActionPerformed(evt);
            }
        });
        jPanel1.add(backButtonClients);
        backButtonClients.setBounds(280, 510, 210, 60);

        jTextField2.setBackground(new java.awt.Color(196, 196, 196));
        jTextField2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setText("Datos del cliente eliminado");
        jTextField2.setBorder(null);
        jTextField2.setMaximumSize(new java.awt.Dimension(0, 0));
        jTextField2.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextField2.setPreferredSize(new java.awt.Dimension(0, 0));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(280, 20, 470, 100);

        principalMenuButton.setBackground(new java.awt.Color(131, 131, 131));
        principalMenuButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        principalMenuButton.setText("Menu Principal");
        principalMenuButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        principalMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                principalMenuButtonActionPerformed(evt);
            }
        });
        jPanel1.add(principalMenuButton);
        principalMenuButton.setBounds(510, 510, 210, 60);

        nameClientRemoved.setBackground(new java.awt.Color(196, 196, 196));
        nameClientRemoved.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        nameClientRemoved.setForeground(new java.awt.Color(0, 0, 0));
        nameClientRemoved.setText("<html>Nombre:</html>");
        nameClientRemoved.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nameClientRemoved.setMaximumSize(new java.awt.Dimension(0, 0));
        nameClientRemoved.setMinimumSize(new java.awt.Dimension(0, 0));
        nameClientRemoved.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(nameClientRemoved);
        nameClientRemoved.setBounds(320, 160, 500, 60);

        lastNameClientRemoved.setBackground(new java.awt.Color(196, 196, 196));
        lastNameClientRemoved.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lastNameClientRemoved.setForeground(new java.awt.Color(0, 0, 0));
        lastNameClientRemoved.setText("<html>Apellido:</html>");
        lastNameClientRemoved.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lastNameClientRemoved.setMaximumSize(new java.awt.Dimension(0, 0));
        lastNameClientRemoved.setMinimumSize(new java.awt.Dimension(0, 0));
        lastNameClientRemoved.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(lastNameClientRemoved);
        lastNameClientRemoved.setBounds(320, 220, 440, 70);

        idClientRemoved.setBackground(new java.awt.Color(196, 196, 196));
        idClientRemoved.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        idClientRemoved.setForeground(new java.awt.Color(0, 0, 0));
        idClientRemoved.setText("<html>Celular:</html>");
        idClientRemoved.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        idClientRemoved.setMaximumSize(new java.awt.Dimension(0, 0));
        idClientRemoved.setMinimumSize(new java.awt.Dimension(0, 0));
        idClientRemoved.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(idClientRemoved);
        idClientRemoved.setBounds(320, 290, 440, 60);

        celClientRemoved.setBackground(new java.awt.Color(196, 196, 196));
        celClientRemoved.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        celClientRemoved.setForeground(new java.awt.Color(0, 0, 0));
        celClientRemoved.setText("<html>Cedula:</html>");
        celClientRemoved.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        celClientRemoved.setMaximumSize(new java.awt.Dimension(0, 0));
        celClientRemoved.setMinimumSize(new java.awt.Dimension(0, 0));
        celClientRemoved.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(celClientRemoved);
        celClientRemoved.setBounds(320, 350, 410, 70);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Mega\\Univalle\\III semestre\\POE\\Projects\\MiniProyecto-4\\src\\main\\java\\resources\\LogoUnivalle.jpeg")); // NOI18N
        jLabel3.setText("jLabel1");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(790, 40, 200, 260);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\Mega\\Univalle\\III semestre\\POE\\Projects\\MiniProyecto-4\\src\\main\\java\\resources\\LogoUnivalle.jpeg")); // NOI18N
        jLabel4.setText("jLabel1");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 30, 200, 260);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1027, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonClientsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonClientsActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void principalMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_principalMenuButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_principalMenuButtonActionPerformed

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
            java.util.logging.Logger.getLogger(showClientsRemoved.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showClientsRemoved.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showClientsRemoved.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showClientsRemoved.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showClientsRemoved().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton backButtonClients;
    public javax.swing.JLabel celClientRemoved;
    public javax.swing.JLabel idClientRemoved;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    public javax.swing.JLabel lastNameClientRemoved;
    public javax.swing.JLabel nameClientRemoved;
    public javax.swing.JButton principalMenuButton;
    // End of variables declaration//GEN-END:variables
}
