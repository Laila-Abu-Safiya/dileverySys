/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.dashboard;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class MANAGER_ADD extends javax.swing.JFrame {

    Connection con=null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public MANAGER_ADD() {
        initComponents();
        //place main frame in center
         super.pack();
        super.setLocationRelativeTo(null);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        CLOSE = new javax.swing.JButton();
        SAVE = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        salary = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        SALARY = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        NAME = new javax.swing.JTextField();
        PHONE = new javax.swing.JTextField();
        ADDRESS = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        EMAIL = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        sidepane = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        DASHBOAR_PANEL4 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        MANAGER_PANEL4 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        ADMIN_PANEL4 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jPanel21 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        company4 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setSize(new java.awt.Dimension(300, 300));

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\DASHBOARD\\src\\main\\java\\com\\mycompany\\dashboard\\imgs\\cancel.png")); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        CLOSE.setBackground(new java.awt.Color(102, 102, 102));
        CLOSE.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CLOSE.setForeground(new java.awt.Color(255, 255, 255));
        CLOSE.setText("CLOSE");
        CLOSE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CLOSE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CLOSEMousePressed(evt);
            }
        });
        CLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEActionPerformed(evt);
            }
        });
        jPanel1.add(CLOSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 70, 40));

        SAVE.setBackground(new java.awt.Color(218, 98, 9));
        SAVE.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        SAVE.setForeground(new java.awt.Color(255, 255, 255));
        SAVE.setText("SAVE");
        SAVE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SAVE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SAVEMousePressed(evt);
            }
        });
        SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVEActionPerformed(evt);
            }
        });
        jPanel1.add(SAVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 70, 40));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Salary: ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        salary.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        salary.setForeground(new java.awt.Color(218, 98, 9));
        salary.setText("________________________________");
        jPanel1.add(salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 330, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Add New Manager ");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        SALARY.setBackground(new java.awt.Color(255, 255, 255));
        SALARY.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        SALARY.setForeground(new java.awt.Color(0, 0, 0));
        SALARY.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SALARY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALARYActionPerformed(evt);
            }
        });
        jPanel1.add(SALARY, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 320, 30));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(218, 98, 9));
        jLabel18.setText("________________");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 250, -1));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("ID: ");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Name: ");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Phone: ");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Address: ");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        id.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        id.setForeground(new java.awt.Color(218, 98, 9));
        id.setText("____________________________________");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 390, -1));

        name.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(218, 98, 9));
        name.setText("________________________________");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 340, -1));

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(218, 98, 9));
        jLabel25.setText("________________________________");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 320, -1));

        address.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        address.setForeground(new java.awt.Color(218, 98, 9));
        address.setText("______________________________");
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 310, -1));

        ID.setBackground(new java.awt.Color(255, 255, 255));
        ID.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ID.setForeground(new java.awt.Color(0, 0, 0));
        ID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        jPanel1.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 360, 30));

        NAME.setBackground(new java.awt.Color(255, 255, 255));
        NAME.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        NAME.setForeground(new java.awt.Color(0, 0, 0));
        NAME.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        NAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMEActionPerformed(evt);
            }
        });
        jPanel1.add(NAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 320, 30));

        PHONE.setBackground(new java.awt.Color(255, 255, 255));
        PHONE.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        PHONE.setForeground(new java.awt.Color(0, 0, 0));
        PHONE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PHONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PHONEActionPerformed(evt);
            }
        });
        jPanel1.add(PHONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 320, 30));

        ADDRESS.setBackground(new java.awt.Color(255, 255, 255));
        ADDRESS.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ADDRESS.setForeground(new java.awt.Color(0, 0, 0));
        ADDRESS.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ADDRESS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDRESSActionPerformed(evt);
            }
        });
        jPanel1.add(ADDRESS, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 300, 30));

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("E-mail: ");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        email.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(218, 98, 9));
        email.setText("________________________________");
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 340, -1));

        EMAIL.setBackground(new java.awt.Color(255, 255, 255));
        EMAIL.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        EMAIL.setForeground(new java.awt.Color(0, 0, 0));
        EMAIL.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        EMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMAILActionPerformed(evt);
            }
        });
        jPanel1.add(EMAIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 320, 30));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Password: ");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        password.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        password.setForeground(new java.awt.Color(218, 98, 9));
        password.setText("_____________________________");
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 320, -1));

        pass.setBackground(new java.awt.Color(255, 255, 255));
        pass.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        pass.setForeground(new java.awt.Color(0, 0, 0));
        pass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 320, 30));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 620, 540));

        sidepane.setBackground(new java.awt.Color(218, 98, 9));

        jPanel18.setBackground(new java.awt.Color(218, 98, 9));

        jLabel62.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\DASHBOARD\\src\\main\\java\\com\\mycompany\\dashboard\\imgs\\LOGO.png")); // NOI18N

        DASHBOAR_PANEL4.setBackground(new java.awt.Color(218, 98, 9));
        DASHBOAR_PANEL4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DASHBOAR_PANEL4MouseMoved(evt);
            }
        });
        DASHBOAR_PANEL4.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                DASHBOAR_PANEL4MouseWheelMoved(evt);
            }
        });
        DASHBOAR_PANEL4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DASHBOAR_PANEL4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DASHBOAR_PANEL4MousePressed(evt);
            }
        });

        jLabel63.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\DASHBOARD\\src\\main\\java\\com\\mycompany\\dashboard\\imgs\\menu.png")); // NOI18N
        DASHBOAR_PANEL4.add(jLabel63);

        jLabel64.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("DASHBOARD");
        DASHBOAR_PANEL4.add(jLabel64);

        MANAGER_PANEL4.setBackground(new java.awt.Color(218, 98, 9));
        MANAGER_PANEL4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MANAGER_PANEL4MousePressed(evt);
            }
        });

        jLabel65.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\DASHBOARD\\src\\main\\java\\com\\mycompany\\dashboard\\imgs\\manager.png")); // NOI18N
        MANAGER_PANEL4.add(jLabel65);

        jLabel66.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("MANAGER   ");
        MANAGER_PANEL4.add(jLabel66);

        jPanel19.setBackground(new java.awt.Color(218, 98, 9));

        jLabel67.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\DASHBOARD\\src\\main\\java\\com\\mycompany\\dashboard\\imgs\\parcel.png")); // NOI18N
        jPanel19.add(jLabel67);

        jLabel68.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("PARCEL       ");
        jPanel19.add(jLabel68);

        jPanel20.setBackground(new java.awt.Color(218, 98, 9));

        jLabel69.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\DASHBOARD\\src\\main\\java\\com\\mycompany\\dashboard\\imgs\\motorbike.png")); // NOI18N
        jPanel20.add(jLabel69);

        jLabel70.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("DRIVER         ");
        jPanel20.add(jLabel70);

        ADMIN_PANEL4.setBackground(new java.awt.Color(218, 98, 9));
        ADMIN_PANEL4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ADMIN_PANEL4MousePressed(evt);
            }
        });

        jLabel71.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\DASHBOARD\\src\\main\\java\\com\\mycompany\\dashboard\\imgs\\admin.png")); // NOI18N
        ADMIN_PANEL4.add(jLabel71);

        jLabel72.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("ADMIN         ");
        ADMIN_PANEL4.add(jLabel72);

        jSeparator9.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator10.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));

        jPanel21.setBackground(new java.awt.Color(218, 98, 9));
        jPanel21.setForeground(new java.awt.Color(255, 255, 255));

        jLabel73.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\DASHBOARD\\src\\main\\java\\com\\mycompany\\dashboard\\imgs\\logout.png")); // NOI18N
        jPanel21.add(jLabel73);

        jLabel74.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("LOGOUT       ");
        jPanel21.add(jLabel74);

        company4.setBackground(new java.awt.Color(218, 98, 9));
        company4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                company4MousePressed(evt);
            }
        });

        jLabel75.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\DASHBOARD\\src\\main\\java\\com\\mycompany\\dashboard\\imgs\\company.png")); // NOI18N
        company4.add(jLabel75);

        jLabel76.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("COMPANY");
        company4.add(jLabel76);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(DASHBOAR_PANEL4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MANAGER_PANEL4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ADMIN_PANEL4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(company4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DASHBOAR_PANEL4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ADMIN_PANEL4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MANAGER_PANEL4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(company4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout sidepaneLayout = new javax.swing.GroupLayout(sidepane);
        sidepane.setLayout(sidepaneLayout);
        sidepaneLayout.setHorizontalGroup(
            sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        sidepaneLayout.setVerticalGroup(
            sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bg.add(sidepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel15MousePressed

    private void CLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CLOSEActionPerformed

    private void SALARYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALARYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SALARYActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void NAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAMEActionPerformed

    private void PHONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PHONEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PHONEActionPerformed

    private void ADDRESSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDRESSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADDRESSActionPerformed

    private void CLOSEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLOSEMousePressed
        this.dispose();
        MANAGER MANAGER = new MANAGER();
        MANAGER.setVisible(true);
    }//GEN-LAST:event_CLOSEMousePressed

    private void SAVEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SAVEMousePressed
       // this.dispose();
        //MANAGER MANAGER = new MANAGER();
       // MANAGER.setVisible(true);
    }//GEN-LAST:event_SAVEMousePressed

    private void SAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVEActionPerformed

        String sql = "INSERT INTO `manger`(`id`, `name`, `email`, `adress`, `password`, `phone`, `salary`) VALUES (?,?,?,?,?,?,?)";
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/delivery", "root", "");
            pst = con.prepareStatement(sql);
            pst.setString(1,ID.getText());
            pst.setString(2,NAME.getText());
            pst.setString(3,EMAIL.getText());
            pst.setString(5,pass.getText());
            pst.setString(6,PHONE.getText());
            pst.setString(4,ADDRESS.getText());
            pst.setString(7,SALARY.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "ADDED");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
    }//GEN-LAST:event_SAVEActionPerformed

    private void EMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMAILActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EMAILActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void DASHBOAR_PANEL4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DASHBOAR_PANEL4MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_DASHBOAR_PANEL4MouseMoved

    private void DASHBOAR_PANEL4MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_DASHBOAR_PANEL4MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_DASHBOAR_PANEL4MouseWheelMoved

    private void DASHBOAR_PANEL4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DASHBOAR_PANEL4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DASHBOAR_PANEL4MouseClicked

    private void DASHBOAR_PANEL4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DASHBOAR_PANEL4MousePressed
        this.dispose();
        MAIN MAIN = new MAIN();
        MAIN.setVisible(true);
    }//GEN-LAST:event_DASHBOAR_PANEL4MousePressed

    private void MANAGER_PANEL4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MANAGER_PANEL4MousePressed
        this.dispose();
        MANAGER MANAGER = new MANAGER();
        MANAGER.setVisible(true);
    }//GEN-LAST:event_MANAGER_PANEL4MousePressed

    private void ADMIN_PANEL4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADMIN_PANEL4MousePressed
        this.dispose();
        ADMIN ADMIN = new ADMIN();
        ADMIN.setVisible(true);
    }//GEN-LAST:event_ADMIN_PANEL4MousePressed

    private void company4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_company4MousePressed
        this.dispose();
        COMPANY COMPANY = new COMPANY();
        COMPANY.setVisible(true);
    }//GEN-LAST:event_company4MousePressed

    void setcolor(JPanel panel){
        setBackground(new Color(250, 118, 20));
    }
    void resetcolor(JPanel panel){
        setBackground(new Color(218,98,9));
    }
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
            java.util.logging.Logger.getLogger(MANAGER_ADD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MANAGER_ADD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MANAGER_ADD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MANAGER_ADD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new MANAGER_ADD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADDRESS;
    private javax.swing.JPanel ADMIN_PANEL4;
    private javax.swing.JButton CLOSE;
    private javax.swing.JPanel DASHBOAR_PANEL4;
    private javax.swing.JTextField EMAIL;
    private javax.swing.JTextField ID;
    private javax.swing.JPanel MANAGER_PANEL4;
    private javax.swing.JTextField NAME;
    private javax.swing.JTextField PHONE;
    private javax.swing.JTextField SALARY;
    private javax.swing.JButton SAVE;
    private javax.swing.JLabel address;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel company4;
    private javax.swing.JLabel email;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel name;
    private javax.swing.JTextField pass;
    private javax.swing.JLabel password;
    private javax.swing.JLabel salary;
    private javax.swing.JPanel sidepane;
    // End of variables declaration//GEN-END:variables
}
