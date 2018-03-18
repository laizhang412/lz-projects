/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SupplierAdmin;

import Interface.ProviderAdmin.*;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ruby
 */
public class SupplierUserAccountManage extends javax.swing.JPanel {

    /**
     * Creates new form SupplierUserAccountManage
     */
    
    private JPanel p;
    private EcoSystem b;
    private UserAccount ua;
    private Organization o;
    private Enterprise e;
    SupplierUserAccountManage(EcoSystem b, JPanel p, UserAccount ua, Organization o, Enterprise e) {
        initComponents();
        this.p = p;
        this.b = b;
        this.ua = ua;
        this.o = o;
        this.e = e;
        populatetbl();
        cb1.removeAllItems();
        cb2.removeAllItems();
        for(Organization og : e.getOrganizationDirectory().getOrganizationList()){
            cb1.addItem(og.getName());
        }
    }
    
    public void populatetbl(){
        DefaultTableModel dtm= (DefaultTableModel)tbl.getModel();
        dtm.setRowCount(0);
        for(Organization og : e.getOrganizationDirectory().getOrganizationList()){
            for(UserAccount ua : og.getUseraccountdirectory().getUserAccountList()){
                Object row[]= new Object[3];
                row[0] = og;
                row[1] = ua.getPerson().getName();
                row[2] = ua;
                dtm.addRow(row);
            }    
            
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        backbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t2 = new javax.swing.JPasswordField();
        cb1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cb2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        createbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Organization", "Person", "Username"
            }
        ));
        jScrollPane1.setViewportView(tbl);

        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Username");

        jLabel4.setText("Password");

        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Organization");

        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Person");

        createbtn.setText("Create");
        createbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnActionPerformed(evt);
            }
        });

        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4))
                                        .addGap(58, 58, 58)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(t1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(t2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createbtn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deletebtn, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(backbtn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createbtn)
                        .addGap(18, 18, 18)
                        .addComponent(deletebtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(196, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        p.remove(this);
        CardLayout layout =(CardLayout) p.getLayout();
        layout.previous(p);
    }//GEN-LAST:event_backbtnActionPerformed

    private void createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnActionPerformed
        // TODO add your handling code here:
        Organization og = e.getOrganizationDirectory().findOrg(String.valueOf(cb1.getSelectedItem()));
        if(!t1.getText().isEmpty()&&!String.valueOf(t2.getPassword()).isEmpty()&&og.getUseraccountdirectory().checkIfUsernameIsUnique(t1.getText())){
            UserAccount ua = og.getUseraccountdirectory().createUserAccount(t1.getText(), String.valueOf(t2.getPassword()), og.findpersonname(String.valueOf(cb2.getSelectedItem())), og.getSupportedRole().get(0));
            og.findpersonname(String.valueOf(cb2.getSelectedItem())).getUseraccount().add(ua);
            populatetbl();
            DB4OUtil.getInstance().storeSystem(b);
        }else{
            JOptionPane.showMessageDialog(null,"Invalid Inputs");
        }
    }//GEN-LAST:event_createbtnActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
        if(cb1.getSelectedItem()!=null){
            cb2.removeAllItems();
            Organization og = e.getOrganizationDirectory().findOrg(String.valueOf(cb1.getSelectedItem()));
            for(Person p : og.getPersondirectory().getPersonlist()){
                cb2.addItem(p.getName());
            }
        }
    }//GEN-LAST:event_cb1ActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        int selectedrow= tbl.getSelectedRow();
        if(selectedrow >=0)
        {
            UserAccount ua = (UserAccount)tbl.getValueAt(selectedrow,2);
            Organization og = (Organization)tbl.getValueAt(selectedrow,0);
            Person p = og.findpersonname(String.valueOf(tbl.getValueAt(selectedrow,1)));
            og.getUseraccountdirectory().getUserAccountList().remove(ua);
            p.getUseraccount().remove(ua);
            JOptionPane.showMessageDialog(null,"Deleted");
            populatetbl();
            DB4OUtil.getInstance().storeSystem(b);
        }else{
            JOptionPane.showMessageDialog(null,"Please Select Any Row");
        }
    }//GEN-LAST:event_deletebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JButton createbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JPasswordField t2;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}
