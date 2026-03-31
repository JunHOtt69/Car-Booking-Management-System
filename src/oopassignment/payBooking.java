package oopassignment;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class payBooking extends javax.swing.JDialog{
    private viewBookingCustomer parent;
    private car selectedCar;
    private Customer selectedCustomer;
    private booking selectedBooking;
    private double originalPrice;
    private int totalSales;
    private double totalCommissions;
    private String date;
    private double downPaymentAmount;
    private double downPaymentRate;
    
    public payBooking(java.awt.Frame parent, boolean modal, booking selectedBooking, Customer selectedCustomer) {
        super(parent, modal);
        this.parent = (viewBookingCustomer)parent;
        this.selectedBooking = selectedBooking;
        this.selectedCustomer = selectedCustomer;
        this.date = LocalDate.now().toString();
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
        initComponents();
        fillFields(selectedCar);
        setVisible();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        car = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        fullName = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        icNo = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        licenseNo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bookingID = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        carID = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        carName = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        bookingDate = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        paymentSection = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        pay = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        totalPayableAmount = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        deposit = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        paymentMethod = new javax.swing.JComboBox<>();
        account = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        bankAccount = new javax.swing.JTextField();
        downP = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        downPayment = new javax.swing.JTextField();
        loanT = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        loanTerm = new javax.swing.JComboBox<>();
        jPanel33 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        loanAmount = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        interest = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        car.setPreferredSize(new java.awt.Dimension(850, 380));
        car.setLayout(new java.awt.BorderLayout());

        jPanel10.setPreferredSize(new java.awt.Dimension(400, 400));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Customer Information ");

        jPanel28.setPreferredSize(new java.awt.Dimension(360, 34));
        jPanel28.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Customer Email: ");
        jLabel3.setPreferredSize(new java.awt.Dimension(140, 22));
        jPanel28.add(jLabel3, java.awt.BorderLayout.WEST);

        email.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel28.add(email, java.awt.BorderLayout.CENTER);

        jPanel30.setPreferredSize(new java.awt.Dimension(360, 34));
        jPanel30.setLayout(new java.awt.BorderLayout());

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Username: ");
        jLabel8.setMinimumSize(new java.awt.Dimension(80, 22));
        jLabel8.setPreferredSize(new java.awt.Dimension(140, 22));
        jPanel30.add(jLabel8, java.awt.BorderLayout.WEST);

        username.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel30.add(username, java.awt.BorderLayout.CENTER);

        jPanel31.setPreferredSize(new java.awt.Dimension(360, 34));
        jPanel31.setLayout(new java.awt.BorderLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Full Name: ");
        jLabel10.setMinimumSize(new java.awt.Dimension(80, 22));
        jLabel10.setPreferredSize(new java.awt.Dimension(140, 22));
        jPanel31.add(jLabel10, java.awt.BorderLayout.WEST);

        fullName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel31.add(fullName, java.awt.BorderLayout.CENTER);

        jPanel32.setPreferredSize(new java.awt.Dimension(360, 34));
        jPanel32.setLayout(new java.awt.BorderLayout());

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Phone Number: ");
        jLabel12.setMinimumSize(new java.awt.Dimension(80, 22));
        jLabel12.setPreferredSize(new java.awt.Dimension(140, 22));
        jPanel32.add(jLabel12, java.awt.BorderLayout.WEST);

        phoneNumber.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel32.add(phoneNumber, java.awt.BorderLayout.CENTER);

        jPanel18.setPreferredSize(new java.awt.Dimension(360, 34));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setText("IC Number: ");
        jLabel14.setMinimumSize(new java.awt.Dimension(80, 22));
        jLabel14.setPreferredSize(new java.awt.Dimension(150, 22));
        jPanel18.add(jLabel14, java.awt.BorderLayout.WEST);

        icNo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        icNo.setPreferredSize(new java.awt.Dimension(250, 0));
        jPanel18.add(icNo, java.awt.BorderLayout.CENTER);

        jPanel25.setPreferredSize(new java.awt.Dimension(360, 34));
        jPanel25.setLayout(new java.awt.BorderLayout());

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setText("License Number:");
        jLabel16.setMinimumSize(new java.awt.Dimension(100, 22));
        jLabel16.setPreferredSize(new java.awt.Dimension(150, 22));
        jPanel25.add(jLabel16, java.awt.BorderLayout.WEST);

        licenseNo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        licenseNo.setPreferredSize(new java.awt.Dimension(250, 0));
        jPanel25.add(licenseNo, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        car.add(jPanel10, java.awt.BorderLayout.EAST);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 320));

        jPanel5.setPreferredSize(new java.awt.Dimension(379, 40));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("Confirm Booking Payment");
        jPanel5.add(jLabel4, java.awt.BorderLayout.CENTER);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Booking Summary ");

        jPanel3.setPreferredSize(new java.awt.Dimension(360, 34));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Booking ID: ");
        jLabel1.setPreferredSize(new java.awt.Dimension(120, 22));
        jLabel1.setRequestFocusEnabled(false);
        jPanel3.add(jLabel1, java.awt.BorderLayout.WEST);

        bookingID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel3.add(bookingID, java.awt.BorderLayout.CENTER);

        jPanel6.setPreferredSize(new java.awt.Dimension(360, 34));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Car ID: ");
        jLabel5.setPreferredSize(new java.awt.Dimension(120, 22));
        jLabel5.setRequestFocusEnabled(false);
        jPanel6.add(jLabel5, java.awt.BorderLayout.WEST);

        carID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel6.add(carID, java.awt.BorderLayout.CENTER);

        jPanel4.setPreferredSize(new java.awt.Dimension(360, 68));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Car Name: ");
        jLabel2.setMinimumSize(new java.awt.Dimension(80, 22));
        jLabel2.setPreferredSize(new java.awt.Dimension(120, 22));
        jLabel2.setRequestFocusEnabled(false);
        jPanel4.add(jLabel2, java.awt.BorderLayout.WEST);

        carName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel4.add(carName, java.awt.BorderLayout.CENTER);

        jPanel7.setPreferredSize(new java.awt.Dimension(360, 34));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Price: ");
        jLabel7.setMinimumSize(new java.awt.Dimension(80, 22));
        jLabel7.setPreferredSize(new java.awt.Dimension(120, 22));
        jLabel7.setRequestFocusEnabled(false);
        jPanel7.add(jLabel7, java.awt.BorderLayout.WEST);

        price.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel7.add(price, java.awt.BorderLayout.CENTER);

        jPanel9.setPreferredSize(new java.awt.Dimension(360, 34));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("Booking Date: ");
        jLabel13.setMinimumSize(new java.awt.Dimension(80, 22));
        jLabel13.setPreferredSize(new java.awt.Dimension(120, 22));
        jLabel13.setRequestFocusEnabled(false);
        jPanel9.add(jLabel13, java.awt.BorderLayout.WEST);

        bookingDate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel9.add(bookingDate, java.awt.BorderLayout.CENTER);

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
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        car.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setPreferredSize(new java.awt.Dimension(50, 320));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        car.add(jPanel2, java.awt.BorderLayout.WEST);

        getContentPane().add(car, java.awt.BorderLayout.NORTH);

        paymentSection.setPreferredSize(new java.awt.Dimension(850, 330));
        paymentSection.setLayout(new java.awt.BorderLayout());

        jPanel20.setPreferredSize(new java.awt.Dimension(400, 300));

        pay.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pay.setText("Pay");
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });

        jPanel8.setLayout(new java.awt.BorderLayout(5, 5));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel21.setText("Total Payable Amount:");
        jLabel21.setMinimumSize(new java.awt.Dimension(230, 22));
        jPanel8.add(jLabel21, java.awt.BorderLayout.PAGE_START);

        totalPayableAmount.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        totalPayableAmount.setText("RM");
        totalPayableAmount.setPreferredSize(new java.awt.Dimension(230, 22));
        jPanel8.add(totalPayableAmount, java.awt.BorderLayout.PAGE_END);

        jPanel11.setLayout(new java.awt.BorderLayout(5, 5));

        deposit.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        deposit.setText("RM");
        deposit.setPreferredSize(new java.awt.Dimension(230, 22));
        jPanel11.add(deposit, java.awt.BorderLayout.CENTER);

        jLabel25.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel25.setText("Paid Deposit:");
        jLabel25.setPreferredSize(new java.awt.Dimension(230, 22));
        jPanel11.add(jLabel25, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(58, 58, 58)
                        .addComponent(pay)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pay)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        paymentSection.add(jPanel20, java.awt.BorderLayout.EAST);

        jPanel29.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText("Payment Details ");

        jPanel21.setPreferredSize(new java.awt.Dimension(390, 34));
        jPanel21.setLayout(new java.awt.BorderLayout(5, 5));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel20.setText("Payment Method: ");
        jLabel20.setMinimumSize(new java.awt.Dimension(80, 22));
        jLabel20.setPreferredSize(new java.awt.Dimension(150, 22));
        jPanel21.add(jLabel20, java.awt.BorderLayout.WEST);

        paymentMethod.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        paymentMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Payment Method", "Full Payment", "Loan Payment" }));
        paymentMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentMethodActionPerformed(evt);
            }
        });
        jPanel21.add(paymentMethod, java.awt.BorderLayout.EAST);

        account.setPreferredSize(new java.awt.Dimension(390, 34));
        account.setLayout(new java.awt.BorderLayout(5, 5));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel22.setText("Bank Account: ");
        jLabel22.setMinimumSize(new java.awt.Dimension(80, 22));
        jLabel22.setPreferredSize(new java.awt.Dimension(130, 22));
        account.add(jLabel22, java.awt.BorderLayout.WEST);

        bankAccount.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        bankAccount.setPreferredSize(new java.awt.Dimension(230, 28));
        account.add(bankAccount, java.awt.BorderLayout.EAST);

        downP.setPreferredSize(new java.awt.Dimension(390, 34));
        downP.setLayout(new java.awt.BorderLayout(5, 5));

        jLabel23.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel23.setText("Down Payment(%): ");
        jLabel23.setMinimumSize(new java.awt.Dimension(80, 22));
        jLabel23.setPreferredSize(new java.awt.Dimension(160, 22));
        downP.add(jLabel23, java.awt.BorderLayout.WEST);

        downPayment.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        downPayment.setPreferredSize(new java.awt.Dimension(230, 28));
        downPayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                downPaymentKeyReleased(evt);
            }
        });
        downP.add(downPayment, java.awt.BorderLayout.EAST);

        loanT.setPreferredSize(new java.awt.Dimension(390, 34));
        loanT.setLayout(new java.awt.BorderLayout(5, 5));

        jLabel27.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel27.setText("Loan Term (year): ");
        jLabel27.setMinimumSize(new java.awt.Dimension(80, 22));
        jLabel27.setPreferredSize(new java.awt.Dimension(160, 22));
        loanT.add(jLabel27, java.awt.BorderLayout.WEST);

        loanTerm.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        loanTerm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "5", "7", "9" }));
        loanTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanTermActionPerformed(evt);
            }
        });
        loanT.add(loanTerm, java.awt.BorderLayout.EAST);

        jPanel33.setPreferredSize(new java.awt.Dimension(340, 34));
        jPanel33.setLayout(new java.awt.BorderLayout(5, 5));

        jLabel24.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel24.setText("Loan Amount: ");
        jLabel24.setMinimumSize(new java.awt.Dimension(80, 22));
        jLabel24.setPreferredSize(new java.awt.Dimension(130, 22));
        jPanel33.add(jLabel24, java.awt.BorderLayout.WEST);

        loanAmount.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        loanAmount.setPreferredSize(new java.awt.Dimension(370, 0));
        jPanel33.add(loanAmount, java.awt.BorderLayout.CENTER);

        jPanel36.setPreferredSize(new java.awt.Dimension(340, 34));
        jPanel36.setLayout(new java.awt.BorderLayout(5, 5));

        jLabel28.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel28.setText("Interest/ year: ");
        jLabel28.setMinimumSize(new java.awt.Dimension(80, 22));
        jLabel28.setPreferredSize(new java.awt.Dimension(130, 22));
        jPanel36.add(jLabel28, java.awt.BorderLayout.WEST);

        interest.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        interest.setPreferredSize(new java.awt.Dimension(370, 0));
        jPanel36.add(interest, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(account, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(downP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loanT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(downP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loanT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        paymentSection.add(jPanel29, java.awt.BorderLayout.CENTER);

        jPanel38.setPreferredSize(new java.awt.Dimension(50, 100));

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        paymentSection.add(jPanel38, java.awt.BorderLayout.WEST);

        getContentPane().add(paymentSection, java.awt.BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        String bankAccount = this.bankAccount.getText().trim();
        String downPayment = this.downPayment.getText().trim();
        String loanTerm = (String) this.loanTerm.getSelectedItem();
        double price = Double.parseDouble(selectedCar.getPrice());
        double commission = price * 0.03;
        String commissionStr = String.format("%.2f", commission);
        String downPStr = String.format("%.2f", this.downPaymentAmount);
        if (!checkIsNumber(bankAccount)){
                return;
        }
       
        if (((String) paymentMethod.getSelectedItem()).equals("Loan Payment")) {
            if (bankAccount.isEmpty() || downPayment.isEmpty()) {
                JOptionPane.showMessageDialog(this, 
                        "Bank account and down payment must not be empty.", 
                        "Input Error", 
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!checkIsNumber(bankAccount) || !checkIsNumber(downPayment) ){
                return;
            }

            String paymentID = payment.generatePaymentID();
            payment newPayment = new payment(
                paymentID,
                selectedBooking.getBookingID(),
                selectedCustomer.getCustomerID(),
                deposit.getText().replace("RM", "").replace(",", "").trim(),
                (String) paymentMethod.getSelectedItem(),
                totalPayableAmount.getText().replace("RM", "").replace(",", "").trim(),
                bankAccount,
                downPStr,
                Double.toString(this.downPaymentRate),
                loanAmount.getText().replace("RM", "").replace(",", "").trim(),
                loanTerm,
                interest.getText().replace("%", "").trim(),
                date
            );

            DataIO.payments.add(newPayment);

            for (booking Booking : DataIO.bookings){
                if (Booking.getBookingID().equals(selectedBooking.getBookingID()) && 
                        Booking.getBookingStatus().equals("Booked")){
                    Booking.setBookingStatus("Paid");
                    Booking.setPaymentID(paymentID);
                    Booking.setCommission(commissionStr);
                }
            }
            
            selectedCar.setCarStatus("Sold");
            
            for (int i = 0; i < DataIO.cars.size(); i++) {
                if (DataIO.cars.get(i).getCarID().equals(selectedCar.getCarID())) {
                    DataIO.cars.set(i, selectedCar);
                    break;
                }
            }
            
            for (salesman s : DataIO.salesmen){
                if(s.getSalesmanID().equals(selectedBooking.getSalesmanID())){
                    try{
                        int totalSales = Integer.parseInt(s.getSalesmanTotalSales());
                        this.totalSales = ++totalSales;
                    }
                    catch (NumberFormatException e) {
                        this.totalSales = 0;
                    }
                    try{
                        double totalCommissions = Double.parseDouble(s.getSalesmanTotalCommissions());
                        this.totalCommissions = totalCommissions + commission;
                    }
                    catch (NumberFormatException e) {
                        this.totalCommissions = 0;
                    }
                    
                    s.setSalesmanTotalSales(Integer.toString(totalSales));
                    s.setSalesmanTotalCommissions(Double.toString(totalCommissions));
                }
            }
            
            DataIO.writeSalesmanData();
            DataIO.writeBookingData();
            DataIO.writePaymentData();
            DataIO.writeCarData();

            JOptionPane.showMessageDialog(this,
                "Booking paid successful!" + 
                "\nBooking ID: " + selectedBooking.getBookingID() +
                "\nPayment ID: " + paymentID,
                "Success", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
        else if (((String) paymentMethod.getSelectedItem()).equals("Full Payment")){
            String paymentID = payment.generatePaymentID(); 
            payment newPayment = new payment(
                paymentID,
                selectedBooking.getBookingID(),
                selectedCustomer.getCustomerID(),
                deposit.getText().replace("RM", "").replace(",", "").trim(),
                (String) paymentMethod.getSelectedItem(),
                selectedCar.getPrice(),
                bankAccount,
                "0.00", //down payment
                "0.00", //down payment rate
                "0.00", //loan amount
                "0",    //loan term
                interest.getText().replace("%", "").trim(),
                date
            );

            DataIO.payments.add(newPayment);

             selectedCar.setCarStatus("Booked");
            for (int i = 0; i < DataIO.cars.size(); i++) {
                if (DataIO.cars.get(i).getCarID().equals(selectedCar.getCarID())) {
                    DataIO.cars.set(i, selectedCar);
                    break;
                }
            }
            
            for (salesman s : DataIO.salesmen){
                if(s.getSalesmanID().equals(selectedBooking.getSalesmanID())){
                    try{
                        int totalSales = Integer.parseInt(s.getSalesmanTotalSales());
                        this.totalSales = totalSales++;
                    }
                    catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this,
                            "Error in converting total sales.",
                            "Number Conversion Error",
                            JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    try{
                        double totalCommissions = Double.parseDouble(s.getSalesmanTotalCommissions());
                        this.totalCommissions = totalCommissions + commission;
                    }
                    catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this,
                            "Error in converting total commissions.",
                            "Number Conversion Error",
                            JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    
                    s.setSalesmanTotalSales(Integer.toString(totalSales));
                    s.setSalesmanTotalCommissions(Double.toString(totalCommissions));
                }
            }

            DataIO.writeBookingData();
            DataIO.writePaymentData();
            DataIO.writeCarData();

            JOptionPane.showMessageDialog(this,
                "Booking successful!\nCar ID: " + bookingID.getText().trim() +
                "\nCustomer ID: " + selectedCustomer.getCustomerID() +
                "\nBooking ID: " + bookingID +
                "\nPayment ID: " + paymentID,
                "Success", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this,
                "Booking could not be completed.\\nPlease check the payment method or contact support.",
                "Booking Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        parent.refreshPage(DataIO.bookings);
    }//GEN-LAST:event_payActionPerformed

    private void paymentMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentMethodActionPerformed
        String selected = (String) paymentMethod.getSelectedItem();
    
        jLabel21.setVisible(false);
        totalPayableAmount.setVisible(false);
        pay.setVisible(false);
        account.setVisible(false);
        downP.setVisible(false);
        loanT.setVisible(false);
        jPanel33.setVisible(false);
        jPanel36.setVisible(false);
        pay.setVisible(false);
        jLabel25.setVisible(false);
        deposit.setVisible(false);
        
        double maxDeposit = (1.0 / 100.0) * originalPrice;
        double deposit = Math.max(300, maxDeposit);
        
        double price = originalPrice - deposit;

        if ("Full Payment".equals(selected)) {
            jLabel21.setVisible(true);
            jLabel21.setText("Total Payable Amount: ");
            totalPayableAmount.setVisible(true);
            account.setVisible(true);
            pay.setVisible(true);
            jLabel25.setVisible(true);
            this.deposit.setVisible(true);
            downPayment.setText("");
            totalPayableAmount.setText(String.format("RM %,.2f", price));
            this.deposit.setText(String.format("RM %,.2f (1%% max)", deposit));
            
        } else if ("Loan Payment".equals(selected)) {
            jLabel21.setVisible(true);
            jLabel21.setText("Ets. Monthly Instalment: ");
            totalPayableAmount.setVisible(true);
            totalPayableAmount.setText("RM 0.00");
            account.setVisible(true);
            downP.setVisible(true);
            loanT.setVisible(true);
            jPanel33.setVisible(true);
            jPanel36.setVisible(true);
            pay.setVisible(true);
            jLabel25.setVisible(true);
            this.deposit.setVisible(true);
            interest.setText("5.5");
            this.deposit.setText(String.format("RM %,.2f (1%% max)", deposit));;
        } 
    }//GEN-LAST:event_paymentMethodActionPerformed

    private void loanTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanTermActionPerformed
        String selectedTerm = (String) loanTerm.getSelectedItem();
        double interest = 0.0;
        switch (selectedTerm) {
            case "3": interest = 5.5; break;
            case "5": interest = 4.5; break;
            case "7": interest = 3.8; break;
            case "9": interest = 3.0; break;
        }

        this.interest.setText(String.format("%.1f%%", interest));
        
        double maxDeposit = (1.0 / 100.0) * originalPrice;
        double deposit = Math.max(300, maxDeposit);
        this.deposit.setText(String.format("RM %,.2f (1%% max)", deposit));
        
        double loanPrincipal = Double.parseDouble(loanAmount.getText().replace("RM", "").replace(",", "").trim());
        double annualInterest = Double.parseDouble(this.interest.getText().replace("%", "").trim());
        int years = Integer.parseInt((String)loanTerm.getSelectedItem());
        int totalMonths = years * 12;
        double monthlyRate = annualInterest / 12.0 / 100;

        double monthlyPayment;
        if (monthlyRate == 0) {
            monthlyPayment = loanPrincipal / totalMonths;
        } else {
            monthlyPayment = loanPrincipal * (monthlyRate * Math.pow(1 + monthlyRate, totalMonths)) /
                             (Math.pow(1 + monthlyRate, totalMonths) - 1);
        }
        totalPayableAmount.setText(String.format("RM %,.2f", monthlyPayment));
    }//GEN-LAST:event_loanTermActionPerformed

    private void downPaymentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_downPaymentKeyReleased
        String downP = downPayment.getText().trim();
        try {
            double downPercentage = Double.parseDouble(downP);
            this.downPaymentRate = downPercentage;
            if (downPercentage >= 100) {
                JOptionPane.showMessageDialog(this, 
                        "Down payment must be less than 100%.", 
                        "Input Error", 
                        JOptionPane.WARNING_MESSAGE); 
                return;
            }
            double maxDeposit = (1.0 / 100.0) * originalPrice;
            double deposit = Math.max(300, maxDeposit);
            this.deposit.setText(String.format("RM %,.2f (1%% max)", deposit));
            
            double downAmount = originalPrice * (downPercentage / 100.0);
            this.downPaymentAmount = downAmount;
            double loan = originalPrice - downAmount - deposit;
            loanAmount.setText(String.format("RM %,.2f", loan));

            double annualInterest = Double.parseDouble(interest.getText().replace("%", "").trim());
            int years = Integer.parseInt((String)loanTerm.getSelectedItem());
            int totalMonths = years * 12;
            double monthlyRate = annualInterest / 12.0 / 100;

            double monthlyPayment;
            if (monthlyRate == 0) {
                monthlyPayment = loan / totalMonths;
            } else {
                monthlyPayment = loan * (monthlyRate * Math.pow(1 + monthlyRate, totalMonths)) /
                                 (Math.pow(1 + monthlyRate, totalMonths) - 1);
            }
            totalPayableAmount.setText(String.format("RM %,.2f", monthlyPayment));
        } catch (NumberFormatException ex) {
            loanAmount.setText("");
        }
    }//GEN-LAST:event_downPaymentKeyReleased

    private void fillFields(car selectedCar){
        bookingID.setText(selectedBooking.getBookingID());
        bookingDate.setText(selectedBooking.getBookingDate());
        carID.setText(selectedCar.getCarID());
        String carName = selectedCar.getCarname(); 
        String wrappedText = "<html><body style='width:150px; text-algin:left;'>" + carName + "</body></html>";
        this.carName.setText(wrappedText);
        price.setText(selectedCar.getCarBrand());
        String priceStr = selectedCar.getPrice();
        try {
            double price = Double.parseDouble(priceStr);
            String formattedPrice = String.format("RM %,.2f", price);
            this.price.setText(formattedPrice);
            this.originalPrice = price;
        } catch (NumberFormatException e) {
            this.price.setText("RM 0.00");
            System.err.println("Invalid price format: " + priceStr);
        }
       
        email.setText(selectedCustomer.getCustomerEmail());
        username.setText(selectedCustomer.getCustomerUsername());
        fullName.setText(selectedCustomer.getCustomerFullName());
        phoneNumber.setText(selectedCustomer.getCustomerPhoneNumber());
        icNo.setText(selectedCustomer.getCustomerICNo());
        licenseNo.setText(selectedCustomer.getCustomerLicenseNo());
    }
    
    private void setVisible(){
        jPanel30.setVisible(true);
        jPanel31.setVisible(true);
        jPanel32.setVisible(true);
        jPanel18.setVisible(true);
        jPanel25.setVisible(true);
        jPanel21.setVisible(true);
        paymentSection.setVisible(true);
        paymentSection.setVisible(true);
        account.setVisible(false);
        downP.setVisible(false);
        loanT.setVisible(false);
        jPanel33.setVisible(false);
        jPanel36.setVisible(false);
        jLabel21.setVisible(false);
        totalPayableAmount.setVisible(false);
        pay.setVisible(false); 
        jLabel25.setVisible(false);
        deposit.setVisible(false);
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
    private javax.swing.JLabel bookingDate;
    private javax.swing.JLabel bookingID;
    private javax.swing.JPanel car;
    private javax.swing.JLabel carID;
    private javax.swing.JLabel carName;
    private javax.swing.JLabel deposit;
    private javax.swing.JPanel downP;
    private javax.swing.JTextField downPayment;
    private javax.swing.JLabel email;
    private javax.swing.JLabel fullName;
    private javax.swing.JLabel icNo;
    private javax.swing.JLabel interest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
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
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel licenseNo;
    private javax.swing.JLabel loanAmount;
    private javax.swing.JPanel loanT;
    private javax.swing.JComboBox<String> loanTerm;
    private javax.swing.JButton pay;
    private javax.swing.JComboBox<String> paymentMethod;
    private javax.swing.JPanel paymentSection;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JLabel price;
    private javax.swing.JLabel totalPayableAmount;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
