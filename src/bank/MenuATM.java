/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author Yuzron
 */
public class MenuATM extends javax.swing.JFrame {

    /**
     * Creates new form MenuATM
     */
    public MenuATM() {
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

        jBKeluar = new javax.swing.JButton();
        jBCek = new javax.swing.JButton();
        jBPenarikan = new javax.swing.JButton();
        jBSimpan = new javax.swing.JButton();
        jBTransfer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jBKeluar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBKeluar.setText("KELUAR");
        jBKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(jBKeluar);
        jBKeluar.setBounds(490, 290, 120, 30);

        jBCek.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCek.setText("CEK SALDO");
        jBCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCekActionPerformed(evt);
            }
        });
        getContentPane().add(jBCek);
        jBCek.setBounds(20, 140, 140, 50);

        jBPenarikan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBPenarikan.setText("PENARIKAN");
        jBPenarikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPenarikanActionPerformed(evt);
            }
        });
        getContentPane().add(jBPenarikan);
        jBPenarikan.setBounds(20, 200, 140, 50);

        jBSimpan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBSimpan.setText("SIMPAN");
        jBSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(jBSimpan);
        jBSimpan.setBounds(460, 140, 140, 50);

        jBTransfer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBTransfer.setText("TRANSFER");
        jBTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTransferActionPerformed(evt);
            }
        });
        getContentPane().add(jBTransfer);
        jBTransfer.setBounds(460, 200, 140, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Pilih yang ingin anda lakukan");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 20, 290, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\PB OBJEK\\pict GUI\\download.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 0, 210, 120);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 630, 340);

        setSize(new java.awt.Dimension(643, 374));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBKeluarActionPerformed
        dispose();
    }//GEN-LAST:event_jBKeluarActionPerformed

    private void jBCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCekActionPerformed
        int saldo = 5000000;
        String f = String.valueOf(saldo);
        CekSaldo b = new CekSaldo(f);
            b.show(); 
            dispose();
    }//GEN-LAST:event_jBCekActionPerformed

    private void jBPenarikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPenarikanActionPerformed
        Penarikan c = new Penarikan();
            c.show(); 
            dispose();
    }//GEN-LAST:event_jBPenarikanActionPerformed

    private void jBSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSimpanActionPerformed
        
        Simpan c = new Simpan();
            c.show(); 
            dispose();
    }//GEN-LAST:event_jBSimpanActionPerformed

    private void jBTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTransferActionPerformed
        Transfer v = new Transfer();
            v.show(); 
            dispose();
    }//GEN-LAST:event_jBTransferActionPerformed

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
            java.util.logging.Logger.getLogger(MenuATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuATM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCek;
    private javax.swing.JButton jBKeluar;
    private javax.swing.JButton jBPenarikan;
    private javax.swing.JButton jBSimpan;
    private javax.swing.JButton jBTransfer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
