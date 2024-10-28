import enums.AccountStatus;
import enums.EmployeeStatus;

import java.util.Date;
import java.util.Scanner;

public class Manager extends Employee implements AccountInt {
    private boolean loggedIn = false;
    private Account account;

    public Manager(String name, String phone, String email, int employeeID, Date dateJoined, String position, double salary, String department, EmployeeStatus status, Account account) {
        super(name, phone, email, employeeID, dateJoined, position, salary, department, status);
        this.account = account;
    }

    public Manager(String manager, String mail, String number, int employeeID, Date dateJoined, String manager1, int salary, String management, AccountStatus accountStatus) {
    }

    @Override
    public void login() {
        loggedIn = true;
        System.out.println("Manager logged in.");
    }

    @Override
    public void logout() {
        loggedIn = false;
        System.out.println("Manager logged out.");
    }

    @Override
    public void register() {
        System.out.println("Manager registered.");
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

    // Метод для добавления сотрудника
    public boolean addEmployee(Employee employee, Branch branch) {
        if (employee != null && branch != null) {
            branch.addEmployee(employee);
            System.out.println("Employee " + employee.getName() + " added to branch " + branch.getName());
            return true;
        } else {
            System.out.println("Invalid employee or branch.");
            return false;
        }
    }
}
