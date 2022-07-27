import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";
        int numOfAttempts = 0;
        
        /* Task 1 
            1. Pick up a username and password from the user.
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("• Username: ");
        //pick up username
        
        boolean boolean1 = true;
        while (boolean1){
            String userInput = scan.next();
            numOfAttempts++;
            if (numOfAttempts > 2){
                System.out.println("Exceed number of try. Program will exit now.");
                System.exit(0);
            }
            if (userInput.equals(username)){
                boolean1 = false;
            }
        }
        System.out.print("• Password: ");
        //pick up password
        while (!boolean1){
            String userPassword = scan.next();
            numOfAttempts++;
            if (numOfAttempts > 5){
                System.out.println("Exceed number of try. Program will exit now.");
                System.exit(0);
            }
            if (userPassword.equals(username)){
                boolean1 = false;
            }
        }
        /* Task 2 
            1. Set up a loop that keeps running while the username OR password is incorrect. 
               When they get it wrong:
                •  println: \nIncorrect, please try again!\n
                •  get them to enter their username and password again
            2. After they enter the correct information, print: 
                   \nSign in successful. Welcome!
       */

        scan.close();

        
    }
}
