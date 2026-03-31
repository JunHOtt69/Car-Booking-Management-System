package oopassignment;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class confirmBooking extends javax.swing.JDialog{
    private viewBookingSalesman parent;
    private String salesmanID;
    private booking selectedBooking;
    private Customer selectedCustomer;
    private car selectedCar;
    private String date;
    private double payableAmount;
    
    public confirmBooking(java.awt.Frame parent, boolean modal, String salesmanID, booking selectedBooking) {
        super(parent, modal);
        this.parent = (viewBookingSalesman) parent;
        this.salesmanID = salesmanID;
        this.date = LocalDate.now().toString();
        this.selectedCar = null;
        this.selectedCustomer = null;
        this.selectedBooking = selectedBooking;
        for (car c : DataIO.cars){
            if(c.getCarID().equals(selectedBooking.getCarID())){
                this.selectedCar = c;
                break;
            }
        }
        if (this.selectedCar == null){
            JOptionPane.showMessageDialog(this,
                    "Car not found, or car is currently not available",
                    "Unavailable Car",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        for (Customer c : DataIO.customers){
            if(c.getCustomerID().equals(selectedBooking.getCustomerID())){
                this.selectedCustomer = c;
                break;
            }
        }
        if (this.selectedCustomer == null){
            JOptionPane.showMessageDialog(this,
                    "Customer not found",
                    "Unavailable Customer",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        initComponents();
        fillFields();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        car = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        mileage = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        transmission = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        fuelType = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        condition = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        carColor = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        carID = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        bookingID = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        carName = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        carType = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        carBrand = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        customer = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        icNo = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        licenseNo = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jPanel30 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        fullName = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        paymentSection = new javax.swing.JPanel();
        confirmBooking = new javax.swing.JButton();
        account = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        bankAccount = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        deposit = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        totalPayableAmount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel10.setPreferredSize(new java.awt.Dimension(400, 320));

        jPanel11.setPreferredSize(new java.awt.Dimension(340, 34));
        jPanel11.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("Mileage: ");
        jLabel13.setMinimumSize(new java.awt.Dimension(80, 22));
        jLabel13.setPreferredSize(new java.awt.Dimension(120, 22));
        jPanel11.add(jLabel13, java.awt.BorderLayout.WEST);

        mileage.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel11.add(mileage, java.awt.BorderLayout.CENTER);

        jPanel12.setPreferredSize(new java.awt.Dimension(340, 34));
        jPanel12.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setText("Transmission:");
        jLabel15.setMinimumSize(new java.awt.Dimension(100, 22));
        jLabel15.setPreferredSize(new java.awt.Dimension(120, 22));
        jPanel12.add(jLabel15, java.awt.BorderLayout.WEST);

        transmission.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel12.add(transmission, java.awt.BorderLayout.CENTER);

        jPanel13.setPreferredSize(new java.awt.Dimension(340, 34));
        jPanel13.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel17.setText("Fuel Type: ");
        jLabel17.setMinimumSize(new java.awt.Dimension(80, 22));
        jLabel17.setPreferredSize(new java.awt.Dimension(120, 22));
        jPanel13.add(jLabel17, java.awt.BorderLayout.WEST);

        fuelType.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel13.add(fuelType, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        jPanel9.setPreferredSize(new java.awt.Dimension(340, 34));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Condition: ");
        jLabel11.setMinimumSize(new java.awt.Dimension(80, 22));
        jLabel11.setPreferredSize(new java.awt.Dimension(100, 22));
        jPanel9.add(jLabel11, java.awt.BorderLayout.WEST);

        condition.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        condition.setPreferredSize(new java.awt.Dimension(250, 0));
        jPanel9.add(condition, java.awt.BorderLayout.CENTER);

        jPanel20.setPreferredSize(new java.awt.Dimension(340, 34));
        jPanel20.setLayout(new java.awt.BorderLayout());

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Color : ");
        jLabel18.setMinimumSize(new java.awt.Dimension(80, 22));
        jLabel18.setPreferredSize(new java.awt.Dimension(100, 22));
        jPanel20.add(jLabel18, java.awt.BorderLayout.WEST);

        carColor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        carColor.setPreferredSize(new java.awt.Dimension(250, 0));
        jPanel20.add(carColor, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 320));

        jPanel3.setPreferredSize(new java.awt.Dimension(320, 34));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Car ID: ");
        jPanel3.add(jLabel1, java.awt.BorderLayout.WEST);

        carID.setEditable(false);
        carID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        carID.setPreferredSize(new java.awt.Dimension(250, 28));
        jPanel3.add(carID, java.awt.BorderLayout.EAST);

        jPanel5.setPreferredSize(new java.awt.Dimension(379, 40));

        bookingID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        bookingID.setText("Confirm Booking ID:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(bookingID)
                .addGap(0, 217, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookingID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setPreferredSize(new java.awt.Dimension(340, 68));
        jPanel4.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Car Name: ");
        jLabel2.setMinimumSize(new java.awt.Dimension(80, 22));
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 22));
        jPanel4.add(jLabel2, java.awt.BorderLayout.WEST);

        carName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel4.add(carName, java.awt.BorderLayout.CENTER);

        jPanel6.setPreferredSize(new java.awt.Dimension(340, 34));
        jPanel6.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Type: ");
        jLabel5.setMinimumSize(new java.awt.Dimension(80, 22));
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 22));
        jPanel6.add(jLabel5, java.awt.BorderLayout.WEST);

        carType.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel6.add(carType, java.awt.BorderLayout.CENTER);

        jPanel7.setPreferredSize(new java.awt.Dimension(340, 34));
        jPanel7.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Brand: ");
        jLabel7.setMinimumSize(new java.awt.Dimension(80, 22));
        jLabel7.setPreferredSize(new java.awt.Dimension(100, 22));
        jPanel7.add(jLabel7, java.awt.BorderLayout.WEST);

        carBrand.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel7.add(carBrand, java.awt.BorderLayout.CENTER);

        jPanel8.setPreferredSize(new java.awt.Dimension(340, 34));
        jPanel8.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Price:  ");
        jLabel9.setMinimumSize(new java.awt.Dimension(80, 22));
        jLabel9.setPreferredSize(new java.awt.Dimension(100, 22));
        jPanel8.add(jLabel9, java.awt.BorderLayout.WEST);

        price.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel8.add(price, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(50, 320));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout carLayout = new javax.swing.GroupLayout(car);
        car.setLayout(carLayout);
        carLayout.setHorizontalGroup(
            carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
            .addGroup(carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(carLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        carLayout.setVerticalGroup(
            carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
            .addGroup(carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(carLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(car, java.awt.BorderLayout.NORTH);

        customer.setPreferredSize(new java.awt.Dimension(835, 170));
        customer.setLayout(new java.awt.BorderLayout());

        jPanel17.setPreferredSize(new java.awt.Dimension(400, 120));

        jPanel18.setPreferredSize(new java.awt.Dimension(370, 34));
        jPanel18.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setText("IC Number: ");
        jLabel14.setMinimumSize(new java.awt.Dimension(80, 22));
        jLabel14.setPreferredSize(new java.awt.Dimension(150, 22));
        jPanel18.add(jLabel14, java.awt.BorderLayout.WEST);

        icNo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        icNo.setPreferredSize(new java.awt.Dimension(250, 0));
        jPanel18.add(icNo, java.awt.BorderLayout.CENTER);

        jPanel25.setPreferredSize(new java.awt.Dimension(370, 34));
        jPanel25.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setText("License Number:");
        jLabel16.setMinimumSize(new java.awt.Dimension(100, 22));
        jLabel16.setPreferredSize(new java.awt.Dimension(150, 22));
        jPanel25.add(jLabel16, java.awt.BorderLayout.WEST);

        licenseNo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        licenseNo.setPreferredSize(new java.awt.Dimension(250, 0));
        jPanel25.add(licenseNo, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        customer.add(jPanel17, java.awt.BorderLayout.EAST);

        jPanel27.setPreferredSize(new java.awt.Dimension(400, 120));

        jPanel28.setPreferredSize(new java.awt.Dimension(390, 34));
        jPanel28.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Customer Email: ");
        jPanel28.add(jLabel3, java.awt.BorderLayout.WEST);

        email.setEditable(false);
        email.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        email.setPreferredSize(new java.awt.Dimension(250, 28));
        jPanel28.add(email, java.awt.BorderLayout.EAST);

        jPanel30.setPreferredSize(new java.awt.Dimension(340, 34));
        jPanel30.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Username: ");
        jLabel8.setMinimumSize(new java.awt.Dimension(80, 22));
        jLabel8.setPreferredSize(new java.awt.Dimension(130, 22));
        jPanel30.add(jLabel8, java.awt.BorderLayout.WEST);

        username.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel30.add(username, java.awt.BorderLayout.CENTER);

        jPanel31.setPreferredSize(new java.awt.Dimension(340, 34));
        jPanel31.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Full Name: ");
        jLabel10.setMinimumSize(new java.awt.Dimension(80, 22));
        jLabel10.setPreferredSize(new java.awt.Dimension(130, 22));
        jPanel31.add(jLabel10, java.awt.BorderLayout.WEST);

        fullName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel31.add(fullName, java.awt.BorderLayout.CENTER);

        jPanel32.setPreferredSize(new java.awt.Dimension(340, 34));
        jPanel32.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Phone Number: ");
        jLabel12.setMinimumSize(new java.awt.Dimension(80, 22));
        jPanel32.add(jLabel12, java.awt.BorderLayout.WEST);

        phoneNumber.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel32.add(phoneNumber, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        customer.add(jPanel27, java.awt.BorderLayout.CENTER);

        jPanel35.setPreferredSize(new java.awt.Dimension(50, 120));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );

        customer.add(jPanel35, java.awt.BorderLayout.WEST);

        getContentPane().add(customer, java.awt.BorderLayout.CENTER);

        paymentSection.setPreferredSize(new java.awt.Dimension(850, 200));

        confirmBooking.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        confirmBooking.setText("Confirm Booking");
        confirmBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBookingActionPerformed(evt);
            }
        });

        account.setPreferredSize(new java.awt.Dimension(390, 34));

        javax.swing.GroupLayout accountLayout = new javax.swing.GroupLayout(account);
        account.setLayout(accountLayout);
        accountLayout.setHorizontalGroup(
            accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        accountLayout.setVerticalGroup(
            accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanel15.setPreferredSize(new java.awt.Dimension(340, 34));
        jPanel15.setLayout(new java.awt.BorderLayout(5, 0));

        bankAccount.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        bankAccount.setPreferredSize(new java.awt.Dimension(250, 28));
        jPanel15.add(bankAccount, java.awt.BorderLayout.EAST);

        jLabel22.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel22.setText("Bank Account: ");
        jLabel22.setMinimumSize(new java.awt.Dimension(80, 22));
        jLabel22.setPreferredSize(new java.awt.Dimension(190, 22));
        jPanel15.add(jLabel22, java.awt.BorderLayout.WEST);

        jPanel16.setPreferredSize(new java.awt.Dimension(450, 34));
        jPanel16.setLayout(new java.awt.BorderLayout(5, 0));

        deposit.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        deposit.setText("RM");
        deposit.setPreferredSize(new java.awt.Dimension(250, 34));
        jPanel16.add(deposit, java.awt.BorderLayout.EAST);

        jLabel25.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel25.setText("Deposit:");
        jLabel25.setPreferredSize(new java.awt.Dimension(190, 22));
        jPanel16.add(jLabel25, java.awt.BorderLayout.WEST);

        jPanel19.setLayout(new java.awt.BorderLayout(5, 0));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel21.setText("Total Payable Amount:");
        jLabel21.setPreferredSize(new java.awt.Dimension(190, 22));
        jPanel19.add(jLabel21, java.awt.BorderLayout.WEST);

        totalPayableAmount.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        totalPayableAmount.setText("RM");
        totalPayableAmount.setPreferredSize(new java.awt.Dimension(250, 34));
        jPanel19.add(totalPayableAmount, java.awt.BorderLayout.EAST);

        javax.swing.GroupLayout paymentSectionLayout = new javax.swing.GroupLayout(paymentSection);
        paymentSection.setLayout(paymentSectionLayout);
        paymentSectionLayout.setHorizontalGroup(
            paymentSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentSectionLayout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(account, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addGap(228, 228, 228))
            .addGroup(paymentSectionLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(paymentSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmBooking)
                .addGap(68, 68, 68))
        );
        paymentSectionLayout.setVerticalGroup(
            paymentSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentSectionLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paymentSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentSectionLayout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(confirmBooking))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(paymentSection, java.awt.BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBookingActionPerformed
        String bankAccount = this.bankAccount.getText().trim();
        
        if (bankAccount.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                    "Bank account must not be empty.", 
                    "Input Error", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!checkIsNumber(bankAccount)){
            return;
        }
        
        for (booking Booking : DataIO.bookings){
            if (Booking.getBookingID().equals(selectedBooking.getBookingID())){
                Booking.setCommission("0");
                Booking.setBookingDate(date);
                Booking.setBookingStatus("Booked");
            }
            if (!Booking.getBookingID().equals(selectedBooking.getBookingID())&& 
                Booking.getCarID().equals(selectedCar.getCarID()) &&
                !Booking.getBookingStatus().equals("Booked") &&
                !Booking.getBookingStatus().equals("Canceled")){
                Booking.setBookingStatus("Request Declined");
            }
        }

        selectedCar.setCarStatus("Booked");
        for (int i = 0; i < DataIO.cars.size(); i++) {
            if (DataIO.cars.get(i).getCarID().equals(selectedCar.getCarID())) {
                DataIO.cars.set(i, selectedCar);
                break;
            }
        }

        DataIO.writeBookingData();
        DataIO.writeCarData();

        JOptionPane.showMessageDialog(this,
            "Booking successful!\nCar ID: " + carID.getText().trim() +
            "\nCustomer ID: " + selectedCustomer.getCustomerID() +
            "\nBooking ID: " + selectedCar.getCarID(), 
            "Success", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        
        parent.refreshPage(DataIO.bookings);
    }//GEN-LAST:event_confirmBookingActionPerformed
   
    private void fillFields(){
        carID.setText(selectedCar.getCarID());
        String carName = selectedCar.getCarname(); 
        String wrappedText = "<html><body style='width:150px; text-algin:left;'>" + carName + "</body></html>";
        this.carName.setText(wrappedText);
        carType.setText(selectedCar.getCarType());
        carBrand.setText(selectedCar.getCarBrand());
        mileage.setText(selectedCar.getMileage());
        condition.setText(selectedCar.getCondition());
        carColor.setText(selectedCar.getCarColor());
        String priceStr = selectedCar.getPrice();
        try {
            double price = Double.parseDouble(priceStr);
            String formattedPrice = String.format("RM %,.2f", price);
            this.price.setText(formattedPrice);
            this.payableAmount = price;
            double maxDeposit = (1.0 / 100.0) * price;
            double deposit = Math.max(300, maxDeposit);
            double totalPayableAmount = price - deposit;
            this.totalPayableAmount.setText(String.format("RM %,.2f", totalPayableAmount));
            this.deposit.setText(String.format("RM %,.2f (1%% max)", deposit));
            
        } catch (NumberFormatException e) {
            this.price.setText("RM 0.00");
            System.err.println("Invalid price format: " + priceStr);
        }
        condition.setText(selectedCar.getCondition());
        transmission.setText(selectedCar.getTransmission());
        fuelType.setText(selectedCar.getFuelType());
        
        email.setText(selectedCustomer.getCustomerEmail());
        username.setText(selectedCustomer.getCustomerUsername());
        fullName.setText(selectedCustomer.getCustomerFullName());
        phoneNumber.setText(selectedCustomer.getCustomerPhoneNumber());
        icNo.setText(selectedCustomer.getCustomerICNo());
        licenseNo.setText(selectedCustomer.getCustomerLicenseNo());
    }

    public static boolean checkIsNumber (String string){
        try {
            Long.parseLong(string); 
            return true;
        }catch (NumberFormatException x) {
            JOptionPane.showMessageDialog(null, 
                "Invalid number. Please enter digits only.",
                "Try again",
                JOptionPane.ERROR_MESSAGE); 
                return false;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel account;
    private javax.swing.JTextField bankAccount;
    private javax.swing.JLabel bookingID;
    private javax.swing.JPanel car;
    private javax.swing.JLabel carBrand;
    private javax.swing.JLabel carColor;
    private javax.swing.JTextField carID;
    private javax.swing.JLabel carName;
    private javax.swing.JLabel carType;
    private javax.swing.JLabel condition;
    private javax.swing.JButton confirmBooking;
    private javax.swing.JPanel customer;
    private javax.swing.JLabel deposit;
    private javax.swing.JTextField email;
    private javax.swing.JLabel fuelType;
    private javax.swing.JLabel fullName;
    private javax.swing.JLabel icNo;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel licenseNo;
    private javax.swing.JLabel mileage;
    private javax.swing.JPanel paymentSection;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JLabel price;
    private javax.swing.JLabel totalPayableAmount;
    private javax.swing.JLabel transmission;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
