/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.jp_assignment;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lynne
 */
public final class index extends javax.swing.JFrame {

    /**
     * Creates new form index
     */
    public index() {
        initComponents();
        this.setLocationRelativeTo(null);
        currentDateTime();
    }
    
    public void currentDateTime() {
        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm");
        LocalDateTime currDateTime = LocalDateTime.now();
        dateTime.setText(dateTimeFormat.format(currDateTime));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        appTitle = new javax.swing.JLabel();
        roomsNav = new javax.swing.JButton();
        bookingsNav = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        dateTime = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(241, 241, 241));
        setFont(new java.awt.Font("Cambria", 0, 10)); // NOI18N

        appTitle.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        appTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appTitle.setText("Jungle Sea Resort Management System");

        roomsNav.setBackground(new java.awt.Color(21, 76, 121));
        roomsNav.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        roomsNav.setForeground(new java.awt.Color(255, 255, 255));
        roomsNav.setText("Rooms");
        roomsNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomsNavActionPerformed(evt);
            }
        });

        bookingsNav.setBackground(new java.awt.Color(21, 76, 121));
        bookingsNav.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        bookingsNav.setForeground(new java.awt.Color(255, 255, 255));
        bookingsNav.setText("Bookings");
        bookingsNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingsNavActionPerformed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(210, 60, 60));
        logoutBtn.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        dateTime.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        dateTime.setText("dateTime");

        jLabel1.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel1.setText("Welcome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(appTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(roomsNav, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookingsNav)
                    .addComponent(logoutBtn)
                    .addComponent(dateTime))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bookingsNav, logoutBtn, roomsNav});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(appTitle)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(dateTime)
                .addGap(35, 35, 35)
                .addComponent(roomsNav, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(bookingsNav)
                .addGap(40, 40, 40)
                .addComponent(logoutBtn)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bookingsNav, logoutBtn, roomsNav});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roomsNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomsNavActionPerformed
        try {
            new room().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_roomsNavActionPerformed

    private void bookingsNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingsNavActionPerformed
        try {
            new reserve().setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bookingsNavActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutBtnActionPerformed

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
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appTitle;
    private javax.swing.JButton bookingsNav;
    private javax.swing.JLabel dateTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton roomsNav;
    // End of variables declaration//GEN-END:variables

    class frame {

        public frame() {
        }
    }
}
