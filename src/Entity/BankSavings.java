package Entity;

import LogicHandle.BankSavingsLogicHandle;

import java.util.Arrays;

public class BankSavings {

    private Customer customer;
    private BankSavingsDetail[] details;
    private int totalQuantity;

    public BankSavings(Customer customer, BankSavingsDetail[] details) {
        this.customer = customer;
        this.details = details;
    }

    public BankSavings(Customer customer, int totalQuantity) {
        this.customer = customer;
        this.totalQuantity = totalQuantity;
    }

    public BankSavings(BankSavingsDetail[] details, int totalQuantity) {
        this.details = details;
        this.totalQuantity = totalQuantity;
    }

    public BankSavings(Customer customer, BankSavingsDetail[] details, int totalQuantity) {
        this.customer = customer;
        this.details = details;
        this.totalQuantity = totalQuantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BankSavingsDetail[] getDetails() {
        return details;
    }

    public void setDetails(BankSavingsDetail[] details) {
        this.details = details;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }


    @Override
    public String toString() {
        return "BankSavings{" +
                "customer=" + customer +
                ", details=" + Arrays.toString(details) +
                '}';
    }
}
