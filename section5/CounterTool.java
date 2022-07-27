import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

        System.out.print("Pick a number to count by: ");
        int countBy = scan.nextInt();
        System.out.print("Pick a number to start counting from: ");
        int countFrom = scan.nextInt();
        System.out.print("Pick a number to count to: ");
        int countTo = scan.nextInt();
        
        jimmyCount(countBy,countFrom,countTo);
        /* Task 1 – Get integers from the user.


          1.   print : Pick a number to count by:
               pick up the user's answer
        
          2.   print : Pick a number to start counting from:
               pick up the user's answer

          3.    print : Pick a number to count to:
                pick up the user's answer 
                
        */
        

      /* Task 2 – Create a for loop that:
            1. starts from the second number.
            2. stops at the third number. 
            3. counts in steps of the first.
      */

        scan.close();
    }

    public static void jimmyCount(int countBy, int countFrom, int countTo) {
      //System.out.println(countBy + " cb " + countFrom + " cf " + countTo+ " ct ");
      for (int i = countFrom; i <= countTo; i += countBy) {
        System.out.print(i + " ");
      }
      // for (int i = 6; 3 <= 66 ; 3 += 6   
    }
}
