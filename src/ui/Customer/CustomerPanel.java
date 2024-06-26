/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Customer;

import api.TravelSystem;
import api.employee.Employee;
import api.organization.Organization;
import api.userAccount.UserAccount;

/**
 *
 * @author 10857
 */
public class CustomerPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerPanel
     */
    
    private TravelSystem system;
    private UserAccount account;
    private Organization organization;
    public CustomerPanel(UserAccount user,Employee em,TravelSystem system, Organization o) {
        initComponents();
        this.system = system;
        this.account = user;
        this.organization = o;
        TabPane.add("Airplane",new CustomerAirplane(this.system, this.account, this.organization));
        TabPane.add("Train",new CustomerTrain(this.system, this.account, this.organization));
        TabPane.add("My Orders",new CustomerOrders(this.system, this.account, this.organization));
        if(this.account.getRole().getRole().equals("VIPCustomer")){
            TabPane.add("VIPComment", new VIPCommentPanel(this.organization, this.account));
        }
        TabPane.add("My Page",new CustomerAdmin(this.system, this.account, this.organization));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabPane = new javax.swing.JTabbedPane();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabPane, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabPane, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabPane;
    // End of variables declaration//GEN-END:variables
}
