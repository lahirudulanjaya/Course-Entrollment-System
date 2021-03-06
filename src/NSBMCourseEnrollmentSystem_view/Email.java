/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NSBMCourseEnrollmentSystem_view;

import NSBMCourseEnrollmentSystem_DB_connection.DB_connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Properties;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.mail.Message;
import javax.mail.MessagingException;

/**
 *
 * @author Lahiru Dulanjaya
 */
public class Email extends javax.swing.JFrame {

    /**
     * Creates new form Email
     */
    public Email() {
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
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        p_email = new javax.swing.JTextField();
        p_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        p_result = new javax.swing.JTextArea();
        send1 = new javax.swing.JButton();
        cheak = new javax.swing.JButton();
        back1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        u_id = new javax.swing.JTextField();
        u_email = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        result = new javax.swing.JTextArea();
        back = new javax.swing.JButton();
        send = new javax.swing.JButton();
        check = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Send Mails");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setForeground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel7.setText("Send Mails to Postgraduate");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 270, 27));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel9.setText("Enter Sudent Index Number");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 200, 27));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel10.setText("Student Email");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 171, 27));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel11.setText("Result");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 171, 27));
        jPanel2.add(p_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 220, 30));
        jPanel2.add(p_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 220, 30));

        p_result.setColumns(20);
        p_result.setRows(5);
        jScrollPane1.setViewportView(p_result);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 290, 140));

        send1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        send1.setText("Send");
        send1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send1ActionPerformed(evt);
            }
        });
        jPanel2.add(send1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 80, 30));

        cheak.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cheak.setText("Check");
        cheak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheakActionPerformed(evt);
            }
        });
        jPanel2.add(cheak, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 90, 30));

        back1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back1.setText("Back");
        jPanel2.add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 70, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NSBMCourseEnrollmentSystem_resources/email.jpg"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, 80));

        jTabbedPane1.addTab("Postgraduate", jPanel2);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Send Mails to Undergraduate");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 270, 27));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel5.setText("Result");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 171, 27));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel6.setText("Enter Sudent Index Number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 200, 27));
        jPanel1.add(u_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 220, 30));
        jPanel1.add(u_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 220, 30));

        result.setColumns(20);
        result.setRows(5);
        jScrollPane2.setViewportView(result);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 300, 150));

        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 100, 30));

        send.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        send.setText("Send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });
        jPanel1.add(send, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 100, 30));

        check.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        check.setText("Check");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        jPanel1.add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 100, 30));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel8.setText("Student Email");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 171, 27));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NSBMCourseEnrollmentSystem_resources/email.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, 80));

        jTabbedPane1.addTab("Undergraduate", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        try {
           
            u_email.setText( un_email());
            result.setText(u_result());
        } catch (SQLException ex) {
            Logger.getLogger(Email.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checkActionPerformed

    private void cheakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheakActionPerformed
        try {
            p_email.setText(po_email());
            p_result.setText(p_result());
        } catch (SQLException ex) {
            Logger.getLogger(Email.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cheakActionPerformed

    private void send1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send1ActionPerformed
       if("true".equals(new Email().sendMail(p_email.getText(),"Results",p_result.getText()))){
            JOptionPane.showMessageDialog(this,"Success");
       }
       else{
               JOptionPane.showMessageDialog(this,"Send Failed");
               }
    }//GEN-LAST:event_send1ActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        
        
        if("true".equals(new Email().sendMail(u_email.getText(),"Results",result.getText()))){
            JOptionPane.showMessageDialog(this,"Success");
       }
       else{
               JOptionPane.showMessageDialog(this,"Send Failed");
               }
    }//GEN-LAST:event_sendActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       register_option rp =new register_option();
       rp.setVisible(true);
       this.dispose();
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
            java.util.logging.Logger.getLogger(Email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Email().setVisible(true);
            }
        });
    }
    public String un_email() throws SQLException{
        String index = u_id.getText();
        Connection con = DB_connection.getConnection();
        String sql = "select Email from undergraduate_student where StudentId=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(1,index);
        ResultSet rs = pst.executeQuery();
        if (rs.next()){
            return rs.getString(1);
        }
        else{
            JOptionPane.showMessageDialog(this,"Email not found cheak Index number");
            return null;
        }
        
         
        
    }
    public String po_email() throws SQLException{
        String index = p_id.getText();
        Connection con = DB_connection.getConnection();
        String sql = "select Email from master_student where StudentId=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(1,index);
        ResultSet rs = pst.executeQuery();
        if (rs.next()){
            return rs.getString(1);
        }
        else{
            JOptionPane.showMessageDialog(this,"Email not found cheak Index number");
            return null;
        }
        
         
        
    }
    public String u_result() throws SQLException{
         String index = u_id.getText();
        Connection con = DB_connection.getConnection();
        String sql = "select Avarage,GPA from rank where Index_Num=?";
         PreparedStatement pst = con.prepareStatement(sql);
         pst.setObject(1,index);
         ResultSet rs = pst.executeQuery();
         if (rs.next()){
            String res = "Your Average Marks is "+rs.getString(1)+"\nYour Current GPA is "+rs.getString(2);
            return res;
        }
        else{
            JOptionPane.showMessageDialog(this,"cheak Index number");
            return null;
        }
        
    }
     public String p_result() throws SQLException{
         String index = p_id.getText();
        Connection con = DB_connection.getConnection();
        String sql = "select Avarage,GPA from rank where Index_Num=?";
         PreparedStatement pst = con.prepareStatement(sql);
         pst.setObject(1,index);
         ResultSet rs = pst.executeQuery();
         if (rs.next()){
            String res = "Your Average Marks is "+rs.getString(1)+"\nYour Current GPA is "+rs.getString(2);
            return res;
        }
        else{
            JOptionPane.showMessageDialog(this,"cheak Index number");
            return null;
        }
        
    }
     public String sendMail(String ToEmail,String Subject,String Text){

	String Msg;
    
        final String username = "laiyalaiyalaiya@gmail.com";
        final String password = "mango1223";

        Properties props = new Properties();
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.starttls.enable", true);
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = (Message) new MimeMessage(session);
            
            message.setFrom(new InternetAddress("laiyalaiyalaiya@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
            InternetAddress.parse(ToEmail));
            message.setSubject(Subject);
            message.setText(Text);
            Transport.send(message);
            Msg="true";
    	    return Msg;

        } catch (MessagingException e) {
            return e.toString();
        }
    
    
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton back1;
    private javax.swing.JButton cheak;
    private javax.swing.JButton check;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField p_email;
    private javax.swing.JTextField p_id;
    private javax.swing.JTextArea p_result;
    private javax.swing.JTextArea result;
    private javax.swing.JButton send;
    private javax.swing.JButton send1;
    private javax.swing.JTextField u_email;
    private javax.swing.JTextField u_id;
    // End of variables declaration//GEN-END:variables
}
