package oopassignment;

public class booking {
    private static int BookingCounter = 1;

    public static void setBookingCounter(int newCount) {
        BookingCounter = newCount;
    }
    
    private String bookingID;
    private String salesmanID;
    private String customerID;
    private String carID;
    private String price;
    private String commission;
    private String bookingDate;
    private String rating;
    private String comments;
    private String paymentID;
    private String status;
    
    
    
    public booking(String bookingID, String salesmanID, String customerID, String carID, String price, String commission, String bookingDate, String rating, String comments, String paymentID, String status){
        this.bookingID = bookingID;
        this.salesmanID = salesmanID;
        this.customerID = customerID;
        this.carID = carID;
        this.price = price;
        this.commission = commission;
        this.bookingDate = bookingDate;
        this.rating = rating;
        this.comments = comments;
        this.paymentID = paymentID;
        this.status = status;
    }
    
    public String getBookingID(){
        return bookingID;
    }
    
    public void setBookingID(String newBookingID){
        this.bookingID = newBookingID;
    }
    
    public String getSalesmanID(){
        return salesmanID;
    }
    
    public void setSalesmanID(String newSalesmanID){
        this.salesmanID = newSalesmanID;
    }
    
    public String getCustomerID(){
        return customerID;
    }
    
    public void setCustomerID(String newCustomerID){
        this.customerID = newCustomerID;
    }
    
    public String getCarID(){
        return carID;
    }
    
    public void setCarID(String newCarID){
        this.carID = newCarID;
    }
    
    public String getPrice(){
        return price;
    }
    
    public void setPrice(String newPrice){
        this.price = newPrice;
    }
    
    public String getCommission(){
        return commission;
    }
    
    public void setCommission(String newCommission){
        this.commission = newCommission;
    }
    
    public String getBookingDate(){
        return bookingDate;
    }
    
    public void setBookingDate(String newBookingDate){
        this.bookingDate = newBookingDate;
    }
    
    public String getBookingStatus(){
        return status;
    }
    
    public void setBookingStatus(String newBookingStatus){
        this.status = newBookingStatus;
    }
    
    public String getRating(){
        return rating;
    }
    
    public void setRating(String newRating){
        this.rating = newRating;
    }
    
    public String getComments(){
        return comments;
    }
    
    public void setComments(String newComments){
        this.comments = newComments;
    }
    
    public String getPaymentID (){
        return paymentID ;
    }

    public void setPaymentID(String newPaymentID ){
        this.paymentID = newPaymentID ;
    }

    public static String generateBookingID() {
        String formattedCounter = String.format("%03d", BookingCounter);
        BookingCounter++; 
        return "B" + formattedCounter;
    }
}