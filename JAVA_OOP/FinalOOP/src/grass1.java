
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
public class grass1 extends javax.swing.JFrame {

    /**
     * Creates new form grass1
     */
    public grass1() {
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
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("GRASS TYPE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 130, 60);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/leaf3.PNG"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(170, 20, 60, 60);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/venusaur.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(40, 350, 100, 90);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("VENOSAUR");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(160, 380, 100, 40);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/bulba1.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(40, 100, 90, 90);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("BULBASAUR");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(160, 130, 100, 40);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/ivysaur2.PNG"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(30, 230, 100, 90);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("IVYSAUR");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(160, 260, 100, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO/Poison.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 420, 50, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO/Poison.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 170, 50, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO/Poison.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 300, 50, 40);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/bellsprout.png"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(280, 100, 100, 90);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/victreebel.png"))); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(280, 360, 100, 90);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("BELLSPROUT");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(400, 130, 120, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO/Poison.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(410, 160, 50, 50);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("VICTREEBEL");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(400, 380, 110, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO/Poison.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(410, 420, 50, 50);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/weepinbell.png"))); // NOI18N
        getContentPane().add(jLabel23);
        jLabel23.setBounds(280, 240, 100, 90);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("WEEPINBELL");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(400, 260, 110, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO/Poison.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(410, 290, 50, 50);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/oddish.PNG"))); // NOI18N
        getContentPane().add(jLabel25);
        jLabel25.setBounds(540, 100, 90, 90);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/vileplume.png"))); // NOI18N
        getContentPane().add(jLabel26);
        jLabel26.setBounds(530, 370, 100, 90);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/gloom.png"))); // NOI18N
        getContentPane().add(jLabel27);
        jLabel27.setBounds(530, 230, 100, 90);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO/Poison.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(690, 170, 50, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO/Poison.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(690, 420, 50, 50);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO/Poison.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(690, 300, 50, 50);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("ODDISH");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(690, 130, 60, 40);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("VILEPLUME");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(680, 380, 100, 40);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("GLOOM");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(690, 260, 70, 40);

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton8.setText("PROCEED");
        jButton8.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(880, 490, 80, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/suicune.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(-80, -110, 1170, 800);

        setSize(new java.awt.Dimension(980, 573));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        grass2 evo = new grass2();
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
            java.util.logging.Logger.getLogger(grass1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(grass1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(grass1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(grass1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new grass1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton8;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
