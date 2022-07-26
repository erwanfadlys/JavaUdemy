import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your conditional method...");
        System.out.println("\telseif ('e')\tswitch ('s')");
        String conditionalMethod = scan.nextLine();
        //this will keep thescript prompting the question
        boolean bool = true;
        while (bool == true) {
            if (conditionalMethod.equals("e") || conditionalMethod.equals("s")){
                bool = false;
            }else{
                System.out.println("Please input 'e' or 's'");
            }
        }
        //persistent code ends here

        //else if implementation
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (y or n)");
        //Task 1 - Pick up the user's decision.
        String userOption = scan.nextLine();
        
        if (conditionalMethod.equals("e")){
            if (userOption.equals("y")) {
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
        }else{
            //implement switch, see how worst can this code run
            switch (userOption){

                case "y":
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
                break;

                default:
                System.out.println("\nOK. Have a nice day!");
                break;
            }
        }
        //Task 2 - Print this if the decision is "yes"
       
            // Task 3 - Pick up each value            
            // Task 4 - Pick up number of years
            // Task 5 - Pick up the user's name
            //Task 6 - Approve the mortgage if they meet the requirements (see article)
            //       - Otherwise, don't give them a mortgage.          
            //Task 2 - Print this if the decision was not "yes"

        scan.close();
    }
}