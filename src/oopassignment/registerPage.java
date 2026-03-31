package oopassignment;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class registerPage extends javax.swing.JFrame {

    public registerPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Create_Account = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        email_address1 = new javax.swing.JLabel();
        userType = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        email_value = new javax.swing.JTextField();
        email_address = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        password = new javax.swing.JLabel();
        password_value = new javax.swing.JPasswordField();
        showPassword = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        reenterPassword = new javax.swing.JLabel();
        reenterPassword_value = new javax.swing.JPasswordField();
        showReenterPassword = new javax.swing.JCheckBox();
        jPanel12 = new javax.swing.JPanel();
        phoneNumber = new javax.swing.JLabel();
        phoneNumber_value = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        alreadyHaveAccount = new javax.swing.JLabel();
        goToLogin = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        register = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        APU_logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));

        jPanel3.setPreferredSize(new java.awt.Dimension(800, 150));

        Title.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("APU Car Sales System");
        Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(Title)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Title)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);

        jPanel4.setPreferredSize(new java.awt.Dimension(800, 60));
        jPanel4.setLayout(new java.awt.BorderLayout());

        Create_Account.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Create_Account.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Create_Account.setText("Create Account");
        Create_Account.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Create_Account.setPreferredSize(new java.awt.Dimension(250, 42));
        jPanel4.add(Create_Account, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);

        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setPreferredSize(new java.awt.Dimension(800, 480));

        jPanel10.setPreferredSize(new java.awt.Dimension(400, 72));
        jPanel10.setLayout(new java.awt.BorderLayout(4, 4));

        email_address1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        email_address1.setText("User Type");
        jPanel10.add(email_address1, java.awt.BorderLayout.CENTER);

        userType.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        userType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Choose User Type", "Admin", "Salesman", "Customer" }));
        userType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTypeActionPerformed(evt);
            }
        });
        jPanel10.add(userType, java.awt.BorderLayout.PAGE_END);

        jPanel5.add(jPanel10);

        jPanel6.setPreferredSize(new java.awt.Dimension(400, 72));
        jPanel6.setLayout(new java.awt.BorderLayout(4, 4));

        email_value.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        email_value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_valueActionPerformed(evt);
            }
        });
        jPanel6.add(email_value, java.awt.BorderLayout.PAGE_END);

        email_address.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        email_address.setText("Email Address");
        jPanel6.add(email_address, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel6);

        jPanel7.setPreferredSize(new java.awt.Dimension(400, 72));
        jPanel7.setLayout(new java.awt.BorderLayout(4, 4));

        password.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        password.setText("Password");
        jPanel7.add(password, java.awt.BorderLayout.CENTER);

        password_value.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        password_value.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel7.add(password_value, java.awt.BorderLayout.PAGE_END);

        showPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        showPassword.setText("Show Password");
        jPanel7.add(showPassword, java.awt.BorderLayout.LINE_END);
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });

        jPanel5.add(jPanel7);

        jPanel11.setPreferredSize(new java.awt.Dimension(400, 72));
        jPanel11.setLayout(new java.awt.BorderLayout(4, 4));

        reenterPassword.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        reenterPassword.setText("Re-Enter Password");
        jPanel11.add(reenterPassword, java.awt.BorderLayout.CENTER);

        reenterPassword_value.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        reenterPassword_value.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel11.add(reenterPassword_value, java.awt.BorderLayout.PAGE_END);

        showReenterPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        showReenterPassword.setText("Show Password");
        jPanel11.add(showReenterPassword, java.awt.BorderLayout.LINE_END);
        showReenterPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showReenterPasswordActionPerformed(evt);
            }
        });

        jPanel5.add(jPanel11);

        jPanel12.setPreferredSize(new java.awt.Dimension(400, 72));
        jPanel12.setLayout(new java.awt.BorderLayout(4, 4));

        phoneNumber.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        phoneNumber.setText("Phone Number");
        jPanel12.add(phoneNumber, java.awt.BorderLayout.CENTER);

        phoneNumber_value.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jPanel12.add(phoneNumber_value, java.awt.BorderLayout.PAGE_END);

        jPanel5.add(jPanel12);

        jPanel8.setPreferredSize(new java.awt.Dimension(400, 30));
        jPanel8.setLayout(new java.awt.BorderLayout());

        alreadyHaveAccount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        alreadyHaveAccount.setText("Already have an account?");
        jPanel8.add(alreadyHaveAccount, java.awt.BorderLayout.LINE_START);

        goToLogin.setBackground(new java.awt.Color(204, 204, 204));
        goToLogin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        goToLogin.setText("Go to Login");
        goToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToLoginActionPerformed(evt);
            }
        });
        jPanel8.add(goToLogin, java.awt.BorderLayout.EAST);

        jPanel5.add(jPanel8);

        jPanel1.add(jPanel5);

        jPanel9.setPreferredSize(new java.awt.Dimension(800, 80));

        register.setBackground(new java.awt.Color(204, 204, 204));
        register.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        register.setText("Register");
        register.setBorder(null);
        register.setPreferredSize(new java.awt.Dimension(50, 30));
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(515, Short.MAX_VALUE)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9);

        getContentPane().add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 800));

        APU_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopassignment/imageSources/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(APU_logo)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(APU_logo)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void email_valueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_valueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_valueActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        String email = email_value.getText();
        String password = new String(password_value.getPassword());
        String password2 = new String(reenterPassword_value.getPassword());
        String selectedType = userType.getSelectedItem().toString();
        String phoneNumberStr = phoneNumber_value.getText();
       
        try{
            if (!checkIsNumber (phoneNumberStr)){
                return;
            }
            
            else if (email.isEmpty() || password.isEmpty() || password2.isEmpty() || phoneNumberStr.isEmpty()|| selectedType.equals("Please Choose User Type") ){
                JOptionPane.showMessageDialog(this, 
                    "Please enter all fields",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            else if (email.contains(" ") || password.contains(" ") || password2.contains(" ") || phoneNumberStr.contains(" ") ){
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
            else if (!password.equals(password2))
                {
                JOptionPane.showMessageDialog(this, 
                    "Password and Re-enter Password does not match",
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
                            String status = "Pending";
                            admin newAdmin = new admin(adminID, username, fullName, email, password, phoneNumberStr, status);
                            DataIO.admins.add(newAdmin);
                            DataIO.writeAdminData();
                            resetFieldDefault();
                            JOptionPane.showMessageDialog(this,
                                    "Your account is currently in PENDING verification list.\nIt will be approve by an administrator shortly",
                                    "Successfully create admin account",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                    case "Customer" ->                         {
                            String customerID = Customer.generateCustomerID();
                            String username = "Empty";
                            String fullName = "Empty";
                            String icNo = "Empty";
                            String licenseNo = "Empty";
                            String status = "Pending";
                            Customer newCustomer = new Customer(customerID, username, fullName, email, password, phoneNumberStr, icNo, licenseNo, status);
                            DataIO.customers.add(newCustomer);
                            DataIO.writeCustomerData();
                            resetFieldDefault();
                            JOptionPane.showMessageDialog(this,
                                    "Your account is currently in PENDING verification list.\nIt will be approve by an administrator shortly",
                                    "Successfully create customer account",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                    case "Salesman" ->                         {
                            String salesmanID = salesman.generateSalesmanID();
                            String username = "Empty";
                            String fullName = "Empty";
                            String totalSales = "0";
                            String totalCommissions = "0";
                            String status = "Pending";
                            salesman newSalesman = new salesman(salesmanID, username, fullName, email, password, phoneNumberStr, totalSales, totalCommissions, status);
                            DataIO.salesmen.add(newSalesman);
                            DataIO.writeSalesmanData();
                            resetFieldDefault();
                            JOptionPane.showMessageDialog(this,
                                    "Your account is currently in PENDING verification list.\nIt will be approve by an administrator shortly",
                                    "Successfully create salesman account",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                    default -> {
                    }
                }
            }
            
        }catch(HeadlessException ex){
            JOptionPane.showMessageDialog(this, 
                        "Invalid Input",
                        "Try again",
                        JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_registerActionPerformed

    private void userTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTypeActionPerformed

    private void goToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToLoginActionPerformed
        Main.loginPage.setVisible(true);
        Main.registerPage.setVisible(false);
    }//GEN-LAST:event_goToLoginActionPerformed
    
    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (showPassword.isSelected()){
            password_value.setEchoChar((char)0);
        }
        else{
            password_value.setEchoChar('*');
        }
    }
    
    private void showReenterPasswordActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (showReenterPassword.isSelected()){
            reenterPassword_value.setEchoChar((char)0);
        }
        else{
            reenterPassword_value.setEchoChar('*');
        }
    }
    
    public static boolean checkIsNumber (String string){
        try {
            Long.parseLong(string); 
            return true;
        }catch (NumberFormatException x) {
            JOptionPane.showMessageDialog(null, 
                "Invalid number. Please enter digits only.",
                "Try again",
                JOptionPane.ERROR_MESSAGE); 
                return false;
        }
    }
    
    public static boolean checkEmailFormat(String email) {
        String emailRegex = "^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,6}$";
        return email.matches(emailRegex);
    }
    
    private void resetFieldDefault(){
        userType.setSelectedItem("Please Choose User Type");
        email_value.setText("");
        password_value.setText("");
        reenterPassword_value.setText("");
        phoneNumber_value.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel APU_logo;
    private javax.swing.JLabel Create_Account;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel alreadyHaveAccount;
    private javax.swing.JLabel email_address;
    private javax.swing.JLabel email_address1;
    private javax.swing.JTextField email_value;
    private javax.swing.JButton goToLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField password_value;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JTextField phoneNumber_value;
    private javax.swing.JLabel reenterPassword;
    private javax.swing.JPasswordField reenterPassword_value;
    private javax.swing.JButton register;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JCheckBox showReenterPassword;
    private javax.swing.JComboBox<String> userType;
    // End of variables declaration//GEN-END:variables
} 
