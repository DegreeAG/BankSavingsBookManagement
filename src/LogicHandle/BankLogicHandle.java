package LogicHandle;

import Entity.Bank;

import java.util.Scanner;

public class BankLogicHandle {

    private final Bank[] banks = new Bank[1000];

    public Bank searchBankByID(int bankID) {
        for (int i = 0; i < banks.length ; i++) {
            if (banks[i] != null && bankID == banks[i].getBankID()) {
                return banks[i];
            }
        }
        return null;

        }


    public boolean checkIfBankAvailable() {
        boolean ifBankAvailable = false;
        for (int i = 0; i < banks.length; i++) {
            if (banks[i] != null) {
                ifBankAvailable =true;
            }
        }
            return ifBankAvailable;
    }

    public void inputNewBank() {
        System.out.println("Nhập số lượn ngân hàng muốn thêm mới vào hệ thống: ");
        int bankNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < bankNumber; i++) {
            System.out.println("Nhập thông tin của ngân hàng thứ" + (i+1));
            Bank bank = new Bank();
            bank.inputInfo();

            saveBank(bank);

        }
    }

    private void saveBank(Bank bank) {
        for (int i = 0; i < banks.length; i++) {
            if (banks[i] != null) {
                continue;
            }
            System.out.println(banks[i]);
        }
    }

    public void printBank() {
        for (int i = 0; i < banks.length; i++) {
            if (banks[i] == null) {
                continue;
            }
            System.out.println(banks[i]);
        }
    }
}
