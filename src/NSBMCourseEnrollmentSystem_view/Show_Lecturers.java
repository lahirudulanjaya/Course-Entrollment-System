/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NSBMCourseEnrollmentSystem_view;

import NSBMCourseEnrollmentSystem_control.Lecturer_controll;
import NSBMCourseEnrollmentSystem_control.Postgraduate_student_controll;
import NSBMCourseEnrollmentSystem_control.Undergraduate_Student_controll;
import NSBMCourseEnrollmentSystem_model.Lecturer;
import NSBMCourseEnrollmentSystem_model.Postgraduate;
import NSBMCourseEnrollmentSystem_model.Undergraduate_Student;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lahiru Dulanjaya
 */
public class Show_Lecturers extends javax.swing.JFrame {

    /**
     * Creates new form Show_undergraduate
     */
    public Show_Lecturers() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        business = new javax.swing.JRadioButton();
        computing = new javax.swing.JRadioButton();
        engineering = new javax.swing.JRadioButton();
        show = new javax.swing.JToggleButton();
        back = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lecturer Id", "Full Name", "Age", "Gender", "Address", "Date of Birth", "Phone number", "Room No", "Subject"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 940, 470));

        jLabel1.setText("Faculty");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 140, 30));

        buttonGroup1.add(business);
        business.setText("School of Business");
        getContentPane().add(business, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        buttonGroup1.add(computing);
        computing.setText("School of Computing");
        getContentPane().add(computing, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        buttonGroup1.add(engineering);
        engineering.setText("School of Engineering");
        getContentPane().add(engineering, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        show.setText("Show Students");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        getContentPane().add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, -1));

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 90, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        try {
            
            ArrayList<Lecturer> lec = Lecturer_controll.getall();
            DefaultTableModel tbl = (DefaultTableModel) table.getModel();
            tbl.setRowCount(0);
            for(Lecturer st : lec){
                
                Object[] Data={st.getLecturer_id(),st.getName(),st.getAge(),st.getGender(),st.getAddress(),st.getDOB(),st.getPhone_number(),st.getRoom_num(),st.getSubject()};
                if(business.isSelected() && "School of Business".equals(st.getFaculty_id())){
                    tbl.addRow(Data);
                }
                else if(computing.isSelected() && "School of Computing".equals(st.getFaculty_id())){
                     tbl.addRow(Data);
                }
                else if(engineering.isShowing() && "School of Engineering".equals(st.getFaculty_id())){
                    tbl.addRow(Data);
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Show_Lecturers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_showActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       this.dispose();
        Admin_Lecturer ad = new Admin_Lecturer();
        ad.setVisible(true);
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
            java.util.logging.Logger.getLogger(Show_Lecturers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Show_Lecturers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Show_Lecturers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Show_Lecturers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Show_Lecturers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton back;
    private javax.swing.JRadioButton business;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton computing;
    private javax.swing.JRadioButton engineering;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton show;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
