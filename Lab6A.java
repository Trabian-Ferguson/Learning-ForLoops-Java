
import java.util.Scanner;

public class Lab6A {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 10 numbers and this program will display the largest.");
        System.out.println();

        int n;
        int ln =0;
        for (int i = 1; i <=10; i++){
            System.out.println("Please enter number " + i +": ");
             n = sc.nextInt();
           if (n>ln){
               ln=n;
           }
        }



        System.out.println("The largest number was "+ ln);








    }




}
