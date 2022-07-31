import java.util.Arrays;
import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Task 1: Create two arrays (see Workbook article)
        double[] originalPrice = new double[4];
        double[] afterTax = new double[4];
        
        System.out.println("Enter four of your price values: ");
        for (int i = 0; i < originalPrice.length; i++) {
            originalPrice[i] = scan.nextDouble();
        }

        System.out.println("Here's your receipt after taxed:\n");

        for (int i = 0; i < originalPrice.length; i++) {
            afterTax[i] = originalPrice[i]+(originalPrice[i]*0.13);
            System.out.println(afterTax[i]); 
        }
        /* Task 2
            Use a for loop to print each apple and the corresponding price.
            
            for {
                println(\t<apple i >: $<price i >)
            }
        */
    }
}