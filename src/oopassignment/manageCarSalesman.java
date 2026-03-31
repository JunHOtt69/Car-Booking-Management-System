package oopassignment;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class manageCarSalesman extends javax.swing.JFrame {
    oopassignment.CarTableModelViewOnly carModel = new oopassignment.CarTableModelViewOnly(DataIO.cars);
    ArrayList<Object[]> originalCarData = carModel.getCarData();
    
    private salesman LoggedInSalesman;
    
    public manageCarSalesman(salesman LoggedInSalesman) {
        this.LoggedInSalesman = LoggedInSalesman;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        carTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        returnPage = new javax.swing.JButton();
        search = new javax.swing.JButton();
        searchBar = new javax.swing.JTextField();
        addBooking = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setPreferredSize(new java.awt.Dimension(1200, 720));
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setLayout(new java.awt.BorderLayout());

        carTable.setAutoCreateRowSorter(true);
        carTable.setFont(new java.awt.Font("Arial", 0, 18));
        carTable.setModel(carModel);
        jScrollPane1.setViewportView(carTable);
        TableStyler.styleCarTable(carTable, jScrollPane1);

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

        addBooking.setText("Add New Booking");
        addBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookingActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("View Cars");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(returnPage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                .addComponent(addBooking)
                .addGap(18, 18, 18)
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(search)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(returnPage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(search)
                                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addBooking)))))
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
        Main.manageCarSalesman.setVisible(false);
    }//GEN-LAST:event_returnPageActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String keyword = searchBar.getText().toLowerCase();
        
        ArrayList<Object[]> carData = new ArrayList<>(originalCarData);

        ArrayList<car> searchedCars = new ArrayList<>();

        
        for (Object[] row : carData) {
            String id = (String) row[1];
            String carName = (String) row[2];
            String carType = (String) row[3];
            String carBrand = (String) row[4];
            String carColor = (String) row[5];
            String price = (String) row[6];
            String condition = (String) row[7];
            String mileage = (String) row[8];
            String transmission = (String) row[9];
            String fuelType = (String) row[10];
            String status = (String) row[11];
            
            if (rowContains(row, 1, 10, keyword)){
                car selected = new car(id, carName, carType, carBrand, carColor, price, condition, mileage, transmission, fuelType, status);
                searchedCars.add(selected);
            }
        }
        
        if (searchedCars.isEmpty()){
            JOptionPane.showMessageDialog(this, 
                        "No car found ",
                        "No Result",
                        JOptionPane.ERROR_MESSAGE);
        }
        else{
            refreshPage(searchedCars);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void addBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookingActionPerformed
        Main.addBooking = new addBooking(this, true, LoggedInSalesman.getSalesmanID());
        Main.addBooking.setVisible(true);
    }//GEN-LAST:event_addBookingActionPerformed
    
    public boolean rowContains(Object[] row, int start, int end, String keyword){
        keyword = keyword.toLowerCase();
        for(int i = start; i <= end; i++){
            if ((String)row[i] != null && !((String)row[i]).equals("Empty")){
                if (((String)row[i]).toLowerCase().contains(keyword)) return true;
            }
        }
        return false;
    }
    
    public void refreshPage(ArrayList<car> cars){
        carModel = new CarTableModelViewOnly(cars);
        carTable.setModel(carModel);
        TableStyler.styleCarTable(carTable, jScrollPane1);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBooking;
    private javax.swing.JTable carTable;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton returnPage;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchBar;
    // End of variables declaration//GEN-END:variables

    
    
}
