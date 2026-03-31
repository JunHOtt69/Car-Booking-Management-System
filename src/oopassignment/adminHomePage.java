package oopassignment;

public class adminHomePage extends javax.swing.JFrame {
    private admin LoggedInAdmin;
    
    public adminHomePage(admin LoggedInAdmin) {
        this.LoggedInAdmin = LoggedInAdmin;
        initComponents();
        welcome.setText("<html>Hi, " + LoggedInAdmin.getAdminUsername() + "<br>Welcome Back.<html>");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        manageUser = new javax.swing.JButton();
        manageCar = new javax.swing.JButton();
        viewProfile = new javax.swing.JButton();
        salesPayment = new javax.swing.JButton();
        feedbackAnalysis = new javax.swing.JButton();
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
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 1097, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcome, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        manageUser.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        manageUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopassignment/imageSources/manageUserIcon.png"))); // NOI18N
        manageUser.setText("<html><right>Manage<p>User</right></html>");
        manageUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        manageUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserActionPerformed(evt);
            }
        });

        manageCar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        manageCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopassignment/imageSources/manageCar.png"))); // NOI18N
        manageCar.setText("<html><right>Manage<p>Car</right></html>");
        manageCar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        manageCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCarActionPerformed(evt);
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

        salesPayment.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        salesPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopassignment/imageSources/sales&Payment.png"))); // NOI18N
        salesPayment.setText("<html><right>Sales and<p>Paymennt<p>Dashboard</right></html>");
        salesPayment.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        salesPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesPaymentActionPerformed(evt);
            }
        });

        feedbackAnalysis.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        feedbackAnalysis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopassignment/imageSources/feedbackAnalysis.png"))); // NOI18N
        feedbackAnalysis.setText("<html><right>Feedback<p>Analysis</right></html>");
        feedbackAnalysis.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        feedbackAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackAnalysisActionPerformed(evt);
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
                    .addComponent(manageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageCar, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salesPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feedbackAnalysis, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(205, 205, 205))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salesPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageCar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feedbackAnalysis, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void manageUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserActionPerformed
        Main.manageUser = new manageUser(LoggedInAdmin);
        Main.manageUser.setVisible(true);
        Main.adminHomePage.setVisible(false);
    }//GEN-LAST:event_manageUserActionPerformed

    private void manageCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCarActionPerformed
        Main.manageCar = new manageCar();
        Main.manageCar.setVisible(true);
        Main.adminHomePage.setVisible(false);
    }//GEN-LAST:event_manageCarActionPerformed

    private void viewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProfileActionPerformed
        Main.viewAdminProfile = new viewAdminProfile(LoggedInAdmin);
        Main.viewAdminProfile.setVisible(true);
        Main.adminHomePage.setVisible(false);
    }//GEN-LAST:event_viewProfileActionPerformed

    private void salesPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesPaymentActionPerformed
        Main.paymentAnalysis = new paymentAnalysis();
        Main.paymentAnalysis.setVisible(true);
        Main.adminHomePage.setVisible(false);
    }//GEN-LAST:event_salesPaymentActionPerformed

    private void feedbackAnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackAnalysisActionPerformed
        Main.feedbackAnalysis = new feedbackAnalysis();
        Main.feedbackAnalysis.setVisible(true);
        Main.adminHomePage.setVisible(false);
    }//GEN-LAST:event_feedbackAnalysisActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Main.loginPage.setVisible(true);
        Main.adminHomePage.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton feedbackAnalysis;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout;
    private javax.swing.JButton manageCar;
    private javax.swing.JButton manageUser;
    private javax.swing.JButton salesPayment;
    private javax.swing.JButton viewProfile;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
