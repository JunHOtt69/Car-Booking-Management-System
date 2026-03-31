package oopassignment;

public class CustomerSummary {
    Customer customer;
    int purchasedNumber;
    double totalSpent;

    public CustomerSummary(Customer customer, int purchasedNumber, double totalSpent) {
        this.customer = customer;
        this.purchasedNumber = purchasedNumber;
        this.totalSpent = totalSpent;
    }
}