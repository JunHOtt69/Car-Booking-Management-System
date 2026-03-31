package oopassignment;

public class payment {
    private static int paymentCounter = 1;

    public static void setPaymentCounter(int newCount) {
        paymentCounter = newCount;
    }
    
    private String paymentID;
    private String bookingID;
    private String customerID;
    private String deposit;
    private String paymentMethod;
    private String payableAmount;
    private String bankAccount;
    private String downPayment;
    private String downPaymentRate;
    private String loanAmount;
    private String loanTerm; 
    private String interestPerYear;
    private String paymentDate;

    public payment(String paymentID, String bookingID, String customerID, String deposit, String paymentMethod,
                   String payableAmount, String bankAccount, String downPayment, String downPaymentRate, String loanAmount,
                   String loanTerm, String interestPerYear, String paymentDate) {
        this.paymentID = paymentID;
        this.bookingID = bookingID;
        this.customerID = customerID;
        this.deposit  = deposit;
        this.paymentMethod = paymentMethod;
        this.payableAmount = payableAmount;
        this.bankAccount = bankAccount;
        this.downPayment = downPayment;
        this.downPaymentRate = downPaymentRate;
        this.loanAmount = loanAmount;
        this.loanTerm = loanTerm;
        this.interestPerYear = interestPerYear;
        this.paymentDate = paymentDate;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    
    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }
    
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(String payableAmount) {
        this.payableAmount = payableAmount;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(String downPayment) {
        this.downPayment = downPayment;
    }
    
    public String getDownPaymentRate() {
        return downPaymentRate;
    }

    public void setDownPaymentRate(String downPaymentRate) {
        this.downPaymentRate = downPaymentRate;
    }
    
    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(String loanTerm) {
        this.loanTerm = loanTerm;
    }

    public String getInterestPerYear() {
        return interestPerYear;
    }

    public void setInterestPerYear(String interestPerYear) {
        this.interestPerYear = interestPerYear;
    }
    
    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String newPaymentDate) {
        this.paymentDate = newPaymentDate;
    }

    public static String generatePaymentID() {
        String formattedCounter = String.format("%04d", paymentCounter);
        paymentCounter++; 
        return "P" + formattedCounter;
    }
}
