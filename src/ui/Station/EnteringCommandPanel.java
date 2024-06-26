/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Station;

import ui.Airport.*;
import ui.captain.*;
import api.TravelSystem;
import api.employee.Employee;
import api.organization.*;
import api.property.*;
import api.property.Airplane;
import api.request.*;
import api.userAccount.UserAccount;
import ui.Airport.*;
import ui.AirlineCompany.*;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author wangqingtang
 */
public class EnteringCommandPanel extends javax.swing.JPanel {

    /**
     * Creates new form AirlineCompanyJPanel
     */
    JPanel container;
    private TravelSystem system;
    private Employee account;
    private Station station;
    public EnteringCommandPanel(JPanel container,Employee em,TravelSystem system, Organization o) {
        this.system = system;
        this.account = em;
        this.station = (Station)o;
        this.container = container;
        initComponents();
        populateTable();
    }
    
    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }
        //Station station = (Station)organization;
        List<request> requests = station.getRequestDirectory().getRequestList();
        for (request request : requests) {
            Entering entering = (Entering)request;
            TrainLine trainline = entering.getTrainLine();
            Object[] row = new Object[5];
            row[0] = entering;
            row[1] = entering.getId();
            row[2] = trainline.getNextStation();
            row[3] = trainline.getCaptain().getName();
            row[4] = entering.getEnter() == null ? 0:entering.getEnter().getEnterNumber();
            model.addRow(row);
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

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Gabriola", 1, 40)); // NOI18N
        lblTitle.setText("Train Entering Command");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        workRequestJTable.setFont(new java.awt.Font("Gabriola", 0, 20)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "", "Train Number", "Next Station", "Train Captain", "Entering strip "
            }
        ));
        workRequestJTable.setRowHeight(30);
        workRequestJTable.setSelectionForeground(new java.awt.Color(153, 153, 255));
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setMinWidth(0);
            workRequestJTable.getColumnModel().getColumn(0).setPreferredWidth(0);
            workRequestJTable.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 982, 280));

        jButton4.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jButton4.setText("Agree");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 513, 149, 42));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Station/Backbutton_3.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 60, 60));

        jButton5.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jButton5.setText("Disagree");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 513, 149, 42));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Station/controller_1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 370, 190));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int row = workRequestJTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Entering entering = (Entering) workRequestJTable.getValueAt(row, 0);
        EnteringPanel enteringPanel = new EnteringPanel(container,station,entering);
        container.add("EnteringPanel", enteringPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
