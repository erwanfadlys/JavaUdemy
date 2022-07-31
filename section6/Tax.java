import java.text.DecimalFormat;
import java.util.Arrays;
public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        
        double[] afterTax = new double[price.length];

        for (int i= 0; i < price.length; i++) {
            afterTax[i] = price[i]+(price[i]*0.13);
            System.out.println("The original prices are: " + price[i]);
            System.out.println("The price after tax are: " + afterTax[i] + "\n");
        }

        //the result is messy, create one function for decimal convert.

        /** Task 1: 
         * 
         *  Create a new array afterTax with the same length as price
         * 
         */

         /** Task 2:
          * 
          *  Update each element in afterTax to be: price + 13% * price.
          *
          */

         /** Task 3:
          * 
          * Print the following messages:
          *     The original prices are: <original prices>
          *     The prices after tax are: <after tax prices>
          *
          */

    }
}
