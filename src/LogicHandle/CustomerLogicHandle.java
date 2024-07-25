package LogicHandle;

import Entity.Customer;

import java.util.Scanner;

public class CustomerLogicHandle {

    private final Customer[] customers = new Customer[10000];

    public boolean checkIfCustomerAvailable() {
        boolean ifCustomerAvailable = false;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                ifCustomerAvailable = true;
                break;
            }
        }
            return ifCustomerAvailable;
    }

    public int getCustomersLength() {
        return customers.length;
    }

    public void inputNewCustomer() {
        System.out.println("Nhập số lượng khách hàng muốn thêm mới: ");
        int customerNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < customerNumber; i++) {
            System.out.println("Nhập thông tin của khách hàng thứ " + (i + 1));
            Customer customer = new Customer();
            customer.inputInfo();

            saveCustomer(customer);

        }
    }

    public void saveCustomer(Customer customer) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                continue;
            }
            System.out.println(customers[i]);
        }

    }

    public void printCustomer() {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                continue;
            }
            System.out.println(customers[i]);
        }

    }

    public Customer searchCustomerById(int customerID) {
        for (int j = 0; j < customers.length; j++) {
            if (customers[j] != null && customerID == customers[j].getId()) {
                return customers[j];
            }
        }
        return null;
    }
}
