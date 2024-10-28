import enums.AccountStatus;
import enums.EmployeeStatus;

import java.sql.Time;
import java.util.Date;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args){
        forSwitching();
    }
    public static void forSwitching(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who do you want to log in as :");
        System.out.println("1. Manager\n2. Cashier\n3. Waiter\n4. Chef\n5. Receptionist");
        int forSwitching = scanner.nextInt();
        switch (forSwitching){
            case 1:
                Manager manager = new Manager();
                forLoggingInManager();
                System.out.println("You are logged in");
                break;
            case 2:
                Cashier cashier = new Cashier();
                break;
            case 3:
                Waiter waiter = new Waiter();
                break;
            case 4:
                Chef chef = new Chef();
                break;
            case 5:
                Receptionist receptionist = new Receptionist();
                break;
            default:
                System.out.println("Invalid input!\n Please choose numbers ONLY from 1 to 5");
                forSwitching();
        }
    }
    public static void forLoggingInManager(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int employeeID = scanner.nextInt();
        String id = scanner.next();
        String password = scanner.next();
        Address address = new Address() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        AccountStatus accountStatus = AccountStatus.ACTIVE;
        Account account = new Account(id,password,address,accountStatus);
        String phone = scanner.next();
        String email = scanner.next();
        String position = scanner.next();
        Date dateJoined = new Date();
        double salary = scanner.nextDouble();
        String department = scanner.next();
        EmployeeStatus employeeStatus = EmployeeStatus.ACTIVE;
        Branch worksAt = new Branch();
        Manager manager = new Manager(name,phone,email,employeeID,dateJoined,position,salary,department,employeeStatus,account,worksAt);
    }
    public static void forLoggingInCashier(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int employeeID = scanner.nextInt();
        String id = scanner.next();
        String password = scanner.next();
        Address address = new Address() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        AccountStatus accountStatus = AccountStatus.ACTIVE;
        Account account = new Account(id,password,address,accountStatus);
        String phone = scanner.next();
        String email = scanner.next();
        String position = scanner.next();
        Date dateJoined = new Date();
        double salary = scanner.nextDouble();
        String department = scanner.next();
        EmployeeStatus employeeStatus = EmployeeStatus.ACTIVE;
        Branch worksAt = new Branch();
        Manager manager = new Manager(name,phone,email,employeeID,dateJoined,position,salary,department,employeeStatus,account,worksAt);
    }
}