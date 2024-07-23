package LogicHandle;

import java.util.Scanner;

public class MenuLogicHandle {

    private static final CustomerLogicHandle customerLogicHandle = new CustomerLogicHandle();
    private static final BankLogicHandle bankLogicHandle = new BankLogicHandle();
    private static final BankSavingsLogicHandle bankSavingsLogicHandle = new BankSavingsLogicHandle(bankLogicHandle, customerLogicHandle);

    public void menu() {

        while (true) {
            printMenuOptions();
            int functionChoice = chooseFunction();
            switch (functionChoice) {
                case 1:
                    customerLogicHandle.inputNewCustomer();
                    break;
                case 2:
                    customerLogicHandle.printCustomer();
                    break;
                case 3:
                    bankLogicHandle.inputNewBank();
                    break;
                case 4:
                    bankLogicHandle.printBank();
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:
                    return;

            }
        }

    }

    private int chooseFunction() {
        System.out.println("Xin mời chọn chức năng");
        int functionChoice;
        while (true) {
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice >= 1 && functionChoice <= 9) {
                break;
            }
            System.out.println("Lựa chọn không phù hợp, xin vui lòng chọn lại từ 1 tới 9: ");
        }
        return functionChoice;
    }

    public void printMenuOptions() {
        System.out.println("==========PHẦN MỀM QUẢN LÝ SỔ TIẾT KIỆM==========");
        System.out.println("1. Thêm khách hàng mới: ");
        System.out.println("2. In danh sách khách hàng đang có trong ngân hàng: ");
        System.out.println("3. Thêm ngân hàng mới: ");
        System.out.println("4. In danh sách ngân hàng đang có trong hệ thống: ");
        System.out.println("5. Lập bảng quản lý sổ tiết kiệm: ");
        System.out.println("6. In danh sách sổ tiết kiệm: ");
        System.out.println("7. Sắp xếp danh sách sổ tiết kiệm: ");
        System.out.println("8. In bảng kê số tiền gửi của mỗi khách hàng: ");
        System.out.println("9. Thoát: ");


    }

}
