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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ruby
 */
public class UpdateUserAccount extends javax.swing.JPanel {

    /**
     * Creates new form UpdateUserAccount
     */
    private Business b;
    private JPanel p;
    private UserAccount ua;
    private Person ps;
    UpdateUserAccount(Business b, JPanel p, UserAccount ua, Person ps) {
        initComponents();
        this.b = b;
        this.p = p;
        this.ua = ua;
        this.ps = ps;
        t1.setText(ua.getUsername());
        t2.setText(ua.getFullname());
        t3.setText("*********");
        if(ua.getAccountrole().equals("System Admin")){
            cb.setSelectedIndex(1);
        }else{
            cb.setSelectedIndex(0);
        }
        if(ua.isStatus()){
            r1.setSelected(true);
        }else{
            r2.setSelected(true);
        }
        t3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                t3.setText("");
            }
        });
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
        t1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t3 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        updatebtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        cb = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("Full Name");

        jLabel2.setText("Username");

        t2.setEnabled(false);

        jLabel3.setText("Password");

        jLabel4.setText("Account Role");

        r1.setText("Active");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        r2.setText("Disabled");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Account Status");

        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        backbtn.setText("Cancel");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HR Admin", "System Admin" }));
        cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("Update User Account");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cb, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(updatebtn)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(r1)
                                        .addGap(31, 31, 31)
                                        .addComponent(r2))))
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backbtn)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1)
                    .addComponent(r2)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(updatebtn)
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        p.remove(this);
        CardLayout layout =(CardLayout) p.getLayout();
        layout.previous(p);
    }//GEN-LAST:event_backbtnActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
        if(r2.isSelected()){
            r1.setSelected(false);
        }
    }//GEN-LAST:event_r1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
        if(r1.isSelected()){
            r2.setSelected(false);
        }
    }//GEN-LAST:event_r2ActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        Boolean e2 = null;
        Boolean e3 = null;
        if(t2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Username Required");
            e2 = false;
        }else{e2 = true;}
        if(String.valueOf(t3.getPassword()).isEmpty()){
            JOptionPane.showMessageDialog(null,"Password Required");
            e3 = false;
        }else{e3 = true;}
        Boolean e4 = null;
        UserAccount target3 = null;
        for(int i=0; i<b.getUseraccountdirectory().getUseraccount().size();i++){
            if(b.getUseraccountdirectory().getUseraccount().get(i).getUsername().equals(t1.getText())&&!ua.getUsername().equals(t1.getText())){
                target3 = b.getUseraccountdirectory().getUseraccount().get(i);
                break;
            }
        }
        if(target3!=null){
            JOptionPane.showMessageDialog(null,"Username Exsits");
            e4 = false;
        }else{e4 = true;}
        
        if(e2&&e3&&e4){
            b.getUseraccountdirectory().deleteUser(ua);
            String fn = t2.getText();
            String un = t1.getText();
            
            String pd = String.valueOf(t3.getPassword());
            String ar = (String)cb.getSelectedItem();
            Boolean st = null;
            if(r1.isSelected()){
                st = true;
            }else{
                st = false;
            }
            
            UserAccount u = b.getUseraccountdirectory().addUser();
            u.setAccountrole(ar);
            u.setFullname(fn);
            u.setUsername(un);
            if(pd.equals("*********")){
                u.setPassword(ua.getPassword());
            }else{
                    u.setPassword(b.passwordtohash(pd));
            }
            u.setStatus(st);
            
            ps.setFullname(fn);
            for(int i=0; i<ps.getUseraccount().size();i++){
                ps.getUseraccount().get(i).setFullname(fn);
            }
            String [] fnm;
            fnm = fn.split(" ");
            ps.setFirstname(fnm[0]);
            ps.setLastname(fnm[1]);
            
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
            
            try{   
                BufferedWriter fw = new BufferedWriter(new FileWriter("person.txt"));
                for(Person line : b.getPersondirectory().getPerson()){
                    String[] a = new String[2];
                    a[0] = line.getFirstname();
                    a[1] = line.getLastname();
                    String thisline=Arrays.toString(a);
                    fw.write(thisline.replace("[", "").replace("]", "").replace(", ",","));
                    fw.newLine();
                }     
                fw.close();    
            }catch(Exception e){System.out.println(e);} 
            System.out.println("Success...");
            
            JOptionPane.showMessageDialog(null,"Updated");
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JComboBox<String> cb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JPasswordField t3;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}