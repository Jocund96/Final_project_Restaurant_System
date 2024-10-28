import java.util.Scanner;

public class Receptionist extends Employee implements AccountInt {
    private boolean loggedIn = false;
    private Account account;

    public Receptionist(){}
    public Receptionist(Account account) {
        super();
        this.account = account;
    }

    @Override
    public void login() {
        loggedIn = true;
        System.out.println("Receptionist logged in.");
    }

    @Override
    public void logout() {
        loggedIn = false;
        System.out.println("Receptionist logged out.");
    }

    @Override
    public void register() {
        // Логика регистрации
        System.out.println("Receptionist registered.");
    }

    @Override
    public void changePassword() {
        // Логика смены пароля
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new password: ");
        String newPassword = scanner.nextLine();
        if (account.resetPassword(newPassword)) {
            System.out.println("Password changed successfully.");
        } else {
            System.out.println("Password change failed.");
        }
    }

    public void searchTable() {
        if (loggedIn) {
            // Логика поиска стола
            System.out.println("Searching for available tables...");
        } else {
            System.out.println("Please log in first.");
        }
    }

    public void reserveTable() {
        if (loggedIn) {
            // Логика резервирования стола
            System.out.println("Reserving a table...");
        } else {
            System.out.println("Please log in first.");
        }
    }

    // Другие методы
}
