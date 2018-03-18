/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.hr;

import business.Business;
import business.Person;
import business.UserAccount;
import java.awt.CardLayout;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import user.admin.AdminInfo;
import user.admin.UpdateUserAccount;

/**
 *
 * @author Ruby
 */
public class ManagePerson extends javax.swing.JPanel {

    /**
     * Creates new form ManagePerson
     */
    private JPanel p;
    private Business b;
    ManagePerson(Business b, JPanel p) {
        initComponents();
        this.b = b;
        this.p = p;
        populatetbl();
    }
    
    public void populatetbl(){
        DefaultTableModel dtm= (DefaultTableModel)tbl.getModel();
        dtm.setRowCount(0);
        for(Person ps : b.getPersondirectory().getPerson())
        {
            Object row[]= new Object[3];
            row[0] = ps;
            row[1] = ps.getLastname();
            ArrayList<String> us = new ArrayList();
            for(int i=0; i<ps.getUseraccount().size(); i++){
                us.add(ps.getUseraccount().get(i).getUsername());
            }
            String usn = String.join(",",us);
            row[2] = usn;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        cb = new javax.swing.JComboBox<>();
        searchbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        newbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl);
        if (tbl.getColumnModel().getColumnCount() > 0) {
            tbl.getColumnModel().getColumn(0).setResizable(false);
            tbl.getColumnModel().getColumn(1).setResizable(false);
            tbl.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Manage Person Directory");

        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select A Way To Search--", "By First Name", "By Last Name", "By Full Name", "By Username" }));

        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Find Person");

        newbtn.setText("New Person");
        newbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newbtnActionPerformed(evt);
            }
        });

        updatebtn.setText("Update Person");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        deletebtn.setText("Delete Person");
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
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backbtn))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deletebtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(newbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(updatebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchbtn)))))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backbtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtn)
                    .addComponent(jLabel2)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newbtn)
                    .addComponent(deletebtn))
                .addGap(18, 18, 18)
                .addComponent(updatebtn)
                .addContainerGap(307, Short.MAX_VALUE))
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
        if(cb.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null,"Please Select A Way To Search");
        }else{
            ArrayList<Person> targets = new ArrayList();
            if(cb.getSelectedIndex()==1){
                for(int i=0; i<b.getPersondirectory().getPerson().size(); i++){
                    if(b.getPersondirectory().getPerson().get(i).getFirstname().equals(t1.getText())){
                        targets.add(b.getPersondirectory().getPerson().get(i));
                    }
                }
            }
            if(cb.getSelectedIndex()==2){
                for(int i=0; i<b.getPersondirectory().getPerson().size(); i++){
                    if(b.getPersondirectory().getPerson().get(i).getLastname().equals(t1.getText())){
                        targets.add(b.getPersondirectory().getPerson().get(i));}
                }
            }
            if(cb.getSelectedIndex()==3){
                for(int i=0; i<b.getPersondirectory().getPerson().size(); i++){
                    if(b.getPersondirectory().getPerson().get(i).getFullname().equals(t1.getText())){
                        targets.add(b.getPersondirectory().getPerson().get(i));
                    }
                }
            }
            if(cb.getSelectedIndex()==4){
                String fnm = null;
                for(int i=0; i<b.getUseraccountdirectory().getUseraccount().size(); i++){
                    if(b.getUseraccountdirectory().getUseraccount().get(i).getUsername().equals(t1.getText())){
                        fnm = b.getUseraccountdirectory().getUseraccount().get(i).getFullname();
                        break;
                    }
                }
                
                if(fnm != null){
                    for(int i=0; i<b.getPersondirectory().getPerson().size();i++){
                        if(fnm.equals(b.getPersondirectory().getPerson().get(i).getFullname())){
                            targets.add(b.getPersondirectory().getPerson().get(i));
                            break;
                        }
                    }
                } 
            }
            if(targets == null){
                JOptionPane.showMessageDialog(null,"Person Not Found");
            }else{
                for(Person ps : targets){
                    DefaultTableModel dtm= (DefaultTableModel)tbl.getModel();
                    dtm.setRowCount(0);
                    Object row[]= new Object[3];
                    row[0] = ps;
                    row[1] = ps.getLastname();
                    ArrayList<String> us = new ArrayList();
                    for(int i=0; i<ps.getUseraccount().size(); i++){
                        us.add(ps.getUseraccount().get(i).getUsername());
                    }
                    String usn = String.join(",",us);
                    row[2] = usn;
                    dtm.addRow(row);
                }
                    
            }
        }
    }//GEN-LAST:event_searchbtnActionPerformed

    private void newbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newbtnActionPerformed
        // TODO add your handling code here:
        NewPerson panel = new NewPerson(b,p);
        p.add("newperson",panel);
        CardLayout layout =(CardLayout) p.getLayout();
        layout.next(p);
    }//GEN-LAST:event_newbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        int selectedrow= tbl.getSelectedRow();
        if(selectedrow >=0)
        {
            Person ps= (Person)tbl.getValueAt(selectedrow,0);
            UpdatePerson panel = new UpdatePerson(b,ps,p);
            p.add("updateperson",panel);
            CardLayout layout =(CardLayout) p.getLayout();
            layout.next(p);
        }else{
            JOptionPane.showMessageDialog(null,"Please Select Any Row");
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        int selectedrow= tbl.getSelectedRow();
        if(selectedrow >=0)
        {
            Person ps= (Person)tbl.getValueAt(selectedrow,0);
            ArrayList<UserAccount> countertargets = new ArrayList();
            for(int i=0; i<b.getUseraccountdirectory().getUseraccount().size();i++){
                if(!ps.getFullname().equals(b.getUseraccountdirectory().getUseraccount().get(i).getFullname())){
                    countertargets.add(b.getUseraccountdirectory().getUseraccount().get(i));
                }
            }
            b.getUseraccountdirectory().getUseraccount().clear();
            for(int i=0;i<countertargets.size();i++){
                 b.getUseraccountdirectory().getUseraccount().add(countertargets.get(i));
            }
            b.getPersondirectory().deletePerson(ps);
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
            JOptionPane.showMessageDialog(null,"Deleted");
            
            populatetbl();
        }else{
            JOptionPane.showMessageDialog(null,"Please Select Any Row");
        }
        
    }//GEN-LAST:event_deletebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JComboBox<String> cb;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newbtn;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField t1;
    private javax.swing.JTable tbl;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
