/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AgencyCustomerRole;

import Business.Enterprise.Agency;
import Business.Organization.AgencyCustomerOrg;
import Business.Rssystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Ruby
 */
public class PurchaseManage extends javax.swing.JPanel {

    /**
     * Creates new form PurchaseManage
     */
    private JPanel p;
    private Rssystem b;
    private Agency a;
    private AgencyCustomerOrg c;
    private UserAccount ua;
    
    PurchaseManage(Rssystem b, JPanel p, Agency a, AgencyCustomerOrg c, UserAccount ua) {
        initComponents();
        this.p = p;
        this.b = b;
        this.a = a;
        this.c = c;
        this.ua = ua;
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
        backbtn = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        requestbtn = new javax.swing.JButton();
        quotebtn = new javax.swing.JButton();
        order = new javax.swing.JButton();

        setBackground(new java.awt.Color(68, 75, 92));

        jLabel1.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Purchase Manage");

        backbtn.setBackground(new java.awt.Color(128, 209, 196));
        backbtn.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AgencyCustomerRole/sp.png"))); // NOI18N
        searchbtn.setText("Search Purchase");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        requestbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AgencyCustomerRole/vr.png"))); // NOI18N
        requestbtn.setText("View Requests");
        requestbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestbtnActionPerformed(evt);
            }
        });

        quotebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AgencyCustomerRole/vqp.png"))); // NOI18N
        quotebtn.setText("View Quoted Price");
        quotebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quotebtnActionPerformed(evt);
            }
        });

        order.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AgencyCustomerRole/vo.png"))); // NOI18N
        order.setText("View Order");
        order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel1)
                        .addGap(150, 150, 150)
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(requestbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quotebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(order, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(532, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backbtn))
                .addGap(42, 42, 42)
                .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(requestbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(quotebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(order, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        p.remove(this);
        CardLayout layout =(CardLayout) p.getLayout();
        layout.previous(p);
    }//GEN-LAST:event_backbtnActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
        PurchaseSearch panel = new PurchaseSearch(b,p,a,c,ua);
        p.add("PurchaseSearch",panel);
        CardLayout layout =(CardLayout) p.getLayout();
        layout.next(p);
    }//GEN-LAST:event_searchbtnActionPerformed

    private void requestbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestbtnActionPerformed
        // TODO add your handling code here:
        ViewRequests panel = new ViewRequests(b,p,a,c,ua);
        p.add("ViewRequests",panel);
        CardLayout layout =(CardLayout) p.getLayout();
        layout.next(p);
    }//GEN-LAST:event_requestbtnActionPerformed

    private void quotebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quotebtnActionPerformed
        // TODO add your handling code here:
        ViewQuote panel = new ViewQuote(b,p,a,c,ua);
        p.add("ViewQuote",panel);
        CardLayout layout =(CardLayout) p.getLayout();
        layout.next(p);
    }//GEN-LAST:event_quotebtnActionPerformed

    private void orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActionPerformed
        // TODO add your handling code here:
        ViewOrder panel = new ViewOrder(b,p,a,c,ua);
        p.add("ViewOrder",panel);
        CardLayout layout =(CardLayout) p.getLayout();
        layout.next(p);
    }//GEN-LAST:event_orderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton order;
    private javax.swing.JButton quotebtn;
    private javax.swing.JButton requestbtn;
    private javax.swing.JButton searchbtn;
    // End of variables declaration//GEN-END:variables
}