package oopassignment;

public class customerHomePage extends javax.swing.JFrame {
    private Customer LoggedInCustomer;
    public customerHomePage(Customer LoggedInCustomer) {
        this.LoggedInCustomer = LoggedInCustomer;
        initComponents();
        welcome.setText("<html>Hi, " + LoggedInCustomer.getCustomerUsername() + "<br>Welcome Back.<html>");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        viewCar = new javax.swing.JButton();
        viewProfile = new javax.swing.JButton();
        viewBooking = new javax.swing.JButton();
        paymentHistory = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 100));

        welcome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        welcome.setText("Hi, [Name]");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 1078, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcome, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        viewCar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        viewCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopassignment/imageSources/manageCar.png"))); // NOI18N
        viewCar.setText("<html><right>View Cars<p></right></html>");
        viewCar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        viewCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCarActionPerformed(evt);
            }
        });

        viewProfile.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        viewProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopassignment/imageSources/profile.png"))); // NOI18N
        viewProfile.setText("<html><right>View<p>Profile</right></html>");
        viewProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        viewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProfileActionPerformed(evt);
            }
        });

        viewBooking.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        viewBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopassignment/imageSources/booking.png"))); // NOI18N
        viewBooking.setText("<html><right>View<p>Booking<p></right></html>");
        viewBooking.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        viewBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBookingActionPerformed(evt);
            }
        });

        paymentHistory.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        paymentHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopassignment/imageSources/sales&Payment.png"))); // NOI18N
        paymentHistory.setText("<html><right>Payment<p>History</right></html>");
        paymentHistory.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        paymentHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentHistoryActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopassignment/imageSources/logout.png"))); // NOI18N
        logout.setText("<html><right>Log Out</right></html>");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewCar, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymentHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(205, 205, 205))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewCar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paymentHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void viewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProfileActionPerformed
        Main.viewCustomerProfile = new viewCustomerProfile(LoggedInCustomer);
        Main.viewCustomerProfile.setVisible(true);
        Main.customerHomePage.setVisible(false);
    }//GEN-LAST:event_viewProfileActionPerformed

    private void viewBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBookingActionPerformed
        Main.viewBookingCustomer = new viewBookingCustomer(LoggedInCustomer);
        Main.viewBookingCustomer.setVisible(true);
        Main.customerHomePage.setVisible(false);
    }//GEN-LAST:event_viewBookingActionPerformed

    private void paymentHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentHistoryActionPerformed
        Main.viewPaymentCustomer = new viewPaymentCustomer(LoggedInCustomer);
        Main.viewPaymentCustomer.setVisible(true);
        Main.customerHomePage.setVisible(false);
    }//GEN-LAST:event_paymentHistoryActionPerformed

    private void viewCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCarActionPerformed
        Main.manageCarViewOnly = new manageCarViewOnly(LoggedInCustomer);
        Main.manageCarViewOnly.setVisible(true);
        Main.customerHomePage.setVisible(false);
    }//GEN-LAST:event_viewCarActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Main.loginPage.setVisible(true);
        Main.customerHomePage.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout;
    private javax.swing.JButton paymentHistory;
    private javax.swing.JButton viewBooking;
    private javax.swing.JButton viewCar;
    private javax.swing.JButton viewProfile;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
