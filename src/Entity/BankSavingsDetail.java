package Entity;

public class BankSavingsDetail {

    private Bank bank;
    private int quantity;

    public BankSavingsDetail(Bank bank, int quantity) {
        this.bank = bank;
        this.quantity = quantity;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "BankSavingsDetail{" +
                "bank=" + bank +
                ", quantity=" + quantity +
                '}';
    }
}
