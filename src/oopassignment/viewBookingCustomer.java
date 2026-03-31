package oopassignment;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class viewBookingCustomer extends javax.swing.JFrame {
    private Customer LoggedInCustomer;
    private booking selectedBooking;
    oopassignment.BookingTableModelCustomer bookingModel;
    ArrayList<Object[]> originalBookingData;

    public viewBookingCustomer(Customer LoggedInCustomer) {
        this.LoggedInCustomer = LoggedInCustomer;
        bookingModel = new BookingTableModelCustomer(DataIO.bookings, this.LoggedInCustomer );
        originalBookingData = bookingModel.getBookingData();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookingTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        returnPage = new javax.swing.JButton();
        searchBar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        pay = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setPreferredSize(new java.awt.Dimension(1200, 720));
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setLayout(new java.awt.BorderLayout());

        bookingTable.setAutoCreateRowSorter(true);
        bookingTable.setFont(new java.awt.Font("Arial", 0, 18));
        bookingTable.setModel(bookingModel);
        jScrollPane1.setViewportView(bookingTable);
        TableStyler.styleBookingTableCustomer(bookingTable, jScrollPane1);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.SOUTH);

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 80));

        returnPage.setForeground(new java.awt.Color(255, 255, 255));
        returnPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopassignment/imageSources/return-icon.png"))); // NOI18N
        returnPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnPageActionPerformed(evt);
            }
        });

        searchBar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBarKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("View Bookings");

        save.setText("Save Ratings & Comments");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        pay.setText("Pay Booking");
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Enter To Search: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(returnPage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(pay)
                .addGap(18, 18, 18)
                .addComponent(save)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(save)
                            .addComponent(pay)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(returnPage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        returnPage.setOpaque(false);
        returnPage.setContentAreaFilled(false);
        returnPage.setBorderPainted(false);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void returnPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnPageActionPerformed
        Main.customerHomePage.setVisible(true);
        Main.viewBookingCustomer.setVisible(false);
    }//GEN-LAST:event_returnPageActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if (bookingTable.isEditing()) {
            bookingTable.getCellEditor().stopCellEditing();
        }
        BookingTableModelCustomer bookingModel = (BookingTableModelCustomer) bookingTable.getModel();
        ArrayList<Object[]> bookingRows = bookingModel.getBookingData();
        
        try{
            for (Object row[] : bookingRows ){
                String bookingID = (String) row[1];
                String rating = (String) row[6];
                String comment = (String) row[7];

                if (!"Empty".equals(rating) && !rating.matches("^(?:[1-4](?:\\.\\d)?|5(?:\\.0)?)$")) {
                    JOptionPane.showMessageDialog(this,
                            "Invalid rating for booking ID " + bookingID + ". Must be between 1.0 and 5.0 with at most 1 decimal place, or 'Empty'.",
                            "Invalid Rating",
                            JOptionPane.ERROR_MESSAGE);
                        return;
                }

                if (!"Empty".equals(comment) && comment.trim().equals("")) {
                    JOptionPane.showMessageDialog(this,
                        "Comment for booking ID " + bookingID + " cannot be blank. Use 'Empty' if no comment.",
                        "Invalid Comment",
                        JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                for (booking b : DataIO.bookings){
                    if(b.getBookingID().equals(bookingID)){
                        b.setRating(rating);
                        b.setComments(comment);
                        System.out.println("Updated: " + bookingID + " | Rating: " + rating + " | Comment: " + comment);
                    }
                }
            }
            DataIO.writeBookingData();

            JOptionPane.showMessageDialog(this,
                "Ratings and Comments are Saved",
                "Successful",
                JOptionPane.INFORMATION_MESSAGE);

            refreshPage(DataIO.bookings);
            originalBookingData = bookingModel.getBookingData();
        }
        catch(HeadlessException ex){
            JOptionPane.showMessageDialog(this,
                "Invalid Input",
                "Try again",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        ArrayList<Object[]> currentCarRows = bookingModel.getBookingData();
        Object[] selectedRow = null;

        int count = 0;
        for (Object[] row : currentCarRows) {
            boolean isSelected = Boolean.TRUE.equals(row[0]);
            if (isSelected) {
                count++;
                selectedRow = row;
            }
        }

        if (count == 0) {
            JOptionPane.showMessageDialog(this, 
                    "Please select a booking to pay.", 
                    "No Selection", 
                    JOptionPane.WARNING_MESSAGE);
        } else if (count > 1) {
            JOptionPane.showMessageDialog(this, 
                    "You can only select ONE booking at a time.", 
                    "Multiple Selections", 
                    JOptionPane.ERROR_MESSAGE);
        } else {
            boolean found = false;
            String bookingID = (String) selectedRow[1];
            for (booking b : DataIO.bookings){
                if (b.getBookingID().equals(bookingID)){
                    if (b.getBookingStatus().equals("Booked")){
                        Main.payBooking = new payBooking(this, true, b, LoggedInCustomer);
                        Main.payBooking.setVisible(true);
                        found = true;
                    }
                    break;
                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(this, 
                    "Please select a booking with status 'Booked'.", 
                    "Invalid Booking", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_payActionPerformed

    private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyReleased
        String keyword = searchBar.getText().toLowerCase();
        ArrayList<booking> searchedBookings = new ArrayList<>();

        for (Object[] row : originalBookingData) {
            if (rowContains(row, 1, 9, keyword)) { 
                String bookingID = (String) row[1]; 
                for (booking b : DataIO.bookings) {
                    if (b.getBookingID().equals(bookingID)) {
                        searchedBookings.add(b);
                        break;
                    }
                }
            }
        }

        if (searchedBookings.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "No booking found.", 
                "No Result", 
                JOptionPane.ERROR_MESSAGE);
        } else {
            refreshPage(searchedBookings);
        }
    }//GEN-LAST:event_searchBarKeyReleased
    
    public boolean rowContains(Object[] row, int start, int end, String keyword){
        keyword = keyword.toLowerCase();
        for(int i = start; i <= end; i++){
            if ((String)row[i] != null && !((String)row[i]).equals("Empty")){
                if (((String)row[i]).toLowerCase().contains(keyword)) return true;
            }
        }
        return false;
    }
    
    public void refreshPage(ArrayList<booking> bookings){
        bookingModel= new BookingTableModelCustomer(bookings, LoggedInCustomer);
        bookingTable.setModel(bookingModel);
        TableStyler.styleBookingTableCustomer(bookingTable, jScrollPane1);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookingTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pay;
    private javax.swing.JButton returnPage;
    private javax.swing.JButton save;
    private javax.swing.JTextField searchBar;
    // End of variables declaration//GEN-END:variables

    
    
}
