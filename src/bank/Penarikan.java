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
public class Penarikan extends javax.swing.JFrame {

    /**
     * Creates new form Penarikan
     */
    public Penarikan() {
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

        jLabel2 = new javax.swing.JLabel();
        jTTarikUang = new javax.swing.JTextField();
        jBBenar = new javax.swing.JButton();
        jBKembali = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Masukkan berapa jumlah yang ingin anda tarik :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 60, 390, 30);

        jTTarikUang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(jTTarikUang);
        jTTarikUang.setBounds(70, 120, 210, 60);

        jBBenar.setText("BENAR");
        jBBenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBenarActionPerformed(evt);
            }
        });
        getContentPane().add(jBBenar);
        jBBenar.setBounds(210, 240, 100, 40);

        jBKembali.setText("KEMBALI");
        jBKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(jBKembali);
        jBKembali.setBounds(20, 240, 100, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\PB OBJEK\\pict GUI\\download.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(330, 210, 190, 120);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 630, 340);

        setSize(new java.awt.Dimension(538, 374));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBKembaliActionPerformed
       MenuATM a = new MenuATM();
            a.show(); 
            dispose();
    }//GEN-LAST:event_jBKembaliActionPerformed

    private void jBBenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBenarActionPerformed
       int saldo = 5000000;
        int nariksaldo = Integer.parseInt(jTTarikUang.getText());
        
        int hasilnarik = saldo - nariksaldo;
        
        String b = String.valueOf(hasilnarik);
        HasilPenarikan a = new HasilPenarikan(b);
        a.show();
        dispose();
        
        
    }//GEN-LAST:event_jBBenarActionPerformed

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
            java.util.logging.Logger.getLogger(Penarikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Penarikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Penarikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Penarikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Penarikan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBenar;
    private javax.swing.JButton jBKembali;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTTarikUang;
    // End of variables declaration//GEN-END:variables

    private void narik() {
        
        
        
        
    }
}
