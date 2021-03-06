/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mangersection;

import com.mycompany.mavenproject4.HomePage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }
    public Connection getConnection(){
        Connection con;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/delivery?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
                    return con;
        }catch (SQLException e){
           return null; 
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

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        resetPass = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(218, 98, 9));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\Mangersection\\src\\main\\java\\MangerIcon\\Screenshot 2022-04-27 143228.jpg")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Delivery System");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel3)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 640));

        jLabel5.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(218, 98, 9));
        jLabel5.setText("Login");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(218, 98, 9));
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(218, 98, 9));
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, -1));

        email.setSelectionColor(new java.awt.Color(51, 255, 255));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 240, 40));

        login.setBackground(new java.awt.Color(218, 98, 9));
        login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, 100, 40));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(218, 98, 9));
        jLabel9.setText("Signup.");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 440, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Don't have an account? ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, -1, -1));

        resetPass.setBackground(new java.awt.Color(255, 255, 255));
        resetPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        resetPass.setForeground(new java.awt.Color(218, 98, 9));
        resetPass.setText("forget your password?");
        resetPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetPassMouseClicked(evt);
            }
        });
        jPanel1.add(resetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, -1, -1));

        pass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pass.setSelectionColor(new java.awt.Color(0, 255, 255));
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 240, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        // TODO add your handling code here:
        if(!(email.getText().equals("") && (pass.getPassword()==null)) ){
        Connection connection = getConnection();
        String E =email.getText();
      String query1 = "SELECT `email`,`Password` FROM `driver` where `email`='"+email.getText()+"'";
      String query2 = "SELECT `email`,`password` FROM `manger` where `email`='"+E+"'";
      String query3 = "SELECT `email`,`password` FROM `Admin` where `email`='"+E+"'";
      String query4 = "SELECT `email`,`password` FROM `company` where `email`='"+E+"'";

       String pass1 = new String(pass.getPassword());
       
       PreparedStatement ps;
       PreparedStatement ps2;
       PreparedStatement ps3;
       PreparedStatement ps4;
       
        try {
            ps = connection.prepareStatement(query1);
            ResultSet rs = ps.executeQuery();
            //rs.next();
            ps2 = connection.prepareStatement(query2);
            ResultSet rs2 = ps2.executeQuery();
            //rs2.next();
            ps3 = connection.prepareStatement(query3);
            ResultSet rs3 = ps3.executeQuery();
            //rs3.next();
            ps4 = connection.prepareStatement(query4);
            ResultSet rs4 = ps4.executeQuery();
            //rs4.next();
          
            if(rs.next()){
            if(pass1.equals(rs.getString("Password")))
            {

                PreparedStatement stmt = connection.prepareStatement("insert into `login` values(?,?)");
               // stmt.setInt(1,1);
                stmt.setString(1,rs.getString("email"));
                stmt.setString(2,pass1);
                stmt.executeUpdate();
                HomePage homepage = new HomePage();
                homepage.setVisible(true);
                dispose();
        }else{
         JOptionPane.showMessageDialog(jPanel1,"Email or password are not correct!","Alert",JOptionPane.WARNING_MESSAGE);
         }
            }else if(rs2.next()){
            if(pass1.equals(rs2.getString("password")))
            {
                PreparedStatement stmt = connection.prepareStatement("insert into `login` values(?,?)");
               // stmt.setInt(1,1);
                stmt.setString(1,rs2.getString("email"));
                stmt.setString(2,pass1);
                stmt.executeUpdate();
                Order_Page orderpage = new Order_Page();
                orderpage.setVisible(true);
                dispose();
        }else{
         JOptionPane.showMessageDialog(jPanel1,"Email or password are not correct!","Alert",JOptionPane.WARNING_MESSAGE);
         }
        
        }else if(rs3.next()){
         if(pass1.equals(rs3.getString("password")))
            {

                PreparedStatement stmt = connection.prepareStatement("insert into `login` values(?,?)");
               // stmt.setInt(1,1);
                stmt.setString(1,rs3.getString("email"));
                stmt.setString(2,pass1);
                stmt.executeUpdate();
                //open Admin
         }else{
         JOptionPane.showMessageDialog(jPanel1,"Email or password are not correct!","Alert",JOptionPane.WARNING_MESSAGE);
         }
        }
        else if(rs4.next()){
         if(pass1.equals(rs4.getString("password")))
            {

                PreparedStatement stmt = connection.prepareStatement("insert into `login` values(?,?)");
               // stmt.setInt(1,1);
                stmt.setString(1,rs4.getString("email"));
                stmt.setString(2,pass1);
                stmt.executeUpdate();
                //open company
         }else{
         JOptionPane.showMessageDialog(jPanel1,"Email or password are not correct!","Alert",JOptionPane.WARNING_MESSAGE);
         }
        }
       
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(jPanel1,"Email or password are not correct!","Alert",JOptionPane.WARNING_MESSAGE);  
            
            
        }}
        else {
            JOptionPane.showMessageDialog(jPanel1,"You should fill the feild","Alert",JOptionPane.WARNING_MESSAGE);
        }
            
        
    }//GEN-LAST:event_loginMouseClicked

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void resetPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetPassMouseClicked
        // TODO add your handling code here:
        ResetPass orderpage = new ResetPass();
        orderpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_resetPassMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel resetPass;
    // End of variables declaration//GEN-END:variables
}
