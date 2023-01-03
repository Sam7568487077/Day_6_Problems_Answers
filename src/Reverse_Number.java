import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        int remainder = 0;
        int reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int num = sc.nextInt();

        while (num != 0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        System.out.println("The reverse of number is : " + reverse);
    }
}
