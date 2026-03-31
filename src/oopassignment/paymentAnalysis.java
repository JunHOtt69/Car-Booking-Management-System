package oopassignment;

public class paymentAnalysis extends javax.swing.JFrame {
    oopassignment.TopCustomerTableModel top5CustomerModel = new oopassignment.TopCustomerTableModel(DataIO.payments, DataIO.customers);
    oopassignment.TopSalesmanTableModel top5SalesmenModel = new oopassignment.TopSalesmanTableModel(DataIO.salesmen);
        
    public paymentAnalysis() {
        initComponents();
        updateRevenueStats();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        returnPage = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel13 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        unpaidBooking = new javax.swing.JLabel();
        viewUnpaidBookings = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        canceledBooking = new javax.swing.JLabel();
        viewCanceledBooking = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        numPayment = new javax.swing.JLabel();
        viewPayment = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        monthlyRevenue = new javax.swing.JLabel();
        month = new javax.swing.JComboBox<>();
        jPanel15 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        totalRevenue = new javax.swing.JLabel();
        viewallBooking = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        top5CustomerTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        top5SalesmenTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setPreferredSize(new java.awt.Dimension(1200, 80));

        returnPage.setForeground(new java.awt.Color(255, 255, 255));
        returnPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopassignment/imageSources/return-icon.png"))); // NOI18N
        returnPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnPageActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setText("Payment Analysis");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(returnPage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(824, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnPage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        returnPage.setOpaque(false);
        returnPage.setContentAreaFilled(false);
        returnPage.setBorderPainted(false);

        getContentPane().add(jPanel6, java.awt.BorderLayout.NORTH);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel13.setLayout(new java.awt.BorderLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(110, 600));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel2, java.awt.BorderLayout.WEST);

        jPanel3.setPreferredSize(new java.awt.Dimension(110, 600));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel3, java.awt.BorderLayout.EAST);

        jPanel14.setLayout(new javax.swing.BoxLayout(jPanel14, javax.swing.BoxLayout.Y_AXIS));

        jPanel5.setPreferredSize(new java.awt.Dimension(980, 120));
        jPanel5.setLayout(new java.awt.BorderLayout(30, 0));

        jPanel22.setPreferredSize(new java.awt.Dimension(470, 108));

        jPanel8.setPreferredSize(new java.awt.Dimension(470, 24));
        jPanel8.setLayout(new java.awt.BorderLayout(5, 0));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Unpaid Bookings: ");
        jLabel12.setPreferredSize(new java.awt.Dimension(170, 22));
        jPanel8.add(jLabel12, java.awt.BorderLayout.WEST);

        unpaidBooking.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        unpaidBooking.setMinimumSize(new java.awt.Dimension(400, 22));
        unpaidBooking.setPreferredSize(new java.awt.Dimension(521, 22));
        jPanel8.add(unpaidBooking, java.awt.BorderLayout.CENTER);

        viewUnpaidBookings.setText("View All");
        viewUnpaidBookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewUnpaidBookingsActionPerformed(evt);
            }
        });
        jPanel8.add(viewUnpaidBookings, java.awt.BorderLayout.EAST);

        jPanel9.setPreferredSize(new java.awt.Dimension(470, 24));
        jPanel9.setLayout(new java.awt.BorderLayout(5, 0));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setText("Canceled Booking:");
        jLabel14.setPreferredSize(new java.awt.Dimension(170, 22));
        jPanel9.add(jLabel14, java.awt.BorderLayout.WEST);

        canceledBooking.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        canceledBooking.setMinimumSize(new java.awt.Dimension(400, 22));
        canceledBooking.setPreferredSize(new java.awt.Dimension(521, 22));
        jPanel9.add(canceledBooking, java.awt.BorderLayout.CENTER);

        viewCanceledBooking.setText("View All");
        viewCanceledBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCanceledBookingActionPerformed(evt);
            }
        });
        jPanel9.add(viewCanceledBooking, java.awt.BorderLayout.EAST);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel22, java.awt.BorderLayout.EAST);

        jPanel23.setPreferredSize(new java.awt.Dimension(470, 108));

        jPanel17.setPreferredSize(new java.awt.Dimension(470, 24));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Number of Payment made:");
        jLabel10.setPreferredSize(new java.awt.Dimension(250, 22));
        jPanel17.add(jLabel10, java.awt.BorderLayout.WEST);

        numPayment.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        numPayment.setMinimumSize(new java.awt.Dimension(400, 22));
        numPayment.setPreferredSize(new java.awt.Dimension(521, 22));
        jPanel17.add(numPayment, java.awt.BorderLayout.CENTER);

        viewPayment.setText("View All");
        viewPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPaymentActionPerformed(evt);
            }
        });
        jPanel17.add(viewPayment, java.awt.BorderLayout.EAST);

        jPanel12.setPreferredSize(new java.awt.Dimension(470, 24));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setText("Monthly Revenue:");
        jLabel15.setPreferredSize(new java.awt.Dimension(150, 22));
        jPanel12.add(jLabel15, java.awt.BorderLayout.WEST);

        monthlyRevenue.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        monthlyRevenue.setMinimumSize(new java.awt.Dimension(400, 22));
        monthlyRevenue.setPreferredSize(new java.awt.Dimension(500, 22));
        jPanel12.add(monthlyRevenue, java.awt.BorderLayout.CENTER);

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });
        jPanel12.add(month, java.awt.BorderLayout.EAST);

        jPanel15.setPreferredSize(new java.awt.Dimension(470, 24));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Total Revenue:");
        jLabel7.setPreferredSize(new java.awt.Dimension(150, 22));
        jPanel15.add(jLabel7, java.awt.BorderLayout.WEST);

        totalRevenue.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        totalRevenue.setMinimumSize(new java.awt.Dimension(400, 22));
        totalRevenue.setPreferredSize(new java.awt.Dimension(600, 22));
        jPanel15.add(totalRevenue, java.awt.BorderLayout.CENTER);

        viewallBooking.setText("View All");
        viewallBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewallBookingActionPerformed(evt);
            }
        });
        jPanel15.add(viewallBooking, java.awt.BorderLayout.EAST);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel23, java.awt.BorderLayout.WEST);

        jPanel14.add(jPanel5);

        jPanel10.setLayout(new java.awt.BorderLayout(10, 10));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(980, 300));

        top5CustomerTable.setModel(top5CustomerModel);
        top5CustomerTable.setPreferredSize(new java.awt.Dimension(980, 300));
        jScrollPane2.setViewportView(top5CustomerTable);
        TableStyler.styleTopCustomerTable(top5CustomerTable, jScrollPane1);

        jPanel10.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Top 5 Customer");
        jPanel10.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setPreferredSize(new java.awt.Dimension(980, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel14.add(jPanel10);

        jPanel11.setLayout(new java.awt.BorderLayout(10, 10));

        jScrollPane3.setPreferredSize(new java.awt.Dimension(980, 300));

        top5SalesmenTable.setModel(top5SalesmenModel);
        top5SalesmenTable.setPreferredSize(new java.awt.Dimension(980, 300));
        jScrollPane3.setViewportView(top5SalesmenTable);
        TableStyler.styleTopCustomerTable(top5SalesmenTable, jScrollPane1);

        jPanel11.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Top 5 Salesman");
        jPanel11.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jPanel4.setPreferredSize(new java.awt.Dimension(980, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel14.add(jPanel11);

        jPanel13.add(jPanel14, java.awt.BorderLayout.CENTER);

        jScrollPane1.setViewportView(jPanel13);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void returnPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnPageActionPerformed
        Main.paymentAnalysis.setVisible(false);
        Main.adminHomePage.setVisible(true);
    }//GEN-LAST:event_returnPageActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        updateRevenueStats();
    }//GEN-LAST:event_monthActionPerformed

    private void viewPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPaymentActionPerformed
        Main.viewPayment = new viewPayment();
        Main.viewPayment.setVisible(true);
        Main.paymentAnalysis.setVisible(false);
    }//GEN-LAST:event_viewPaymentActionPerformed

    private void viewallBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewallBookingActionPerformed
        Main.manageBooking = new manageBooking();
        Main.manageBooking.setVisible(true);
        Main.paymentAnalysis.setVisible(false);
    }//GEN-LAST:event_viewallBookingActionPerformed

    private void viewCanceledBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCanceledBookingActionPerformed
        Main.canceledBooking = new canceledBooking();
        Main.canceledBooking.setVisible(true);
        Main.paymentAnalysis.setVisible(false);
    }//GEN-LAST:event_viewCanceledBookingActionPerformed

    private void viewUnpaidBookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUnpaidBookingsActionPerformed
        Main.unpaidBooking = new unpaidBooking();
        Main.unpaidBooking.setVisible(true);
        Main.paymentAnalysis.setVisible(false);
    }//GEN-LAST:event_viewUnpaidBookingsActionPerformed
    private void updateRevenueStats() {
        double totalRevenue = 0;
        double monthlyRevenue = 0;
        int paidCount = 0;
        int unpaidCount = 0;
        int canceledCount = 0;

        int selectedMonth = month.getSelectedIndex() + 1;

        for (booking b : DataIO.bookings) {
            String status = b.getBookingStatus().trim().toLowerCase();
            String date = b.getBookingDate();
            if (date.isEmpty() || date.equalsIgnoreCase("empty")) {
                continue;
            }
            
            double price;
            try {
                price = Double.parseDouble(b.getPrice());
            } catch (NumberFormatException e) {
                System.err.println("Invalid price format: " + b.getPrice());
                continue;
            }
            
            String[] dateParts = date.split("-");
            if (dateParts.length != 3) {
                System.err.println("Invalid date format: " + date);
                continue;
            }
            
            int monthNumber = Integer.parseInt(dateParts[1]);

            if (status.equalsIgnoreCase("paid")) {
                totalRevenue += price;
                paidCount++;
                if (monthNumber == selectedMonth) {
                    monthlyRevenue += price;
                }
            } else if (status.equalsIgnoreCase("booked") || status.equalsIgnoreCase("requesting booking")) {
                unpaidCount++;
            } else if (status.equalsIgnoreCase("canceled") || status.equalsIgnoreCase("cancelled")) {
                canceledCount++;
            }
        }

        this.totalRevenue.setText("RM " + String.format("%.2f", totalRevenue));
        this.monthlyRevenue.setText("RM " + String.format("%.2f", monthlyRevenue));
        numPayment.setText(String.valueOf(paidCount));
        unpaidBooking.setText(String.valueOf(unpaidCount));
        canceledBooking.setText(String.valueOf(canceledCount));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel canceledBooking;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JLabel monthlyRevenue;
    private javax.swing.JLabel numPayment;
    private javax.swing.JButton returnPage;
    private javax.swing.JTable top5CustomerTable;
    private javax.swing.JTable top5SalesmenTable;
    private javax.swing.JLabel totalRevenue;
    private javax.swing.JLabel unpaidBooking;
    private javax.swing.JButton viewCanceledBooking;
    private javax.swing.JButton viewPayment;
    private javax.swing.JButton viewUnpaidBookings;
    private javax.swing.JButton viewallBooking;
    // End of variables declaration//GEN-END:variables
}
