import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner imbas = new Scanner(System.in);
        System.out.println("Welcome to JavaGram! Let's sign you up.");
        

        //Task 1 - Using Scanner, ask the user questions
        //Ask for their first name.
        System.out.print("Hello, what is your first name? ");
        String firstName = imbas.nextLine();
        //Ask for their last name.
        System.out.print("Hello, what is your last name? ");
        String lastName = imbas.nextLine();
        //Ask: how old are you?
        System.out.print("Hello " + firstName +" "+ lastName +", how old are you? ");
        int age = imbas.nextInt();

        /* Ask them to make a username. SIDE NOTE:
        */
        //Throwaway nextline because this nextline will be skipped if there is nextint, double and long. delimiters
        imbas.nextLine();
        System.out.print("Create your username: ");
        String username = imbas.nextLine();
        
        
        //    – nextLine() gets "skipped" if you put it ahead of nextInt() , nextDouble(), nextLong().
        //    – You will understand why this happens when we cover Delimiters in the next section (Booleans and Conditionals).
        //    – For now, just know that the solution is to add an extra nextLine().
    
        //Ask what city they live in.
        System.out.print("What is the city that you live in?");
        String city = imbas.nextLine();
        //Ask what country that's from.
        System.out.print("What is the country that you come from?");
        String country = imbas.nextLine(); 


        //Task 2 - Print their information. 

        System.out.println("Thank you for joining JavaGram!");

        //Print their information like so:
        System.out.println("Your information: ");
        System.out.println("    First Name: " + firstName);
        System.out.println("    Last Name: " + lastName);
        System.out.println("    Age: " + age);
        System.out.println("    City: " + city);
        System.out.println("    Country: " + country);
        System.out.println("    Username: " + username);
        imbas.close();
        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //


        //close scanner. It's good practice :D ! 
    }
}
