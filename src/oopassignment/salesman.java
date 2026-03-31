package oopassignment;

public class salesman {
    private static int salesmanCounter = 1;

    public static void setSalesmanCounter(int newCount) {
        salesmanCounter = newCount;
    }
    
    private String salesmanID;
    private String username;
    private String fullName;
    private String email;
    private String password;
    private String phoneNumber;
    private String status;
    private String totalSales;
    private String totalCommissions;
    
    
    public salesman(String salesmanID, String username, String fullName, String email, String password, String phoneNumber, String totalSales, String totalCommissions, String status){
        this.salesmanID = salesmanID;
        this.username = username;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.totalSales = totalSales;
        this.totalCommissions = totalCommissions;
    }
    
    public String getSalesmanID(){
        return salesmanID;
    }
    
    public String getSalesmanUsername(){
        return username;
    }
    
    public void setSalesmanUsername(String newUsername){
        this.username = newUsername;
    }
    
    public String getSalesmanFullName(){
        return fullName;
    }
    
    public void setSalesmanFullName(String newFullName){
        this.fullName = newFullName;
    }
    
    public String getSalesmanEmail(){
        return email;
    }
    
    public void setSalesmanEmail(String newEmail){
        this.email = newEmail;
    }
    
    public String getSalesmanPassword(){
        return password;
    }
    
    public void setSalesmanPassword(String newPassword){
        this.password = newPassword;
    }
    
    public String getSalesmanPhoneNumber(){
        return phoneNumber;
    }
    
    public void setSalesmanPhoneNumber(String newPhoneNumber){
        this.phoneNumber = newPhoneNumber;
    }
    
    public String getSalesmanStatus(){
        return status;
    }
    
    public void setSalesmanStatus(String newStatus){
        this.status = newStatus;
    }
    
    public String getSalesmanTotalSales(){
        return totalSales;
    }
    
    public void setSalesmanTotalSales(String newTotalSales){
        this.totalSales = newTotalSales;
    }

    public String getSalesmanTotalCommissions(){
        return totalCommissions;
    }
    
    public void setSalesmanTotalCommissions(String newTotalCommissions){
        this.totalCommissions = newTotalCommissions;
    }
    
    public static String generateSalesmanID() {
        String formattedCounter = String.format("%03d", salesmanCounter);
        salesmanCounter++; 
        return "S" + formattedCounter;
    }
}