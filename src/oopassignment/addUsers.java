package oopassignment;

import javax.swing.JOptionPane;

public class addUsers extends javax.swing.JDialog {
    private manageUser manageUserRef;
    public addUsers(java.awt.Frame parent, boolean modal, manageUser ref) {
        super(parent, modal);
        this.manageUserRef = ref;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        email_address1 = new javax.swing.JLabel();
        userType = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        email_value = new javax.swing.JTextField();
        email_address = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        password_value = new javax.swing.JPasswordField();
        password = new javax.swing.JLabel();
        showPassword = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        phoneNumber_value = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        create = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setPreferredSize(new java.awt.Dimension(500, 50));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Create New User");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(591, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.NORTH);

        jPanel1.setMinimumSize(new java.awt.Dimension(500, 69));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 370));

        jPanel2.setPreferredSize(new java.awt.Dimension(400, 72));
        jPanel2.setLayout(new java.awt.BorderLayout(5, 5));

        email_address1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        email_address1.setText("User Type");
        jPanel2.add(email_address1, java.awt.BorderLayout.CENTER);

        userType.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        userType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Choose User Type", "Admin", "Salesman", "Customer" }));
        userType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTypeActionPerformed(evt);
            }
        });
        jPanel2.add(userType, java.awt.BorderLayout.PAGE_END);

        jPanel1.add(jPanel2);

        jPanel3.setPreferredSize(new java.awt.Dimension(400, 72));
        jPanel3.setLayout(new java.awt.BorderLayout(5, 5));

        email_value.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        email_value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_valueActionPerformed(evt);
            }
        });
        jPanel3.add(email_value, java.awt.BorderLayout.PAGE_END);

        email_address.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        email_address.setText("Email Address");
        jPanel3.add(email_address, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3);

        jPanel5.setPreferredSize(new java.awt.Dimension(400, 72));
        jPanel5.setLayout(new java.awt.BorderLayout());

        password_value.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        password_value.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel5.add(password_value, java.awt.BorderLayout.PAGE_END);

        password.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        password.setText("Password");
        jPanel5.add(password, java.awt.BorderLayout.CENTER);

        showPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        showPassword.setText("Show Password");
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });
        jPanel5.add(showPassword, java.awt.BorderLayout.LINE_END);
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });

        jPanel1.add(jPanel5);

        jPanel6.setPreferredSize(new java.awt.Dimension(400, 72));
        jPanel6.setLayout(new java.awt.BorderLayout());

        phoneNumber_value.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jPanel6.add(phoneNumber_value, java.awt.BorderLayout.PAGE_END);

        phoneNumber.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        phoneNumber.setText("Phone Number");
        jPanel6.add(phoneNumber, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel6);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel8.setPreferredSize(new java.awt.Dimension(500, 80));

        create.setText("Create");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(484, Short.MAX_VALUE)
                .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel8, java.awt.BorderLayout.PAGE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTypeActionPerformed

    private void email_valueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_valueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_valueActionPerformed

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        if (showPassword.isSelected()){
            password_value.setEchoChar((char)0);
        }
        else{
            password_value.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        String email = email_value.getText();
        String password = new String(password_value.getPassword());
        String selectedType = userType.getSelectedItem().toString();
        String phoneNumberStr = phoneNumber_value.getText();
        
        try {
                int phoneNumber = Integer.parseInt(phoneNumber_value.getText());             
        }catch (NumberFormatException x) {
            JOptionPane.showMessageDialog(this, 
                "Invalid phone number. Please enter digits only.",
                "Try again",
                JOptionPane.ERROR_MESSAGE); 
                return;
        }
        
        try{
            if (email.isEmpty() || password.isEmpty() || phoneNumberStr.isEmpty()|| selectedType.equals("Please Choose User Type") ){
                JOptionPane.showMessageDialog(this, 
                    "Please enter all fields",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            else if (email.contains(" ") || password.contains(" ") || phoneNumberStr.contains(" ") ){
                JOptionPane.showMessageDialog(this, 
                    "Fields cannot contain empty spaces",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            else if (!checkEmailFormat(email))
                {
                JOptionPane.showMessageDialog(this, 
                    "Incorrect email format",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
                       
            admin existingAdmin = DataIO.searchAdmin(email);
            Customer existingCustomer = DataIO.searchCustomer(email);
            salesman existingSalesmen = DataIO.searchSalesman(email);
            
            if (existingAdmin != null || existingCustomer != null || existingSalesmen != null)
                {JOptionPane.showMessageDialog(this, 
                    "This email has been registered",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
            }
            else {
                switch (selectedType) {
                    case "Admin" ->                         {
                            String adminID = admin.generateAdminID();
                            String username = "Empty";
                            String fullName = "Empty";
                            String status = "Active";
                            admin newAdmin = new admin(adminID, username, fullName, email, password, phoneNumberStr, status);
                            DataIO.admins.add(newAdmin);
                            DataIO.writeAdminData();
                            resetFieldDefault();
                            JOptionPane.showMessageDialog(this,
                                    "Created customer ID: " + adminID,
                                    "Successfully create admin account",
                                    JOptionPane.INFORMATION_MESSAGE);
                            if (manageUserRef != null) {
                                manageUserRef.refreshPage(DataIO.admins, DataIO.customers, DataIO.salesmen);
                            }                              }
                    case "Customer" ->                         {
                            String customerID = Customer.generateCustomerID();
                            String username = "Empty";
                            String fullName = "Empty";
                            String icNo = "Empty";
                            String licenseNo = "Empty";
                            String status = "Active";
                            Customer newCustomer = new Customer(customerID, username, fullName, email, password, phoneNumberStr, icNo, licenseNo, status);
                            DataIO.customers.add(newCustomer);
                            DataIO.writeCustomerData();
                            resetFieldDefault();
                            JOptionPane.showMessageDialog(this,
                                    "Created customer ID: " + customerID,
                                    "Successfully create customer account",
                                    JOptionPane.INFORMATION_MESSAGE);
                            if (manageUserRef != null) {
                                manageUserRef.refreshPage(DataIO.admins, DataIO.customers, DataIO.salesmen);
                            }                              }
                    case "Salesman" ->                         {
                            String salesmanID = salesman.generateSalesmanID();
                            String username = "Empty";
                            String fullName = "Empty";
                            String totalSales = "0";
                            String totalCommissions = "0";
                            String status = "Active";
                            salesman newSalesman = new salesman(salesmanID, username, fullName, email, password, phoneNumberStr, totalSales, totalCommissions, status);
                            DataIO.salesmen.add(newSalesman);
                            DataIO.writeSalesmanData();
                            resetFieldDefault();
                            JOptionPane.showMessageDialog(this,
                                    "Created customer ID:" + salesmanID,
                                    "Successfully create salesman account",
                                    JOptionPane.INFORMATION_MESSAGE);
                            if (manageUserRef != null) {
                                manageUserRef.refreshPage(DataIO.admins, DataIO.customers, DataIO.salesmen);
                            }                              }
                    default -> {
                    }
                }
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, 
                        "Invalid Input",
                        "Try again",
                        JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_createActionPerformed
    
    public static boolean checkEmailFormat(String email) {
        String emailRegex = "^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,6}$";
        return email.matches(emailRegex);
    }
    
    private void resetFieldDefault(){
        userType.setSelectedItem("Please Choose User Type");
        email_value.setText("");
        password_value.setText("");
        phoneNumber_value.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton create;
    private javax.swing.JLabel email_address;
    private javax.swing.JLabel email_address1;
    private javax.swing.JTextField email_value;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField password_value;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JTextField phoneNumber_value;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JComboBox<String> userType;
    // End of variables declaration//GEN-END:variables
}
