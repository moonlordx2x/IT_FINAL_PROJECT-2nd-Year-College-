
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
public class hunt8 extends javax.swing.JFrame {

    /**
     * Creates new form hunt8
     */
    public hunt8() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Pokestop Rewards");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 20, 200, 60);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pokestop2.PNG"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(210, 20, 60, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/incubator.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 440, 90, 90);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/berry.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(480, 90, 80, 90);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pokemon-Go-Potion.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(270, 350, 80, 90);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/potion4.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(270, 260, 90, 90);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("HYPER POTION");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(350, 290, 120, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("EGG");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(560, 380, 110, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("MAX POTION");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(350, 380, 100, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("SUPER POTION");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(350, 210, 120, 40);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setText("BACK");
        jButton3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(880, 490, 80, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pokeball23.PNG"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 90, 80, 90);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ultra.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 180, 90, 90);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/great2.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(50, 270, 90, 90);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/master.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(50, 360, 80, 90);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("POKEBALL");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(140, 120, 100, 40);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("ULTRABALL");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(140, 200, 100, 40);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("GREATBALL");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(140, 290, 100, 40);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("INCUBATOR");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(360, 470, 100, 40);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/potion1.png"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(270, 90, 80, 90);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("POTION");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(350, 120, 100, 40);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/potion2.png"))); // NOI18N
        getContentPane().add(jLabel21);
        jLabel21.setBounds(270, 180, 90, 90);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/revive.png"))); // NOI18N
        getContentPane().add(jLabel22);
        jLabel22.setBounds(470, 180, 90, 90);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lucky.png"))); // NOI18N
        getContentPane().add(jLabel23);
        jLabel23.setBounds(470, 260, 90, 90);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("RAZZY BERRY");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(560, 150, 110, 40);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("REVIVE");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(560, 210, 110, 40);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("LUCKY EGG");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(560, 290, 110, 40);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Egg.png"))); // NOI18N
        getContentPane().add(jLabel27);
        jLabel27.setBounds(470, 340, 90, 90);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("MASTERBALL");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(140, 380, 100, 40);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/2.png"))); // NOI18N
        getContentPane().add(jLabel29);
        jLabel29.setBounds(50, 440, 90, 90);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("INCENSE");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(140, 470, 100, 40);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/neil32.jpg"))); // NOI18N
        getContentPane().add(jLabel31);
        jLabel31.setBounds(0, -80, 1540, 700);

        setSize(new java.awt.Dimension(983, 573));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Tip1 evo = new Tip1();
        evo.setVisible(true);
        close();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(hunt8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hunt8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hunt8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hunt8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hunt8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
