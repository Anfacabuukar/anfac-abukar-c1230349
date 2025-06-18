import java.util.Scanner;

public class assig5 {
    static double balance = 700.0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String PIN;
        int attempts=0;
//        creating pin
        System.out.print("Create a 4-digit PIN: ");
        PIN = input.nextLine();

        while (true){
            System.out.println("Enter your pin");
            String userPIN=input.nextLine();
            if (userPIN.equals(PIN)){
                System.out.println(" pin is correct");
                break;
            }
            else {
                attempts++;
                System.out.println("Incorrect PIN");
                if (attempts>=3){
                    System.out.println("You reached attempts");
                    return;
                }
            }
        }

        int choice ;
        do {
            menu();
            choice=input.nextInt();

            if (choice==1){
                deposit(input);


            }
            else if (choice==2){
                withdrow(input);

            }
            else if (choice==3){
                balance();

            }
            else if (choice==4){
                System.out.println("You exited thank you");
                break;

            }
            else {
                System.out.println("Invalid number");
            }

        }
        while (choice<=4);


    }






    //    Deposit money
    public  static void deposit(Scanner input){
        System.out.println("Enter amount to deposit");
        double amount = input.nextDouble();
        if (amount>0){
            balance+=amount;
            System.out.println(" deposited $"+amount);
            System.out.println(" balance is $"+balance);
        }
    }

    //    withdrow
    public static void withdrow(Scanner input){
        System.out.println("Enter amount to withdrow");
        double amount = input.nextDouble();
        if (amount>0 && amount<=balance){
            balance-=amount;
            System.out.println(" withdrowed $"+amount);
            System.out.println(" balance is $"+balance);
        }
    }

    //    balance
    public static void balance(){
        System.out.println(" balance is $"+balance);
    }

    //    menu
    public static void menu(){
        System.out.println("\n \n Choose an option");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. balance");
        System.out.println("4. Exit");
    }


}



