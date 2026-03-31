package oopassignment;

public class salesmanHomePage extends javax.swing.JFrame {
    private salesman LoggedInSalesman;
    public salesmanHomePage(salesman LoggedInSalesman) {
        this.LoggedInSalesman = LoggedInSalesman;
        initComponents();
        welcome.setText("<html>Hi, " + LoggedInSalesman.getSalesmanUsername() + "<br>Welcome Back.<html>");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        viewCar = new javax.swing.JButton();
        viewProflie = new javax.swing.JButton();
        viewBooking = new javax.swing.JButton();
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
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcome, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        viewCar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        viewCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopassignment/imageSources/manageCar.png"))); // NOI18N
        viewCar.setText("<html><right>View Car</right></html>");
        viewCar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        viewCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCarActionPerformed(evt);
            }
        });

        viewProflie.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        viewProflie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopassignment/imageSources/profile.png"))); // NOI18N
        viewProflie.setText("<html><right>View<p>Profile</right></html>");
        viewProflie.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        viewProflie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProflieActionPerformed(evt);
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
                    .addComponent(viewCar, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewProflie, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(205, 205, 205))
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
                    .addComponent(viewProflie, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(286, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void viewCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCarActionPerformed
        Main.manageCarSalesman = new manageCarSalesman(LoggedInSalesman);
        Main.manageCarSalesman.setVisible(true);
        Main.salesmanHomePage.setVisible(false);
    }//GEN-LAST:event_viewCarActionPerformed

    private void viewProflieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProflieActionPerformed
        Main.viewSalesmanProfile = new viewSalesmanProfile(LoggedInSalesman);
        Main.viewSalesmanProfile.setVisible(true);
        Main.salesmanHomePage.setVisible(false);
    }//GEN-LAST:event_viewProflieActionPerformed

    private void viewBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBookingActionPerformed
        Main.viewBookingSalesman = new viewBookingSalesman(LoggedInSalesman);
        Main.viewBookingSalesman.setVisible(true);
        Main.salesmanHomePage.setVisible(false);
    }//GEN-LAST:event_viewBookingActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Main.loginPage.setVisible(true);
        Main.salesmanHomePage.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout;
    private javax.swing.JButton viewBooking;
    private javax.swing.JButton viewCar;
    private javax.swing.JButton viewProflie;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
