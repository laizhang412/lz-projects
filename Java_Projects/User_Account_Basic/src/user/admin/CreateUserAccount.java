/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.admin;

import business.Business;
import business.Person;
import business.UserAccount;
import java.awt.CardLayout;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ruby
 */
public class CreateUserAccount extends javax.swing.JPanel {

    /**
     * Creates new form CreateUserAccount
     */
    private Business b;
    private JPanel p;
    CreateUserAccount(Business b, JPanel p) {
        initComponents();
        this.b = b;
        this.p = p;
        for(Person ps : b.getPersondirectory().getPerson()){
            cb1.addItem(ps.getFullname());
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
        r2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        cb2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t2 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        cb1 = new javax.swing.JComboBox<>();
        createbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("New User Account");

        r2.setText("Disabled");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Account Status");

        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select A Role--", "System Admin", "HR Admin" }));
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Full Name");

        jLabel3.setText("Username");

        jLabel4.setText("Password");

        jLabel6.setText("Account Role");

        r1.setText("Active");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select A Person--" }));

        createbtn.setText("Create");
        createbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnActionPerformed(evt);
            }
        });

        backbtn.setText("Cancel");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(createbtn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(backbtn)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(t1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cb2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(r1)
                                            .addGap(31, 31, 31)
                                            .addComponent(r2)))
                                    .addComponent(cb1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jLabel1))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backbtn)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1)
                    .addComponent(r2)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(createbtn)
                .addContainerGap(227, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
        if(r1.isSelected()){
            r2.setSelected(false);
        }
    }//GEN-LAST:event_r2ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb2ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
        if(r2.isSelected()){
            r1.setSelected(false);
        }
    }//GEN-LAST:event_r1ActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        p.remove(this);
        CardLayout layout =(CardLayout) p.getLayout();
        layout.previous(p);
    }//GEN-LAST:event_backbtnActionPerformed

    
    private void createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnActionPerformed
        // TODO add your handling code here:
        Boolean e1 = null;
        Boolean e2 = null;
        Boolean e3 = null;
        Boolean e4 = null;
        Boolean e5 = null;
        Boolean e6 = null;
        
        if(cb1.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null,"Please Select A Name");
            e1 = false;
        }else{e1 = true;}
        if(t1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Username Required");
            e2 = false;
        }else{e2 = true;}
        if(String.valueOf(t2.getPassword()).isEmpty()){
            JOptionPane.showMessageDialog(null,"Password Required");
            e3 = false;
        }else{e3 = true;}
        if(cb2.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null,"Please Select A Role");
            e4 = false;
        }else{e4 = true;}
        if(!r1.isSelected()&&!r2.isSelected()){
            JOptionPane.showMessageDialog(null,"Please Select A Status");
            e5 = false;
        }else{e5 = true;}
        Person target = null;
        String ar = (String)cb2.getSelectedItem();
        String nm = (String)cb1.getSelectedItem();
        for(int i=0;i<b.getPersondirectory().getPerson().size();i++){
            if(nm.equals(b.getPersondirectory().getPerson().get(i).getFullname())){
                target = b.getPersondirectory().getPerson().get(i);
                break;
            }
        }
        
        UserAccount target3 = null;
        for(int i=0; i<b.getUseraccountdirectory().getUseraccount().size();i++){
            if(b.getUseraccountdirectory().getUseraccount().get(i).getUsername().equals(t1.getText())){
                target3 = b.getUseraccountdirectory().getUseraccount().get(i);
                break;
            }
        }
        if(target3!=null){
            JOptionPane.showMessageDialog(null,"Username Exsits");
            e6 = false;
        }else{e6 = true;}
        if(e1&&e2&&e3&&e4&&e5&&e6){
            String fnm = (String)cb1.getSelectedItem();
            String usn = t1.getText();
            String pwd = String.valueOf(t2.getPassword());
            String acr = (String)cb2.getSelectedItem();
            Boolean sts = null;
            if(r1.isSelected()){
                sts = true;
            }else{sts = false;}
            
            UserAccount usa = b.getUseraccountdirectory().addUser();
            usa.setFullname(fnm);
            usa.setUsername(usn);
            usa.setPassword(b.passwordtohash(pwd));
            usa.setAccountrole(acr);
            usa.setStatus(sts);
            
            try{   
                BufferedWriter fw = new BufferedWriter(new FileWriter("user.txt"));
                for(UserAccount line : b.getUseraccountdirectory().getUseraccount()){
                    String[] a = new String[5];
                    a[0] = line.getUsername();
                    a[1] = line.getPassword();
                    a[2] = line.getFullname();
                    a[3] = line.getAccountrole();
                    if(line.isStatus()){
                        a[4] = "Active";
                    }else{
                        a[4] = "Disabled";
                    }
                    String thisline=Arrays.toString(a);
                    fw.write(thisline.replace("[", "").replace("]", "").replace(", ",","));
                    fw.newLine();
                }     
                fw.close();    
            }catch(Exception e){System.out.println(e);}    
            System.out.println("Success...");
            JOptionPane.showMessageDialog(null,"Created");
            cb1.setSelectedIndex(0);
            t1.setText("");
            t2.setText("");
            cb2.setSelectedIndex(0);
            r1.setSelected(false);
            r2.setSelected(false);
            
            
        }
    }//GEN-LAST:event_createbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JButton createbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JTextField t1;
    private javax.swing.JPasswordField t2;
    // End of variables declaration//GEN-END:variables
}
