import java.util.Scanner;

public class Perfect_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int remainder;
        System.out.print(" Enter a number : ");
        System.out.println("\n");
        int num = sc.nextInt();
        for (int i = 1; i < num; i++) {
            remainder = num % i;

            if (remainder == 0) {
                count = count + i;


            }

        }
        if (count == num) {
            System.out.print(num + " is a perfect number");
            System.out.println("\n");
        } else {
            System.out.print(num + " is not a perfect number ");
            System.out.println("\n");
        }
    }
}
