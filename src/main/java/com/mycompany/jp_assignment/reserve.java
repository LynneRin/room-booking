/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.jp_assignment;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lynne
 */
public final class reserve extends javax.swing.JFrame {

    /**
     * Creates new form reserve
     * @throws java.io.IOException
     */
    public reserve() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        importCategorisedRoom();
        importCategorisedReservation();
    }
    
    
    public void importCategorisedRoom() throws IOException {
        fileHandle file = new fileHandle("rooms.txt");
        
        // Reset table
        DefaultTableModel availablemodel = (DefaultTableModel)availableRoomsTable.getModel();
        availablemodel.setRowCount(0);
        
        Object[] fileRow = file.readFromFile();
        System.out.println("Importing Available Rooms...");
        for (var i = 0; i < fileRow.length; i++) {
            String line = fileRow[i].toString().trim();
            String[] dataRow = line.split(", ");
            if (i == 0){
                availablemodel.setColumnIdentifiers(dataRow);
            } else if (dataRow[4].equals("True")){
                availablemodel.addRow(dataRow);
                roomNumberInput.addItem(dataRow[0]);
            } 
        }
        System.out.println("Available Rooms Imported!");
    }
    
    public void importCategorisedReservation() throws IOException {
        fileHandle file = new fileHandle("reservations.txt");
        
        // Reset table
        DefaultTableModel activemodel = (DefaultTableModel)activeReservationsTable.getModel();
        DefaultTableModel historymodel = (DefaultTableModel)historyReservationTable.getModel();
        activemodel.setRowCount(0);
        historymodel.setRowCount(0);
        
        Object[] fileRow = file.readFromFile();
        
        System.out.println("Importing Reservations...");
        for (var i = 0; i < fileRow.length; i++) {
            String line = fileRow[i].toString().trim();
            String[] dataRow = line.split(", ");
            if (i == 0){
                activemodel.setColumnIdentifiers(dataRow);
                historymodel.setColumnIdentifiers(dataRow);
            } else if (dataRow[6].equals("False")){
                activemodel.addRow(dataRow);
                jComboBox3.addItem(dataRow[0]);
            } else if (dataRow[6].equals("True")){
                historymodel.addRow(dataRow);
                jComboBox5.addItem(dataRow[0]);
            } 
        }
        System.out.println("Reservations Imported!");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        customerNameInput = new javax.swing.JTextField();
        roomNumberInput = new javax.swing.JComboBox<>();
        roomTypeInput = new javax.swing.JTextField();
        roomViewInput = new javax.swing.JTextField();
        daysStaying = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        availableRoomsTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        activeReservationsTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        customerNameInput3 = new javax.swing.JTextField();
        customerNameInput4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        historyReservationTable = new javax.swing.JTable();
        jComboBox5 = new javax.swing.JComboBox<>();
        customerNameInput7 = new javax.swing.JTextField();
        customerNameInput8 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        mainPageBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setText("Jungle Sea Resort Management System");

        jLabel2.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel2.setText("Reservations");

        jTabbedPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTabbedPane1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel3.setText("Customer Name:");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel4.setText("Room Number:");

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel5.setText("Room Type:");

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel6.setText("Room View:");

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel7.setText("Days of Stay:");

        customerNameInput.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        customerNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameInputActionPerformed(evt);
            }
        });

        roomNumberInput.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        roomNumberInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomNumberInputActionPerformed(evt);
            }
        });

        roomTypeInput.setEditable(false);
        roomTypeInput.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N

        roomViewInput.setEditable(false);
        roomViewInput.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N

        daysStaying.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        daysStaying.setModel(new javax.swing.SpinnerNumberModel(1, 1, 7, 1));

        jButton1.setBackground(new java.awt.Color(21, 76, 121));
        jButton1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add Reservation");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        availableRoomsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(availableRoomsTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roomNumberInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roomTypeInput)
                            .addComponent(roomViewInput)
                            .addComponent(daysStaying)
                            .addComponent(customerNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {customerNameInput, daysStaying, roomNumberInput, roomTypeInput, roomViewInput});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(customerNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(roomNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(roomTypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(roomViewInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(daysStaying, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Reservations", jPanel2);

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel12.setText("Customer Name:");

        jComboBox3.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        activeReservationsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(activeReservationsTable);

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel13.setText("Booking ID:");

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel14.setText("Room Number:");

        customerNameInput3.setEditable(false);
        customerNameInput3.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        customerNameInput3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameInput3ActionPerformed(evt);
            }
        });

        customerNameInput4.setEditable(false);
        customerNameInput4.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        customerNameInput4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameInput4ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(21, 76, 121));
        jButton2.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Check Out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(customerNameInput3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(customerNameInput4, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {customerNameInput3, customerNameInput4, jComboBox3});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(customerNameInput4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(customerNameInput3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(40, 40, 40)
                .addComponent(jButton2)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Active Reservations", jPanel1);

        historyReservationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(historyReservationTable);

        jComboBox5.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        customerNameInput7.setEditable(false);
        customerNameInput7.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        customerNameInput7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameInput7ActionPerformed(evt);
            }
        });

        customerNameInput8.setEditable(false);
        customerNameInput8.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        customerNameInput8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameInput8ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(21, 76, 121));
        jButton4.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("View Invoice");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel18.setText("Room Number:");

        jLabel19.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel19.setText("Customer Name:");

        jLabel20.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel20.setText("Booking ID:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerNameInput7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerNameInput8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(523, 523, 523))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {customerNameInput7, customerNameInput8, jComboBox5});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(30, 30, 30))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel20)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(customerNameInput7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(customerNameInput8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(40, 40, 40)
                .addComponent(jButton4)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reservation History", jPanel3);

        mainPageBtn.setBackground(new java.awt.Color(21, 76, 121));
        mainPageBtn.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        mainPageBtn.setForeground(new java.awt.Color(255, 255, 255));
        mainPageBtn.setText("Main Page");
        mainPageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainPageBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mainPageBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addComponent(mainPageBtn)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void mainPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainPageBtnActionPerformed
        new index().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mainPageBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String roomID = customerNameInput3.getText();
        String bookingID = jComboBox3.getSelectedItem().toString();
        
        fileHandle roomFile = new fileHandle("rooms.txt");
        Object[] roomLines = {};
        try {
            roomLines = roomFile.readFromFile();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(reserve.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            roomFile.truncate();
        } catch (IOException ex) {
            Logger.getLogger(reserve.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Object row : roomLines) {
            String line = row.toString().trim();
            String[] dataRow = line.split(", ");
            if (dataRow[0].equals(roomID)) {
                dataRow[4] = "True";
            }
            roomFile.writeToFile(dataRow);
        }
        
        fileHandle bookingFile = new fileHandle("reservations.txt");
        Object[] bookingLines = {};
        try {
            bookingLines = bookingFile.readFromFile();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(reserve.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bookingFile.truncate();
        } catch (IOException ex) {
            Logger.getLogger(reserve.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Object row : bookingLines) {
            String line = row.toString().trim();
            String[] dataRow = line.split(", ");
            if (dataRow[0].equals(bookingID)) {
                dataRow[6] = "True";
            }
            bookingFile.writeToFile(dataRow);
        }
        
        JOptionPane.showMessageDialog(this, "Booking data has been updated.", "Data Updated", JOptionPane.INFORMATION_MESSAGE);
        try {
            importCategorisedRoom();
        } catch (IOException ex) {
            Logger.getLogger(reserve.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            importCategorisedReservation();
        } catch (IOException ex) {
            Logger.getLogger(reserve.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void customerNameInput4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameInput4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameInput4ActionPerformed

    private void customerNameInput3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameInput3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameInput3ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        DefaultTableModel model = (DefaultTableModel)activeReservationsTable.getModel();
        int selectedIndex = jComboBox3.getSelectedIndex();
        
        customerNameInput4.setText(model.getValueAt(selectedIndex, 2).toString());
        customerNameInput3.setText(model.getValueAt(selectedIndex, 1).toString());       
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void customerNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameInputActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        DefaultTableModel model = (DefaultTableModel)historyReservationTable.getModel();
        int selectedIndex = jComboBox5.getSelectedIndex();
        
        customerNameInput7.setText(model.getValueAt(selectedIndex, 2).toString());
        customerNameInput8.setText(model.getValueAt(selectedIndex, 1).toString());
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void customerNameInput7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameInput7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameInput7ActionPerformed

    private void customerNameInput8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameInput8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameInput8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new receipts().setVisible(true);
        String bookingID = jComboBox5.getSelectedItem().toString();
        receipts.bookingID.setText(bookingID);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String custName = customerNameInput.getText();
        String roomNumber = roomNumberInput.getSelectedItem().toString();
        int days = (Integer)daysStaying.getValue();
        
        if (custName.length() > 0) {
            DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-YYYY");
            LocalDateTime currDateTime = LocalDateTime.now();
            String date = dateTimeFormat.format(currDateTime);
            
            int roomCharges = 350 * days;
            int serviceTax = roomCharges * 10/100;
            int tourismTax = 10 * days;
            
            int total = roomCharges + serviceTax + tourismTax;
            
            fileHandle file = new fileHandle("reservations.txt");
            int bookingID = 0;
            try {
                bookingID = file.getLineNumber();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(reserve.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String[] data = {String.valueOf(bookingID), roomNumber, custName, String.valueOf(days), String.valueOf(total), date, "False"};
            if (file.writeToFile(data)) {
                fileHandle roomFile = new fileHandle("rooms.txt");
                Object[] lines = {};
                try {
                    lines = roomFile.readFromFile();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(reserve.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    roomFile.truncate();
                } catch (IOException ex) {
                    Logger.getLogger(reserve.class.getName()).log(Level.SEVERE, null, ex);
                }
                for (Object row : lines) {
                    String line = row.toString().trim();
                    String[] dataRow = line.split(", ");
                    if (dataRow[0].equals(roomNumber)) {
                        dataRow[4] = "False";
                    }
                    roomFile.writeToFile(dataRow);
                }
                JOptionPane.showMessageDialog(this, "Booking data has been added.", "Data Added", JOptionPane.INFORMATION_MESSAGE);
                try {
                    importCategorisedRoom();
                } catch (IOException ex) {
                    Logger.getLogger(reserve.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    importCategorisedReservation();
                } catch (IOException ex) {
                    Logger.getLogger(reserve.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "An error has occured while inserting the data!", "Insertion Failed", JOptionPane.WARNING_MESSAGE);
            }
            
        } else {
            JOptionPane.showMessageDialog(this, "Customer name is required to add booking!", "Invalid Input", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void roomNumberInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomNumberInputActionPerformed
        DefaultTableModel model = (DefaultTableModel)availableRoomsTable.getModel();
        int selectedIndex = roomNumberInput.getSelectedIndex();
        
        roomTypeInput.setText(model.getValueAt(selectedIndex, 1).toString());
        roomViewInput.setText(model.getValueAt(selectedIndex, 2).toString());
    }//GEN-LAST:event_roomNumberInputActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new reserve().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(reserve.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable activeReservationsTable;
    private javax.swing.JTable availableRoomsTable;
    private javax.swing.JTextField customerNameInput;
    private javax.swing.JTextField customerNameInput3;
    private javax.swing.JTextField customerNameInput4;
    private javax.swing.JTextField customerNameInput7;
    private javax.swing.JTextField customerNameInput8;
    private javax.swing.JSpinner daysStaying;
    private javax.swing.JTable historyReservationTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton mainPageBtn;
    private javax.swing.JComboBox<String> roomNumberInput;
    private javax.swing.JTextField roomTypeInput;
    private javax.swing.JTextField roomViewInput;
    // End of variables declaration//GEN-END:variables
}
