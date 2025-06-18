import java.util.Scanner;

public class assig2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter  number");
        int num= input.nextInt();
        boolean prime = num >1;
        for (int i=2; i <= num/2; i++){
            if (num % i == 0)
                prime = false;
            break;
        }
        System.out.println(prime? num+ "prime number": num+ "not a prime number");

    }
}

