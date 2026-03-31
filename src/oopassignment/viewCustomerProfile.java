
package oopassignment;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class viewCustomerProfile extends javax.swing.JFrame {
    
    private Customer LoggedInCustomer;
    
    public viewCustomerProfile(Customer LoggedInCustomer) {
        this.LoggedInCustomer = LoggedInCustomer;
        initComponents();
        fillFields();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        returnPage = new javax.swing.JButton();
        save = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        viewProfile = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        full_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        showPassword = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        phone_number = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        icNo = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        licenseNo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 80));

        returnPage.setForeground(new java.awt.Color(255, 255, 255));
        returnPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopassignment/imageSources/return-icon.png"))); // NOI18N
        returnPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnPageActionPerformed(evt);
            }
        });

        save.setText("Save Changes");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        cancel.setText("Cancel Changes");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        viewProfile.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        viewProfile.setText("View Profile");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(returnPage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(viewProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 607, Short.MAX_VALUE)
                .addComponent(cancel)
                .addGap(18, 18, 18)
                .addComponent(save)
                .addGap(127, 127, 127))
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
                            .addComponent(save)
                            .addComponent(cancel)
                            .addComponent(viewProfile))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        returnPage.setOpaque(false);
        returnPage.setContentAreaFilled(false);
        returnPage.setBorderPainted(false);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setPreferredSize(new java.awt.Dimension(800, 720));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setPreferredSize(new java.awt.Dimension(600, 600));

        jPanel9.setPreferredSize(new java.awt.Dimension(400, 40));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setText("Customer ID: ");
        jPanel9.add(jLabel6, java.awt.BorderLayout.CENTER);

        id.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        id.setMinimumSize(new java.awt.Dimension(120, 28));
        id.setPreferredSize(new java.awt.Dimension(250, 28));
        jPanel9.add(id, java.awt.BorderLayout.EAST);

        jPanel8.setMinimumSize(new java.awt.Dimension(400, 67));
        jPanel8.setLayout(new java.awt.BorderLayout(5, 5));

        username.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        username.setPreferredSize(new java.awt.Dimension(400, 34));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel8.add(username, java.awt.BorderLayout.CENTER);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText("Username: ");
        jPanel8.add(jLabel7, java.awt.BorderLayout.PAGE_START);

        jPanel5.setMinimumSize(new java.awt.Dimension(400, 67));
        jPanel5.setLayout(new java.awt.BorderLayout(5, 5));

        full_name.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        full_name.setPreferredSize(new java.awt.Dimension(400, 34));
        full_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                full_nameActionPerformed(evt);
            }
        });
        jPanel5.add(full_name, java.awt.BorderLayout.CENTER);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Full Name: ");
        jPanel5.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jPanel6.setMinimumSize(new java.awt.Dimension(400, 67));
        jPanel6.setLayout(new java.awt.BorderLayout(5, 5));

        email.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        email.setPreferredSize(new java.awt.Dimension(400, 34));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel6.add(email, java.awt.BorderLayout.CENTER);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setText("Email: ");
        jPanel6.add(jLabel9, java.awt.BorderLayout.PAGE_START);

        jPanel7.setMinimumSize(new java.awt.Dimension(400, 67));
        jPanel7.setLayout(new java.awt.BorderLayout(5, 5));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("Password: ");
        jLabel5.setPreferredSize(new java.awt.Dimension(120, 28));
        jPanel7.add(jLabel5, java.awt.BorderLayout.WEST);

        password.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        password.setPreferredSize(new java.awt.Dimension(400, 34));
        jPanel7.add(password, java.awt.BorderLayout.PAGE_END);

        showPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        showPassword.setText("Show Password");
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });
        jPanel7.add(showPassword, java.awt.BorderLayout.EAST);
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(528, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.WEST);

        jPanel4.setPreferredSize(new java.awt.Dimension(600, 600));

        jPanel10.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setText("Phone Number:");
        jPanel10.add(jLabel8, java.awt.BorderLayout.CENTER);

        phone_number.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        phone_number.setPreferredSize(new java.awt.Dimension(400, 34));
        phone_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_numberActionPerformed(evt);
            }
        });
        jPanel10.add(phone_number, java.awt.BorderLayout.PAGE_END);

        jPanel11.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel11.setText("IC Number:");
        jPanel11.add(jLabel11, java.awt.BorderLayout.PAGE_START);

        icNo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        icNo.setPreferredSize(new java.awt.Dimension(400, 34));
        icNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icNoActionPerformed(evt);
            }
        });
        jPanel11.add(icNo, java.awt.BorderLayout.CENTER);

        jPanel12.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setText("License Number:");
        jPanel12.add(jLabel10, java.awt.BorderLayout.CENTER);

        licenseNo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        licenseNo.setPreferredSize(new java.awt.Dimension(400, 34));
        licenseNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenseNoActionPerformed(evt);
            }
        });
        jPanel12.add(licenseNo, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(613, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, java.awt.BorderLayout.EAST);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void returnPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnPageActionPerformed
        Main.customerHomePage = new customerHomePage(LoggedInCustomer);
        Main.customerHomePage.setVisible(true);
        Main.viewCustomerProfile.setVisible(false);
    }//GEN-LAST:event_returnPageActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        ArrayList<Customer> updatedCustomerData = new ArrayList<>();
        String password = new String(this.password.getPassword());
        
        for (Customer c : DataIO.customers){
                if(c.getCustomerID().equals(LoggedInCustomer.getCustomerID())){
                    if (!registerPage.checkIsNumber (phone_number.getText())){
                        return;
                    }
                    if (icNo.getText() != null && !icNo.getText().trim().equalsIgnoreCase("empty")){
                        if (!registerPage.checkIsNumber(icNo.getText().trim())){
                            return;
                        }
                    }

                    if (licenseNo.getText() != null && !licenseNo.getText().trim().equalsIgnoreCase("empty")){
                        if (!registerPage.checkIsNumber (licenseNo.getText().trim())){
                        return;
                        }
                    }
                    if (!checkFields(email.getText(), phone_number.getText(), icNo.getText(), licenseNo.getText(), password)){
                        return;
                    }
                    if (!checkEmailFormat(email.getText()))
                    {
                        JOptionPane.showMessageDialog(this, 
                            "Incorrect email format",
                            "Try again",
                            JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    c.setCustomerUsername(username.getText());
                    c.setCustomerFullName(full_name.getText());
                    c.setCustomerEmail(email.getText());
                    c.setCustomerPhoneNumber(phone_number.getText());
                    c.setCustomerPassword(password);
                    c.setCustomerICno(icNo.getText());
                    c.setCustomerLicenseNo(licenseNo.getText());
                    
                }
            }
        DataIO.writeCustomerData();
        JOptionPane.showMessageDialog(this,
            "Your information has been saved.",
            "Saved Customer Data",
            JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_saveActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        fillFields();
        JOptionPane.showMessageDialog(this,
            "Changes have been canceled. Original data has been restored.",
            "Discard Changes",
            JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cancelActionPerformed

    private void full_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_full_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_full_nameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        if (showPassword.isSelected()){
            password.setEchoChar((char)0);
        }
        else{
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordActionPerformed

    private void phone_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone_numberActionPerformed

    private void icNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_icNoActionPerformed

    private void licenseNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenseNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_licenseNoActionPerformed
    
    private boolean checkFields(String email, String phone, String icNO, String licenseNo, String password){
        if (!registerPage.checkEmailFormat(email) || 
                email.isEmpty() || phone.isEmpty() || 
                icNO.isEmpty() || 
                licenseNo.isEmpty() ||
                password.isEmpty() ||
                email.contains(" ") || 
                phone.contains(" ") ||
                icNO.contains(" ") ||
                licenseNo.contains(" ") ||
                password.contains(" ")){
            JOptionPane.showMessageDialog(null, 
                "Invalid input in email, phone, IC number and license number fields",
                "Try again",
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    private void fillFields(){
        id.setText(LoggedInCustomer.getCustomerID());
        username.setText(LoggedInCustomer.getCustomerUsername());
        full_name.setText(LoggedInCustomer.getCustomerFullName());
        email.setText(LoggedInCustomer.getCustomerEmail());
        password.setText(LoggedInCustomer.getCustomerPassword());
        phone_number.setText(LoggedInCustomer.getCustomerPhoneNumber());
        licenseNo.setText(LoggedInCustomer.getCustomerLicenseNo());
        icNo.setText(LoggedInCustomer.getCustomerICNo());
    }
    
    public static boolean checkEmailFormat(String email) {
        String emailRegex = "^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,6}$";
        return email.matches(emailRegex);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JTextField email;
    private javax.swing.JTextField full_name;
    private javax.swing.JTextField icNo;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JTextField licenseNo;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone_number;
    private javax.swing.JButton returnPage;
    private javax.swing.JButton save;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JTextField username;
    private javax.swing.JLabel viewProfile;
    // End of variables declaration//GEN-END:variables
}
