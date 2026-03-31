package oopassignment;

public class Main {
    public static registerPage registerPage;
    public static loginPage loginPage;
    public static adminHomePage adminHomePage; 
    public static customerHomePage customerHomePage;
    public static salesmanHomePage salesmanHomePage;
    public static manageUser manageUser;
    public static manageCar manageCar;
    public static viewBookingSalesman viewBookingSalesman;
    public static viewBookingCustomer viewBookingCustomer;
    public static manageBooking manageBooking; 
    public static canceledBooking canceledBooking;
    public static unpaidBooking unpaidBooking;
    public static addUsers addUsers;
    public static addCars addCars;
    public static requestBooking requestBooking;
    public static confirmBooking confirmBooking;
    public static cancelBooking cancelBooking;
    public static viewAdminProfile viewAdminProfile;
    public static viewCustomerProfile viewCustomerProfile;
    public static viewSalesmanProfile viewSalesmanProfile;
    public static manageCarViewOnly manageCarViewOnly;
    public static manageCarSalesman manageCarSalesman;
    public static paymentAnalysis paymentAnalysis;
    public static addBooking addBooking;
    public static payBooking payBooking;
    public static viewPayment viewPayment;
    public static viewPaymentCustomer viewPaymentCustomer;
    public static feedbackAnalysis feedbackAnalysis;
    
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        DataIO.readAdminData();
        DataIO.readCustomerData();
        DataIO.readSalesmanData();
        DataIO.readCarData();
        DataIO.readBookingData();
        DataIO.readPaymentData();
        
        for (admin a : DataIO.admins) {
            System.out.println("Loaded admin email: " + a.getAdminEmail());
        }
        
        for (Customer c : DataIO.customers) {
            System.out.println("Loaded customer email: " + c.getCustomerEmail());
        }
        
        for (salesman s : DataIO.salesmen) {
            System.out.println("Loaded salesman email: " + s.getSalesmanEmail());
        }
        
        for (car v : DataIO.cars){
            System.out.println("Loaded car ID: " + v.getCarID());
        }
        
        for (booking b : DataIO.bookings){
            System.out.println("Loaded booking ID: " + b.getBookingID());
        }
        
        registerPage = new registerPage();
        loginPage = new loginPage();
        
        
        
        loginPage.setVisible(true);
        registerPage.setVisible(false);
        
    }   
}

