/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NSBMCourseEnrollmentSystem_view;

import NSBMCourseEnrollmentSystem_DB_connection.DB_connection;
import NSBMCourseEnrollmentSystem_control.Assignment_controll;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lahiru Dulanjaya
 */
public class Assignment_marks extends javax.swing.JFrame {
     Connection con =DB_connection.getConnection();
   

    /**
     * Creates new form Assignment
     * @throws java.sql.SQLException
     */
    public Assignment_marks() throws SQLException {
        initComponents();
        fillcombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JComboBox<>();
        course = new javax.swing.JComboBox<>();
        name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        subject = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        grade = new javax.swing.JTextField();
        marks = new javax.swing.JTextField();
        submit = new javax.swing.JToggleButton();
        assignment_id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        year = new javax.swing.JComboBox<>();
        sem = new javax.swing.JComboBox<>();
        back = new javax.swing.JToggleButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Assignment Marks");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Student Id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 190, 30));

        jLabel2.setText("Assignment Grade");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 190, 30));

        jLabel3.setText("Course");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 190, 30));

        jLabel4.setText("Assignment_code");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 190, 30));

        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 160, 30));

        course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseActionPerformed(evt);
            }
        });
        jPanel1.add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 160, 30));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 160, 30));

        jLabel5.setText("Subject_Code");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 190, 30));

        jPanel1.add(subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 160, 30));

        jLabel6.setText("Assignment Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 190, 30));

        jLabel7.setText("Assignment Marks");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 190, 30));
        jPanel1.add(grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 90, 30));
        jPanel1.add(marks, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 90, 30));

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 140, 30));
        jPanel1.add(assignment_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 160, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Grading Assignment ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 260, 40));

        jLabel9.setText("Year");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 90, 30));

        jLabel10.setText("Semester");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 70, 20));

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", " " }));
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        jPanel1.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 60, -1));

        sem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semActionPerformed(evt);
            }
        });
        jPanel1.add(sem, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 60, -1));

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseActionPerformed
         try {
             fillcombo1();
             fillcombo2();
         } catch (SQLException ex) {
             Logger.getLogger(Assignment_marks.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_courseActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        NSBMCourseEnrollmentSystem_model.Assignment as =new NSBMCourseEnrollmentSystem_model.Assignment();
       as.setAssignment_id(assignment_id.getText());
       as.setName(name.getText());
       as.setGrade(grade.getText());
       as.setStudent_id(id.getSelectedItem().toString());
       as.setSubject_code(subject.getSelectedItem().toString());
       as.setMarks(Integer.parseInt(marks.getText()));
         try {
             Assignment_controll.add(as);
             JOptionPane.showMessageDialog(this,"Success");
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this,"Try Again");
         }
    }//GEN-LAST:event_submitActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
         try {
             fillcombo1();
             fillcombo2();
         } catch (SQLException ex) {
             Logger.getLogger(Assignment_marks.class.getName()).log(Level.SEVERE, null, ex);
         }
       
    }//GEN-LAST:event_yearActionPerformed

    private void semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semActionPerformed
        try {
             fillcombo1();
             fillcombo2();
         } catch (SQLException ex) {
             Logger.getLogger(Assignment_marks.class.getName()).log(Level.SEVERE, null, ex);
         }
       
    }//GEN-LAST:event_semActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
        if(Home.student==1){
        Admin_Undergraduate ad = new Admin_Undergraduate();
        ad.setVisible(true);
        }
        if(Home.student==2){
            Admin_Postgraduate ap =new Admin_Postgraduate();
            ap.setVisible(true);
        }
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(Assignment_marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assignment_marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assignment_marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assignment_marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Assignment_marks().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Assignment_marks.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    private void fillcombo() throws SQLException{
        
         String sql1="Select Course_Id from courses";
         PreparedStatement pst = con.prepareStatement(sql1);
         ResultSet rs = pst.executeQuery();
         
         while(rs.next()){
             String cour = rs.getString("Course_Id");
             course.addItem(cour);
         }
         
    }
    private void fillcombo1() throws SQLException{
        id.removeAllItems();
        String sql2 ="Select StudentId from undergraduate_student where Courses_Course_Id=? and Year =? and Semester =?";
         PreparedStatement pst1 = con.prepareStatement(sql2);
         pst1.setObject(1,course.getSelectedItem());
         pst1.setObject(2,year.getSelectedItem());
         pst1.setObject(3,sem.getSelectedItem());
         ResultSet rs1 = pst1.executeQuery();
        
         while(rs1.next()){
             String st = rs1.getString("StudentId");
             id.addItem(st);
         }
    }
     private void fillcombo2() throws SQLException{
        subject.removeAllItems();
        String sql3 ="Select Subject_code from subject where Courses_Course_Id=? and Year =? and Semester =?";
         PreparedStatement pst1 = con.prepareStatement(sql3);
         pst1.setObject(1,course.getSelectedItem());
         pst1.setObject(2,year.getSelectedItem());
         pst1.setObject(3,sem.getSelectedItem());
         ResultSet rs2 = pst1.executeQuery();
        
         while(rs2.next()){
             String st = rs2.getString("Subject_code");
             subject.addItem(st);
         }
     }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField assignment_id;
    private javax.swing.JToggleButton back;
    private javax.swing.JComboBox<String> course;
    private javax.swing.JTextField grade;
    private javax.swing.JComboBox<String> id;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JTextField marks;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> sem;
    private javax.swing.JComboBox<String> subject;
    private javax.swing.JToggleButton submit;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
