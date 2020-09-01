package OperadoresLogicos;

import java.awt.Font;

public class LeitorDePensamento extends javax.swing.JFrame {
    
    public LeitorDePensamento() {
        initComponents();
        lblMessage1.setText("<html>Eu pensei em um número entre 1 e 5. Tente advinhar qual número é esse.</html>");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMessage1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtValue = new javax.swing.JSpinner();
        btnPalp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMessage1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMessage1.setText("Frase");
        lblMessage1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lblMessage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 70));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Valor:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, -1));

        txtValue.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        jPanel1.add(txtValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 49, -1));

        btnPalp.setText("Palpite");
        btnPalp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalpActionPerformed(evt);
            }
        });
        jPanel1.add(btnPalp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 73, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPalpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalpActionPerformed
        int value = Integer.parseInt(txtValue.getValue().toString());
        double ale = Math.random();
        int n = (int) (1 + ale * (6 - 1));
        String acerto = "ACERTOU!!!";
        String erro = "ERROU! Eu pensei em " + n;
        String res = (value == n) ? acerto:erro;
        
        lblMessage1.setText(res);
        lblMessage1.setFont(new Font("Arial Black", Font.PLAIN, 14));
        
    }//GEN-LAST:event_btnPalpActionPerformed

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
            java.util.logging.Logger.getLogger(LeitorDePensamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeitorDePensamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeitorDePensamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeitorDePensamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeitorDePensamento().setVisible(true);
            }     
        });
            }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPalp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMessage1;
    private javax.swing.JSpinner txtValue;
    // End of variables declaration//GEN-END:variables
}
