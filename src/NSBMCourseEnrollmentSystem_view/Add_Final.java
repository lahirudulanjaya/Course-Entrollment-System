/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NSBMCourseEnrollmentSystem_view;

import NSBMCourseEnrollmentSystem_control.Exam_controll;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lahiru Dulanjaya
 */
public class Add_Final extends javax.swing.JFrame {
    

    /**
     * Creates new form Add_Final
     */
    public Add_Final() {
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

        search = new javax.swing.JToggleButton();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        avg = new javax.swing.JLabel();
        add = new javax.swing.JToggleButton();
        back = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        gpv = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GPA");
        setBackground(new java.awt.Color(255, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 150, 30));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 210, 30));

        jLabel2.setText("Index Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 160, 20));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index Number", "Subject Code", "Assignment Marks", "Exam Marks", "Final Marks", "Grade", "GPV Value"
            }
        ));
        jScrollPane1.setViewportView(Table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 860, 90));

        jLabel3.setText("Average");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 130, 30));

        avg.setBackground(new java.awt.Color(102, 102, 102));
        avg.setForeground(new java.awt.Color(255, 255, 255));
        avg.setOpaque(true);
        getContentPane().add(avg, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 150, 20));

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 120, -1));

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 90, -1));

        jLabel4.setText("GPA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 60, 20));

        gpv.setBackground(new java.awt.Color(102, 102, 102));
        gpv.setForeground(new java.awt.Color(255, 255, 255));
        gpv.setOpaque(true);
        getContentPane().add(gpv, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 150, 20));

        jLabel1.setFont(new java.awt.Font("Trajan Pro 3", 0, 18)); // NOI18N
        jLabel1.setText("Calculate GPA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 200, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try {
            //create a table 
            DefaultTableModel tbl = (DefaultTableModel) Table.getModel();
            ArrayList<NSBMCourseEnrollmentSystem_model.Result> result = Exam_controll.results(id.getText());
            tbl.setRowCount(0);
            //create result object and add values to table
            for(NSBMCourseEnrollmentSystem_model.Result rs: result){
                Object Data[]={rs.getIndex_num(),rs.getSubject(),rs.getAvg_assignment(),rs.getExam_mark(),rs.getFinal_mark(),rs.getGrade(),rs.getGPV()};
                tbl.addRow(Data);
            }
            avg.setText(avg()+"");
            gpv.setText(GPV()+"");
            
        } catch (SQLException ex) {
            Logger.getLogger(Add_Final.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_searchActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        try {
            
            Exam_controll.add(id.getText(),Double.parseDouble(avg.getText()),Double.parseDouble(gpv.getText()));
            JOptionPane.showMessageDialog(this,"Success");
        } catch (SQLException ex) {
            Logger.getLogger(Add_Final.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_addActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Final().setVisible(true);
            }
        });
    }
    public double avg(){
        //get average of results
        DefaultTableModel tbl = (DefaultTableModel) Table.getModel();
        double sum =0;
        for(int i=0;i<tbl.getRowCount();i++){
            sum=sum+Double.parseDouble(tbl.getValueAt(i, 4).toString());
            
        }
        return sum/tbl.getRowCount();
    } 
    public double GPV(){
        //create a gpa value
        DefaultTableModel tbl = (DefaultTableModel) Table.getModel();
        double sum =0;
        for(int i=0;i<tbl.getRowCount();i++){
            sum=sum+Double.parseDouble(tbl.getValueAt(i, 6).toString());
            
        }
        return sum/tbl.getRowCount();
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JToggleButton add;
    private javax.swing.JLabel avg;
    private javax.swing.JToggleButton back;
    private javax.swing.JLabel gpv;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton search;
    // End of variables declaration//GEN-END:variables
}
