import java.util.Scanner;

public class Prime_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int remainder;
        System.out.print(" Enter a number : ");
        System.out.println("\n");
        int num = sc.nextInt();
        if (num == 0 || num == 1) {

            System.out.println("Its not a prime number");
        } else {
            for (int i = 2; i < num; i++) {
                remainder = num % i;

                if (remainder == 0) {
                    count = count + 1;
                }
            }
            if (count == 0) {
                System.out.print(num + " is a Prime number");
                System.out.println("\n");
            } else {
                System.out.print(num + " is not a Prime number ");
                System.out.println("\n");
            }
        }
    }
}



