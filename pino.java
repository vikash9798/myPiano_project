
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hp
 */
public class pino extends javax.swing.JFrame {

    /**
     * Creates new form pino
     */
    public pino() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("My Piano");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 530, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("F1");
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 50, 140));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("C");
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 50, 140));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("D");
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 50, 140));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("E");
        jButton4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 50, 140));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("F");
        jButton5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 50, 140));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setText("G");
        jButton6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 50, 140));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setText("A");
        jButton7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 50, 140));

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setText("B");
        jButton8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 50, 140));

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setText("B");
        jButton9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 50, 140));

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton10.setText("C1");
        jButton10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 50, 140));

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton11.setText("E1");
        jButton11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 50, 140));

        jButton12.setBackground(new java.awt.Color(102, 102, 102));
        jButton12.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton12.setText("D#1");
        jButton12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 60, 80));

        jButton13.setBackground(new java.awt.Color(102, 102, 102));
        jButton13.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton13.setText("C#");
        jButton13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 50, 80));

        jButton14.setBackground(new java.awt.Color(102, 102, 102));
        jButton14.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton14.setText("D#");
        jButton14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 50, 80));

        jButton15.setBackground(new java.awt.Color(102, 102, 102));
        jButton15.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton15.setText("F#");
        jButton15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 50, 80));

        jButton16.setBackground(new java.awt.Color(102, 102, 102));
        jButton16.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton16.setText("G#");
        jButton16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 50, 80));

        jButton17.setBackground(new java.awt.Color(102, 102, 102));
        jButton17.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton17.setText("Bb");
        jButton17.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 50, 80));

        jButton18.setBackground(new java.awt.Color(102, 102, 102));
        jButton18.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton18.setText("C#1");
        jButton18.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 60, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try{
        String path = "piano";
        AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
        Clip player = AudioSystem.getClip();
        player.open(audio);
        player.start();
       } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e){
           
       }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(pino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pino().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
