
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
public class bug2 extends javax.swing.JFrame {

    /**
     * Creates new form bug2
     */
    public bug2() {
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
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("BUG TYPE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 110, 60);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bug.png"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(140, 20, 60, 60);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/venomat.png"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(40, 100, 90, 90);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/venomoth.png"))); // NOI18N
        getContentPane().add(jLabel21);
        jLabel21.setBounds(30, 230, 100, 90);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("VENOMAT");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(160, 130, 120, 40);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("VENOMOTH");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(160, 260, 110, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO/Poison.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 300, 50, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO/Poison.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 170, 50, 40);

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton8.setText("BACK");
        jButton8.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(880, 490, 80, 30);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/scyther.png"))); // NOI18N
        getContentPane().add(jLabel23);
        jLabel23.setBounds(280, 100, 100, 90);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("SCYTHER");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(400, 130, 120, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO/Flying.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(410, 160, 50, 50);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/pinsir.png"))); // NOI18N
        getContentPane().add(jLabel25);
        jLabel25.setBounds(540, 100, 90, 90);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("PINSIR");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(690, 130, 60, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/suicune.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-80, -110, 1170, 800);

        setSize(new java.awt.Dimension(980, 573));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Element2 evo = new Element2();
        evo.setVisible(true);
        close();// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(bug2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bug2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bug2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bug2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bug2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
