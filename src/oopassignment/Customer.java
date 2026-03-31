package oopassignment;

public class Customer {
    private static int customerCounter = 1;

    public static void setCustomerCounter(int newCount) {
        customerCounter = newCount;
    }
    
    private String customerID;
    private String username;
    private String fullName;
    private String email;
    private String password;
    private String phoneNumber;
    private String icNo;
    private String licenseNo;
    private String status;
    
    
    
    
    public Customer(String customerID, String username, String fullName, String email, String password, String phoneNumber,String icNo, String licenseNo, String status){
        this.customerID = customerID;
        this.username = username;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.icNo = icNo;
        this.licenseNo = licenseNo;
        this.status = status;
    }
    
    public String getCustomerID(){
        return customerID;
    }
    
    public String getCustomerUsername(){
        return username;
    }
    
    public void setCustomerUsername(String newUsername){
        this.username = newUsername;
    }
    
    public String getCustomerFullName(){
        return fullName;
    }
    
    public void setCustomerFullName(String newFullName){
        this.fullName = newFullName;
    }
    
    public String getCustomerEmail(){
        return email;
    }
    
    public void setCustomerEmail(String newEmail){
        this.email = newEmail;
    }
    
    public String getCustomerPassword(){
        return password;
    }
    
    public void setCustomerPassword(String newPassword){
        this.password = newPassword;
    }
    
    public String getCustomerPhoneNumber(){
        return phoneNumber;
    }
    
    public void setCustomerPhoneNumber(String newPhoneNumber){
        this.phoneNumber = newPhoneNumber;
    }
    
    public String getCustomerICNo(){
        return icNo;
    }
    
    public void setCustomerICno(String newICNo){
        this.icNo = newICNo;
    }
    
    public String getCustomerLicenseNo(){
        return licenseNo;
    }
    
    public void setCustomerLicenseNo(String newLicenseNo){
        this.licenseNo = newLicenseNo;
    }
    
    public String getCustomerStatus(){
        return status;
    }
    
    public void setCustomerStatus(String newStatus){
        this.status = newStatus;
    }
    
    public static String generateCustomerID() {
        String formattedCounter = String.format("%03d", customerCounter);
        customerCounter++; 
        return "C" + formattedCounter;
    }
}

