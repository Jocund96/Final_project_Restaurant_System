import java.util.Scanner;

public class Waiter extends Employee implements AccountInt {
    private boolean loggedIn = false;
    private Account account;

    public Waiter(Account account) {
        this.account = account;
    }

    @Override
    public void login() {
        loggedIn = true;
        System.out.println("Waiter logged in.");
    }

    @Override
    public void logout() {
        loggedIn = false;
        System.out.println("Waiter logged out.");
    }

    @Override
    public void register() {

        System.out.println("Waiter registered.");
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

    public void placeOrder(Order order) {
        if (loggedIn) {
            // Логика размещения заказа
            System.out.println("Placing order...");
        } else {
            System.out.println("Please log in first.");
        }
    }

    public void updateOrder(Order order) {
        if (loggedIn) {
            // Логика обновления заказа
            System.out.println("Updating order...");
        } else {
            System.out.println("Please log in first.");
        }
    }

    // Другие методы
}
