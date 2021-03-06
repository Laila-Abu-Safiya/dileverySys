/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mangersection;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hp
 */
public class driverPage extends javax.swing.JFrame {

    /**
     * Creates new form driverPage
     */
    public driverPage() {
        initComponents();
       Show_driverTable();
    }
    public Connection getConnection(){
        Connection con;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/delivery?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
                    return con;
        }catch (Exception e){
           return null; 
        }
    }
    public ArrayList<Driver> driverList(String searchVal){
      ArrayList<Driver> driverList = new ArrayList<Driver>();
      Connection connection = getConnection();
      String query1 = "SELECT `email` FROM `login`";
       Statement st0;
       ResultSet rs0;
       String email = " ";
       try {
           st0 = connection.createStatement();
           rs0 = st0.executeQuery(query1);


           while(rs0.next())
           {
            email = rs0.getString("email");
           }

       } 
      catch (SQLException e) {
           e.printStackTrace();
       }
      String query = "SELECT `adress` FROM `manger` where `email` = '"+email+"'";
       Statement st1;
       ResultSet rs1;
       String address = " ";
       try {
           st1 = connection.createStatement();
           rs1 = st1.executeQuery(query);


           while(rs1.next())
           {
            address = rs1.getString("adress");
           }

       } 
      catch (SQLException e) {
           e.printStackTrace();
       }
  
      
      String quary = "SELECT * FROM `Driver` WHERE (CONCAT(`id`,`name`,`salary`) like '%"+searchVal+"%' and `address`='"+address+"')";
      Statement st;
       ResultSet rs;
       
       try {
           st = connection.createStatement();
           rs = st.executeQuery(quary);

           Driver drivers;

           while(rs.next())
           {
drivers = new Driver(rs.getInt("id"),rs.getString("name"),rs.getString("phone"),rs.getInt("salary"),rs.getString("license"),rs.getInt("points"),rs.getString("email"),rs.getString("Address"),rs.getString("Password"));
              driverList.add(drivers);
           }

       } 
      catch (SQLException e) {
           e.printStackTrace();
       }
       return driverList;
    }
    public void Show_driverTable(){
        ArrayList <Driver> listDriver = driverList(search.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID","Name","Phone","Salary","license","Points","Email","Address","Password"});     
        Object[] row = new Object[9];
        for(int i =0;i<listDriver.size();i++){
            row[0] = listDriver.get(i).getId();
            row[1] = listDriver.get(i).getName();
            row[2] = listDriver.get(i).getPhone();
            row[3] = listDriver.get(i).getSalary();
            row[4] = listDriver.get(i).getLicens();
            row[5] = listDriver.get(i).getPoints();
            row[6] = listDriver.get(i).getEmail();
            row[7] = listDriver.get(i).getAddress();
            row[8] = listDriver.get(i).getPassword();  
            model.addRow(row);
        }
        JTable_Drivers.setModel(model);
    }
    public void excuteSQLquery(String quary, String massege){
        Connection con = getConnection();
         Statement st;
       try{
           st = con.createStatement();
           if((st.executeUpdate(quary)) == 1)
           {
               // refresh jtable data
               DefaultTableModel model = (DefaultTableModel)JTable_Drivers.getModel();
               model.setRowCount(0);
               Show_driverTable();
               
               JOptionPane.showMessageDialog(null, "Data "+massege+" Succefully");
           }else{
               JOptionPane.showMessageDialog(null, "Data Not "+massege);
           }
       }catch(HeadlessException | SQLException ex){
       }
    }
     public static String Array[]=new String[9];
    public String[] getTable(){
       return Array;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        searchDriver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_Drivers = new javax.swing.JTable();
        sidePare2 = new javax.swing.JPanel();
        Orders1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Disribute_order1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Driver1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Add_driver1 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        Edit_Driver1 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        Edit_order1 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel42 = new javax.swing.JLabel();
        logout1 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(245, 124, 54));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Driver List");

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\Mangersection\\src\\main\\java\\MangerIcon\\LOGO.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel23))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 18, -1, 140));

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 190, 30));

        searchDriver.setBackground(new java.awt.Color(245, 124, 54));
        searchDriver.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\Mangersection\\src\\main\\java\\MangerIcon\\icons8-search-24.png")); // NOI18N
        searchDriver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchDriverMouseClicked(evt);
            }
        });
        searchDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDriverActionPerformed(evt);
            }
        });
        jPanel1.add(searchDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 40, 30));

        JTable_Drivers.setAutoCreateRowSorter(true);
        JTable_Drivers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone", "Salary", "Licance", "Points", "Email", "Address", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.String.class, java.lang.Short.class, java.lang.Short.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JTable_Drivers.setGridColor(new java.awt.Color(255, 255, 255));
        JTable_Drivers.setSelectionBackground(new java.awt.Color(255, 204, 204));
        JTable_Drivers.setSelectionForeground(new java.awt.Color(153, 0, 51));
        JTable_Drivers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTable_DriversMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTable_Drivers);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 680, 410));

        sidePare2.setBackground(new java.awt.Color(218, 98, 9));
        sidePare2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Orders1.setBackground(new java.awt.Color(218, 98, 9));
        Orders1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Orders1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Orders1MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Orders");

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\Mangersection\\src\\main\\java\\MangerIcon\\icons8-package-24.png")); // NOI18N

        javax.swing.GroupLayout Orders1Layout = new javax.swing.GroupLayout(Orders1);
        Orders1.setLayout(Orders1Layout);
        Orders1Layout.setHorizontalGroup(
            Orders1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Orders1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        Orders1Layout.setVerticalGroup(
            Orders1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Orders1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(Orders1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        sidePare2.add(Orders1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 260, -1));

        Disribute_order1.setBackground(new java.awt.Color(218, 98, 9));
        Disribute_order1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Disribute_order1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Disribute_order1MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Distribute orders");

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\Mangersection\\src\\main\\java\\MangerIcon\\icons8-list-24.png")); // NOI18N

        javax.swing.GroupLayout Disribute_order1Layout = new javax.swing.GroupLayout(Disribute_order1);
        Disribute_order1.setLayout(Disribute_order1Layout);
        Disribute_order1Layout.setHorizontalGroup(
            Disribute_order1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Disribute_order1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        Disribute_order1Layout.setVerticalGroup(
            Disribute_order1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Disribute_order1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(Disribute_order1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        sidePare2.add(Disribute_order1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 260, -1));

        Driver1.setBackground(new java.awt.Color(245, 124, 54));
        Driver1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Driver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Driver1MouseClicked(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Drivers");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\Mangersection\\src\\main\\java\\MangerIcon\\icons8-driver-24.png")); // NOI18N

        javax.swing.GroupLayout Driver1Layout = new javax.swing.GroupLayout(Driver1);
        Driver1.setLayout(Driver1Layout);
        Driver1Layout.setHorizontalGroup(
            Driver1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Driver1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        Driver1Layout.setVerticalGroup(
            Driver1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Driver1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Driver1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        sidePare2.add(Driver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 260, -1));

        Add_driver1.setBackground(new java.awt.Color(218, 98, 9));
        Add_driver1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add_driver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_driver1MouseClicked(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Add driver");

        jLabel36.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\Mangersection\\src\\main\\java\\MangerIcon\\icons8-add-new-16.png")); // NOI18N

        javax.swing.GroupLayout Add_driver1Layout = new javax.swing.GroupLayout(Add_driver1);
        Add_driver1.setLayout(Add_driver1Layout);
        Add_driver1Layout.setHorizontalGroup(
            Add_driver1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_driver1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        Add_driver1Layout.setVerticalGroup(
            Add_driver1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Add_driver1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Add_driver1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Add_driver1Layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(jLabel35)))
                .addContainerGap())
        );

        sidePare2.add(Add_driver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, -1));

        Edit_Driver1.setBackground(new java.awt.Color(218, 98, 9));
        Edit_Driver1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Edit_Driver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Edit_Driver1MouseClicked(evt);
            }
        });

        jLabel37.setBackground(new java.awt.Color(218, 98, 9));
        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Edit Driver information");

        jLabel38.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\Mangersection\\src\\main\\java\\MangerIcon\\editdriver.png")); // NOI18N

        javax.swing.GroupLayout Edit_Driver1Layout = new javax.swing.GroupLayout(Edit_Driver1);
        Edit_Driver1.setLayout(Edit_Driver1Layout);
        Edit_Driver1Layout.setHorizontalGroup(
            Edit_Driver1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Edit_Driver1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addGap(29, 29, 29))
        );
        Edit_Driver1Layout.setVerticalGroup(
            Edit_Driver1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Edit_Driver1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(Edit_Driver1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        sidePare2.add(Edit_Driver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 260, -1));

        Edit_order1.setBackground(new java.awt.Color(218, 98, 9));
        Edit_order1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Edit_order1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Edit_order1MouseClicked(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Edit order information");

        jLabel40.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\Mangersection\\src\\main\\java\\MangerIcon\\editorder.png")); // NOI18N

        javax.swing.GroupLayout Edit_order1Layout = new javax.swing.GroupLayout(Edit_order1);
        Edit_order1.setLayout(Edit_order1Layout);
        Edit_order1Layout.setHorizontalGroup(
            Edit_order1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Edit_order1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addGap(34, 34, 34))
        );
        Edit_order1Layout.setVerticalGroup(
            Edit_order1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Edit_order1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(Edit_order1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40))
                .addGap(15, 15, 15))
        );

        sidePare2.add(Edit_order1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 260, -1));

        jLabel41.setBackground(new java.awt.Color(255, 255, 255));
        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Delivery System");
        sidePare2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sidePare2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 180, 10));

        jLabel42.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\Mangersection\\src\\main\\java\\MangerIcon\\delivery.png")); // NOI18N
        sidePare2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        logout1.setBackground(new java.awt.Color(218, 98, 9));
        logout1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Logout");
        logout1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 30));

        jLabel44.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Downloads\\icons8-logout-24 (1).png")); // NOI18N
        logout1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 0, -1, 33));

        sidePare2.add(logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 523, 260, 40));

        jPanel1.add(sidePare2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void searchDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDriverActionPerformed

    }//GEN-LAST:event_searchDriverActionPerformed

    private void searchDriverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchDriverMouseClicked
        // TODO add your handling code here:
        Show_driverTable();
    }//GEN-LAST:event_searchDriverMouseClicked

    private void OrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrdersMouseClicked
        // TODO add your handling code here:
        Order_Page orderpage = new Order_Page();
        orderpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_OrdersMouseClicked

    private void Disribute_orderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Disribute_orderMouseClicked
        // TODO add your handling code here:
        Distribute_order distribuetPage = new Distribute_order();
        distribuetPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_Disribute_orderMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        driverPage driverPage = new driverPage();
        driverPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void DriverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DriverMouseClicked
        // TODO add your handling code here:
        driverPage driverpage = new driverPage();
        driverpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_DriverMouseClicked

    private void Add_driverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_driverMouseClicked
        // TODO add your handling code here:
        Add_Driver_Frame orderpage = new Add_Driver_Frame();
        orderpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_Add_driverMouseClicked

    private void Edit_DriverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Edit_DriverMouseClicked
        // TODO add your handling code here:
        Add_Driver_Frame orderpage = new Add_Driver_Frame();
        orderpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_Edit_DriverMouseClicked

    private void Edit_orderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Edit_orderMouseClicked
        // TODO add your handling code here:
        edit_order_frame orderpage = new edit_order_frame();
        orderpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_Edit_orderMouseClicked

    private void Orders1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Orders1MouseClicked
        // TODO add your handling code here:
        Order_Page orderpage = new Order_Page();
        orderpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_Orders1MouseClicked

    private void Disribute_order1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Disribute_order1MouseClicked
        // TODO add your handling code here:
        Distribute_order distribuetPage = new Distribute_order();
        distribuetPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_Disribute_order1MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        driverPage driverPage = new driverPage();
        driverPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel24MouseClicked

    private void Driver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Driver1MouseClicked
        // TODO add your handling code here:
        driverPage driverpage = new driverPage();
        driverpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_Driver1MouseClicked

    private void Add_driver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_driver1MouseClicked
        // TODO add your handling code here:
        Add_Driver_Frame orderpage = new Add_Driver_Frame();
        orderpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_Add_driver1MouseClicked

    private void Edit_Driver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Edit_Driver1MouseClicked
        // TODO add your handling code here:
        edit_Driver orderpage = new edit_Driver();
        orderpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_Edit_Driver1MouseClicked

    private void Edit_order1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Edit_order1MouseClicked
        // TODO add your handling code here:
        edit_order_frame orderpage = new edit_order_frame();
        orderpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_Edit_order1MouseClicked

    private void JTable_DriversMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTable_DriversMouseClicked
        // TODO add your handling code here:
        int j = JTable_Drivers.getSelectedRow();
       TableModel model = JTable_Drivers.getModel();
       Array[0]= model.getValueAt(j, 0).toString();
       Array[1]= model.getValueAt(j, 1).toString();
       Array[2]= model.getValueAt(j, 2).toString();
       Array[3]= model.getValueAt(j, 3).toString();
       Array[4]= model.getValueAt(j, 4).toString();
       Array[5]= model.getValueAt(j, 5).toString();
       Array[6]= model.getValueAt(j, 6).toString();
       Array[7]= model.getValueAt(j, 7).toString();
       Array[8]= model.getValueAt(j, 8).toString();
    }//GEN-LAST:event_JTable_DriversMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Add_driver1;
    private javax.swing.JPanel Disribute_order1;
    private javax.swing.JPanel Driver1;
    private javax.swing.JPanel Edit_Driver1;
    private javax.swing.JPanel Edit_order1;
    private javax.swing.JTable JTable_Drivers;
    private javax.swing.JPanel Orders1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel logout1;
    private javax.swing.JTextField search;
    private javax.swing.JButton searchDriver;
    private javax.swing.JPanel sidePare2;
    // End of variables declaration//GEN-END:variables
}
