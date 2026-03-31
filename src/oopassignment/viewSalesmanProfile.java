
package oopassignment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class viewSalesmanProfile extends javax.swing.JFrame {
    
    private salesman LoggedInSalesman;
    private LocalDate date;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private double totalCommissions;
    
    public viewSalesmanProfile(salesman LoggedInSalesman) {
        this.LoggedInSalesman = LoggedInSalesman;
        this.date = LocalDate.now();
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
        jPanel5 = new javax.swing.JPanel();
        fullName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        showPassword = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        password_value = new javax.swing.JPasswordField();
        jPanel8 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        phone_number = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        sales = new javax.swing.JTextField();
        salesRange = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        commissions = new javax.swing.JTextField();
        commissionRange = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();

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

        jPanel5.setMinimumSize(new java.awt.Dimension(400, 67));
        jPanel5.setLayout(new java.awt.BorderLayout(5, 5));

        fullName.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        fullName.setPreferredSize(new java.awt.Dimension(400, 34));
        fullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameActionPerformed(evt);
            }
        });
        jPanel5.add(fullName, java.awt.BorderLayout.CENTER);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Full Name: ");
        jPanel5.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jPanel6.setMinimumSize(new java.awt.Dimension(400, 67));
        jPanel6.setLayout(new java.awt.BorderLayout(5, 5));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setText("Email: ");
        jPanel6.add(jLabel8, java.awt.BorderLayout.PAGE_START);

        email.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        email.setPreferredSize(new java.awt.Dimension(400, 34));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel6.add(email, java.awt.BorderLayout.CENTER);

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

        jPanel3.setLayout(new java.awt.BorderLayout(0, 5));

        phone_number.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        phone_number.setPreferredSize(new java.awt.Dimension(400, 34));
        phone_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_numberActionPerformed(evt);
            }
        });
        jPanel3.add(phone_number, java.awt.BorderLayout.CENTER);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setText("Phone Number: ");
        jPanel3.add(jLabel9, java.awt.BorderLayout.PAGE_START);

        jPanel9.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("Sales: ");
        jPanel9.add(jLabel4, java.awt.BorderLayout.CENTER);

        sales.setEditable(false);
        sales.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        sales.setPreferredSize(new java.awt.Dimension(400, 34));
        sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesActionPerformed(evt);
            }
        });
        jPanel9.add(sales, java.awt.BorderLayout.PAGE_END);

        salesRange.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Total", "January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        salesRange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesRangeActionPerformed(evt);
            }
        });
        jPanel9.add(salesRange, java.awt.BorderLayout.LINE_END);

        jPanel10.setLayout(new java.awt.BorderLayout());

        jLabel11.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel11.setText("Commissions: ");
        jPanel10.add(jLabel11, java.awt.BorderLayout.CENTER);

        commissions.setEditable(false);
        commissions.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        commissions.setPreferredSize(new java.awt.Dimension(400, 34));
        commissions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commissionsActionPerformed(evt);
            }
        });
        jPanel10.add(commissions, java.awt.BorderLayout.PAGE_END);

        commissionRange.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Total", "January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        commissionRange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commissionRangeActionPerformed(evt);
            }
        });
        jPanel10.add(commissionRange, java.awt.BorderLayout.LINE_END);

        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setText("Salesman ID: ");
        jPanel11.add(jLabel6, java.awt.BorderLayout.CENTER);

        id.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        id.setMinimumSize(new java.awt.Dimension(120, 28));
        id.setPreferredSize(new java.awt.Dimension(250, 28));
        jPanel11.add(id, java.awt.BorderLayout.EAST);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(400, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void returnPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnPageActionPerformed
        Main.salesmanHomePage = new salesmanHomePage(LoggedInSalesman);
        Main.salesmanHomePage.setVisible(true);
        Main.viewSalesmanProfile.setVisible(false);
    }//GEN-LAST:event_returnPageActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        ArrayList<salesman> updatedSalesmanData = new ArrayList<>();
        String password = new String(password_value.getPassword());
        
        for (salesman s : DataIO.salesmen){
                if(s.getSalesmanID().equals(LoggedInSalesman.getSalesmanID())){
                    if (!registerPage.checkIsNumber (phone_number.getText())){
                        return;
                    }

                    if (!checkFields(email.getText(), phone_number.getText(), password)){
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
                    s.setSalesmanUsername(username.getText());
                    s.setSalesmanFullName(fullName.getText());
                    s.setSalesmanEmail(email.getText());
                    s.setSalesmanPhoneNumber(phone_number.getText());
                    s.setSalesmanPassword(password);
                }
            }
        DataIO.writeSalesmanData();
        JOptionPane.showMessageDialog(this,
            "Your information has been saved.",
            "Saved Salesman Data",
            JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_saveActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        fillFields();
        JOptionPane.showMessageDialog(this,
            "Changes have been canceled. Original data has been restored.",
            "Discard Changes",
            JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cancelActionPerformed

    private void fullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameActionPerformed

    private void phone_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone_numberActionPerformed

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        if (showPassword.isSelected()){
            password_value.setEchoChar((char)0);
        }
        else{
            password_value.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salesActionPerformed

    private void commissionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commissionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commissionsActionPerformed

    private void salesRangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesRangeActionPerformed
        String selectedRange = (String) salesRange.getSelectedItem();
        int salesCount = 0;
        
        if (selectedRange.equals("Total")) {
            try{
                salesCount = Integer.parseInt(LoggedInSalesman.getSalesmanTotalSales());
            }
            catch (NumberFormatException e) {
                salesCount = 0;
                System.out.println("Error in converting sales");
            }
        } else {
            for (booking b : DataIO.bookings) {
                if (b.getSalesmanID().equals(LoggedInSalesman.getSalesmanID())) {
                    try {
                        LocalDate bookingDate = LocalDate.parse(b.getBookingDate(), formatter);
                        if (bookingDate.getMonth().name().equalsIgnoreCase(selectedRange) && bookingDate.getYear() == date.getYear()) {
                            salesCount++;
                            
                        }
                    } 
                    catch (Exception ex) {
                        JOptionPane.showMessageDialog(this,
                            "Invalid booking date format:" + b.getBookingDate(),
                            "Error in reading sales",
                            JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }

        sales.setText(Integer.toString(salesCount));
    }//GEN-LAST:event_salesRangeActionPerformed

    private void commissionRangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commissionRangeActionPerformed
        String selectedRange = (String) commissionRange.getSelectedItem();
        double commissions = 0;
        if (selectedRange.equals("Total")) {
            commissions = this.totalCommissions;
        } else {
            for (booking b : DataIO.bookings) {
                double commission;
                try{
                    commission = Double.parseDouble(b.getCommission());
                } 
                catch (NumberFormatException e) {
                   commission = 0;
                }
                if (b.getSalesmanID().equals(LoggedInSalesman.getSalesmanID())) {
                    try {
                        LocalDate bookingDate = LocalDate.parse(b.getBookingDate(), formatter);
                        if (bookingDate.getMonth().name().equalsIgnoreCase(selectedRange) && bookingDate.getYear() == date.getYear()) {
                            commissions += commission;
                            
                        }
                    } 
                    catch (Exception ex) {
                        JOptionPane.showMessageDialog(this,
                            "Invalid booking date format:" + b.getBookingDate(),
                            "Error in reading commissions",
                            JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }

        this.commissions.setText(String.format("RM %,.2f", commissions));
    }//GEN-LAST:event_commissionRangeActionPerformed
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
        id.setText(LoggedInSalesman.getSalesmanID());
        username.setText(LoggedInSalesman.getSalesmanUsername());
        fullName.setText(LoggedInSalesman.getSalesmanFullName());
        email.setText(LoggedInSalesman.getSalesmanEmail());
        phone_number.setText(LoggedInSalesman.getSalesmanPhoneNumber());
        password_value.setText(LoggedInSalesman.getSalesmanPassword());
        sales.setText(LoggedInSalesman.getSalesmanTotalSales());
        
        double commissions;
        try{
            commissions = Double.parseDouble(LoggedInSalesman.getSalesmanTotalCommissions());
            this.totalCommissions = commissions;
        }
        catch (NumberFormatException e) {
            this.totalCommissions = 0;
            System.out.println("Error in converting commissions");
        }
        this.commissions.setText(String.format("RM %,.2f", this.totalCommissions));
    }
    
    public static boolean checkEmailFormat(String email) {
        String emailRegex = "^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,6}$";
        return email.matches(emailRegex);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox<String> commissionRange;
    private javax.swing.JTextField commissions;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fullName;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField password_value;
    private javax.swing.JTextField phone_number;
    private javax.swing.JButton returnPage;
    private javax.swing.JTextField sales;
    private javax.swing.JComboBox<String> salesRange;
    private javax.swing.JButton save;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JTextField username;
    private javax.swing.JLabel viewProfile;
    // End of variables declaration//GEN-END:variables
}
