/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package user.salesman;

import business.Business;
import business.Configure;
import business.Customer;
import business.Market;
import business.MarketOffer;
import business.MarketOfferCatalog;
import business.Order;
import business.PersonAndAccount;
import business.Product;
import business.ProductDirectory;
import business.Salesman;
import business.UserAccount;
import java.awt.CardLayout;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ruby
 */
public class ManageOrder extends javax.swing.JPanel {

    /** Creates new form ManageOrder */
    
    private Business b;
    private UserAccount ua;
    private JPanel p;
    private PersonAndAccount pa;
    private Salesman s;
    
    /*ManageOrder(Business b, UserAccount ua, JPanel p, PersonAndAccount pa) {
        initComponents();
         this.b = b;
          this.ua = ua;
          this.p = p;
          this.pa = pa;
          populateProduct();
          populateOrder();
          
        String fn = ua.getFullname();
        MarketList ml = b.getMarketlist();
        Person person = pa.getPerson();
        Salesman s = person.findSalesman(fn);
        Market m = ml.findMarket(s.getMarketname());
        customerCom.removeAllItems();
        for (Customer customer : m.getCustomer()) {
            customerCom.addItem(customer.getFullname());
        }
    }*/

    ManageOrder(Business b, UserAccount ua, JPanel p, PersonAndAccount pa, Salesman sm) {
        initComponents();
        this.b = b;
        this.ua = ua;
        this.p = p;
        this.pa = pa;
        this.s = sm;
        populateProduct();
        populateOrder(); 
        Market m = b.getMarketlist().findMarket(s.getMarketname());
        customerCom.removeAllItems();
        customerCom.addItem("--Select A Customer--");
        for (Customer customer : m.getCustomer()) {
            customerCom.addItem(customer.getFullname());
        }
    }
    
    public void populateProduct(){
        DefaultTableModel dtm = (DefaultTableModel)tblProduct.getModel();
        dtm.setRowCount(0);
        ProductDirectory p = b.getProductdirectory();
        for (Product product : p.getproduct()){
            Object row[] = new Object[6];
            row[0] = product;
            row[1] = product.getProductname();
            row[2] = product.getSuppliername();
            MarketOfferCatalog moc = b.getMarketoffercatalog();
            MarketOffer mo = moc.findMarketOffer(s.getMarketname(),product.getProductid() );
            row[3] = mo.getFloor();
            row[4] = mo.getCeiling();
            row[5] = mo.getTarget();
            
            dtm.addRow(row);
        }
    }
    public void populateOrder(){
        DefaultTableModel dtm = (DefaultTableModel)tblOrder.getModel();
        dtm.setRowCount(0);
        for(Order order : s.getOrderlist()){
            Object row[] = new Object[4];
            row[0] = order;
            row[1] = order.getCustomername();
            row[2] = order.getActualprice();
            row[3] = order.getQuantity();
            dtm.addRow(row);
        }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        customerCom = new javax.swing.JComboBox<>();
        btnCreate = new javax.swing.JButton();
        txtPrice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        intCount = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        txtSearchId = new javax.swing.JTextField();
        btnSearchProduct = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Suplier", "Floor Price", "Ceiling Price", "Target Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProduct);

        customerCom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        jLabel1.setText("Manage Order");

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product ID", "Customer", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOrder);

        jLabel2.setText("Price:");

        jLabel3.setText("Customer:");

        jLabel4.setText("Product ID:");

        btnSearchProduct.setText("Search");
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        backbtn.setText("Back");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchProduct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(259, 259, 259)
                        .addComponent(backbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(170, 170, 170))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(customerCom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(intCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchProduct)
                    .addComponent(jButton2)
                    .addComponent(backbtn))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(intCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCreate)
                        .addComponent(deletebtn)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        int selectedRow = tblProduct.getSelectedRow();
        
        if(selectedRow <0)
        {
            JOptionPane.showMessageDialog(null,"Please select any row");
        }else{
                Product product = (Product)tblProduct.getValueAt(selectedRow, 0);
                int Qty = (Integer)intCount.getValue();
                if(Qty<= 0){
                    JOptionPane.showMessageDialog(null,"Quantity can not be or less than 0.");
                    return;
                }else{
                    if(customerCom.getSelectedIndex()==0){
                        JOptionPane.showMessageDialog(null,"Please Select A Customer");
                    }else{    
                        Scanner sc1 = new Scanner(txtPrice.getText());
                        if(!sc1.hasNextDouble()){
                            JOptionPane.showMessageDialog(null,"Invalid Price");
                        }else{
                                ProductDirectory pc = b.getProductdirectory();
                                MarketOfferCatalog moc = b.getMarketoffercatalog();
                                MarketOffer mo = moc.findMarketOffer(s.getMarketname(),product.getProductid() );
                                double price = Double.parseDouble(txtPrice.getText());
                                if((price>=mo.getFloor())&&(price<=mo.getCeiling())){
                                    Order o1 = s.addOrder();
                                    o1.setActualprice(price);
                                    o1.setCustomername((String) customerCom.getSelectedItem());
                                    o1.setMarketname(s.getMarketname());
                                    o1.setProductid(product.getProductid());
                                    o1.setSalesmanname(s.getFullname());
                                    o1.setQuantity(Qty);
                                    o1.setTargetprice(mo.getTarget());
                                    Order o2 = b.getOrderlist().addOrder();
                                    o2.setActualprice(price);
                                    o2.setCustomername((String) customerCom.getSelectedItem());
                                    o2.setMarketname(s.getMarketname());
                                    o2.setProductid(product.getProductid());
                                    o2.setSalesmanname(s.getFullname());
                                    o2.setQuantity(Qty);
                                    o2.setTargetprice(mo.getTarget());
                                    Configure.ExportOrder(b.getOrderlist());
                                }else{
                                        JOptionPane.showMessageDialog(null,"Price cannot lower than floor price or higher than ceiling price.");
                                        return;
                                }
                        }
                    }
                }   
        }
        populateOrder();
            // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed
        DefaultTableModel dtm = (DefaultTableModel)tblProduct.getModel();
        dtm.setRowCount(0);
        Object row[] = new Object[6];
        
        ProductDirectory pd = b.getProductdirectory();
        Product  result = pd.searchProduct(Integer.parseInt(txtSearchId.getText()));
        if (result == null) {
            JOptionPane.showMessageDialog(null,"Account does not exist","Information",JOptionPane.INFORMATION_MESSAGE);
        }else {
                row[0] = result;
            row[1] = result.getProductname();
            row[2] = result.getSuppliername();
            
             MarketOfferCatalog moc = b.getMarketoffercatalog();
             MarketOffer mo = moc.findMarketOffer(s.getMarketname(),result.getProductid() );
            row[3] = mo.getFloor();
            row[4] = mo.getCeiling();
            row[5] = mo.getTarget();
                dtm.addRow(row);
        }        // TODO add your handling code here:                        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchProductActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        populateProduct();                // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        int row = tblOrder.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }else{
            Order o = (Order)tblOrder.getValueAt(row, 0);
            b.getOrderlist().deleteOrder(o);
            s.deleteOrder(o);
            populateOrder();
        }
        
    }//GEN-LAST:event_deletebtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        p.remove(this);
        CardLayout layout =(CardLayout) p.getLayout();
        layout.previous(p);
    }//GEN-LAST:event_backbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JComboBox<String> customerCom;
    private javax.swing.JButton deletebtn;
    private javax.swing.JSpinner intCount;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSearchId;
    // End of variables declaration//GEN-END:variables

}
