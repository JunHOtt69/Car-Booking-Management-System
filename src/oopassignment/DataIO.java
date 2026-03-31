package oopassignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataIO {
    public static ArrayList<Customer> customers = new ArrayList<>();
    public static ArrayList<admin> admins = new ArrayList<>();
    public static ArrayList<salesman> salesmen = new ArrayList<>();
    public static ArrayList<car> cars = new ArrayList<>();
    public static ArrayList<booking> bookings = new ArrayList<>();
    public static ArrayList<payment> payments = new ArrayList<>();
    
    //Customer
    public static void writeCustomerData(){
        try {
            PrintWriter a = new PrintWriter("customer.txt");
            for(int i = 0; i<customers.size(); i++){
                a.println(customers.get(i).getCustomerID());
                a.println(customers.get(i).getCustomerUsername());
                a.println(customers.get(i).getCustomerFullName());
                a.println(customers.get(i).getCustomerEmail());
                a.println(customers.get(i).getCustomerPassword());
                a.println(customers.get(i).getCustomerPhoneNumber());
                a.println(customers.get(i).getCustomerICNo());
                a.println(customers.get(i).getCustomerLicenseNo());
                a.println(customers.get(i).getCustomerStatus());
                a.println();
            }
            a.close();
            System.out.println("Customer data successfully written to file.");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataIO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error writing to customer.txt: " + ex.getMessage());
        }
    }
    
    public static void readCustomerData(){
        File file = new File("customer.txt");
        int largestID = 0;
        if (!file.exists()) {
            System.out.println("No customer data file found. Starting with empty customer list.");
            return;
        }
        try{
            Scanner s = new Scanner(new File("customer.txt"));
            while(s.hasNext()){
                String customerID = s.nextLine();
                int customerCounter = Integer.parseInt(customerID.substring(1));
                    if (customerCounter > largestID){
                    largestID = customerCounter;
                }
               
                String username = s.nextLine();
                String fullName = s.nextLine();
                String email = s.nextLine();
                String password = s.nextLine();
                String phoneNumber = s.nextLine();
                String icNo = s.nextLine();
                String licenseNo = s.nextLine();
                String status = s.nextLine();
                s.nextLine();
                
                Customer Customer = new Customer(customerID, username, fullName, email, password, phoneNumber, icNo, licenseNo, status);
                customers.add(Customer);
            }
            s.close();
            System.out.println("Successfully loaded " + customers.size() + " customer records.");
        }catch (FileNotFoundException ex) {
            Logger.getLogger(DataIO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error reading from customer.txt: " + ex.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(DataIO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Unexpected error reading customer data: " + ex.getMessage());
        }
        if (!customers.isEmpty()){
            Customer.setCustomerCounter(largestID + 1);
        }
    }
    
    public static Customer searchCustomer(String email){
        for(Customer currentCustomer: customers){
            if (currentCustomer.getCustomerEmail().equals(email)){
                return currentCustomer;
            }
        }
        return null;
    }
   
    public static void updateCustomerInfo(ArrayList<Customer>updatedInfo){
       customers = updatedInfo;
   }
    
    //Salesman
    public static void writeSalesmanData(){
        try {
            PrintWriter a = new PrintWriter("salesman.txt");
            for(int i = 0; i<salesmen.size(); i++){
                a.println(salesmen.get(i).getSalesmanID());
                a.println(salesmen.get(i).getSalesmanUsername());
                a.println(salesmen.get(i).getSalesmanFullName());
                a.println(salesmen.get(i).getSalesmanEmail());
                a.println(salesmen.get(i).getSalesmanPassword());
                a.println(salesmen.get(i).getSalesmanPhoneNumber());
                a.println(salesmen.get(i).getSalesmanTotalSales());
                a.println(salesmen.get(i).getSalesmanTotalCommissions());
                a.println(salesmen.get(i).getSalesmanStatus());
                a.println();
            }
            a.close();
            System.out.println("Salesman data successfully written to file.");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataIO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error writing to salesmen.txt: " + ex.getMessage());
        }
    }
    
    public static void readSalesmanData(){
        File file = new File("salesman.txt");
        int largestID = 0;
        if (!file.exists()) {
            System.out.println("No salesman data file found. Starting with empty salesman list.");
            return;
        }
        try{
            Scanner s = new Scanner(new File("salesman.txt"));
            while(s.hasNext()){
                String salesmanID = s.nextLine();
                int salesmanCounter = Integer.parseInt(salesmanID.substring(1));
                    if (salesmanCounter > largestID){
                    largestID = salesmanCounter;
                }
                    
                String username = s.nextLine();
                String fullName = s.nextLine();
                String email = s.nextLine();
                String password = s.nextLine();
                String phoneNumber = s.nextLine();
                String totalSales = s.nextLine();
                String totalCommissions = s.nextLine();
                String status = s.nextLine();
                s.nextLine();
                
                salesman Salesman = new salesman(salesmanID, username, fullName, email, password, phoneNumber, totalSales, totalCommissions, status);
                salesmen.add(Salesman);
            }
            s.close();
            System.out.println("Successfully loaded " + salesmen.size() + " salesman records.");
        }catch (FileNotFoundException ex) {
            Logger.getLogger(DataIO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error reading from salesman.txt: " + ex.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(DataIO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Unexpected error reading salesmen data: " + ex.getMessage());
        }
        if (!salesmen.isEmpty()){
            salesman.setSalesmanCounter(largestID + 1);
        }
    }
    
    public static salesman searchSalesman(String email){
        for(salesman currentSalesmen: salesmen){
            if (currentSalesmen.getSalesmanEmail().equals(email)){
                return currentSalesmen;
            }
        }
        return null;
    }
    
   
   public static void updateSalesmenInfo(ArrayList<salesman>updatedInfo){
       salesmen = updatedInfo;
   }
    //Admin
    public static void writeAdminData(){
        try {
            PrintWriter a = new PrintWriter("admin.txt");
            for(int i = 0; i<admins.size(); i++){
                a.println(admins.get(i).getAdminID());
                a.println(admins.get(i).getAdminUsername());
                a.println(admins.get(i).getAdminFullName());
                a.println(admins.get(i).getAdminEmail());
                a.println(admins.get(i).getAdminPassword());
                a.println(admins.get(i).getAdminPhoneNumber());
                a.println(admins.get(i).getAdminStatus());
                a.println();
            }
            a.close();
            System.out.println("Admin data successfully written to file.");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataIO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error writing to admin.txt: " + ex.getMessage());
        }
    }

    public static void readAdminData(){
        File file = new File("admin.txt");
        int largestID = 0;
        if (!file.exists()) {
            System.out.println("No admin data file found. Starting with empty admin list.");
            return;
        }
        try{
            Scanner s = new Scanner(new File("admin.txt"));
            while(s.hasNext()){
                String adminID = s.nextLine();
                int adminCounter = Integer.parseInt(adminID.substring(1)); 
                    if (adminCounter > largestID){
                    largestID = adminCounter;   
                }
               
                String username = s.nextLine();
                String fullName = s.nextLine();
                String email = s.nextLine();
                String password = s.nextLine();
                String phoneNumber = s.nextLine();
                String status = s.nextLine();
                s.nextLine();
                
                admin Admin = new admin(adminID, username, fullName, email, password, phoneNumber, status);
                admins.add(Admin);
            }
            s.close();
            System.out.println("Successfully loaded " + admins.size() + " admin records.");
        }catch (FileNotFoundException ex) {
            Logger.getLogger(DataIO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error reading from admin.txt: " + ex.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(DataIO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Unexpected error reading admin data: " + ex.getMessage());
        }
        if (!admins.isEmpty()){
            admin.setAdminCounter(largestID + 1); 
        }
    }
    
    public static admin searchAdmin(String email){
        for(admin currentAdmin: admins){
            if (currentAdmin.getAdminEmail().equals(email)){
                return currentAdmin;
            }
        }
        return null;
    }
    
    
   public static void updateAdminInfo(ArrayList<admin>updatedInfo){
       admins = updatedInfo;
   }
   
   //Car
   public static void writeCarData(){
        try {
            PrintWriter a = new PrintWriter("car.txt");
            for(int i = 0; i<cars.size(); i++){
                a.println(cars.get(i).getCarID());
                a.println(cars.get(i).getCarname());
                a.println(cars.get(i).getCarType());
                a.println(cars.get(i).getCarBrand());
                a.println(cars.get(i).getCarColor());
                a.println(cars.get(i).getPrice());
                a.println(cars.get(i).getCondition());
                a.println(cars.get(i).getMileage());
                a.println(cars.get(i).getTransmission());
                a.println(cars.get(i).getFuelType());
                a.println(cars.get(i).getCarStatus());
                a.println();
            }
            a.close();
            System.out.println("Car data successfully written to file.");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataIO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error writing to Car.txt: " + ex.getMessage());
        }
    }
    
    public static void readCarData(){
        File file = new File("car.txt");
        int largestID = 0;
        if (!file.exists()) {
            System.out.println("No car data file found. Starting with empty car list.");
            return;
        }
        try{
            Scanner s = new Scanner(new File("car.txt"));
            while(s.hasNext()){
                String carID = s.nextLine();
                int CarCounter = Integer.parseInt(carID.substring(1));
                    if (CarCounter > largestID){
                    largestID = CarCounter;
                }
               
                String carName = s.nextLine();
                String carType = s.nextLine();
                String carBrand = s.nextLine();
                String carColor = s.nextLine();
                String price = s.nextLine();
                String condition = s.nextLine();
                String mileage = s.nextLine();
                String transmission = s.nextLine();
                String fuelType = s.nextLine();
                String status = s.nextLine();
                s.nextLine();
                
                car Car = new car(carID, carName, carType, carBrand, carColor, price, condition, mileage, transmission, fuelType, status);
                cars.add(Car);
            }
            s.close();
            System.out.println("Successfully loaded " + cars.size() + " car records.");
        }catch (FileNotFoundException ex) {
            Logger.getLogger(DataIO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error reading from Car.txt: " + ex.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(DataIO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Unexpected error reading car data: " + ex.getMessage());
        }
        if (!cars.isEmpty()){
            car.setCarCounter(largestID + 1);
        }
    }
    
    public static car searchCar(String carID){
        for(car currentCar: cars){
            if (currentCar.getCarID().equals(carID)){
                return currentCar;
            }
        }
        return null;
    }
    
   public static void updateCarInfo(ArrayList<car>updatedInfo){
       cars = updatedInfo;
   }
   
   
   //Booking
   public static void writeBookingData(){
        try {
            PrintWriter a = new PrintWriter("booking.txt");
            for(int i = 0; i<bookings.size(); i++){
                a.println(bookings.get(i).getBookingID());
                a.println(bookings.get(i).getSalesmanID());
                a.println(bookings.get(i).getCustomerID());
                a.println(bookings.get(i).getCarID());
                a.println(bookings.get(i).getPrice());
                a.println(bookings.get(i).getCommission());
                a.println(bookings.get(i).getBookingDate());                
                a.println(bookings.get(i).getRating());
                a.println(bookings.get(i).getComments());
                a.println(bookings.get(i).getPaymentID());
                a.println(bookings.get(i).getBookingStatus());
                a.println();
            }
            a.close();
            System.out.println("Booking data successfully written to file.");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataIO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error writing to Booking.txt: " + ex.getMessage());
        }
    }
    
    public static void readBookingData(){
        File file = new File("booking.txt");
        int largestID = 0;
        if (!file.exists()) {
            System.out.println("No booking data file found. Starting with empty booking list.");
            return;
        }
        try{
            Scanner s = new Scanner(new File("booking.txt"));
            while(s.hasNext()){
                String bookingID = s.nextLine();
                int BookingCounter = Integer.parseInt(bookingID.substring(1));
                    if (BookingCounter > largestID){
                    largestID = BookingCounter;
                }
                String salesmanID = s.nextLine();
                String customerID = s.nextLine();
                String carID = s.nextLine();
                String price = s.nextLine();
                String commission = s.nextLine();
                String bookingdate = s.nextLine();
                String rating = s.nextLine();
                String comments = s.nextLine();
                String paymentID= s.nextLine();
                String status = s.nextLine();
                s.nextLine();
                
                booking Booking = new booking(bookingID, salesmanID, customerID, carID, price, commission, bookingdate, rating, comments, paymentID, status);
                bookings.add(Booking);
            }
            s.close();
            System.out.println("Successfully loaded " + bookings.size() + " Booking records.");
        }catch (FileNotFoundException ex) {
            Logger.getLogger(DataIO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error reading from Booking.txt: " + ex.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(DataIO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Unexpected error reading booking data: " + ex.getMessage());
        }
        if (!bookings.isEmpty()){
            booking.setBookingCounter(largestID + 1);
        }
    }
    
    public static booking searchBooking(String bookingID){
        for(booking currentBooking: bookings){
            if (currentBooking.getBookingID().equals(bookingID)){
                return currentBooking;
            }
        }
        return null;
    }
    
   public static void updateBookingInfo(ArrayList<booking>updatedInfo){
       bookings = updatedInfo;
   }
   
   //payment
   public static void writePaymentData() {
        try {
            PrintWriter a = new PrintWriter("payment.txt");
            for (payment p : payments) {
                a.println(p.getPaymentID());
                a.println(p.getBookingID());
                a.println(p.getCustomerID());
                a.println(p.getDeposit());
                a.println(p.getPaymentMethod());
                a.println(p.getPayableAmount());
                a.println(p.getBankAccount());
                a.println(p.getDownPayment());
                a.println(p.getDownPaymentRate());
                a.println(p.getLoanAmount());
                a.println(p.getLoanTerm());
                a.println(p.getInterestPerYear());
                a.println(p.getPaymentDate());
                a.println(); 
            }
            a.close();
            System.out.println("Payment data successfully written to file.");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataIO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error writing to payment.txt: " + ex.getMessage());
        }
    }
    
    public static void readPaymentData() {
        File file = new File("payment.txt");
        if (!file.exists()) {
            System.out.println("No payment data file found. Starting with empty payment list.");
            return;
        }
        int largestID = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String paymentID = scanner.nextLine();
                int PaymentCounter = Integer.parseInt(paymentID.substring(1));
                    if (PaymentCounter > largestID){
                    largestID = PaymentCounter;
                }
                String bookingID = scanner.nextLine();
                String customerID = scanner.nextLine();
                String deposit = scanner.nextLine();
                String paymentMethod = scanner.nextLine();
                String payableAmount = scanner.nextLine();
                String bankAccount = scanner.nextLine();
                String downPayment = scanner.nextLine();
                String downPaymentRate = scanner.nextLine();
                String loanAmount = scanner.nextLine();
                String loanTerm = scanner.nextLine();
                String interestPerYear = scanner.nextLine();
                String paymentDate = scanner.nextLine();
                scanner.nextLine(); // consume empty line

                payment p = new payment(paymentID, bookingID, customerID, deposit, paymentMethod,
                        payableAmount, bankAccount, downPayment, downPaymentRate, loanAmount,
                        loanTerm, interestPerYear, paymentDate);
                payments.add(p);
            }
            scanner.close();
            System.out.println("Successfully loaded " + payments.size() + " Payment records.");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataIO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error reading from payment.txt: " + ex.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(DataIO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Unexpected error reading payment data: " + ex.getMessage());
        }
        if (!payments.isEmpty()){
            payment.setPaymentCounter(largestID + 1);
        }
    }

    public static payment searchPayment(String paymentID) {
        for (payment p : payments) {
            if (p.getPaymentID().equals(paymentID)) {
                return p;
            }
        }
        return null;
    }

    public static ArrayList<payment> searchPaymentsByCustomer(String customerID) {
        ArrayList<payment> results = new ArrayList<>();
        for (payment p : payments) {
            if (p.getCustomerID().equals(customerID)) {
                results.add(p);
            }
        }
        return results;
    }

    public static void updatePaymentInfo(ArrayList<payment> updatedList) {
        payments = updatedList;
    }
}
