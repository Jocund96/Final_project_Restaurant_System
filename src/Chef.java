import java.util.Scanner;
import java.util.Date;

import enums.AccountStatus;
import enums.EmployeeStatus;

public class Chef extends Employee implements AccountInt {
    private boolean loggedIn = false;
    private Account account;

    public Chef(){}
    public Chef(String name, String phone, String email, int employeeID, Date dateJoined, String position, double salary, String department, EmployeeStatus status, Account account, Branch worksAt) {
        super(name, phone, email, employeeID, dateJoined, position, salary, department, status, worksAt);
        this.account = account;
    }

    public Chef(String chem, String phone, String email, String number, Date dateJoined, String chef, double salary, String kitchen, EmployeeStatus employeeStatus, AccountStatus accountStatus) {
    }

    @Override
    public void login() {
        loggedIn = true;
        System.out.println("Chef logged in.");
    }

    @Override
    public void logout() {
        loggedIn = false;
        System.out.println("Chef logged out.");
    }

    @Override
    public void register() {
        System.out.println("Chef registered.");
    }

    @Override
    public void changePassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new password: ");
        String newPassword = scanner.nextLine();
        if (account.resetPassword(newPassword)) {
            System.out.println("Password changed successfully.");
        } else {
            System.out.println("Password change failed.");
        }
    }


    public boolean takeOrder(Order order) {
        if (loggedIn) {
            // Логика принятия заказа
            System.out.println("Order taken by chef.");
            return true;
        } else {
            System.out.println("Please log in first.");
            return false;
        }
    }
}
