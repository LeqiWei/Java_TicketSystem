/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Station;

import ui.Airport.*;
import ui.captain.*;
import ui.AirlineCompany.*;
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
public class StationPanel extends javax.swing.JPanel {

    /**
     * Creates new form AirlineCompanyPanel
     */
    private JPanel userProcessContainer;
    private TravelSystem system;
    private Employee employee;
    private Organization origanization;
    private Airplane airplane;
    private Flight flight;
    
    public StationPanel(JPanel userProcessContainer, UserAccount user, Employee employee, TravelSystem system, Organization origanization) {
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

        jLabel1 = new javax.swing.JLabel();
        lblCompany = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnFlight = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCompany.setFont(new java.awt.Font("Gabriola", 1, 40)); // NOI18N
        lblCompany.setText(employee.getName());
        add(lblCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 59, 245, -1));

        lblTitle.setFont(new java.awt.Font("Gabriola", 1, 40)); // NOI18N
        lblTitle.setText("Station command:");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 59, -1, -1));

        btnFlight.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        btnFlight.setText("Entering Request");
        btnFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlightActionPerformed(evt);
            }
        });
        add(btnFlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 470, 54));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Station/station.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 590, 370));
    }// </editor-fold>//GEN-END:initComponents

    private void btnFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlightActionPerformed
        // TODO add your handling code here:
        EnteringCommandPanel enteringcapPanel = new EnteringCommandPanel(userProcessContainer, employee, system, origanization);
        userProcessContainer.add("EnteringCommandPanel",enteringcapPanel);
        CardLayout layout = (CardLayout)  userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFlightActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFlight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
