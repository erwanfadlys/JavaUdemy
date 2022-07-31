import java.util.Scanner;

public class Grocer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] store = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("\nWelcome to Java Grocers. ");
        System.out.println("What can I help you find?\n");
        //  Task 1: Set up Scanner, and pick up the user's response.  
        String userInput = scanner.nextLine();
        
        for (int i = 0; i < store.length; i++) {
            if (store[i].equals(userInput)) {
                System.out.println("Yes, we do sell " + userInput + ". \n It is in aisle number " + i);
            }
            
        }
    }
    
}
/* Task 2  
    if element equals user's response  {
        println: \nWe have that in aisle:  <index>
        break;
    }
*/