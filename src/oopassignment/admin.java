package oopassignment;

public class admin {
    private static int adminCounter = 1;

    public static void setAdminCounter(int newCount) {
        adminCounter = newCount;
    }
    
    private String adminID;
    private String username;
    private String fullName;
    private String email;
    private String password;
    private String phoneNumber;
    private String status;
    
    
   
    public admin(String adminID, String username, String fullName, String email, String password, String phoneNumber,String status){
        this.adminID = adminID;
        this.username = username;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }
    
    public String getAdminID(){
        return adminID;
    }
    
    public String getAdminUsername(){
        return username;
    }
    
    public void setAdminUsername(String newUsername){
        this.username = newUsername;
    }
    
    public String getAdminFullName(){
        return fullName;
    }
    
    public void setAdminFullName(String newFullName){
        this.fullName = newFullName;
    }
    
    public String getAdminEmail(){
        return email;
    }
    
    public void setAdminEmail(String newEmail){
        this.email = newEmail;
    }
    
    public String getAdminPassword(){
        return password;
    }
    
    public void setAdminPassword(String newPassword){
        this.password = newPassword;
    }
    
    public String getAdminPhoneNumber(){
        return phoneNumber;
    }
    
    public void setAdminPhoneNumber(String newPhoneNumber){
        this.phoneNumber = newPhoneNumber;
    }
    
    public String getAdminStatus(){
        return status;
    }
    
    public void setAdminStatus(String newStatus){
        this.status = newStatus;
    }
    
    public static String generateAdminID() {
        String formattedCounter = String.format("%03d", adminCounter);
        adminCounter++; 
        return "A" + formattedCounter;
    }
}
