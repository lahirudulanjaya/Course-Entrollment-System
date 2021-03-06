/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NSBMCourseEnrollmentSystem_view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lahiru Dulanjaya
 */
public class Admin_Undergraduate extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin_Undergraduate() {
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

        jPanel1 = new javax.swing.JPanel();
        find = new javax.swing.JToggleButton();
        show = new javax.swing.JToggleButton();
        add = new javax.swing.JToggleButton();
        add_assign = new javax.swing.JToggleButton();
        add_exam = new javax.swing.JToggleButton();
        back = new javax.swing.JToggleButton();
        add_final = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));

        jPanel1.setLayout(null);

        find.setText("Find Student");
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });
        jPanel1.add(find);
        find.setBounds(300, 220, 140, 49);

        show.setText("Show Students");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        jPanel1.add(show);
        show.setBounds(540, 220, 130, 49);

        add.setText("Add Student");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add);
        add.setBounds(30, 220, 160, 49);

        add_assign.setText("Add Assignment Marks");
        add_assign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_assignActionPerformed(evt);
            }
        });
        jPanel1.add(add_assign);
        add_assign.setBounds(30, 300, 160, 50);

        add_exam.setText("Add Exam Marks");
        add_exam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_examActionPerformed(evt);
            }
        });
        jPanel1.add(add_exam);
        add_exam.setBounds(300, 310, 140, 50);

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(320, 480, 120, 30);

        add_final.setText("Add Final Marks");
        add_final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_finalActionPerformed(evt);
            }
        });
        jPanel1.add(add_final);
        add_final.setBounds(540, 310, 130, 50);

        jLabel1.setBackground(new java.awt.Color(255, 0, 51));
        jLabel1.setFont(new java.awt.Font("Trajan Pro 3", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NSBMCourseEnrollmentSystem_resources/Undergraduate.jpg"))); // NOI18N
        jLabel1.setText("Manage Undergraduate Details");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 20, 550, 150);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed
        this.dispose();
        Update_Undergraduate fd =new Update_Undergraduate();
        fd.setVisible(true);
    }//GEN-LAST:event_findActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
       this.dispose();
       Show_undergraduate sh = new Show_undergraduate();
       sh.setVisible(true);
    }//GEN-LAST:event_showActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if(Home.student==1){
            this.dispose();
            Register_undergraduate rg =new Register_undergraduate();
            rg.setVisible(true);
        }
    }//GEN-LAST:event_addActionPerformed

    private void add_assignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_assignActionPerformed
      this.dispose();
        try {
            Assignment_marks am =new Assignment_marks();
            am.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Undergraduate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_add_assignActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
        register_option rg = new register_option();
        rg.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void add_examActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_examActionPerformed
         try {
            this.dispose();
            Exam_Marks em =new Exam_Marks();
            em.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Postgraduate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_add_examActionPerformed

    private void add_finalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_finalActionPerformed
        Add_Final ap =new Add_Final();
        this.dispose();
        ap.setVisible(true);
    }//GEN-LAST:event_add_finalActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Undergraduate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Undergraduate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Undergraduate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Undergraduate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Undergraduate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton add;
    private javax.swing.JToggleButton add_assign;
    private javax.swing.JToggleButton add_exam;
    private javax.swing.JToggleButton add_final;
    private javax.swing.JToggleButton back;
    private javax.swing.JToggleButton find;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton show;
    // End of variables declaration//GEN-END:variables
}
