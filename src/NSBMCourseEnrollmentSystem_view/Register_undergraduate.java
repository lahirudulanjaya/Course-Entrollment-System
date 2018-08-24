/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NSBMCourseEnrollmentSystem_view;

import NSBMCourseEnrollmentSystem_DB_connection.DB_connection;
import NSBMCourseEnrollmentSystem_control.Undergraduate_Student_controll;
import NSBMCourseEnrollmentSystem_model.Undergraduate_Student;
import java.awt.HeadlessException;
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
public class Register_undergraduate extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register_undergraduate() {
        initComponents();
        try {
            fillcombo();
        } catch (SQLException ex) {
            Logger.getLogger(Register_undergraduate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        phn_num = new javax.swing.JTextField();
        stu_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        Register = new javax.swing.JToggleButton();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        course = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        faculty = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        year = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        but1 = new javax.swing.JRadioButton();
        but2 = new javax.swing.JRadioButton();
        back = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();

        setTitle("Register Undergraduate");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Register  Student for Bachelor Course");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 0, 420, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Course");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(430, 420, 150, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 250, 150, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contact Number");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 310, 150, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Student Id");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 60, 150, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Full Name");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 130, 150, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Age");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 190, 150, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Gender");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(430, 50, 150, 40);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(30, 160, 320, 30);

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        jPanel1.add(age);
        age.setBounds(30, 230, 320, 30);

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email);
        email.setBounds(30, 280, 320, 30);

        phn_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phn_numActionPerformed(evt);
            }
        });
        jPanel1.add(phn_num);
        phn_num.setBounds(30, 350, 320, 30);

        stu_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stu_idActionPerformed(evt);
            }
        });
        jPanel1.add(stu_id);
        stu_id.setBounds(30, 90, 320, 30);

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(430, 150, 270, 90);

        Register.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        jPanel1.add(Register);
        Register.setBounds(410, 630, 170, 40);

        buttonGroup1.add(female);
        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("Female");
        female.setOpaque(false);
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel1.add(female);
        female.setBounds(510, 80, 93, 30);

        male.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(male);
        male.setForeground(new java.awt.Color(255, 255, 255));
        male.setText("Male");
        male.setOpaque(false);
        jPanel1.add(male);
        male.setBounds(430, 80, 90, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Gender");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(430, 50, 150, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Gender");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(430, 50, 150, 40);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Address");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(430, 120, 150, 40);

        course.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseActionPerformed(evt);
            }
        });
        jPanel1.add(course);
        course.setBounds(430, 460, 180, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Semester");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(430, 390, 100, 40);

        faculty.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        faculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School of Business", "School of Computing", "School of Engineering", " " }));
        faculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyActionPerformed(evt);
            }
        });
        jPanel1.add(faculty);
        faculty.setBounds(430, 280, 180, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Facullty");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(430, 240, 150, 40);

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", " " }));
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        jPanel1.add(year);
        year.setBounds(430, 350, 40, 20);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Year");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(430, 310, 150, 40);

        buttonGroup2.add(but1);
        but1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        but1.setForeground(new java.awt.Color(255, 255, 255));
        but1.setText("1");
        but1.setOpaque(false);
        jPanel1.add(but1);
        but1.setBounds(530, 400, 50, 23);

        buttonGroup2.add(but2);
        but2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        but2.setForeground(new java.awt.Color(255, 255, 255));
        but2.setText("2");
        but2.setOpaque(false);
        jPanel1.add(but2);
        but2.setBounds(590, 400, 50, 23);

        back.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(120, 630, 150, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date Of Birth");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 370, 150, 40);

        dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobActionPerformed(evt);
            }
        });
        jPanel1.add(dob);
        dob.setBounds(30, 410, 320, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        Undergraduate_Student us =new Undergraduate_Student();
        us.setName(name.getText());
        us.setAdmission_number(stu_id.getText());
        us.setDOB(dob.getText());
        if(male.isSelected()){
            us.setGender(male.getText());
        }
        else {
            us.setGender(female.getText());
        }
        us.setEmail(email.getText());
         us.setAddress(address.getText());
         us.setAge(Integer.parseInt(age.getText()));
         us.setPhone_number(Integer.parseInt(phn_num.getText()));
         us.setFaculty(faculty.getSelectedItem().toString());
        us.setCourse(course.getSelectedItem().toString());
        us.setYear(Integer.parseInt((String) year.getSelectedItem()));
        if(but1.isSelected()){
            us.setSem(1);
        }
        else if(but2.isSelected()){
            us.setSem(2);
        }

        try {
            Undergraduate_Student_controll.add(us);
            JOptionPane.showMessageDialog(this,"Success");
        } catch (HeadlessException | SQLException ex) {
           
            JOptionPane.showMessageDialog(this,ex);
        }
        
        
        
        
    }//GEN-LAST:event_RegisterActionPerformed

    private void stu_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stu_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stu_idActionPerformed

    private void phn_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phn_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phn_numActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseActionPerformed

    private void facultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facultyActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

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

    private void dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobActionPerformed

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
            java.util.logging.Logger.getLogger(Register_undergraduate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_undergraduate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_undergraduate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_undergraduate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_undergraduate().setVisible(true);
            }
        });
    }
     private void fillcombo() throws SQLException{
        
         String sql1="Select Course_Id from courses";
          Connection con =DB_connection.getConnection();
          PreparedStatement pst = con.prepareStatement(sql1);
         ResultSet rs = pst.executeQuery();
         
         while(rs.next()){
             String cour = rs.getString("Course_Id");
             course.addItem(cour);
         }
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Register;
    private javax.swing.JTextArea address;
    private javax.swing.JTextField age;
    private javax.swing.JToggleButton back;
    private javax.swing.JRadioButton but1;
    private javax.swing.JRadioButton but2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> course;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox<String> faculty;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phn_num;
    private javax.swing.JTextField stu_id;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
