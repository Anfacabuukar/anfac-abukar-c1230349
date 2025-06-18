import java.util.Scanner;

public class assig1 {
    public static void main(String[] args) {
        int sum = 0;

        System.out.println("Enter numbers.");
        System.out.println("'n' exit.");
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter integer: ");
            String Input = input.next();
            if (Input.equalsIgnoreCase("n")) {
                break;
            }

            try {
                int number = Integer.parseInt(Input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }

        System.out.println("sum" + sum);
    }
}

