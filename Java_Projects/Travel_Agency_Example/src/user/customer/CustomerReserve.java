/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.customer;

import business.CustomerDirectory;
import business.Flight;
import business.Person;
import business.Reservation;
import business.ReservationDirectory;
import java.awt.CardLayout;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ruby
 */
public class CustomerReserve extends javax.swing.JPanel {
    private CustomerDirectory c;
    private ReservationDirectory r;
    private JPanel p;
    private Flight f;
    
    /**
     * Creates new form CustomerReserve
     */
    

    public CustomerReserve(JPanel p, CustomerDirectory c, ReservationDirectory r, Flight f) {
        initComponents();
        this.f = f;
        this.p = p;
        this.c = c;
        this.r = r;
        details();
    }
    
    private void details(){
        t1.setText(String.valueOf(f.getFlightid()));
        t2.setText(f.getDepart());
        t3.setText(f.getArrive());
        t4.setText(f.getFrom());
        t5.setText(f.getTo());
        t6.setText(f.getDate());
        t7.setText(f.getCompany());
        t8.setText(f.getModel());
        t9.setText(String.valueOf(f.getMadeyear()));
        Random rand = new Random();
        int reservationcode = rand.nextInt(899999)+100000;
        t10.setText(String.valueOf(reservationcode));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        t9 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        t10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        t12 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        t13 = new javax.swing.JTextField();
        t11 = new javax.swing.JTextField();
        t14 = new javax.swing.JTextField();
        confirmbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        cb2 = new javax.swing.JComboBox<>();
        t16 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        t15 = new javax.swing.JTextField();
        pricebtn = new javax.swing.JButton();

        t9.setEnabled(false);

        t2.setEnabled(false);
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        t4.setEnabled(false);

        t3.setEnabled(false);

        jLabel2.setText("Flight Number");

        t5.setEnabled(false);

        jLabel7.setText("Date");

        jLabel3.setText("Departure Time");

        jLabel8.setText("Model");

        jLabel9.setText("Made Year");

        jLabel4.setText("Arrival Time");

        jLabel10.setText("Company");

        t6.setEnabled(false);

        jLabel5.setText("Departure City");

        t8.setEnabled(false);

        jLabel6.setText("Arrival City");

        t7.setEnabled(false);

        t1.setEnabled(false);

        jLabel1.setText("Firstname");

        t10.setEnabled(false);

        jLabel11.setText("Lastname");

        jLabel12.setText("ID Number");

        jLabel13.setText("Phone");

        jLabel14.setText("Email");

        confirmbtn.setText("Confirm");
        confirmbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmbtnActionPerformed(evt);
            }
        });

        backbtn.setText("<<Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel15.setText("Reservation");

        jLabel16.setText("Seat");

        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Row--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", " ", " " }));

        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Coloum--", "A", "B", "C", "D", "E", "F" }));

        t16.setEnabled(false);

        jLabel18.setText("Reservation Code");

        pricebtn.setText("Calculate Price");
        pricebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(355, 355, 355)
                        .addComponent(backbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(t1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                        .addComponent(t2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(t3))
                                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(t8, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(t9))))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel18)
                                    .addGap(18, 18, 18)
                                    .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(67, 67, 67)
                                    .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel11)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel16))
                                        .addGap(95, 95, 95))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pricebtn)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t16, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t12, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t13, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t14, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t15, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(confirmbtn)))))))
                .addGap(0, 128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(t12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(t13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(t14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(t15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pricebtn))))
                .addGap(18, 18, 18)
                .addComponent(confirmbtn)
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        p.remove(this);
        CardLayout layout =(CardLayout) p.getLayout();
        layout.previous(p);
    }//GEN-LAST:event_backbtnActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void confirmbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmbtnActionPerformed
        // TODO add your handling code here:
        Boolean e1 = null;
        Boolean e2 = null;
        Boolean e3 = null;
        Boolean e4 = null;
        Boolean e5 = null;
        Boolean e6 = null;
        
        Scanner sc1 = new Scanner(t13.getText());
        Scanner sc2 = new Scanner(t14.getText());
        
        if(t11.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"First Name Required");
            e1= false;
        }else{e1=true;}
        
        if(t12.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Last Name Required");
            e2= false;
        }else{e2=true;}
        
        if(!sc1.hasNextInt()){
            JOptionPane.showMessageDialog(null,"Invalid ID Number");
            e3=false;
        }else{e3=true;}
        
        if(!sc2.hasNextInt()){
            JOptionPane.showMessageDialog(null,"Invalid Phone Number");
            e4=false;
        }else{e4=true;}
        
        if(t15.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Last Name Required");
            e5= false;
        }else{e5=true;}
        
        if(t16.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Get The Price Before Confirm");
            e6= false;
        }else{e6=true;}
        
        if(e1&&e2&&e3&&e4&&e5&&e6){
            int fi = Integer.parseInt(t1.getText());
            int rc = Integer.parseInt(t10.getText());
            String fn = t11.getText();
            String ln = t12.getText();
            int id = Integer.parseInt(t13.getText());
            long ph = Long.parseLong(t14.getText());
            String em = t15.getText();
            String se = (String)cb1.getSelectedItem()+(String)cb2.getSelectedItem();
            double fp = Double.parseDouble(t16.getText());
            
            Reservation re = r.addReservation();
            re.setDate(System.currentTimeMillis());
            re.setFinalprice(fp);
            re.setFirstname(fn);
            re.setIdnum(id);
            re.setLastname(ln);
            re.setReservationcode(rc);
            re.setSeat(se);
            re.setFlightnumber(fi);
            
            
            Person targ = null;
            ArrayList<Person> plist= c.getPerson();
            for(int i=0; i<plist.size();i++){
                if(plist.get(i).getIdnum()==id){
                    targ = plist.get(i);
                    break;
                }
            }
            if(targ == null){
                Person ps = c.addPerson();
                ps.setEmail(em);
                ps.setFirstname(fn);
                ps.setIdnum(id);
                ps.setLastname(ln);
                ps.setPhonenumber(ph);
                
                
            }
            
            
            
            try{   
                BufferedWriter fw = new BufferedWriter(new FileWriter("reservation.txt"));
                for(Reservation line : r.getReservation()){
                    
                    String[] a = new String[8];
                    a[0]=String.valueOf(line.getReservationcode());
                    a[1]=line.getFirstname();
                    a[2]=line.getLastname();
                    a[3]=line.getSeat();
                    a[4]=String.valueOf(line.getDate());
                    a[5]=String.valueOf(line.getFlightnumber());
                    a[6]=String.valueOf(line.getIdnum());
                    a[7]=String.valueOf(line.getFinalprice());
                    String thisline=Arrays.toString(a);
                    fw.write(thisline.replace("[", "").replace("]", "").replace(", ",","));
                    fw.newLine();
                }     
                fw.close();    
            }catch(Exception e){System.out.println(e);}    
            System.out.println("Success..."); 
            
            try{   
                BufferedWriter fw = new BufferedWriter(new FileWriter("customer.txt"));
                for(Person line : c.getPerson()){
                    String[] a = new String[5];
                    a[0]=line.getFirstname();
                    a[1]=line.getLastname();
                    a[2]=line.getEmail();
                    a[3]=String.valueOf(line.getPhonenumber());
                    a[4]=String.valueOf(line.getIdnum());
                    String thisline=Arrays.toString(a);
                    fw.write(thisline.replace("[", "").replace("]", "").replace(", ",","));
                    fw.newLine();
                }     
                fw.close();    
            }catch(Exception e){System.out.println(e);}    
            System.out.println("Success..."); 
            
            JOptionPane.showMessageDialog(null,"Reservation Confirmed");
          
          
            
        }
        
        
    }//GEN-LAST:event_confirmbtnActionPerformed

    private void pricebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricebtnActionPerformed
        // TODO add your handling code here:
        int row = cb1.getSelectedIndex();
        int col = cb2.getSelectedIndex();
        if(row!=0 && col!=0){
            double price = f.getSeatprice();
            if(row <= 7){
                price = price*2.5;
            }
            if(col==1 || col==6){
                price = price*1.1;
            }
            if(col==2 || col==5){
                price = price*0.95;
            }
            t16.setText(String.valueOf(price));
        }else{JOptionPane.showMessageDialog(null,"Please Select A Seat");}
    }//GEN-LAST:event_pricebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JButton confirmbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton pricebtn;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTextField t13;
    private javax.swing.JTextField t14;
    private javax.swing.JTextField t15;
    private javax.swing.JTextField t16;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables
}
