import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Grocer {
    public static void main(String[] args) {
        
        String aisle[] = {"apples", "bananas", "candy", "chocolate","coffee", "tea"};

        for (int i = 0; i < aisle.length; i++) {
            System.out.print(aisle[i] + " ");
        }
        
        System.out.println("\nDo you sell starbuck?");
        String customerRequest = "starbuck";
        if(binarySearch(aisle, customerRequest)== true ){
            System.out.println("Yes, we do sell " + customerRequest);
        }else{
            System.out.println("We do not sell " + customerRequest);
        }
        
    }
    private static Boolean binarySearch (String[] aisle, String customerRequest) {
        Arrays.sort(aisle); //first we sort the data ascending
        int result = Arrays.binarySearch(aisle, customerRequest);
        // using binary search, we check if cust req string exist in the compared argument.
        boolean bool1 = result > 0 ? true : false;
        return bool1;
    }
}
/* Task 2:
    1. System.out.println("\nDo you sell coffee?");

    2. Using the for loop from task 1:
    • check if Java Grocer sells coffee.
    • if so, break the loop and print: \nWe have that in aisle: <index>

*/
/* Task 1: Create an array that stores each aisle:
             apples – bananas – candy – chocolate – coffee – tea

             Then, use a for loop to print each element in the array. 
        */  