import java.util.Scanner;

public class Stop_Watch {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long start_time;
        long end_time;
        long time;

        System.out.println("CLICK ON ANY NUMBER BETWEEN 1 - 10 AND PRESS ENTER TO START");
        start_time = sc.nextLong();
        start_time = System.currentTimeMillis();
       // System.out.println(start_time);
        System.out.println("CLICK ON ANY NUMBER BETWEEN 1 - 10 AND PRESS ENTER TO END");
        end_time = sc.nextLong();
        end_time = System.currentTimeMillis();
        //   System.out.println(end_time);

        time = (end_time - start_time) / 1000;

        System.out.print("THE ELASPED TIME IS :" + time + " SEC");
        /* if(time >= 60)
        {
            long min= time/60;
            System.out.println("THE TIME IN MINUTES IS:" + min + " MIN");
        }
        else
        {
            System.out.print("THE ELASPED TIME IS :" + time + " SEC");
        }
*/


    }
}
