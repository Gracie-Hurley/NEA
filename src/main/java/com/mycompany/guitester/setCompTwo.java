/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.guitester;

/**
 *
 * @author hurle
 */
public class setCompTwo extends javax.swing.JFrame {

    /**
     * Creates new form setCompTwo
     */
    public setCompTwo() {
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

        menuButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bigDataButton = new javax.swing.JButton();
        architectureButton = new javax.swing.JButton();
        cryptographyButton = new javax.swing.JButton();
        logicButton1 = new javax.swing.JButton();
        SecondaryStorageButton = new javax.swing.JButton();
        networkingButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuButton.setBackground(new java.awt.Color(0, 102, 102));
        menuButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        menuButton.setText("Menu");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(menuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 650, 180, 90));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 650, 180, 90));

        bigDataButton.setBackground(new java.awt.Color(0, 102, 102));
        bigDataButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        bigDataButton.setText("Big Data");
        getContentPane().add(bigDataButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 160, 230, 90));

        architectureButton.setBackground(new java.awt.Color(0, 102, 102));
        architectureButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        architectureButton.setText("Architecture");
        getContentPane().add(architectureButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 240, 90));

        cryptographyButton.setBackground(new java.awt.Color(0, 102, 102));
        cryptographyButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        cryptographyButton.setText("Cryptography");
        cryptographyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cryptographyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cryptographyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 360, 230, 90));

        logicButton1.setBackground(new java.awt.Color(0, 102, 102));
        logicButton1.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        logicButton1.setText("Boolean Logic");
        logicButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logicButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(logicButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 240, 90));

        SecondaryStorageButton.setBackground(new java.awt.Color(0, 102, 102));
        SecondaryStorageButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        SecondaryStorageButton.setText("Secondary storage");
        SecondaryStorageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecondaryStorageButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SecondaryStorageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 240, 90));

        networkingButton.setBackground(new java.awt.Color(0, 102, 102));
        networkingButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        networkingButton.setText("Networking");
        networkingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkingButtonActionPerformed(evt);
            }
        });
        getContentPane().add(networkingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 260, 230, 90));

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 48)); // NOI18N
        jLabel1.setText("Quadrat revision");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 380, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        new teacherHome().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_menuButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    new setAssignments().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cryptographyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cryptographyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cryptographyButtonActionPerformed

    private void logicButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logicButton1ActionPerformed
       new setBoolean().setVisible(true);
       
    }//GEN-LAST:event_logicButton1ActionPerformed

    private void networkingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_networkingButtonActionPerformed

    private void SecondaryStorageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecondaryStorageButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SecondaryStorageButtonActionPerformed

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
            java.util.logging.Logger.getLogger(setCompTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(setCompTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(setCompTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(setCompTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new setCompTwo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SecondaryStorageButton;
    private javax.swing.JButton architectureButton;
    private javax.swing.JButton bigDataButton;
    private javax.swing.JButton cryptographyButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logicButton1;
    private javax.swing.JButton menuButton;
    private javax.swing.JButton networkingButton;
    // End of variables declaration//GEN-END:variables
}
