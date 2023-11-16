/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.guitester;

/**
 *
 * @author hurle
 */
public class setBoolean extends javax.swing.JFrame {

    /**
     * Creates new form setBoolean
     */
    public setBoolean() {
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

        ReturnButton = new javax.swing.JButton();
        teacherMenuButton = new javax.swing.JButton();
        worksheetButton = new javax.swing.JButton();
        pastQuesButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusableWindowState(false);
        setMinimumSize(new java.awt.Dimension(1490, 750));
        setPreferredSize(new java.awt.Dimension(1490, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReturnButton.setBackground(new java.awt.Color(0, 102, 102));
        ReturnButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        ReturnButton.setText("Return");
        ReturnButton.setMaximumSize(new java.awt.Dimension(200, 95));
        ReturnButton.setMinimumSize(new java.awt.Dimension(200, 95));
        ReturnButton.setPreferredSize(new java.awt.Dimension(200, 95));
        ReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ReturnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 640, -1, 100));

        teacherMenuButton.setBackground(new java.awt.Color(0, 102, 102));
        teacherMenuButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        teacherMenuButton.setText("Menu");
        teacherMenuButton.setMaximumSize(new java.awt.Dimension(200, 95));
        teacherMenuButton.setMinimumSize(new java.awt.Dimension(200, 95));
        teacherMenuButton.setPreferredSize(new java.awt.Dimension(200, 95));
        teacherMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherMenuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(teacherMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 640, -1, 100));

        worksheetButton.setBackground(new java.awt.Color(0, 102, 102));
        worksheetButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        worksheetButton.setText("Worksheet ");
        worksheetButton.setMaximumSize(new java.awt.Dimension(200, 95));
        worksheetButton.setMinimumSize(new java.awt.Dimension(200, 95));
        worksheetButton.setName(""); // NOI18N
        worksheetButton.setPreferredSize(new java.awt.Dimension(200, 95));
        worksheetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                worksheetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(worksheetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 260, 100));

        pastQuesButton.setBackground(new java.awt.Color(0, 102, 102));
        pastQuesButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        pastQuesButton.setText("Past paper questions");
        pastQuesButton.setMaximumSize(new java.awt.Dimension(200, 95));
        pastQuesButton.setMinimumSize(new java.awt.Dimension(200, 95));
        pastQuesButton.setPreferredSize(new java.awt.Dimension(200, 95));
        pastQuesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastQuesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(pastQuesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 260, 100));

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 48)); // NOI18N
        jLabel1.setText("Quadrat revision");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 380, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teacherMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherMenuButtonActionPerformed
        new teacherHome().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_teacherMenuButtonActionPerformed

    private void ReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnButtonActionPerformed
   new setCompTwo().setVisible(true);
   this.dispose();
    }//GEN-LAST:event_ReturnButtonActionPerformed

    private void worksheetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_worksheetButtonActionPerformed
        new setBooleanWorksheet().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_worksheetButtonActionPerformed

    private void pastQuesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastQuesButtonActionPerformed
        new setBooleanPastQuestions().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pastQuesButtonActionPerformed

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
            java.util.logging.Logger.getLogger(setBoolean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(setBoolean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(setBoolean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(setBoolean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new setBoolean().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ReturnButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton pastQuesButton;
    private javax.swing.JButton teacherMenuButton;
    private javax.swing.JButton worksheetButton;
    // End of variables declaration//GEN-END:variables
}
