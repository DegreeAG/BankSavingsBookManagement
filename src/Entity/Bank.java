package Entity;

import java.util.Scanner;

public class Bank {

    private int bankID;
    private String name;
    private float depositInterestRates;

    public static int AUTO_ID = 100;

    public Bank() {
        this.bankID = AUTO_ID;
        AUTO_ID++;
    }

    public int getBankID() {
        return bankID;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDepositInterestRates() {
        return depositInterestRates;
    }

    public void setDepositInterestRates(float depositInterestRates) {
        this.depositInterestRates = depositInterestRates;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankID=" + bankID +
                ", name='" + name + '\'' +
                ", depositInterestRates=" + depositInterestRates +
                '}';
    }

    public void inputInfo() {
        System.out.println("Nhập tên ngân hàng: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập lãi suất tiền gửi của ngân hàng: ");
        this.setDepositInterestRates(new Scanner(System.in).nextFloat());
    }
}
