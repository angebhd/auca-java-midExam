/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.angebhd.midtermjava;

import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mickael-angebhd
 */
public class EPMS extends javax.swing.JFrame {

    /**
     * Creates new form EPMS
     */
    public EPMS() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        RetrieveButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        e_name = new javax.swing.JTextField();
        e_ID = new javax.swing.JTextField();
        basic_salary = new javax.swing.JTextField();
        e_period = new javax.swing.JTextField();
        ee_contribution = new javax.swing.JTextField();
        er_contribution = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        total_ee_contrButton = new javax.swing.JButton();
        total_er_contrButton = new javax.swing.JButton();
        benefitButton = new javax.swing.JButton();
        totalButton = new javax.swing.JButton();
        total_ee_contribution = new javax.swing.JTextField();
        total_er_contribution = new javax.swing.JTextField();
        benefit = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1412, 812));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 255))));
        jPanel1.setPreferredSize(new java.awt.Dimension(1450, 800));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel2.setText("EMPLOYEE NAME");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel3.setText("EMPOYEE-ID");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel4.setText("BASIC SALARY");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel5.setText("EMPLOYEMENT PERIOD ");

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel6.setText("EMPLOYEE CONTRIBUTION IN %");

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel7.setText("EMPLOYER CONTRIBUTION IN %");

        saveButton.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        RetrieveButton.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        RetrieveButton.setText("RETRIEVE");
        RetrieveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetrieveButtonActionPerformed(evt);
            }
        });

        resetButton.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        resetButton.setText("RESET");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        e_name.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N

        e_ID.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N

        basic_salary.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N

        e_period.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N

        ee_contribution.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N

        er_contribution.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N

        jLabel8.setText("*******************************************************************************************************************************************************");

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel9.setText("CALCULATE THE FOLLOWING");

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel10.setText("******************************************************************");

        total_ee_contrButton.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        total_ee_contrButton.setText("TOTAL EMPLOYEE CONTRIBUTION");
        total_ee_contrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_ee_contrButtonActionPerformed(evt);
            }
        });

        total_er_contrButton.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        total_er_contrButton.setText("TOTAL EMPLOYER CONTRIBUTION");
        total_er_contrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_er_contrButtonActionPerformed(evt);
            }
        });

        benefitButton.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        benefitButton.setText("BENEFIT IN %");
        benefitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                benefitButtonActionPerformed(evt);
            }
        });

        totalButton.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        totalButton.setText("TOTAL AMOUNT TO BE PAID");
        totalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalButtonActionPerformed(evt);
            }
        });

        total_ee_contribution.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N

        total_er_contribution.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N

        benefit.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N

        total.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N

        jButton8.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jButton8.setText("DISPLAY RECORD");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        updateButton.setText("UPDATE DATA");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jButton10.setText("DELETE");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "EMPLOYEE ID", "BASIC SALARY", "EMPLOYEE CONTRIBUTION", "EMPLOYER CONTRIBUTION"
            }
        ));
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel1.setText("EMPLOYEE PENSION MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)))
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(er_contribution, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(ee_contribution)
                            .addComponent(e_name, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(e_ID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(basic_salary, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(e_period, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(total_ee_contrButton)
                                    .addComponent(benefitButton)
                                    .addComponent(total_er_contrButton)
                                    .addComponent(totalButton))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(total_ee_contribution)
                                    .addComponent(total_er_contribution)
                                    .addComponent(benefit)
                                    .addComponent(total)))
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(updateButton)
                                    .addComponent(jButton8)
                                    .addComponent(jButton10))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(saveButton)
                                        .addGap(41, 41, 41)
                                        .addComponent(RetrieveButton)
                                        .addGap(37, 37, 37)
                                        .addComponent(resetButton))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(e_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(e_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(basic_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(e_period, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(total_ee_contrButton)
                            .addComponent(total_ee_contribution, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(total_er_contrButton)
                            .addComponent(total_er_contribution, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ee_contribution, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(er_contribution, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(benefitButton)
                            .addComponent(benefit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalButton)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(RetrieveButton)
                    .addComponent(resetButton))
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addGap(18, 18, 18)
                        .addComponent(updateButton)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void total_ee_contrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_ee_contrButtonActionPerformed
        // TODO add your handling code here:
        int basic = Integer.parseInt(basic_salary.getText());
        float ee_contr = Float.parseFloat(ee_contribution.getText());
        int period = Integer.parseInt(e_period.getText());
        
        double ee_total_contr = (basic*ee_contr*period*12) / 100;
        
        total_ee_contribution.setText(String.valueOf(ee_total_contr));
    }//GEN-LAST:event_total_ee_contrButtonActionPerformed

    private void total_er_contrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_er_contrButtonActionPerformed
        // TODO add your handling code here:
        int basic = Integer.parseInt(basic_salary.getText());
        float er_contr = Float.parseFloat(er_contribution.getText());
        int period = Integer.parseInt(e_period.getText());
        
        double er_total_contr = (basic*er_contr*period*12) / 100;
        total_er_contribution.setText(String.valueOf(er_total_contr));
    }//GEN-LAST:event_total_er_contrButtonActionPerformed

    private void benefitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_benefitButtonActionPerformed
        // TODO add your handling code here:
       
        int period = Integer.parseInt(e_period.getText());
        
        int benefitVal;
        if(period < 5){
            benefitVal = 10;
        } else if(period<10){
            benefitVal = 15;
         }else{
            benefitVal = 20;
        }
        benefit.setText(String.valueOf(benefitVal));
    }//GEN-LAST:event_benefitButtonActionPerformed

    private void totalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalButtonActionPerformed
        // TODO add your handling code here:
        int basic = Integer.parseInt(basic_salary.getText());
        float ee_contr = Float.parseFloat(ee_contribution.getText());
        int period = Integer.parseInt(e_period.getText());
        
        double ee_total_contr = (basic*ee_contr*period*12) / 100;
//        total_ee_contribution.setText(String.valueOf(ee_total_contr));
        
        float er_contr = Float.parseFloat(er_contribution.getText());
        
        double er_total_contr = (basic*er_contr*period*12) / 100;
//        total_er_contribution.setText(String.valueOf(er_total_contr));        
        int benefitVal;
        if(period < 5){
            benefitVal = 10;
        } else if(period<10){
            benefitVal = 15;
         }else{
            benefitVal = 20;
        }
//        benefit.setText(String.valueOf(benefitVal));

    double totalSimple = basic + ee_total_contr + er_total_contr;
    double totalAmount = totalSimple + (totalSimple*benefitVal*0.01);
    System.out.print(totalSimple*benefitVal*0.01);
    total.setText(String.format("%.0f", totalAmount));
        
    }//GEN-LAST:event_totalButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        
        int basic = Integer.parseInt(basic_salary.getText());
        float ee_contr = Float.parseFloat(ee_contribution.getText());
        int period = Integer.parseInt(e_period.getText());
        
        double ee_total_contr = (basic*ee_contr*period*12) / 100;
//        total_ee_contribution.setText(String.valueOf(ee_total_contr));
        
        float er_contr = Float.parseFloat(er_contribution.getText());
        
        double er_total_contr = (basic*er_contr*period*12) / 100;
//        total_er_contribution.setText(String.valueOf(er_total_contr));        
        int benefitVal;
        if(period < 5){
            benefitVal = 10;
        } else if(period<10){
            benefitVal = 15;
         }else{
            benefitVal = 20;
        }
//        benefit.setText(String.valueOf(benefitVal));
    

    double totalSimple = basic + ee_total_contr + er_total_contr;
    double totalAmount = totalSimple + (totalSimple*benefitVal*0.01);
//    System.out.print(totalSimple*benefitVal*0.01);
//    total.setText(String.valueOf(totalAmount));

    String name = e_name.getText();
    int ID = Integer.parseInt(e_ID.getText());
    
    try{
            
//            Class.forName("com.mysql.jdbc.Driver");
            Connection con1=DriverManager.getConnection("jdbc:mysql://localhost/Group_C_Project2024","DBuser","DBpass@123");
            PreparedStatement inp=con1.prepareStatement("insert into Pensions (names, ID, basic_salary, period, ee_contribution, er_contribution, total_ee_contribution, total_er_contribution, benefit, total) values(?,?,?,?,?,?,?,?,?,?)");
            inp.setString(1,name);
            inp.setInt(2, ID);
            inp.setInt(3, basic);
            inp.setInt(4, period);
            inp.setFloat(5, ee_contr);
            inp.setFloat(6, er_contr);
            inp.setDouble(7, ee_total_contr);
            inp.setDouble(8, er_total_contr);
            inp.setInt(9, benefitVal);
            inp.setDouble(10, totalAmount);
            
            inp.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record inserted sucessfully");
        } catch (SQLException ex) {
            System.out.print(ex);
            JOptionPane.showMessageDialog(this, "Somthing went wrong ! SQLException");
        }

    
    }//GEN-LAST:event_saveButtonActionPerformed

    private void RetrieveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetrieveButtonActionPerformed
        // TODO add your handling code here:
        int ID = Integer.parseInt(e_ID.getText());
        try{
            Connection con1=DriverManager.getConnection("jdbc:mysql://localhost/Group_C_Project2024","DBuser","DBpass@123");
            PreparedStatement retr=con1.prepareStatement("select * from  Pensions where id=?");
            retr.setInt(1, ID);
            
            ResultSet rs=retr.executeQuery();
//            JOptionPane.showMessageDialog(this, "Record well inserted");
            if(rs.next()){
                e_name.setText(rs.getString(1));
                e_ID.setText(String.valueOf(rs.getInt(2)));
                basic_salary.setText(String.valueOf(rs.getInt(3)));
                e_period.setText(String.valueOf(rs.getInt(4)));
                ee_contribution.setText(String.valueOf(rs.getFloat(5)));
                er_contribution.setText(String.valueOf(rs.getFloat(6)));
                total_ee_contribution.setText(String.format("%.0f",rs.getDouble(7)));
                total_er_contribution.setText(String.format("%.0f",rs.getDouble(8)));
                benefit.setText(String.valueOf(rs.getInt(9)));
                total.setText(String.format("%.0f",rs.getDouble(10)));
            }else{
                JOptionPane.showMessageDialog(this, "Employee not found !");

            }

        } catch (SQLException ex) {
            System.out.print(ex);
            JOptionPane.showMessageDialog(this, "Something went wrong");
        }
        
    }//GEN-LAST:event_RetrieveButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        e_name.setText(null);
        e_ID.setText(null);
        basic_salary.setText(null);
        e_period.setText(null);
        ee_contribution.setText(null);
        er_contribution.setText(null);
        total_ee_contribution.setText(null);
        total_er_contribution.setText(null);
        benefit.setText(null);
        total.setText(null);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        try{
            Connection con1=DriverManager.getConnection("jdbc:mysql://localhost/Group_C_Project2024","DBuser","DBpass@123");
            PreparedStatement retr=con1.prepareStatement("select * from  Pensions LIMIT 4");           
            ResultSet rs=retr.executeQuery();
                DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
                tblModel.setRowCount(0);

            while(rs.next()){
//                String[] tableData = {rs.getString(1), String.valueOf(rs.getInt(2)), String.valueOf(rs.getInt(3)), String.valueOf(rs.getInt(4)), String.format("%.0f",rs.getFloat(5)), String.format("%.0f",rs.getFloat(6)),String.format("%.0f",rs.getDouble(7)), String.format("%.0f",rs.getDouble(8)), String.valueOf(rs.getInt(9)), String.format("%.0f",rs.getDouble(10)) };
                String[] tableData = { String.valueOf(rs.getInt(2)), String.valueOf(rs.getInt(3)), String.valueOf(rs.getFloat(5)), String.valueOf(rs.getFloat(6)) };
                tblModel.addRow(tableData);
            }
        } catch (SQLException ex) {
            System.out.print(ex);
            JOptionPane.showMessageDialog(this, "Something went wrong");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        int rowIndex = jTable1.getSelectedRow();
        if (rowIndex == -1){
            JOptionPane.showMessageDialog(this, "Select the row to update");
        }
        else{
            
            try{     
//            Class.forName("com.mysql.jdbc.Driver");
                Connection con1=DriverManager.getConnection("jdbc:mysql://localhost/Group_C_Project2024","DBuser","DBpass@123");
                PreparedStatement inp=con1.prepareStatement("UPDATE Pensions SET basic_salary = ?, ee_contribution = ?, er_contribution = ? WHERE ID=?" );
                System.out.println(jTable1.getValueAt(rowIndex, 1));
                System.out.println(jTable1.getValueAt(rowIndex, 2));
                System.out.println(jTable1.getValueAt(rowIndex, 3));
                int bas_sal = Integer.parseInt(jTable1.getValueAt(rowIndex, 1).toString());
                float ee_contr = Float.parseFloat(jTable1.getValueAt(rowIndex, 2).toString());
                float er_contr = Float.parseFloat(jTable1.getValueAt(rowIndex, 3).toString());
                int emp_ID = Integer.parseInt(jTable1.getValueAt(rowIndex, 0).toString());
                inp.setInt(1, bas_sal);
                inp.setFloat(2, ee_contr );
                inp.setFloat(3, er_contr);
                inp.setInt(4, emp_ID);
            inp.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record updated");
            } catch (SQLException ex) {
                System.out.print(ex);
                JOptionPane.showMessageDialog(this, "Somthing went wrong ! SQLException");
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
          int rowIndex = jTable1.getSelectedRow();
        if (rowIndex == -1){
            JOptionPane.showMessageDialog(this, "Select the row to delete");
        }
        else{
            
            try{     
//            Class.forName("com.mysql.jdbc.Driver");
                Connection con1=DriverManager.getConnection("jdbc:mysql://localhost/Group_C_Project2024","DBuser","DBpass@123");
                PreparedStatement inp=con1.prepareStatement("DELETE FROM Pensions WHERE ID=?" );

                int emp_ID = Integer.parseInt(jTable1.getValueAt(rowIndex, 0).toString());

                inp.setInt(1, emp_ID);
            inp.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Deleted");
            } catch (SQLException ex) {
                System.out.print(ex);
                JOptionPane.showMessageDialog(this, "Somthing went wrong ! SQLException");
            }
        }
        
        
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(EPMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EPMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EPMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EPMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EPMS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RetrieveButton;
    private javax.swing.JTextField basic_salary;
    private javax.swing.JTextField benefit;
    private javax.swing.JButton benefitButton;
    private javax.swing.JTextField e_ID;
    private javax.swing.JTextField e_name;
    private javax.swing.JTextField e_period;
    private javax.swing.JTextField ee_contribution;
    private javax.swing.JTextField er_contribution;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField total;
    private javax.swing.JButton totalButton;
    private javax.swing.JButton total_ee_contrButton;
    private javax.swing.JTextField total_ee_contribution;
    private javax.swing.JButton total_er_contrButton;
    private javax.swing.JTextField total_er_contribution;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
