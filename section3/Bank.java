import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        //Task 1 - Pick up the user's decision.
        String userOption = scan.nextLine();
        //Task 2 - Print this if the decision is "yes"
        if (userOption.equals("yes")) {
            System.out.println("\nGreat! In one line" +
            "\nHow much money do you have in your savings?" +
            "\nAnd, how much do you owe in credit card debt?");

            double savings =scan.nextDouble();
            double debt = scan.nextDouble();

            System.out.println("\nHow many years have you worked for?");
            int userWorkExp = scan.nextInt();
            //scan.nextLine trap here, use throwaway
            scan.nextLine();
            System.out.println("What is your name?");
            String name = scan.nextLine();
        
            if ((savings - debt ) > debt && (userWorkExp > 5)){
                System.out.println("Congratulations " + name + " You have been approved!");
            }else {
                System.out.println("Sorry, you are not eligible for a mortgage.");
            }
        }else{
            System.out.println("\nOK. Have a nice day!");
        }
            // Task 3 - Pick up each value            
            // Task 4 - Pick up number of years
            // Task 5 - Pick up the user's name
            //Task 6 - Approve the mortgage if they meet the requirements (see article)
            //       - Otherwise, don't give them a mortgage.          
            //Task 2 - Print this if the decision was not "yes"
        scan.close();
    }
}