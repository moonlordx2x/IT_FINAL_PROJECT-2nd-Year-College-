
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Rat2_1 extends javax.swing.JFrame {

    /**
     * Creates new form CPokemon
     */
    public Rat2_1() {
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

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pok = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/megaRa1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 70, 210, 270);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("=");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(240, 350, 20, 140);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/great.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 350, 170, 140);

        pok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokActionPerformed(evt);
            }
        });
        getContentPane().add(pok);
        pok.setBounds(270, 400, 110, 50);

        jButton4.setText("Go Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(880, 10, 80, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 127, 54));
        jButton1.setText("Raticate");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(238, 145, 33), new java.awt.Color(238, 145, 33), new java.awt.Color(238, 145, 33), new java.awt.Color(238, 145, 33))));
        getContentPane().add(jButton1);
        jButton1.setBounds(210, 320, 150, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ratt1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-240, -80, 1360, 790);

        setSize(new java.awt.Dimension(984, 573));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        GB_Poke p = new GB_Poke();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void pokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokActionPerformed
        Rat3 r = new Rat3();
        int poke;
        poke = Integer.parseInt(pok.getText());
        if (poke >=5 ){
            r.setVisible(true);
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(null,"You need atleast 5 pokeballs to catch this pokemon...");
        }
    }//GEN-LAST:event_pokActionPerformed

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
            java.util.logging.Logger.getLogger(Pokebal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pokebal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pokebal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pokebal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UB_Poke().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField pok;
    // End of variables declaration//GEN-END:variables

    private void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
