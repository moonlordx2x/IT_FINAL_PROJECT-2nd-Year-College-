
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class fight1 extends javax.swing.JFrame {

    /**
     * Creates new form fight1
     */
    public fight1() {
        initComponents();
    }
public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("FIGHTING TYPE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 180, 60);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elements/ground2.png"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(200, 20, 60, 60);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/mankey.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(40, 100, 90, 90);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/primeape.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(30, 230, 100, 90);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("MANKEY");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(160, 130, 120, 40);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("PRIMEAPE");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(160, 260, 110, 40);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/machop.png"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(300, 100, 90, 90);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/machoke.png"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(310, 230, 100, 90);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/machamp.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(310, 350, 100, 90);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("MACHOP");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(430, 130, 120, 40);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("MACHOKE");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(430, 260, 110, 40);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("MACHAMP");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(430, 380, 100, 40);

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton10.setText("PROCEED");
        jButton10.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(880, 490, 80, 30);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/hitmonlee.png"))); // NOI18N
        getContentPane().add(jLabel25);
        jLabel25.setBounds(540, 100, 100, 90);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("HITMONLEE");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(690, 130, 100, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/suicune.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(-80, -110, 1170, 800);

        setSize(new java.awt.Dimension(980, 573));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        fight2 evo = new fight2();
        evo.setVisible(true);
        close();// TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(fight1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fight1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fight1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fight1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fight1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    // End of variables declaration//GEN-END:variables
}
