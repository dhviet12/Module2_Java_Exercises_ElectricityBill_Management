import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static Manage billManage = new Manage();
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Add new bill");
            System.out.println("2. Get total money");
            System.out.println("3. Show bill list");
            System.out.println("0. Exit");
            choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Enter number of bills you want to add");
                    int number = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < number; i++) {
                        addNewBill();
                    }
                    break;
                case 2:
                    System.out.println("Enter client id");
                    int clientID = Integer.parseInt(input.nextLine());
                    int result = billManage.getTotalMoneyById(clientID);
                    System.out.println("Bill needs to pay = "+result);
                    break;
                case 3:
                    billManage.displayAll();
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice != 0);
    }
    public static void addNewBill(){
        System.out.println("Enter client ID");
        int clientID= Integer.parseInt(input.nextLine());
        System.out.println("Enter customer's name");
        String name = input.nextLine();
        System.out.println("Enter house number");
        int houseNumber = Integer.parseInt(input.nextLine());
        final int validIndex = 0;
        int oldIndex;
        do {
            System.out.println("Enter old index");
            oldIndex = Integer.parseInt(input.nextLine());
        }while (oldIndex<validIndex);
        int newIndex;
        do {
            System.out.println("Enter new index");
            newIndex= Integer.parseInt(input.nextLine());
        } while (oldIndex> newIndex);
        Customer customer = new Customer(name,houseNumber,clientID);
        Bill bill = new Bill(customer,oldIndex,newIndex);
        billManage.addBill(bill);
        System.out.println("Successfully add");
    }
}
