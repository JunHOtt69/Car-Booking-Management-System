package oopassignment;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class manageUser extends javax.swing.JFrame {
    oopassignment.AdminTableModel adminModel = new oopassignment.AdminTableModel(DataIO.admins);
    oopassignment.CustomerTableModel cusModel = new oopassignment.CustomerTableModel(DataIO.customers);
    oopassignment.SalesmanTableModel salesmanModel = new oopassignment.SalesmanTableModel(DataIO.salesmen);

    private admin LoggedInAdmin;
    
    public manageUser(admin LoggedInAdmin) {
        this.LoggedInAdmin = LoggedInAdmin;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        viewUser = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adminTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        salesmanTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        returnPage = new javax.swing.JButton();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        search = new javax.swing.JButton();
        searchBar = new javax.swing.JTextField();
        approval = new javax.swing.JButton();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setPreferredSize(new java.awt.Dimension(1200, 720));
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setLayout(new java.awt.BorderLayout());

        viewUser.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jPanel4.setLayout(new java.awt.BorderLayout());

        adminTable.setAutoCreateRowSorter(true);
        adminTable.setFont(new java.awt.Font("Arial", 0, 18));
        adminTable.setModel(adminModel);
        jScrollPane1.setViewportView(adminTable);
        TableStyler.styleAdminTable(adminTable, jScrollPane1);

        jPanel4.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        viewUser.addTab("Staff", jPanel4);

        jPanel5.setLayout(new java.awt.BorderLayout());

        salesmanTable.setAutoCreateRowSorter(true);
        salesmanTable.setFont(new java.awt.Font("Arial", 0, 18));
        salesmanTable.setModel(salesmanModel);
        jScrollPane4.setViewportView(salesmanTable);
        TableStyler.styleSalesmanTable(salesmanTable, jScrollPane4);

        jPanel5.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        viewUser.addTab("Salesman", jPanel5);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setToolTipText("");

        customerTable.setAutoCreateRowSorter(true);
        customerTable.setFont(new java.awt.Font("Arial", 0, 18));
        customerTable.setModel(cusModel);
        jScrollPane2.setViewportView(customerTable);
        TableStyler.styleCustomerTable(customerTable, jScrollPane2);

        jPanel2.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        viewUser.addTab("Customer", jPanel2);

        jPanel3.add(viewUser, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.SOUTH);

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 80));

        returnPage.setForeground(new java.awt.Color(255, 255, 255));
        returnPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopassignment/imageSources/return-icon.png"))); // NOI18N
        returnPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnPageActionPerformed(evt);
            }
        });

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        searchBar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        approval.setText("Approval");
        approval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvalActionPerformed(evt);
            }
        });

        save.setText("Save Changes");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(returnPage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 408, Short.MAX_VALUE)
                .addComponent(save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(approval)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(add)
                .addGap(12, 12, 12)
                .addComponent(delete)
                .addGap(18, 18, 18)
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(search)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(returnPage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add)
                            .addComponent(delete)
                            .addComponent(search)
                            .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(approval)
                            .addComponent(save))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        returnPage.setOpaque(false);
        returnPage.setContentAreaFilled(false);
        returnPage.setBorderPainted(false);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void approvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvalActionPerformed
        CustomerTableModel cusModel = (CustomerTableModel) customerTable.getModel();
        ArrayList<Object[]> currentCustomerRows = cusModel.getCustomerData();

        AdminTableModel adminModel = (AdminTableModel) adminTable.getModel();
        ArrayList<Object[]> currentAdminRows = adminModel.getAdminData();
        
        SalesmanTableModel salesmanModel = (SalesmanTableModel) salesmanTable.getModel();
        ArrayList<Object[]> currentSalesmanRows = salesmanModel.getSalesmenData();
        
        ArrayList<admin> updatedAdmins = new ArrayList<>();
        ArrayList<Customer> updatedCustomers = new ArrayList<>();
        ArrayList<salesman> updatedSalesmen = new ArrayList<>();
        
        ArrayList<String> updatedUsersIDs = new ArrayList<>();
        
        try{
            for (Object[] row : currentAdminRows) {
                String id = (String) row[1];
                String username = (String) row[2];
                String fullName = (String) row[3];
                String email = (String) row[4];
                String phone = (String) row[5];
                String status = (String) row[6];

                admin original = DataIO.searchAdmin(email);
                if (original == null) continue; 

                boolean isSelected = Boolean.TRUE.equals(row[0]);
                if (isSelected) { 
                    if(!status.equals("Active")){ //if status is not active
                        status = "Active";
                        updatedUsersIDs.add(id);
                        System.out.println("User " + id + "is active.");
                    }
                }
                admin updated = new admin(id, username, fullName, email, original.getAdminPassword(), phone, status);
                updatedAdmins.add(updated);
            }

            for (Object[] row : currentCustomerRows) {
                String id = (String) row[1];
                String username = (String) row[2];
                String fullName = (String) row[3];
                String email = (String) row[4];
                String phone = (String) row[5];
                String icNo = (String) row[6];
                String licenseNo = (String) row[7];
                String status = (String) row[8];
                
                System.out.println(status);
                
                Customer original = DataIO.searchCustomer(email);
                if (original == null) continue; 

                boolean isSelected = Boolean.TRUE.equals(row[0]);
                if (isSelected) { 
                    if(!status.equals("Active")){ //if status is not active
                        status = "Active";
                        updatedUsersIDs.add(id);
                        System.out.println("User " + id + "is active.");
                    }
                }
                Customer updated = new Customer(id, username, fullName, email, original.getCustomerPassword(), phone, icNo, licenseNo, status);
                updatedCustomers.add(updated);
            }

            for (Object[] row : currentSalesmanRows) {
                String id = (String) row[1];
                String username = (String) row[2];
                String fullName = (String) row[3];
                String email = (String) row[4];
                String phone = (String) row[5];
                String totalSales = (String) row[6];
                String totalCommissions = (String) row[7];
                String status = (String) row[8];


                salesman original = DataIO.searchSalesman(email);
                if (original == null) continue; 

                boolean isSelected = Boolean.TRUE.equals(row[0]);
                if (isSelected) { 
                    if(!status.equals("Active")){ //if status is not active
                        status = "Active";
                        updatedUsersIDs.add(id);
                        System.out.println("User " + id + "is active.");
                    }
                }
                salesman updated = new salesman(id, username, fullName, email, original.getSalesmanPassword(), phone, totalSales, totalCommissions, status);
                updatedSalesmen.add(updated);
            }


            if (updatedUsersIDs.isEmpty()){
                JOptionPane.showMessageDialog(this, 
                            "No users' status is activated. ",
                            "Update Fail",
                            JOptionPane.ERROR_MESSAGE);
            }
            else{
                DataIO.updateAdminInfo(updatedAdmins);
                DataIO.updateCustomerInfo(updatedCustomers);
                DataIO.updateSalesmenInfo(updatedSalesmen);
                DataIO.writeAdminData();
                DataIO.writeCustomerData();
                DataIO.writeSalesmanData();

                String updatedUsersID = String.join(", ", updatedUsersIDs);
                JOptionPane.showMessageDialog(this, 
                            "Users Status Updated\nUpdated Users: " + updatedUsersID,
                            "Successful Update Status", 
                            JOptionPane.INFORMATION_MESSAGE);

                refreshPage(updatedAdmins, updatedCustomers, updatedSalesmen);
            }
        }
        catch(HeadlessException ex){
            JOptionPane.showMessageDialog(this, 
                        "Invalid Action",
                        "Try again",
                        JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_approvalActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        Main.addUsers = new addUsers(this, true, this);
        Main.addUsers.setVisible(true);
    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        ArrayList<admin> updatedAdmins = new ArrayList<>();
        ArrayList<Customer> updatedCustomers = new ArrayList<>();
        ArrayList<salesman> updatedSalesmen = new ArrayList<>();
        
        ArrayList<String> deletedUsersIDs = new ArrayList<>();
        ArrayList<Object[]> originalAdminData = adminModel.getAdminData();
        ArrayList<Object[]> originalCusData = cusModel.getCustomerData();
        ArrayList<Object[]> originalSalesmenData = salesmanModel.getSalesmenData();
        try{
            for (Object[] row : originalAdminData) {
                String id = (String) row[1];
                String username = (String) row[2];
                String fullName = (String) row[3];
                String email = (String) row[4];
                String phone = (String) row[5];
                String status = (String) row[6];

                admin original = DataIO.searchAdmin(email);
                if (original == null) continue; 

                boolean isSelected = Boolean.TRUE.equals(row[0]);
                if (isSelected) { 
                    if (id.equals(LoggedInAdmin.getAdminID())){
                        JOptionPane.showMessageDialog(this, 
                            "Cannot delete yourself.",
                            "Invalid Action",
                            JOptionPane.WARNING_MESSAGE);
                        updatedAdmins.add(original);
                        continue;
                    }
                    deletedUsersIDs.add(id);
                    System.out.println("User " + id + "is deleted.");
                }
                else{
                    admin updated = new admin(id, username, fullName, email, original.getAdminPassword(), phone, status);
                    updatedAdmins.add(updated);
                }
            }

            for (Object[] row : originalCusData) {
                String id = (String) row[1];
                String username = (String) row[2];
                String fullName = (String) row[3];
                String email = (String) row[4];
                String phone = (String) row[5];
                String icNo = (String) row[6];
                String licenseNo = (String) row[7];
                String status = (String) row[8];

                Customer original = DataIO.searchCustomer(email);
                if (original == null) continue; 

                boolean isSelected = Boolean.TRUE.equals(row[0]);
                if (isSelected) { 
                    deletedUsersIDs.add(id);
                    System.out.println("User " + id + "is deleted.");
                }
                else{
                    Customer remaining = new Customer(id, username, fullName, email, original.getCustomerPassword(), phone, icNo, licenseNo, status);
                    updatedCustomers.add(remaining);
                }
            }

            for (Object[] row : originalSalesmenData) {
                String id = (String) row[1];
                String username = (String) row[2];
                String fullName = (String) row[3];
                String email = (String) row[4];
                String phone = (String) row[5];
                String totalSales = (String) row[6];
                String totalCommissions = (String) row[7];
                String status = (String) row[8];

                salesman original = DataIO.searchSalesman(email);
                if (original == null) continue; 

                boolean isSelected = Boolean.TRUE.equals(row[0]);
                if (isSelected) { 
                    deletedUsersIDs.add(id);
                    System.out.println("User " + id + "is deleted.");
                }
                else{
                    salesman remaining = new salesman(id, username, fullName, email, original.getSalesmanPassword(), phone, totalSales, totalCommissions, status);
                    updatedSalesmen.add(remaining);
                }
            }

            if (deletedUsersIDs.isEmpty()){
                JOptionPane.showMessageDialog(this, 
                            "No user is deleted. ",
                            "Delete Fail Fail",
                            JOptionPane.ERROR_MESSAGE);
            }
            else{
                DataIO.updateAdminInfo(updatedAdmins);
                DataIO.updateCustomerInfo(updatedCustomers);
                DataIO.updateSalesmenInfo(updatedSalesmen);
                DataIO.writeAdminData();
                DataIO.writeCustomerData();
                DataIO.writeSalesmanData();

                String deletedUsersID = String.join(", ", deletedUsersIDs);
                JOptionPane.showMessageDialog(this, 
                            "Users deleted.\nDeleted Users: " + deletedUsersID,
                            "Successful Delete Users", 
                            JOptionPane.INFORMATION_MESSAGE);

                refreshPage(updatedAdmins, updatedCustomers, updatedSalesmen);
            }
        }
        catch(HeadlessException ex){
            JOptionPane.showMessageDialog(this, 
                        "Invalid Action",
                        "Try again",
                        JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_deleteActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if (adminTable.isEditing() || customerTable.isEditing() || salesmanTable.isEditing()) {
            adminTable.getCellEditor().stopCellEditing();
            customerTable.getCellEditor().stopCellEditing();
            salesmanTable.getCellEditor().stopCellEditing();
        }
        AdminTableModel adminModel = (AdminTableModel) adminTable.getModel();
        CustomerTableModel cusModel = (CustomerTableModel) customerTable.getModel();
        SalesmanTableModel salesmanModel = (SalesmanTableModel) salesmanTable.getModel(); 
        
        ArrayList<Object[]> adminRows = adminModel.getAdminData();
        ArrayList<Object[]> customerRows = cusModel.getCustomerData();
        ArrayList<Object[]> salesmanRows = salesmanModel.getSalesmenData();
        
        ArrayList<admin> updatedAdminData = new ArrayList<>();
        ArrayList<Customer> updatedCustomerData = new ArrayList<>();
        ArrayList<salesman> updatedSalesmenData = new ArrayList<>();
        
        try{
            for (Object row[] : adminRows){
                String id = (String) row[1];
                String username = (String) row[2];
                String fullName = (String) row[3];
                String email = (String) row[4];
                String phone = (String) row[5];
                String status = (String) row[6];

                if (!registerPage.checkIsNumber (phone)){
                    return;
                }

                else if (!checkFields(email, phone)){
                    return;
                }

                admin original = DataIO.searchAdmin(email);
                if (original == null) continue; 
                
                admin updated = new admin(id, username, fullName, email, original.getAdminPassword(), phone, status);
                updatedAdminData.add(updated);
            }
            
            for (Object row[] : customerRows) {
                String id = (String) row[1];
                String username = (String) row[2];
                String fullName = (String) row[3];
                String email = (String) row[4];
                String phone = (String) row[5];
                String icNo = (String) row[6];
                String licenseNo = (String) row[7];
                String status = (String) row[8];
                
                if (!registerPage.checkIsNumber (phone)){
                    return;
                }
                
                else if (icNo != null && !icNo.trim().equalsIgnoreCase("empty")){
                    if (!registerPage.checkIsNumber(icNo.trim())){
                        return;
                    }
                }
                
                else if (licenseNo != null && !licenseNo.trim().equalsIgnoreCase("empty")){
                    if (!registerPage.checkIsNumber (licenseNo.trim())){
                    return;
                    }
                }
                
                else if (!checkFields(email, phone)){
                    return;
                }
                System.out.println("IC VALUE: [" + icNo + "]");
                Customer original = DataIO.searchCustomer(email);
                if (original == null) continue; 

                Customer updated = new Customer(id, username, fullName, email, original.getCustomerPassword(), phone, icNo, licenseNo, status);
                updatedCustomerData.add(updated);
            }

            for (Object row[] : salesmanRows) {
                String id = (String) row[1];
                String username = (String) row[2];
                String fullName = (String) row[3];
                String email = (String) row[4];
                String phone = (String) row[5];
                String monthlySales = (String) row[6];
                String totalSales = (String) row[7];
                String monthlyCommissions = (String) row[8];
                String totalCommissions = (String) row[9];
                String status = (String) row[10];
                
                if (!registerPage.checkIsNumber (phone) || !registerPage.checkIsNumber (monthlySales)  || !registerPage.checkIsNumber (totalSales) || !registerPage.checkIsNumber (monthlyCommissions) || !registerPage.checkIsNumber (totalCommissions)){
                    return;
                }
                
                if (!checkFields(email, phone)){
                    return;
                }

                salesman original = DataIO.searchSalesman(email);
                if (original == null) continue; 

                salesman updated = new salesman(id, username, fullName, email, original.getSalesmanPassword(), phone, totalSales, totalCommissions, status);
                updatedSalesmenData.add(updated);
            }

            DataIO.updateAdminInfo(updatedAdminData);
            DataIO.updateCustomerInfo(updatedCustomerData);
            DataIO.updateSalesmenInfo(updatedSalesmenData);
            DataIO.writeAdminData();
            DataIO.writeCustomerData();
            DataIO.writeSalesmanData();
        
            JOptionPane.showMessageDialog(this, 
                        "Changes Saved",
                        "Successful", 
                        JOptionPane.INFORMATION_MESSAGE);
        
            refreshPage(updatedAdminData, updatedCustomerData, updatedSalesmenData);
        }
        catch(HeadlessException ex){
            JOptionPane.showMessageDialog(this, 
                        "Invalid Input",
                        "Try again",
                        JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void returnPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnPageActionPerformed
        Main.adminHomePage.setVisible(true);
        Main.manageUser.setVisible(false);
    }//GEN-LAST:event_returnPageActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String keyword = searchBar.getText().toLowerCase();
        ArrayList<Object[]> originalAdminData = adminModel.getAdminData();
        ArrayList<Object[]> originalCusData = cusModel.getCustomerData();
        ArrayList<Object[]> originalSalesmenData = salesmanModel.getSalesmenData();
        
        ArrayList<Object[]> adminData = new ArrayList<>(originalAdminData);
        ArrayList<Object[]> cusData = new ArrayList<>(originalCusData);
        ArrayList<Object[]> salesmenData = new ArrayList<>(originalSalesmenData);

        ArrayList<admin> searchedAdmins = new ArrayList<>();
        ArrayList<Customer> searchedCustomers = new ArrayList<>();
        ArrayList<salesman> searchedSalesmen = new ArrayList<>();
        
        for (Object[] row : adminData) {
            String id = (String) row[1];
            String username = (String) row[2];
            String fullName = (String) row[3];
            String email = (String) row[4];
            String phone = (String) row[5];
            String status = (String) row[6];
            
            if (rowContains(row, 1, 5, keyword)){
                admin selected = new admin(id, username, fullName, email, null, phone, status);
                searchedAdmins.add(selected);
            }
        }
        
        for (Object[] row : cusData) {
            String id = (String) row[1];
            String username = (String) row[2];
            String fullName = (String) row[3];
            String email = (String) row[4];
            String phone = (String) row[5];
            String icNo = (String) row[6];
            String licenseNo = (String) row[7];
            String status = (String) row[8];
            
            if (rowContains(row, 1, 7, keyword)){
                Customer selected = new Customer(id, username, fullName, email, null, phone, icNo, licenseNo, status);
                searchedCustomers.add(selected);
            }
        }
        
        for (Object[] row : salesmenData) {
            String id = (String) row[1];
            String username = (String) row[2];
            String fullName = (String) row[3];
            String email = (String) row[4];
            String phone = (String) row[5];
            String totalSales = (String) row[6];
            String totalCommissions = (String) row[7];
            String status = (String) row[8];

            if (rowContains(row, 1, 5, keyword)){
                salesman selected = new salesman(id, username, fullName, email, null, phone, totalSales, totalCommissions, status);
                searchedSalesmen.add(selected);
            }
        }
        
        if (searchedAdmins.isEmpty() && searchedCustomers.isEmpty() && searchedSalesmen.isEmpty()){
            JOptionPane.showMessageDialog(this, 
                        "No user found ",
                        "No Result",
                        JOptionPane.ERROR_MESSAGE);
        }
        else{
            refreshPage(searchedAdmins, searchedCustomers, searchedSalesmen);
        }
    }//GEN-LAST:event_searchActionPerformed
    
    private boolean checkFields(String email, String phone){
        if (!registerPage.checkEmailFormat(email) || email.isEmpty() || phone.isEmpty()||email.contains(" ") || phone.contains(" ") ){
                    JOptionPane.showMessageDialog(null, 
                        "Invalid input in email and phone fields",
                        "Try again",
                        JOptionPane.ERROR_MESSAGE);
                    return false;
                }
        return true;
    }
    
    public boolean rowContains(Object[] row, int start, int end, String keyword){
        keyword = keyword.toLowerCase();
        for(int i = start; i <= end; i++){
            if ((String)row[i] != null && !((String)row[i]).equals("Empty")){
                if (((String)row[i]).toLowerCase().contains(keyword)) return true;
            }
        }
        return false;
    }
    
    public void refreshPage(ArrayList<admin> admins, ArrayList<Customer> customers, ArrayList<salesman> salesmen){
        adminModel = new AdminTableModel(admins);
        adminTable.setModel(adminModel);
        TableStyler.styleAdminTable(adminTable, jScrollPane1);
        
        cusModel = new CustomerTableModel(customers);
        customerTable.setModel(cusModel);
        TableStyler.styleCustomerTable(customerTable, jScrollPane2);

        salesmanModel = new SalesmanTableModel(salesmen);
        salesmanTable.setModel(salesmanModel);
        TableStyler.styleSalesmanTable(salesmanTable, jScrollPane4);
    }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTable adminTable;
    private javax.swing.JButton approval;
    private javax.swing.JTable customerTable;
    private javax.swing.JButton delete;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton returnPage;
    private javax.swing.JTable salesmanTable;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchBar;
    private javax.swing.JTabbedPane viewUser;
    // End of variables declaration//GEN-END:variables
}
