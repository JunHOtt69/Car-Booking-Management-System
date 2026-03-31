package oopassignment;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class addCars extends javax.swing.JDialog {
    private manageCar manageCarRef;
    public addCars(java.awt.Frame parent, boolean modal, manageCar ref) {
        super(parent, modal);
        this.manageCarRef = ref;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        carName = new javax.swing.JTextField();
        email_address = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        carType = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        carBrand = new javax.swing.JTextField();
        phoneNumber1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        carColor = new javax.swing.JTextField();
        phoneNumber2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        price = new javax.swing.JTextField();
        phoneNumber3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        create = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        condition = new javax.swing.JTextField();
        email_address2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        mileage = new javax.swing.JTextField();
        phoneNumber4 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        transmission = new javax.swing.JTextField();
        phoneNumber5 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        fuelType = new javax.swing.JTextField();
        phoneNumber6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setPreferredSize(new java.awt.Dimension(500, 50));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Add New Car");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(823, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.NORTH);

        jPanel1.setMinimumSize(new java.awt.Dimension(500, 69));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 370));

        jPanel3.setPreferredSize(new java.awt.Dimension(400, 72));
        jPanel3.setLayout(new java.awt.BorderLayout(5, 5));

        carName.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        carName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carNameActionPerformed(evt);
            }
        });
        jPanel3.add(carName, java.awt.BorderLayout.PAGE_END);

        email_address.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        email_address.setText("Car Name");
        jPanel3.add(email_address, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3);

        jPanel6.setPreferredSize(new java.awt.Dimension(400, 72));
        jPanel6.setLayout(new java.awt.BorderLayout());

        carType.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jPanel6.add(carType, java.awt.BorderLayout.PAGE_END);

        phoneNumber.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        phoneNumber.setText("Car Type");
        jPanel6.add(phoneNumber, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel6);

        jPanel7.setPreferredSize(new java.awt.Dimension(400, 72));
        jPanel7.setLayout(new java.awt.BorderLayout());

        carBrand.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jPanel7.add(carBrand, java.awt.BorderLayout.PAGE_END);

        phoneNumber1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        phoneNumber1.setText("Car Brand");
        jPanel7.add(phoneNumber1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7);

        jPanel9.setPreferredSize(new java.awt.Dimension(400, 72));
        jPanel9.setLayout(new java.awt.BorderLayout());

        carColor.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jPanel9.add(carColor, java.awt.BorderLayout.PAGE_END);

        phoneNumber2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        phoneNumber2.setText("Car Color");
        jPanel9.add(phoneNumber2, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel9);

        jPanel10.setPreferredSize(new java.awt.Dimension(400, 72));
        jPanel10.setLayout(new java.awt.BorderLayout());

        price.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jPanel10.add(price, java.awt.BorderLayout.PAGE_END);

        phoneNumber3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        phoneNumber3.setText("Price (RM)");
        jPanel10.add(phoneNumber3, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel10);

        getContentPane().add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel8.setPreferredSize(new java.awt.Dimension(500, 60));

        create.setText("Create");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(851, Short.MAX_VALUE)
                .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel8, java.awt.BorderLayout.PAGE_END);

        jPanel11.setMinimumSize(new java.awt.Dimension(500, 69));
        jPanel11.setPreferredSize(new java.awt.Dimension(500, 370));

        jPanel12.setPreferredSize(new java.awt.Dimension(400, 72));
        jPanel12.setLayout(new java.awt.BorderLayout(5, 5));

        condition.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        condition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conditionActionPerformed(evt);
            }
        });
        jPanel12.add(condition, java.awt.BorderLayout.PAGE_END);

        email_address2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        email_address2.setText("Condition");
        jPanel12.add(email_address2, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel12);

        jPanel13.setPreferredSize(new java.awt.Dimension(400, 72));
        jPanel13.setLayout(new java.awt.BorderLayout());

        mileage.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jPanel13.add(mileage, java.awt.BorderLayout.PAGE_END);

        phoneNumber4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        phoneNumber4.setText("Mileage (km)");
        jPanel13.add(phoneNumber4, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel13);

        jPanel14.setPreferredSize(new java.awt.Dimension(400, 72));
        jPanel14.setLayout(new java.awt.BorderLayout());

        transmission.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jPanel14.add(transmission, java.awt.BorderLayout.PAGE_END);

        phoneNumber5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        phoneNumber5.setText("Transmission");
        jPanel14.add(phoneNumber5, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel14);

        jPanel15.setPreferredSize(new java.awt.Dimension(400, 72));
        jPanel15.setLayout(new java.awt.BorderLayout());

        fuelType.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jPanel15.add(fuelType, java.awt.BorderLayout.PAGE_END);

        phoneNumber6.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        phoneNumber6.setText("Fuel Type");
        jPanel15.add(phoneNumber6, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel15);

        getContentPane().add(jPanel11, java.awt.BorderLayout.EAST);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void carNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carNameActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        String carname = carName.getText();
        String cartype = carType.getText();
        String carbrand = carBrand.getText();
        String carcolor = carColor.getText();
        String carPrice = price.getText();
        String carCondition = condition.getText();
        String carMileage = mileage.getText();
        String carTransmission = transmission.getText();
        String carFuelType = fuelType.getText();
        
        try{
            if (!registerPage.checkIsNumber (carPrice) || !registerPage.checkIsNumber (carMileage)){
                    return;
            }
            
            String carID = car.generateCarID();
            String status = "Available";
            car newCar = new car(carID, carname, cartype, carbrand, carcolor, carPrice, carCondition, carMileage, carTransmission, carFuelType, status);
            DataIO.cars.add(newCar);
            DataIO.writeCarData();
            resetFieldDefault();
            JOptionPane.showMessageDialog(this,
                    "Car Created. \nCar ID: " + carID,
                    "Successfully create new car",
                    JOptionPane.INFORMATION_MESSAGE);
            if (manageCarRef != null) {
                manageCarRef.refreshPage(DataIO.cars);
            }
        }
        catch(HeadlessException ex){
            JOptionPane.showMessageDialog(this, 
                        "Invalid Input",
                        "Try again",
                        JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_createActionPerformed
    
    private void resetFieldDefault(){
        carName.setText("");
        carType.setText("");
        carBrand.setText("");
        carColor.setText("");
        price.setText("");
        condition.setText("");
        mileage.setText("");
        transmission.setText("");
        fuelType.setText("");
    }
    
    private void conditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conditionActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField carBrand;
    private javax.swing.JTextField carColor;
    private javax.swing.JTextField carName;
    private javax.swing.JTextField carType;
    private javax.swing.JTextField condition;
    private javax.swing.JButton create;
    private javax.swing.JLabel email_address;
    private javax.swing.JLabel email_address2;
    private javax.swing.JTextField fuelType;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField mileage;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JLabel phoneNumber1;
    private javax.swing.JLabel phoneNumber2;
    private javax.swing.JLabel phoneNumber3;
    private javax.swing.JLabel phoneNumber4;
    private javax.swing.JLabel phoneNumber5;
    private javax.swing.JLabel phoneNumber6;
    private javax.swing.JTextField price;
    private javax.swing.JTextField transmission;
    // End of variables declaration//GEN-END:variables
}
