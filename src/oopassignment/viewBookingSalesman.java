package oopassignment;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class viewBookingSalesman extends javax.swing.JFrame {
    private salesman LoggedInSalesman;
    private booking selectedBooking;
    oopassignment.BookingTableModelSalesman bookingModel;
    ArrayList<Object[]> originalBookingData;

    public viewBookingSalesman(salesman LoggedInSalesman) {
        this.LoggedInSalesman = LoggedInSalesman;
        bookingModel = new BookingTableModelSalesman(DataIO.bookings, this.LoggedInSalesman);
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
        search = new javax.swing.JButton();
        searchBar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cancelBooking = new javax.swing.JButton();
        confirmBooking = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setPreferredSize(new java.awt.Dimension(1200, 720));
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setLayout(new java.awt.BorderLayout());

        bookingTable.setAutoCreateRowSorter(true);
        bookingTable.setFont(new java.awt.Font("Arial", 0, 18));
        bookingTable.setModel(bookingModel);
        jScrollPane1.setViewportView(bookingTable);
        TableStyler.styleBookingTableSalesman(bookingTable, jScrollPane1);

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

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        searchBar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("View Bookings");

        cancelBooking.setText("Cancel Booking");
        cancelBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBookingActionPerformed(evt);
            }
        });

        confirmBooking.setText("Confrim Request Booking");
        confirmBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBookingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(returnPage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(confirmBooking)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelBooking)
                .addGap(18, 18, 18)
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(search)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search)
                            .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(returnPage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelBooking)
                                .addComponent(confirmBooking)))))
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
        Main.salesmanHomePage.setVisible(true);
        Main.viewBookingSalesman.setVisible(false);
    }//GEN-LAST:event_returnPageActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String keyword = searchBar.getText().toLowerCase();
        ArrayList<Object[]> bookingData = new ArrayList<>(originalBookingData);
        ArrayList<booking> searchedBookings = new ArrayList<>();

        for (Object[] row : bookingData) {
            if (rowContains(row, 1, 10, keyword)) {
                String bookingID = (String) row[1];
                for (booking b : DataIO.bookings){
                    if (b.getBookingID().equals(bookingID)){
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
    }//GEN-LAST:event_searchActionPerformed

    private void cancelBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBookingActionPerformed
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
                    "Please select a booking to cancel.", 
                    "No Selection", 
                    JOptionPane.WARNING_MESSAGE);
        } else if (count > 1) {
            JOptionPane.showMessageDialog(this, 
                    "You can only select ONE booking at a time.", 
                    "Multiple Selections", 
                    JOptionPane.ERROR_MESSAGE);
        } else{
            boolean found = false;
            String bookingID = (String) selectedRow[1];
            for (booking b : DataIO.bookings){
                if (b.getBookingID().equals(bookingID)){
                    if (b.getBookingStatus().equals("Booked")){
                        Main.cancelBooking = new cancelBooking(this, true, b, this);
                        Main.cancelBooking.setVisible(true);
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
    }//GEN-LAST:event_cancelBookingActionPerformed

    private void confirmBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBookingActionPerformed
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
                    "Please select a booking to confirm booking.", 
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
                    if (b.getBookingStatus().equals("Requesting Booking")){
                        Main.confirmBooking = new confirmBooking(this, true, LoggedInSalesman.getSalesmanID(), b);
                        Main.confirmBooking.setVisible(true);
                        found = true;
                    }
                    break;
                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(this, 
                    "Please select a booking with status 'Requested Booking'.", 
                    "Invalid Booking", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_confirmBookingActionPerformed
    
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
        bookingModel= new BookingTableModelSalesman(bookings, LoggedInSalesman);
        bookingTable.setModel(bookingModel);
        TableStyler.styleBookingTableSalesman(bookingTable, jScrollPane1);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookingTable;
    private javax.swing.JButton cancelBooking;
    private javax.swing.JButton confirmBooking;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton returnPage;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchBar;
    // End of variables declaration//GEN-END:variables

    
    
}
