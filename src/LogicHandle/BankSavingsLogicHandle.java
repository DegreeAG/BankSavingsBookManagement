package LogicHandle;

import Entity.BankSavings;
import Entity.BankSavingsDetail;
import Entity.Customer;

import java.util.Scanner;

public class BankSavingsLogicHandle {

    private final BankSavings[] orders = new BankSavings[1000];

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
            System.out.println("Nhập thông tin của khách hàng thứ" + (i+1) + ":");
            Customer customer = queryCustomer();

            BankSavingsDetail[] details = declareBankSavingsBookInfo();

        }
    }

    private BankSavingsDetail[] declareBankSavingsBookInfo() {
        System.out.println("Khách hàng muốn gửi bao nhiêu sổ tiết kiệm: ");
        int bankSavingsBook = 0;
        
    }


    public Customer queryCustomer() {
        Customer customer = null;
        while (true) {
            int customerID = new Scanner(System.in).nextInt();
            
            customer = customerLogicHandle.searchReaderById(customerID);
            if (customer != null) {
                break;
            }
            System.out.print("Không có khách hàng nào có mã vừa nhâp, vui lòng nhập lại: ");
        }
        return customer;
    }

}
