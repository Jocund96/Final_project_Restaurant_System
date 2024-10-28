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
    public static void forLoggingIn(){
        String name;

    }
}