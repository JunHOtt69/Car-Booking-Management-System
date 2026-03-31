package oopassignment;

import java.util.ArrayList;

public class feedbackAnalysis extends javax.swing.JFrame {
    oopassignment.FeedbackTableModel FeedbackModel = new oopassignment.FeedbackTableModel(DataIO.bookings);
    oopassignment.FeedbackSalesmanTableModel SalesmanFeedbackModel = new oopassignment.FeedbackSalesmanTableModel(DataIO.bookings);
        
    public feedbackAnalysis() {
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
        jPanel15 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        averageRating = new javax.swing.JLabel();
        month = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerFeedback = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        salesmanRating = new javax.swing.JTable();
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
        jLabel6.setText("Feedback Analysis");

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

        jPanel5.setPreferredSize(new java.awt.Dimension(980, 50));

        jPanel15.setPreferredSize(new java.awt.Dimension(550, 24));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Average Rating (1-5):");
        jLabel7.setPreferredSize(new java.awt.Dimension(200, 22));
        jPanel15.add(jLabel7, java.awt.BorderLayout.WEST);

        averageRating.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        averageRating.setMinimumSize(new java.awt.Dimension(400, 22));
        averageRating.setPreferredSize(new java.awt.Dimension(600, 22));
        jPanel15.add(averageRating, java.awt.BorderLayout.CENTER);

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Total", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });
        jPanel15.add(month, java.awt.BorderLayout.EAST);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(424, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel14.add(jPanel5);

        jPanel10.setLayout(new java.awt.BorderLayout(10, 10));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(980, 300));

        customerFeedback.setModel(FeedbackModel);
        customerFeedback.setPreferredSize(new java.awt.Dimension(980, 300));
        jScrollPane2.setViewportView(customerFeedback);
        TableStyler.styleFeedbackTable(customerFeedback, jScrollPane1);

        jPanel10.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Customer Feedback");
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

        salesmanRating.setModel(SalesmanFeedbackModel);
        salesmanRating.setPreferredSize(new java.awt.Dimension(980, 300));
        jScrollPane3.setViewportView(salesmanRating);
        TableStyler.styleFeedbackSalesmanTable(salesmanRating, jScrollPane1);

        jPanel11.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Salesman Rating");
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
        Main.feedbackAnalysis.setVisible(false);
        Main.adminHomePage.setVisible(true);
    }//GEN-LAST:event_returnPageActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        updateRevenueStats();
    }//GEN-LAST:event_monthActionPerformed
    private void updateRevenueStats() {
        ArrayList<Double> ratings = new ArrayList<>();
        double averageRating = 0;
        
        if(((String)month.getSelectedItem()).equalsIgnoreCase("total")){
            for (booking b : DataIO.bookings) {
                String ratingStr = b.getRating();
                String date = b.getBookingDate();

                if (ratingStr.equalsIgnoreCase("empty")) {
                    continue;
                }

                double rating;
                try {
                     rating = Double.parseDouble(ratingStr);
                     ratings.add(rating);
                } catch (NumberFormatException e) {
                    System.err.println("Invalid rating format: " + ratingStr);
                    continue;
                }
            }
            if(ratings.isEmpty()){
                this.averageRating.setText("0 (No rating found)");
            }
            else{
                double totalRating = 0;
                for (double rating : ratings){
                    totalRating += rating;
                }
                averageRating = totalRating / ratings.size();
                this.averageRating.setText(String.format("%.2f (%d ratings)", averageRating, ratings.size()));
            }
        }
        else{
            int selectedMonth = month.getSelectedIndex();

            for (booking b : DataIO.bookings) {
                String ratingStr = b.getRating();
                String date = b.getBookingDate();

                if (ratingStr.equalsIgnoreCase("empty")) {
                    continue;
                }

                double rating;
                try {
                     rating = Double.parseDouble(ratingStr);
                } catch (NumberFormatException e) {
                    System.err.println("Invalid rating format: " + ratingStr);
                    continue;
                }

                String[] dateParts = date.split("-");
                if (dateParts.length != 3) {
                    System.err.println("Invalid date format: " + date);
                    continue;
                }

                int monthNumber = Integer.parseInt(dateParts[1]);

                if (monthNumber == selectedMonth) {
                    ratings.add(rating);
                }
            }

            if(ratings.isEmpty()){
                this.averageRating.setText("0 (No rating found)");
            }
            else{
                double totalRating = 0;
                for (double rating : ratings){
                    totalRating += rating;
                }
                averageRating = totalRating / ratings.size();
                this.averageRating.setText(String.format("%.2f (%d ratings)", averageRating, ratings.size()));
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel averageRating;
    private javax.swing.JTable customerFeedback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JButton returnPage;
    private javax.swing.JTable salesmanRating;
    // End of variables declaration//GEN-END:variables
}
