package oopassignment;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class manageBooking extends javax.swing.JFrame {
    oopassignment.BookingTableModel bookingModel = new oopassignment.BookingTableModel(DataIO.bookings);
    
    ArrayList<Object[]> originalBookingData = bookingModel.getBookingData();

    public manageBooking() {
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
        jLabel3 = new javax.swing.JLabel();
        searchBar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setPreferredSize(new java.awt.Dimension(1200, 720));
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setLayout(new java.awt.BorderLayout());

        bookingTable.setAutoCreateRowSorter(true);
        bookingTable.setFont(new java.awt.Font("Arial", 0, 18));
        bookingTable.setModel(bookingModel);
        jScrollPane1.setViewportView(bookingTable);
        TableStyler.styleBookingTable(bookingTable, jScrollPane1);

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

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("View Bookings");

        searchBar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBarKeyReleased(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 414, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(returnPage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jLabel3))
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
        Main.paymentAnalysis.setVisible(true);
        Main.manageBooking.setVisible(false);
    }//GEN-LAST:event_returnPageActionPerformed

    private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyReleased
        String keyword = searchBar.getText().toLowerCase();
        ArrayList<booking> searchedBookings = new ArrayList<>();

        for (Object[] row : originalBookingData) {
            if (rowContains(row, 0, 9, keyword)) {
                String bookingID = (String) row[0];
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
        bookingModel= new BookingTableModel(bookings);
        bookingTable.setModel(bookingModel);
        TableStyler.styleBookingTable(bookingTable, jScrollPane1);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookingTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton returnPage;
    private javax.swing.JTextField searchBar;
    // End of variables declaration//GEN-END:variables

    
    
}
