/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LandOwnerMasterRole;

import Business.Data.Databank;
import Business.Enterprise.LandOwner;
import Business.Organization.LandOwnerEvaluatorOrg;
import Business.Organization.LandOwnerMasterOrg;
import Business.Rssystem;
import Business.land.Land;
import java.awt.CardLayout;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ruby
 */
public class LandInfo extends javax.swing.JPanel {

    /**
     * Creates new form LandInfo
     */
    
    private JPanel p;
    private Rssystem b;
    private LandOwner lo;
    private LandOwnerMasterOrg m;
    
    LandInfo(Rssystem b, JPanel p, LandOwner lo, LandOwnerMasterOrg m) {
        initComponents();
        this.b = b;
        this.p = p;
        this.lo = lo;
        this.m = m;
        populatetbl();
    }
    
    public void populatetbl(){
        DefaultTableModel dtm = (DefaultTableModel)tbl.getModel();
        dtm.setRowCount(0);
        for(Land l : lo.getLand()){
            Object row[] = new Object[4];
            row[0] = l;
            row[1] = l.getCategory();
            if(l.isStatus()){
                row[2] = "Available";
            }else{
                row[2] = "Unavailable";
            }
            row[3] = l.getArea();
            dtm.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        addbtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        cb2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        savebtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        requestbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(68, 75, 92));

        jLabel1.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Land Information");

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Category", "Status", "Area"
            }
        ));
        jScrollPane1.setViewportView(tbl);

        addbtn.setBackground(new java.awt.Color(128, 209, 196));
        addbtn.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        editbtn.setBackground(new java.awt.Color(128, 209, 196));
        editbtn.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        editbtn.setForeground(new java.awt.Color(255, 255, 255));
        editbtn.setText("Edit");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(128, 209, 196));
        deletebtn.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");

        t1.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Category");

        jLabel4.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Status");

        cb1.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        cb1.setForeground(new java.awt.Color(255, 255, 255));
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Commerical", "Residence", "Education", "Military", "Agriculture" }));
        cb1.setEnabled(false);

        cb2.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        cb2.setForeground(new java.awt.Color(255, 255, 255));
        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Unavailable" }));
        cb2.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Area");

        t2.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Street Address");

        t3.setEnabled(false);

        savebtn.setBackground(new java.awt.Color(128, 209, 196));
        savebtn.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        savebtn.setForeground(new java.awt.Color(255, 255, 255));
        savebtn.setText("Save");
        savebtn.setEnabled(false);
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        backbtn.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        requestbtn.setBackground(new java.awt.Color(128, 209, 196));
        requestbtn.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        requestbtn.setForeground(new java.awt.Color(255, 255, 255));
        requestbtn.setText("Request Evaluation");
        requestbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(savebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(addbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deletebtn)
                                .addGap(94, 94, 94))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cb2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(60, 60, 60)
                                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)))
                                .addGap(33, 33, 33)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(requestbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(t2))))
                .addContainerGap(476, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backbtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbtn)
                    .addComponent(editbtn)
                    .addComponent(deletebtn)
                    .addComponent(requestbtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savebtn))
                .addContainerGap(237, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        p.remove(this);
        CardLayout layout =(CardLayout) p.getLayout();
        layout.previous(p);
    }//GEN-LAST:event_backbtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
        savebtn.setEnabled(true);
        addbtn.setEnabled(false);
        editbtn.setEnabled(false);
        deletebtn.setEnabled(false);
        t1.setEnabled(true);
        t2.setEnabled(true);
        t3.setEnabled(true);
        cb1.setEnabled(true);
        cb2.setEnabled(true);
    }//GEN-LAST:event_addbtnActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
        Scanner sc1 = new Scanner(t1.getText());
        Scanner sc2 = new Scanner(t2.getText());
        if(sc1.hasNextInt() && sc2.hasNextDouble() && !t3.getText().isEmpty() && cb2.getSelectedItem()!=null){
            if(lo.checkuniqueLand(Integer.parseInt(t1.getText()))){
                Land l = new Land(lo);
                l.setAddress(t3.getText());
                l.setArea(Double.parseDouble(t2.getText()));
                l.setCategory((String)cb1.getSelectedItem());
                if(cb2.getSelectedIndex()==0){
                    l.setStatus(true);
                }else{
                    l.setStatus(false);
                }
                l.setId(Integer.parseInt(t1.getText()));
                lo.getLand().add(l);
                populatetbl();
                Databank.getInstance().storeSystem(b);
                savebtn.setEnabled(false);
                addbtn.setEnabled(true);
                editbtn.setEnabled(true);
                deletebtn.setEnabled(true);
                t1.setEnabled(false);
                t2.setEnabled(false);
                t3.setEnabled(false);
                cb1.setEnabled(false);
                cb2.setEnabled(false);
            }else{
                JOptionPane.showMessageDialog(null, "Land Exists");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Invalid Inputs");
        }
    }//GEN-LAST:event_savebtnActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        // TODO add your handling code here:
        int selectedrow= tbl.getSelectedRow();
        if(selectedrow >=0){
            savebtn.setEnabled(true);
            addbtn.setEnabled(false);
            editbtn.setEnabled(false);
            deletebtn.setEnabled(false);
            t1.setEnabled(true);
            t2.setEnabled(true);
            t3.setEnabled(true);
            cb1.setEnabled(true);
            cb2.setEnabled(true);
            Land l = (Land)tbl.getValueAt(selectedrow,0);
            t1.setText(String.valueOf(l.getId()));
            t2.setText(String.valueOf(l.getArea()));
            t3.setText(l.getAddress());
            cb1.setSelectedItem(l.getCategory());
            if(l.isStatus()){
                cb2.setSelectedIndex(0);
            }else{
                cb2.setSelectedIndex(1);
            }
            lo.getLand().remove(l);
        }else{
            JOptionPane.showMessageDialog(null,"Please Select Any Row");
        }
    }//GEN-LAST:event_editbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        int selectedrow= tbl.getSelectedRow();
        if(selectedrow >=0){
            Land l = (Land)tbl.getValueAt(selectedrow,0);
            lo.getLand().remove(l);
            populatetbl();
            Databank.getInstance().storeSystem(b);
        }else{
            JOptionPane.showMessageDialog(null,"Please Select Any Row");
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void requestbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestbtnActionPerformed
        // TODO add your handling code here:
        int selectedrow= tbl.getSelectedRow();
        if(selectedrow >=0){
            Land l = (Land)tbl.getValueAt(selectedrow,0);
            for(LandOwnerEvaluatorOrg e : lo.findLandOwnerEvaluator()){
                if(!e.checkiflandrequestexists(l)){
                    e.getTobeevaluated().add(l);
                    Databank.getInstance().storeSystem(b);
                    JOptionPane.showMessageDialog(null,"Request Sent");
                }else{
                    e.getTobeevaluated().remove(e.findland(l.getId()));
                    e.getTobeevaluated().add(l);
                    JOptionPane.showMessageDialog(null,"Request Exists");
                    break;
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"Please Select Any Row");
        }
    }//GEN-LAST:event_requestbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton backbtn;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton editbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton requestbtn;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}
