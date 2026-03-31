package oopassignment;

import javax.swing.JOptionPane;

public class loginPage extends javax.swing.JFrame {

    public loginPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        loginTitle = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        email_value = new javax.swing.JTextField();
        email_address = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        password = new javax.swing.JLabel();
        password_value = new javax.swing.JPasswordField();
        showPassword = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        alreadyHaveAccount = new javax.swing.JLabel();
        goToRegister = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        login = new javax.swing.JButton();
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
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);

        jPanel4.setPreferredSize(new java.awt.Dimension(800, 60));
        jPanel4.setLayout(new java.awt.BorderLayout());

        loginTitle.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        loginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTitle.setText("Login");
        loginTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginTitle.setPreferredSize(new java.awt.Dimension(250, 42));
        jPanel4.add(loginTitle, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);

        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setPreferredSize(new java.awt.Dimension(800, 450));

        jPanel10.setPreferredSize(new java.awt.Dimension(400, 110));
        jPanel10.setLayout(new java.awt.BorderLayout(4, 4));
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
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });
        jPanel7.add(showPassword, java.awt.BorderLayout.LINE_END);
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });

        jPanel5.add(jPanel7);

        jPanel8.setPreferredSize(new java.awt.Dimension(400, 30));
        jPanel8.setLayout(new java.awt.BorderLayout());

        alreadyHaveAccount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        alreadyHaveAccount.setText("Do not have an account?");
        jPanel8.add(alreadyHaveAccount, java.awt.BorderLayout.LINE_START);

        goToRegister.setBackground(new java.awt.Color(204, 204, 204));
        goToRegister.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        goToRegister.setText("Go to Register");
        goToRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToRegisterActionPerformed(evt);
            }
        });
        jPanel8.add(goToRegister, java.awt.BorderLayout.EAST);

        jPanel5.add(jPanel8);

        jPanel1.add(jPanel5);

        jPanel9.setPreferredSize(new java.awt.Dimension(800, 80));

        login.setBackground(new java.awt.Color(204, 204, 204));
        login.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        login.setText("Login");
        login.setBorder(null);
        login.setPreferredSize(new java.awt.Dimension(50, 30));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(515, Short.MAX_VALUE)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        
    }//GEN-LAST:event_email_valueActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        String email = email_value.getText();
        String password = new String(password_value.getPassword());
                
        try{
           if (email.isEmpty() || password.isEmpty()){
                JOptionPane.showMessageDialog(this, 
                    "Please enter all fields",
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
            salesman existingSalesman = DataIO.searchSalesman(email);
            
            if (existingAdmin != null)
                {
                    if (existingAdmin.getAdminStatus().equals("Pending"))
                        {
                        JOptionPane.showMessageDialog(this, 
                            "Your account is PENDING.\nPlease wait your account to be approve by an administrator",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    }
                    else if (!existingAdmin.getAdminPassword().equals(password))
                        {
                        JOptionPane.showMessageDialog(this, 
                            "Wrong password",
                            "Try again",
                            JOptionPane.ERROR_MESSAGE);
                    }
                    else if (existingAdmin.getAdminStatus().equals("Active") && existingAdmin.getAdminPassword().equals(password)){
                        JOptionPane.showMessageDialog(this, 
                            "Log in as Admin",
                            "Successfully login",
                            JOptionPane.INFORMATION_MESSAGE);

                        Main.adminHomePage = new adminHomePage(existingAdmin);
                        Main.adminHomePage.setVisible(true);
                        Main.loginPage.setVisible(false);
                        resetFieldDefault();
                    }
                    
                    else{
                        JOptionPane.showMessageDialog(this, 
                            "There is an Error in your account.\nKindly approach to our administrator to get help.",
                            "Error",
                            JOptionPane.INFORMATION_MESSAGE);
                    }
            
                    
            }
            else if (existingCustomer != null){
                if (existingCustomer.getCustomerStatus().equals("Pending"))
                        {
                        JOptionPane.showMessageDialog(this, 
                            "Your account is PENDING.\nPlease wait your account to be approve by an administrator",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    }
                    else if (!existingCustomer.getCustomerPassword().equals(password))
                        {
                        JOptionPane.showMessageDialog(this, 
                            "Wrong password",
                            "Try again",
                            JOptionPane.ERROR_MESSAGE);
                    }
                    else if (existingCustomer.getCustomerStatus().equals("Active") && existingCustomer.getCustomerPassword().equals(password)){
                        JOptionPane.showMessageDialog(this, 
                            "Log in as Customer",
                            "Successfully login",
                            JOptionPane.INFORMATION_MESSAGE);
                        
                        Main.customerHomePage = new customerHomePage(existingCustomer);
                        Main.customerHomePage.setVisible(true);
                        Main.loginPage.setVisible(false);
                        resetFieldDefault();
                    }
                    
                    else{
                        JOptionPane.showMessageDialog(this, 
                            "There is an Error in your account.\nKindly approach to our administrator to get help.",
                            "Error",
                            JOptionPane.INFORMATION_MESSAGE);
                    }
            }
            
            else if (existingSalesman != null){
                if (existingSalesman.getSalesmanStatus().equals("Pending"))
                        {
                        JOptionPane.showMessageDialog(this, 
                            "Your account is PENDING.\nPlease wait your account to be approve by an administrator",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    }
                    else if (!existingSalesman.getSalesmanPassword().equals(password))
                        {
                        JOptionPane.showMessageDialog(this, 
                            "Wrong password",
                            "Try again",
                            JOptionPane.ERROR_MESSAGE);
                    }
                    else if (existingSalesman.getSalesmanStatus().equals("Active") && existingSalesman.getSalesmanPassword().equals(password)){
                        JOptionPane.showMessageDialog(this, 
                            "Log in as Salesman",
                            "Successfully login",
                            JOptionPane.INFORMATION_MESSAGE);
                        
                        Main.salesmanHomePage = new salesmanHomePage(existingSalesman);
                        Main.salesmanHomePage.setVisible(true);
                        Main.loginPage.setVisible(false);
                        resetFieldDefault();
                    }
                    
                    else{
                        JOptionPane.showMessageDialog(this, 
                            "There is an Error in your account.\nKindly approach to our administrator to get help.",
                            "Error",
                            JOptionPane.INFORMATION_MESSAGE);
                    }
            }
            else{
                JOptionPane.showMessageDialog(this, 
                    "User Not Found\n Please register as new account",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
            
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, 
                        "Invalid Input",
                        "Try again",
                        JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginActionPerformed

    private void goToRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToRegisterActionPerformed
        Main.loginPage.setVisible(false);
        Main.registerPage.setVisible(true);
    }//GEN-LAST:event_goToRegisterActionPerformed

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        if (showPassword.isSelected()){
            password_value.setEchoChar((char)0);
        }
        else{
            password_value.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordActionPerformed
    
    public static boolean checkEmailFormat(String email) {
        boolean hasAt = email.indexOf('@') != -1;
        boolean endsWithCorrect = email.length() >=4 && email.endsWith(".com"); // example suffix
        return hasAt && endsWithCorrect;
    }
    
    private void resetFieldDefault(){
        email_value.setText("");
        password_value.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel APU_logo;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel alreadyHaveAccount;
    private javax.swing.JLabel email_address;
    private javax.swing.JTextField email_value;
    private javax.swing.JButton goToRegister;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton login;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField password_value;
    private javax.swing.JCheckBox showPassword;
    // End of variables declaration//GEN-END:variables
}
