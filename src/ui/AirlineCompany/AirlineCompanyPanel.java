/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AirlineCompany;

import api.TravelSystem;
import api.employee.Employee;
import api.organization.Organization;
import api.property.Airplane;
import api.request.Flight;
import api.userAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author 10857
 */
public class AirlineCompanyPanel extends javax.swing.JPanel {

    /**
     * Creates new form AirlineCompanyPanel
     */
    private JPanel userProcessContainer;
    private TravelSystem system;
    private Employee employee;
    private Organization origanization;
    private Airplane airplane;
    private Flight flight;
    
    public AirlineCompanyPanel(JPanel userProcessContainer, UserAccount user, Employee employee, TravelSystem system, Organization origanization) {
        this.system = system;
        this.employee = employee;
        this.origanization = origanization;
        this.userProcessContainer = userProcessContainer;
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

        lblCompany = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnFlight = new javax.swing.JButton();
        btnPlane = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCompany.setFont(new java.awt.Font("Gabriola", 1, 40)); // NOI18N
        lblCompany.setText(origanization.getName());
        add(lblCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 550, -1));

        lblTitle.setFont(new java.awt.Font("Gabriola", 1, 40)); // NOI18N
        lblTitle.setText("Welcome to Airline Company:");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 460, -1));

        btnFlight.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        btnFlight.setText("Manage Flight");
        btnFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlightActionPerformed(evt);
            }
        });
        add(btnFlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 471, 54));

        btnPlane.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        btnPlane.setText("Manage Plane");
        btnPlane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPlane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaneActionPerformed(evt);
            }
        });
        add(btnPlane, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 471, 54));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/AirlineCompany/travel1.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 330, -1, 320));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/AirlineCompany/airplane.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, -1, 250));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaneActionPerformed
        // TODO add your handling code here:
        ShowPlaneJPanel showPlaneJPanel = new ShowPlaneJPanel(userProcessContainer, employee, system, origanization);
        userProcessContainer.add("showPlaneJPanel", showPlaneJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnPlaneActionPerformed

    private void btnFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlightActionPerformed
        // TODO add your handling code here:
        ShowFlightJPanel showFlightJPanel = new ShowFlightJPanel(userProcessContainer, employee, system, origanization);
        userProcessContainer.add("ShowFlightJPanel",showFlightJPanel);
        CardLayout layout = (CardLayout)  userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFlightActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFlight;
    private javax.swing.JButton btnPlane;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
