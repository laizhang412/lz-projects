/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LandOwnerMasterRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.LandOwner;
import Business.Organization.LandOwnerMasterOrg;
import Business.Organization.Organization;
import Business.Rssystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author yangyufan
 */
public class MasterManage extends javax.swing.JPanel {

    /**
     * Creates new form Buyer
     */
   
    private JPanel p;
    private Rssystem b;
    private LandOwner lo;
    private LandOwnerMasterOrg m;
    public MasterManage(JPanel p, UserAccount ua, Rssystem b, Enterprise e, Organization o) {
        initComponents();
        this.p = p;
        this.b = b;
        this.lo = (LandOwner)e;
        this.m = (LandOwnerMasterOrg)o;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backbtn = new javax.swing.JButton();
        publishbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sellbtn = new javax.swing.JButton();
        orderbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(68, 75, 92));

        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/LandOwnerMasterRole/logout2.png"))); // NOI18N
        backbtn.setText("Logout");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        publishbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/LandOwnerMasterRole/fli.png"))); // NOI18N
        publishbtn.setText("Fill Land Information");
        publishbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publishbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Land Master Manage");

        sellbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/LandOwnerMasterRole/cps.png"))); // NOI18N
        sellbtn.setText("Set Price and Sell");
        sellbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtnActionPerformed(evt);
            }
        });

        orderbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/LandOwnerMasterRole/vo1.png"))); // NOI18N
        orderbtn.setText("View Order");
        orderbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(orderbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(sellbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(publishbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(705, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(publishbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(sellbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(orderbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        p.remove(this);
        CardLayout layout =(CardLayout) p.getLayout();
        layout.previous(p);
    }//GEN-LAST:event_backbtnActionPerformed

    private void publishbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publishbtnActionPerformed
        // TODO add your handling code here:
        LandInfo panel = new LandInfo(b,p,lo,m);
        p.add("LandInfo",panel);
        CardLayout layout =(CardLayout) p.getLayout();
        layout.next(p);
    }//GEN-LAST:event_publishbtnActionPerformed

    private void sellbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtnActionPerformed
        // TODO add your handling code here:
        SetPrice panel = new SetPrice(b,p,lo,m);
        p.add("SetPrice",panel);
        CardLayout layout =(CardLayout) p.getLayout();
        layout.next(p);
    }//GEN-LAST:event_sellbtnActionPerformed

    private void orderbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderbtnActionPerformed
        // TODO add your handling code here:
        OrderInfos panel = new OrderInfos(b,p,lo,m);
        p.add("OrderInfos",panel);
        CardLayout layout =(CardLayout) p.getLayout();
        layout.next(p);
    }//GEN-LAST:event_orderbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton orderbtn;
    private javax.swing.JButton publishbtn;
    private javax.swing.JButton sellbtn;
    // End of variables declaration//GEN-END:variables
}
