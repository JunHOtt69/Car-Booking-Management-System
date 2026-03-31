package oopassignment;

import javax.swing.JOptionPane;

public class cancelBooking extends javax.swing.JDialog {
    private booking selectedBooking;
    private viewBookingSalesman viewBookingSalesman;
   
    public cancelBooking(java.awt.Frame parent, boolean modal, booking selectedBooking, viewBookingSalesman viewBookingSalesman) {
        super(parent, modal);
        this.selectedBooking = selectedBooking;
        this.viewBookingSalesman = viewBookingSalesman;
        initComponents();
        fillFields();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bookingID = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cusID = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        carID = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        carName = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        bookingDate = new javax.swing.JLabel();
        cancelBooking = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Cancel Booking");

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 22));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Booking ID: ");
        jLabel2.setPreferredSize(new java.awt.Dimension(120, 22));
        jPanel1.add(jLabel2, java.awt.BorderLayout.CENTER);

        bookingID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        bookingID.setPreferredSize(new java.awt.Dimension(250, 22));
        jPanel1.add(bookingID, java.awt.BorderLayout.EAST);

        jPanel2.setPreferredSize(new java.awt.Dimension(400, 22));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Customer ID: ");
        jLabel3.setPreferredSize(new java.awt.Dimension(120, 22));
        jPanel2.add(jLabel3, java.awt.BorderLayout.CENTER);

        cusID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cusID.setPreferredSize(new java.awt.Dimension(250, 22));
        jPanel2.add(cusID, java.awt.BorderLayout.EAST);

        jPanel3.setPreferredSize(new java.awt.Dimension(400, 22));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Car ID:");
        jLabel4.setPreferredSize(new java.awt.Dimension(120, 22));
        jPanel3.add(jLabel4, java.awt.BorderLayout.CENTER);

        carID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        carID.setPreferredSize(new java.awt.Dimension(250, 22));
        jPanel3.add(carID, java.awt.BorderLayout.EAST);

        jPanel17.setPreferredSize(new java.awt.Dimension(400, 22));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Car Name:");
        jLabel18.setPreferredSize(new java.awt.Dimension(120, 22));
        jPanel17.add(jLabel18, java.awt.BorderLayout.CENTER);

        carName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        carName.setPreferredSize(new java.awt.Dimension(250, 22));
        jPanel17.add(carName, java.awt.BorderLayout.EAST);

        jPanel18.setPreferredSize(new java.awt.Dimension(400, 22));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jLabel19.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel19.setText("Booking Date:");
        jLabel19.setPreferredSize(new java.awt.Dimension(120, 22));
        jPanel18.add(jLabel19, java.awt.BorderLayout.CENTER);

        bookingDate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        bookingDate.setPreferredSize(new java.awt.Dimension(250, 22));
        jPanel18.add(bookingDate, java.awt.BorderLayout.EAST);

        cancelBooking.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cancelBooking.setForeground(new java.awt.Color(255, 51, 51));
        cancelBooking.setText("Cancel Booking");
        cancelBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBookingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cancelBooking)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelBooking)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBookingActionPerformed
        int result = JOptionPane.showConfirmDialog(
            this,
            "This action cannot be undone.\nAre you sure you want to cancel the selected booking?",
            "Confirm Cancellation",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.WARNING_MESSAGE
        );

        if (result == JOptionPane.OK_OPTION) {
            for (booking b : DataIO.bookings){
                if (b.getBookingID().equals(selectedBooking.getBookingID())){
                    b.setBookingStatus("Canceled");
                for (car c : DataIO.cars){
                    if (c.getCarID().equals(b.getCarID())){
                            c.setCarStatus("Available");
                        }
                    }
                }
            }
            
            DataIO.writeCarData();
            DataIO.writeBookingData();
            JOptionPane.showMessageDialog(this, 
                    "Booking has been canceled : " + selectedBooking.getBookingID(),
                    "Booking Canceled",
                    JOptionPane.INFORMATION_MESSAGE
                    );
            this.dispose();
            viewBookingSalesman.refreshPage(DataIO.bookings);
        } else {
            JOptionPane.showMessageDialog(this, 
                    "Canceled action",
                    "Operation canceled",
                    JOptionPane.INFORMATION_MESSAGE
                    );
        }
    }//GEN-LAST:event_cancelBookingActionPerformed
    
    private void fillFields(){
        bookingID.setText(selectedBooking.getBookingID());
        cusID.setText(selectedBooking.getCustomerID());
        carID.setText(selectedBooking.getCarID());
        for (car Car : DataIO.cars){
            if (Car.getCarID().equals(selectedBooking.getCarID())){
                this.carName.setText(Car.getCarname());
            }
        }
        bookingDate.setText(selectedBooking.getBookingDate());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookingDate;
    private javax.swing.JLabel bookingID;
    private javax.swing.JLabel bookingID10;
    private javax.swing.JLabel bookingID11;
    private javax.swing.JLabel bookingID12;
    private javax.swing.JLabel bookingID13;
    private javax.swing.JLabel bookingID14;
    private javax.swing.JLabel bookingID15;
    private javax.swing.JLabel bookingID3;
    private javax.swing.JLabel bookingID4;
    private javax.swing.JLabel bookingID5;
    private javax.swing.JLabel bookingID6;
    private javax.swing.JLabel bookingID7;
    private javax.swing.JLabel bookingID8;
    private javax.swing.JLabel bookingID9;
    private javax.swing.JButton cancelBooking;
    private javax.swing.JLabel carID;
    private javax.swing.JLabel carName;
    private javax.swing.JLabel cusID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
