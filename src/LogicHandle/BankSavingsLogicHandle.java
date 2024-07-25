package LogicHandle;

import Entity.Bank;
import Entity.BankSavings;
import Entity.BankSavingsDetail;
import Entity.Customer;

import java.util.Scanner;

public class BankSavingsLogicHandle {

    private final BankSavings[] orders = new BankSavings[1000];
    private final Bank[] banks = new Bank[1000];
    private final BankSavings[] bankSavings = new BankSavings[1000];

    private final BankLogicHandle bankLogicHandle;
    private final CustomerLogicHandle customerLogicHandle;


    public BankSavingsLogicHandle(BankLogicHandle bankLogicHandle, CustomerLogicHandle customerLogicHandle) {
        this.bankLogicHandle = bankLogicHandle;
        this.customerLogicHandle = customerLogicHandle;
    }

    public void creatBankSavingsBook() {

        boolean ifCustomerAvailable = customerLogicHandle.checkIfCustomerAvailable();
        boolean ifBankAvailable = bankLogicHandle.checkIfBankAvailable();

        if (!ifCustomerAvailable || !ifBankAvailable) {
            System.out.println("Chưa đủ dữ liệu về khách hàng/ngân hàng để thực hiện. Vui lòng nhập thông tin của khách hàng/ngân hàng trước: ");
            return;
        }
        System.out.println("Có bao nhiêu khách hàng đang cần gửi sổ tiết kiệm: ");
        int customerNumber;
        while (true) {
            customerNumber = new Scanner(System.in).nextInt();
            if (customerNumber > 0 && customerNumber <= customerLogicHandle.getCustomersLength()) {
                break;
            }
            System.out.println("Số lượng khách hàng không hợp lệ, vui lòng nhập lại: ");
        }
        for (int i = 0; i < customerNumber; i++) {
            System.out.println("Nhập thông tin của khách hàng thứ" + (i + 1) + ":");
            Customer customer = queryCustomer();

            BankSavingsDetail[] details = declareBankSavingsBookInfo();

        }
    }

    private BankSavingsDetail[] declareBankSavingsBookInfo() {
//        System.out.println("Nhập ID ngân hàng mà khách hàng muốn gửi sổ tiết kiệm ");
//        Bank bank = null;
//        while (true) {
//            int bankID = new Scanner(System.in).nextInt();
//            bank = bankLogicHandle.searchBankByID(bankID);
//            if (bank != null) {
//                break;
//            }
//            System.out.println("Không có ngân hàng khớp với ID bạn vừa nhập, xin vui lòng nhập lại: ");
//        }
//        System.out.println("Khách hàng muốn mở bao nhiêu sổ tiết kiệm ở ngân hàng này: ");
//        int bankSavingBookNumber = 0;
//        while (true) {
//            bankSavingBookNumber = new Scanner(System.in).nextInt();
//            if (bankSavingBookNumber > 0 && bankSavingBookNumber <= 5) {
//                break;
//            }
//            System.out.println("Số lượng mở sổ không hợp lệ, vui lòng nhập lại số nguyên có giá trị từ 1 tới 5: ");
//        }
//        BankSavingsDetail[] details = new BankSavingsDetail[bankSavingBookNumber];
//        int count = 0;
//        double amount;
//        while (true) {
//            for (int i = 0; i < bankSavingBookNumber ; i++) {
//            System.out.println("Nhập số tiền bạn muốn gửi ở sổ tiết kiệm thứ " + (i+1));
//
//            BankSavings bankSavings = new BankSavings();
//
//            }
//            BankSavingsDetail detail = new BankSavingsDetail(bank, amount);
//            details[count] = detail;
//            count++;
//        }

        System.out.println("Khách hàng muốn gửi sổ tiết kiệm ở bao nhiêu ngân hàng: ");
        int bankQuantity = 0;
        while (true) {
            bankQuantity = new Scanner(System.in).nextInt();
            if (bankQuantity > 0 && bankQuantity <= banks.length) {
                break;
            }
            System.out.println("Số lượng ngân hàng không hợp lệ, vui lòng nhập lại: ");
        }
        BankSavingsDetail[] details = new BankSavingsDetail[bankQuantity];
        int count = 0;
        for (int i = 0; i < bankQuantity; i++) {
            System.out.println("Nhập ID của ngân hàng thứ" + (i+1) +": ");
            Bank bank = null;
            while (true) {
                int bankID = new Scanner(System.in).nextInt();
                bank = bankLogicHandle.searchBankByID(bankID);
            if (bank != null) {
                break;
            }
            System.out.println("Không có ngân hàng khớp với ID bạn vừa nhập, xin vui lòng nhập lại: ");
            }
            System.out.println("Khách hàng muốn gửi bao nhiêu sổ tiết kiệm ở ngân hàng này: ");
            int bankSavingsBook = 0;
            while (true) {
                bankSavingsBook = new Scanner(System.in).nextInt();
                if (bankSavingsBook >0 && bankSavingsBook <=5) {
                    break;
                }
                System.out.println("Số lượng mở sổ tiết kiệm vượt quá giới hạn, khách hàng vui lòng lựa chọn mở từ 1 tới 5 sổ(tối đa): ");
            }
            double amount;
            for (int j = 0; j < bankSavingsBook ; j++) {
                System.out.println("Nhập số tiền gửi của sổ tiết kiệm thứ" + (j + 1));
                amount = new Scanner(System.in).nextInt();
                continue;
            }
            BankSavingsDetail detail = new BankSavingsDetail(bank, amount);
            details[count] = detail;
            count++;
            }
        return details;
        }

    }


    public Customer queryCustomer() {
        Customer customer = null;
        while (true) {
            int customerID = new Scanner(System.in).nextInt();
            customer = customerLogicHandle.searchCustomerById(customerID);
            if (customer != null) {
                break;
            }
            System.out.print("Không có khách hàng nào có mã vừa nhâp, vui lòng nhập lại: ");
        }
        return customer;
    }

    public int getBankSavingLength() {
        return getBankSavingLength();
    }
}
