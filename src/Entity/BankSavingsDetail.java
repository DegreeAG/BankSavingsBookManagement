package Entity;

public class BankSavingsDetail {

    private Bank bank;
    private double amount;

    public BankSavingsDetail(Bank bank, double amount) {
        this.bank = bank;
        this.amount = amount;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "BankSavingsDetail{" +
                "bank=" + bank +
                ", amount=" + amount +
                '}';
    }
}
