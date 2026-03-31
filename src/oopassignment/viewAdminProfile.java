
package oopassignment;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class viewAdminProfile extends javax.swing.JFrame {
    
    private admin LoggedInAdmin;
    
    public viewAdminProfile(admin LoggedInAdmin) {
        this.LoggedInAdmin = LoggedInAdmin;
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
        jPanel4 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        phoneNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        showPassword = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        password_value = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        fullName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 681, Short.MAX_VALUE)
                .addComponent(cancel)
                .addGap(18, 18, 18)
                .addComponent(save)
                .addGap(51, 51, 51))
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

        jPanel4.setMinimumSize(new java.awt.Dimension(400, 67));
        jPanel4.setLayout(new java.awt.BorderLayout(5, 5));

        username.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        username.setPreferredSize(new java.awt.Dimension(400, 34));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel4.add(username, java.awt.BorderLayout.CENTER);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Username: ");
        jPanel4.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jPanel5.setMinimumSize(new java.awt.Dimension(400, 67));
        jPanel5.setLayout(new java.awt.BorderLayout(5, 5));

        email.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        email.setPreferredSize(new java.awt.Dimension(400, 34));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel5.add(email, java.awt.BorderLayout.CENTER);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Email Address: ");
        jPanel5.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jPanel6.setMinimumSize(new java.awt.Dimension(400, 67));
        jPanel6.setLayout(new java.awt.BorderLayout(5, 5));

        phoneNumber.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        phoneNumber.setPreferredSize(new java.awt.Dimension(400, 34));
        phoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberActionPerformed(evt);
            }
        });
        jPanel6.add(phoneNumber, java.awt.BorderLayout.CENTER);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("Phone Number: ");
        jPanel6.add(jLabel4, java.awt.BorderLayout.PAGE_START);

        jPanel7.setMinimumSize(new java.awt.Dimension(400, 67));
        jPanel7.setLayout(new java.awt.BorderLayout(5, 5));

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

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("Password: ");
        jLabel5.setPreferredSize(new java.awt.Dimension(120, 28));
        jPanel7.add(jLabel5, java.awt.BorderLayout.WEST);

        password_value.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        password_value.setPreferredSize(new java.awt.Dimension(400, 34));
        jPanel7.add(password_value, java.awt.BorderLayout.PAGE_END);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setText("Admin ID: ");

        id.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        id.setMinimumSize(new java.awt.Dimension(120, 28));
        id.setPreferredSize(new java.awt.Dimension(120, 28));

        jPanel8.setMinimumSize(new java.awt.Dimension(400, 67));
        jPanel8.setLayout(new java.awt.BorderLayout(5, 5));

        fullName.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        fullName.setPreferredSize(new java.awt.Dimension(400, 34));
        fullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameActionPerformed(evt);
            }
        });
        jPanel8.add(fullName, java.awt.BorderLayout.CENTER);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText("Full Name: ");
        jPanel8.add(jLabel7, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(400, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void returnPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnPageActionPerformed
        Main.adminHomePage = new adminHomePage(LoggedInAdmin);
        Main.adminHomePage.setVisible(true);
        Main.viewAdminProfile.setVisible(false);
    }//GEN-LAST:event_returnPageActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        ArrayList<admin> updatedAdminData = new ArrayList<>();
        String password = new String(password_value.getPassword());
        
        for (admin admin : DataIO.admins){
                if(admin.getAdminID().equals(LoggedInAdmin.getAdminID())){
                    if (!registerPage.checkIsNumber (phoneNumber.getText())){
                        return;
                    }

                    if (!checkFields(email.getText(), phoneNumber.getText(), password)){
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
                    admin.setAdminUsername(username.getText());
                    admin.setAdminFullName(fullName.getText());
                    admin.setAdminEmail(email.getText());
                    admin.setAdminPhoneNumber(phoneNumber.getText());
                    admin.setAdminPassword(password);
                }
            }
        
        DataIO.writeAdminData();
        JOptionPane.showMessageDialog(this,
            "Your information has been saved.",
            "Saved Admin Data",
            JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_saveActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        fillFields();
        JOptionPane.showMessageDialog(this,
            "Changes have been canceled. Original data has been restored.",
            "Discard Changes",
            JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cancelActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void phoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberActionPerformed

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        if (showPassword.isSelected()){
            password_value.setEchoChar((char)0);
        }
        else{
            password_value.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordActionPerformed

    private void fullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameActionPerformed
    
    private boolean checkFields(String email, String phone, String password){
        if (!registerPage.checkEmailFormat(email) || 
                email.isEmpty() || 
                phone.isEmpty() || 
                password.isEmpty() ||
                email.contains(" ") || 
                phone.contains(" ") ||
                password.contains(" ")) {
            JOptionPane.showMessageDialog(null, 
                "Invalid input in email, phone, IC number and license number fields",
                "Try again",
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    private void fillFields(){
        id.setText(LoggedInAdmin.getAdminID());
        username.setText(LoggedInAdmin.getAdminUsername());
        fullName.setText(LoggedInAdmin.getAdminFullName());
        email.setText(LoggedInAdmin.getAdminEmail());
        phoneNumber.setText(LoggedInAdmin.getAdminPhoneNumber());
        password_value.setText(LoggedInAdmin.getAdminPassword());
    }
    
    public static boolean checkEmailFormat(String email) {
        String emailRegex = "^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,6}$";
        return email.matches(emailRegex);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fullName;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPasswordField password_value;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JButton returnPage;
    private javax.swing.JButton save;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JTextField username;
    private javax.swing.JLabel viewProfile;
    // End of variables declaration//GEN-END:variables
}
