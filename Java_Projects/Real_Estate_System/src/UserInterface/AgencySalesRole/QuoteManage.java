/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AgencySalesRole;

import Business.Data.Databank;
import Business.Enterprise.Agency;
import Business.Order.CustomerRequest;
import Business.Order.Quote;
import Business.Organization.AgencySalesOrg;
import Business.Role.AgencyCustomer;
import Business.Rssystem;
import java.awt.CardLayout;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ruby
 */
public class QuoteManage extends javax.swing.JPanel {

    /**
     * Creates new form QuoteManage
     */
    private JPanel p;
    private Rssystem b;
    private Agency a;
    private AgencySalesOrg as;
    private CustomerRequest rq;
    private AgencyCustomer acm;
    
    QuoteManage(Rssystem b, JPanel p, Agency a, AgencySalesOrg as, CustomerRequest rq) {
        initComponents();
        this.p = p;
        this.b = b;
        this.a = a;
        this.as = as;
        this.rq = rq;
        this.acm = (AgencyCustomer)rq.getCustomeraccount().getRole();
        l1.setText(String.valueOf(rq.getRequestid()));
        l2.setText(rq.getCustomeraccount().getPerson().getName());
        l3.setText(acm.getCustomertype().getValue());
        l4.setText(rq.getRealestate().getConstruction().getName());
        l5.setText(String.valueOf(rq.getRoom().getRoomid()));
        l6.setText(String.valueOf(rq.getRealestate().getUnitprice()));
        l7.setText(String.valueOf(rq.getRoom().getRoomarea()));
        l8.setText("");
        l9.setText("");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        quotebtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(68, 75, 92));
        setForeground(new java.awt.Color(255, 255, 255));

        backbtn.setBackground(new java.awt.Color(128, 209, 196));
        backbtn.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quote Manage");

        jLabel2.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Request ID");

        l1.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Customer");

        jLabel5.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Customer Type");

        jLabel6.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("RealEstate Name");

        jLabel7.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Room No.");

        jLabel8.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estimated Unit Price");

        jLabel9.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Room Area");

        l2.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setText("jLabel3");

        l3.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setText("jLabel3");

        l4.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 255, 255));
        l4.setText("jLabel3");

        l5.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        l5.setForeground(new java.awt.Color(255, 255, 255));
        l5.setText("jLabel3");

        l6.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        l6.setForeground(new java.awt.Color(255, 255, 255));
        l6.setText("jLabel3");

        l7.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        l7.setForeground(new java.awt.Color(255, 255, 255));
        l7.setText("jLabel3");

        jLabel3.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Discount");

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        jLabel10.setText("%");

        jLabel11.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Final Unit Price");

        l8.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        l8.setForeground(new java.awt.Color(255, 255, 255));
        l8.setText("jLabel3");

        jLabel12.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Final Total Price");

        l9.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        l9.setForeground(new java.awt.Color(255, 255, 255));
        l9.setText("jLabel13");

        quotebtn.setBackground(new java.awt.Color(128, 209, 196));
        quotebtn.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        quotebtn.setForeground(new java.awt.Color(255, 255, 255));
        quotebtn.setText("Send Quote");
        quotebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quotebtnActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Taxes & Fees");

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11)
                    .addComponent(jLabel1)
                    .addComponent(jLabel12))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l1)
                    .addComponent(l8)
                    .addComponent(l2)
                    .addComponent(l3)
                    .addComponent(l4)
                    .addComponent(l5)
                    .addComponent(l6)
                    .addComponent(l7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(t2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(backbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10)
                            .addComponent(quotebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
                    .addComponent(l9))
                .addGap(0, 604, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backbtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(l1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(l2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(l3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(l4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(l5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(l6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(l7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(l9)
                    .addComponent(quotebtn))
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        p.remove(this);
        CardLayout layout =(CardLayout) p.getLayout();
        layout.previous(p);
    }//GEN-LAST:event_backbtnActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
        Scanner sc = new Scanner(t1.getText());
        if(sc.hasNextDouble() && Double.parseDouble(t1.getText())<=0 && Double.parseDouble(t1.getText())>=100){
            t1.setText("");
        }
        
        double ep = Double.parseDouble(l6.getText());
        double d = Double.parseDouble(t1.getText());
        l8.setText(String.valueOf(ep*d/100));
        
    }//GEN-LAST:event_t1ActionPerformed

    private void quotebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quotebtnActionPerformed
        // TODO add your handling code here:
        if(l9.getText()!=""){
            if(acm.findQuote(rq.getRealestate(), rq.getRoom(), rq.getCustomeraccount()) != null){
                acm.getQuotelist().remove(acm.findQuote(rq.getRealestate(), rq.getRoom(), rq.getCustomeraccount()));
            }
            Quote q = new Quote(rq.getCustomeraccount(), rq.getRoom(), rq.getRealestate());
            q.setAgencycharge(Double.parseDouble(t2.getText()));
            q.setDiscount(Double.parseDouble(t1.getText())/100);
            q.setUnitprice(Double.parseDouble(t1.getText())*Double.parseDouble(l6.getText())/100);
            q.setTotalprice(Double.parseDouble(t1.getText())*Double.parseDouble(l6.getText())*Double.parseDouble(l7.getText())/100);
            if(acm.findQuote(rq.getRealestate(), rq.getRoom(), rq.getCustomeraccount())!=null){
                acm.getQuotelist().remove(acm.findQuote(rq.getRealestate(), rq.getRoom(), rq.getCustomeraccount()));
            }
            acm.getQuotelist().add(q);
            JOptionPane.showMessageDialog(null, "Quote Sent To Customer");
            Databank.getInstance().storeSystem(b);
        }else{
            JOptionPane.showMessageDialog(null, "Get Final Price First");
        }
    }//GEN-LAST:event_quotebtnActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
        Scanner sc = new Scanner(t2.getText());
        double s = Double.parseDouble(l7.getText());
        if(!sc.hasNextDouble()){
            t2.setText("");
        }
        double fup = Double.parseDouble(l8.getText());
        l9.setText(String.valueOf(fup*s+Double.parseDouble(t2.getText())));
    }//GEN-LAST:event_t2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JButton quotebtn;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
