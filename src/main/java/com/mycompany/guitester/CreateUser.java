/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.guitester;

import java.util.Random;

/**
 *
 * @author hurle
 */
public class CreateUser extends javax.swing.JFrame {

    /**
     * Creates new form CreateUser
     */
    public CreateUser() {
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

        Exit = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        CreateUser = new javax.swing.JButton();
        DeleteUser = new javax.swing.JButton();
        UpdateUser = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        PasswordLbl = new javax.swing.JLabel();
        PasswordTxt = new javax.swing.JTextField();
        FirstNameLbl = new javax.swing.JLabel();
        surnameLbl = new javax.swing.JLabel();
        EmailLbl = new javax.swing.JLabel();
        SurnameTxt = new javax.swing.JTextField();
        EmailTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        MemberType = new javax.swing.JComboBox<>();
        FirstNameTxt = new javax.swing.JTextField();
        UserNameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Exit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Mongolian Baiti", 1, 12)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Exit.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, 240, 20));

        CreateUser.setBackground(new java.awt.Color(0, 102, 102));
        CreateUser.setFont(new java.awt.Font("Mongolian Baiti", 1, 12)); // NOI18N
        CreateUser.setText("Create new user");
        CreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateUserActionPerformed(evt);
            }
        });
        Exit.add(CreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 240, 20));

        DeleteUser.setBackground(new java.awt.Color(0, 102, 102));
        DeleteUser.setFont(new java.awt.Font("Mongolian Baiti", 1, 12)); // NOI18N
        DeleteUser.setText("Delete user");
        Exit.add(DeleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 240, 20));

        UpdateUser.setBackground(new java.awt.Color(0, 102, 102));
        UpdateUser.setFont(new java.awt.Font("Mongolian Baiti", 1, 12)); // NOI18N
        UpdateUser.setText("Update existing user");
        Exit.add(UpdateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 240, 20));

        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 1490, 40));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        jTable1.setBackground(new java.awt.Color(0, 153, 153));
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setFont(new java.awt.Font("Mongolian Baiti", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Surname", "Email", "Member Type", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, -200, 1490, 440));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 1490, 470));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PasswordLbl.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        PasswordLbl.setText("Password");
        jPanel4.add(PasswordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, -1, -1));

        PasswordTxt.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        PasswordTxt.setToolTipText("");
        jPanel4.add(PasswordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 250, -1));

        FirstNameLbl.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        FirstNameLbl.setText("First Name");
        jPanel4.add(FirstNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        surnameLbl.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        surnameLbl.setText("Surname");
        jPanel4.add(surnameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        EmailLbl.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        EmailLbl.setText("Email");
        EmailLbl.setToolTipText("");
        jPanel4.add(EmailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        SurnameTxt.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        SurnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SurnameTxtActionPerformed(evt);
            }
        });
        jPanel4.add(SurnameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 250, -1));

        EmailTxt.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        EmailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTxtActionPerformed(evt);
            }
        });
        jPanel4.add(EmailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 250, -1));

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jLabel1.setText("Member Type");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, -1, -1));

        MemberType.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        MemberType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Parent", "Student", "Teacher" }));
        MemberType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberTypeActionPerformed(evt);
            }
        });
        jPanel4.add(MemberType, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, 220, 30));

        FirstNameTxt.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jPanel4.add(FirstNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 250, 30));

        UserNameTxt.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jPanel4.add(UserNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 60, 220, 30));

        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jLabel2.setText("Username");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 60, 120, 20));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1490, 220));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MemberTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MemberTypeActionPerformed

    private void CreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateUserActionPerformed

        Random ranNum = new Random();
        int minRange = 1;
        int maxRange = 10;

        Integer randomInt = ranNum.nextInt(maxRange - minRange + 1) + minRange;
        Integer combinationNum = randomInt + randomInt + randomInt +randomInt;
        
        String userName = UserNameTxt.getText();
        String firstName = FirstNameTxt.getText();
        String surName = SurnameTxt.getText();
        String password = PasswordTxt.getText();
        String email = EmailTxt.getText();
        String type = MemberType.getSelectedItem().toString();
        String userType = MemberType.getSelectedItem().toString();
        if (type.equals("Student")) {
            type = "Student";
            userType = "Student";
        } else if (type.equals("Teacher")) {
            type = "Teacher";
            userType = "Teacher";
        } else {
            type = "Parent";
            userType = "Parent";

        }
        String uniqueID = userType + combinationNum.toString();

        DBaccess.dataEntry(firstName, surName, password, email, type, userName, uniqueID);


    }//GEN-LAST:event_CreateUserActionPerformed

    private void SurnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SurnameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SurnameTxtActionPerformed

    private void EmailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTxtActionPerformed

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
            java.util.logging.Logger.getLogger(CreateUser.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateUser;
    private javax.swing.JButton DeleteUser;
    private javax.swing.JLabel EmailLbl;
    private javax.swing.JTextField EmailTxt;
    private javax.swing.JPanel Exit;
    private javax.swing.JLabel FirstNameLbl;
    private javax.swing.JTextField FirstNameTxt;
    private javax.swing.JComboBox<String> MemberType;
    private javax.swing.JLabel PasswordLbl;
    private javax.swing.JTextField PasswordTxt;
    private javax.swing.JTextField SurnameTxt;
    private javax.swing.JButton UpdateUser;
    private javax.swing.JTextField UserNameTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel surnameLbl;
    // End of variables declaration//GEN-END:variables
}
