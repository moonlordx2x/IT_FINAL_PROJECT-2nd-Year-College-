
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
public class electric1 extends javax.swing.JFrame {

    /**
     * Creates new form electric1
     */
    public electric1() {
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
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("ELECTRIC TYPE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 180, 60);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/electric3.PNG"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(190, 20, 60, 60);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/pikachu.png"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(40, 100, 100, 90);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/raichu.png"))); // NOI18N
        getContentPane().add(jLabel21);
        jLabel21.setBounds(40, 230, 100, 90);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("PIKACHU");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(160, 130, 120, 40);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("RAICHU");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(160, 260, 110, 40);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/magnemite.png"))); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(280, 100, 100, 90);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/magneton.PNG"))); // NOI18N
        getContentPane().add(jLabel24);
        jLabel24.setBounds(280, 240, 100, 90);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("MAGNEMITE");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(400, 130, 120, 40);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("MAGNETON");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(400, 260, 110, 40);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/voltrob.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(540, 100, 90, 90);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("VOLTROB");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(690, 130, 80, 40);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/electrode.png"))); // NOI18N
        getContentPane().add(jLabel28);
        jLabel28.setBounds(530, 230, 100, 90);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("ELECTRODE");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(690, 260, 110, 40);

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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/suicune.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-80, -110, 1170, 800);

        setSize(new java.awt.Dimension(980, 573));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        electric2 evo = new electric2();
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
            java.util.logging.Logger.getLogger(electric1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(electric1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(electric1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(electric1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new electric1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
