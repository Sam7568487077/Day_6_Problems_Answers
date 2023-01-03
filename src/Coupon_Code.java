
import java.util.Scanner;
import java.util.Random;
public class Coupon_Code {


    public static void main(String[] args) {
        Random rm = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of distinct coupon number you need:");
        int n = sc.nextInt();
        int[] ran_number = new int[n];
        for (int i = 0; i < ran_number.length; i++) {

            ran_number[i] = rm.nextInt(1000000,9000000);
            for (int j = 0; j < i; j++) {
                if (ran_number[i] == ran_number[j]) {
                    i--;
                    break;
                }
            }
        }
            for(int i=0;i<ran_number.length;i++)
            {
                System.out.println("Coupon Code No " + i + " : "+ ran_number[i]);
            }



    }
}