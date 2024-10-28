import enums.AccountStatus;
import enums.EmployeeStatus;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();
        Branch branch = new Branch("Central Branch", new ConcreteAddress("123 Main St", "City", "State", "12345", "Country"));
        restaurant.addBranch(branch);

        Account receptionistAccount = new Account("receptionist1", "password", branch.getLocation(), AccountStatus.ACTIVE);
        Account waiterAccount = new Account("waiter1", "password", branch.getLocation(), AccountStatus.ACTIVE);

        Receptionist receptionist = new Receptionist(receptionistAccount);
        Waiter waiter = new Waiter(waiterAccount);
        branch.addEmployee(receptionist);
        branch.addEmployee(waiter);

        Manager manager = new Manager("Manager", "manager@example.com", "1234567890", 1, new Date(), "Manager", 50000, "Management", AccountStatus.ACTIVE);
        Chef chef = new Chef("Chem", "phone", "email", "2", new Date(),"Chef", 5000.0, "Kitchen", EmployeeStatus.ACTIVE, AccountStatus.ACTIVE);

        while (true) {
            System.out.println("1. Login as Receptionist");
            System.out.println("2. Login as Waiter");
            System.out.println("3. Logout");
            System.out.println("4. Search Table (Receptionist)");
            System.out.println("5. Reserve Table (Receptionist)");
            System.out.println("6. Place Order (Waiter)");
            System.out.println("7. Update Order (Waiter)");
            System.out.println("8. Change Password (Receptionist)");
            System.out.println("9. Change Password (Waiter)");
            System.out.println("10. Add Employee (Manager)");
            System.out.println("11. Remove Employee (Manager)");
            System.out.println("12. Update Menu (Manager)");
            System.out.println("13. Exit");
            System.out.println("14. Manager Login");
            System.out.println("15. Chef Login");
            System.out.println("16. Manager Logout");
            System.out.println("17. Chef Logout");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    receptionist.login();
                    break;
                case 2:
                    waiter.login();
                    break;
                case 3:
                    receptionist.logout();
                    waiter.logout();
                    break;
                case 4:
                    receptionist.searchTable();
                    break;
                case 5:
                    receptionist.reserveTable();
                    break;
                case 6:
                    Order order = new Order(1); // Пример заказа
                    waiter.placeOrder(order);
                    break;
                case 7:
                    Order updateOrder = new Order(1); // Пример обновления заказа
                    waiter.updateOrder(updateOrder);
                    break;
                case 8:
                    receptionist.changePassword();
                    break;
                case 9:
                    waiter.changePassword();
                    break;
                case 10:
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter employee email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter employee phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter employee id: ");
                    int employeeID = scanner.nextInt();
                    Date dateJoined = new Date();
                    System.out.print("Enter employee position: ");
                    String position = scanner.nextLine();
                    System.out.print("Enter employee salary: ");
                    double salary = scanner.nextDouble();
                    System.out.print("Enter employee department: ");
                    String department = scanner.nextLine();
                    EmployeeStatus status = EmployeeStatus.ACTIVE;
                    Employee employee = new Employee(name, phone, email, employeeID, dateJoined, position, salary, department, status, branch);

                    manager.addEmployee(employee, branch);
                    break;
                case 11:
                    System.out.print("Enter employee ID to remove: ");
                    employeeID = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Employee with ID " + employeeID + " removed.");
                    break;
                case 12:
                    System.out.print("Enter menu section name: ");
                    String sectionName = scanner.nextLine();
                    MenuSection section = new MenuSection(sectionName);
                    branch.getMenu().addSection(section);
                    System.out.println("Menu section " + sectionName + " added.");
                    break;
                case 13:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                case 14:
                    manager.login();
                    break;
                case 15:
                    chef.login();
                    break;
                case 16:
                    manager.logout();
                    break;
                case 17:
                    chef.logout();
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
