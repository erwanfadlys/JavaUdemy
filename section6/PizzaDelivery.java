import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**  Task 1: 
         *   1. Ask the user: How many pizza toppings do you want?. 
         *   2. Then, pick up the result using Scanner.
         */
        System.out.println("welcome to my pizzaria, how many toppings do you wamt?");

        int numOfToppings = scan.nextInt();
        scan.nextLine();
        String[] toppings = new String [numOfToppings];
        // Task 2 – Create the array here
        for (int i = 0; i < toppings.length; i++) {
            System.out.print("Please enter your toppings number " + (i+1) + ": ");
            toppings[i] = scan.nextLine();
        }
        System.out.println("Let me repeat your order. Your pizza toppings are");

        for (int i = 0; i < toppings.length; i++) {
            System.out.print(toppings[i] + " ");
        }


        /** Task 3
         *  print Great, enter each topping!
         *  Create a for loop that runs through the length of the array.   
         * 
         */

        /** Task 4 – Pick up the user's toppings and store them in the array.
         *  
         *  See the workbook article for more detail  
         * 
         */

        /** Task 5 –  Loop through the length of the array and print each topping
         *  
         *  See the workbook article for more detail   
         * 
         */

        /** Task 6 –  Confirm the order
         *  
         *  See the workbook article for more detail  
         * 
         */

        scan.close();


         
    }
}
