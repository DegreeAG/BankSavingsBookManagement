package Entity;

import Constant.CustomerType;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Customer extends Person {

    private int id;
    private CustomerType customerType;

    public static int AUTO_ID = 10000;

    public Customer() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }



    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", customerType=" + customerType +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public void inputInfo() {

        System.out.println("Nhập tên khách hàng: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập địa chỉ của khách hàng: ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.println("Nhập số điện thoại của khách hàng: " );
        this.setPhoneNumber(new Scanner(System.in).nextLine());
        System.out.println("Lựa chọn loại khách hàng: ");
        System.out.println("1. Cá Nhân");
        System.out.println("2. Tập Thể");
        System.out.println("3. Doanh Nghiệp");
        int customerType;
        while (true) {
            customerType = new Scanner(System.in).nextInt();
            if (customerType >=1 && customerType <=3) {
                break;
            }
            System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại từ 1 tới 3: ");
        }
        switch (customerType) {
            case 1:
                this.setCustomerType(CustomerType.CN);
                break;
            case 2:
                this.setCustomerType(CustomerType.TT);
                break;
            case 3:
                this.setCustomerType(CustomerType.DN);
                break;
        }
    }
}
