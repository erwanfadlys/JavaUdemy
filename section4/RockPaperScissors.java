import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

    //Task 1: See if the user wants to play. 
        String userInput = scan.nextLine();
        
        if (userInput.equals("yes")){
            System.out.print("How many times do you want to play? ");
            int numOfPlays = scan.nextInt();
            scan.nextLine();//throwexception
            
            System.out.println("Great!");
            System.out.println("rock - paper - scissors, shoot!");
            

            for (int i = 0; i <numOfPlays; i++) {
            System.out.print("Enter your choice: ");
            String yourChoice = scan.nextLine(); //save result to my variable
            String computerChoice = computerChoice(); //save return value to string variable
            String computeResult = (result(yourChoice, computerChoice)); //just pass the string value, dont call the function within especially the computer choice otherwise data will be amended.
            printResult(yourChoice, computerChoice, computeResult); //, computeResult);
            }
        }
    scan.close();
    }

//Task 3
    public static String computerChoice(){
        
        Random r = new Random(); //to generate random number
        int upperbound = 3; //3 because the random 0 to (upperbound - 1) which is 2
        int random = r.nextInt(upperbound);
        
        switch(random){
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "404";
        }//throwexception
    }
    //Task 4
    public static String result(String yourChoice, String computerChoice) {
        
        String result = "";
        if (yourChoice.equals("rock") && computerChoice.equals("scissors")){
            result = ("You win!"); //save the string in result variable to be returned later
        }else if(yourChoice.equals("paper") && computerChoice.equals("rock")){
            result = ("You win!");
        }else if(yourChoice.equals("scissors") && computerChoice.equals("paper")){
            result = ("You win!");
        }else if(computerChoice.equals("rock") && yourChoice.equals("scissors")){
            result = ("You lose!");
        }else if(computerChoice.equals("paper") && yourChoice.equals("rock")){
            result = ("You lose!");
        }else if(computerChoice.equals("scissors") && yourChoice.equals("paper")){
            result = ("You lose!");
        }else if(yourChoice.equals(computerChoice)){
            result = ("Its a tie!");
        }return result;
    }
    
    //task 5
    
    public static void printResult (String yourChoice,  String computerChoice, String result) {
        
        System.out.println("\nYou have choose " + yourChoice);
        System.out.println("Computer have choose " + computerChoice);
        System.out.println(result + "\n");
    }
}
/*Task 2: Set up the game


   • if the answer is yes: 
         – print: Great!
         – print: rock – paper – scissors, shoot!
         – pick up user's choice.
         – get the computer choice (can only be done after task 3).
         – get the result (can only be done after task 4)
         – print everything (can only be done after task 5).

   • else:
         – print: Darn, some other time...!        
*/

//Task 3  – Write a function where the computer picks a random choice.

/**
 * Function name: computerChoice - picks randomly between rock paper and scissors
 * @return a choice (String).
 * 
 * Inside the function:
 *   1. Picks a random number between 0 and 2.
 *   2. if 0: returns the choice 'rock'
 *      if 1: returns the choice 'paper'
 *      if 2: returns the choice 'scissors'
 */

//Task 4  – Write a function that compares the choices and returns the result.

/**
 * Function name: result - It returns the result of the game.
 *  @param yourChoice (String)
 *  @param computerChoice (String) 
 *  @return result (String) 
 
 * Inside the function:
 *   1. result is "You win" if:
 * 
 *       You: "rock"      Computer: "scissors"
 *       You: "paper"     Computer: "rock"
 *       You: "scissors"  Computer: "paper"
 * 
 *   2. result is "You lose" if:
 * 
 *       Computer: "rock"      You: "scissors"
 *       Computer: "paper"     You: "rock"
 *       Computer: "scissors"  You: "paper"
 * 
 *   3. result is "It's a tie" if:
 * 
 *       your choice equals computer choice.
 *   
 */



    //Task 5  – Write a function that prints your choice, the computer's, and the result.

/**
 * Name: printResult - It prints everything (your choice, computer choice, result)
 * @param yourChoice (String)
 * @param computerChoice (String)
 * @param result (String)
 * 
 * Inside the function:
 * 
 *  1. prints everything:
 *      – prints: You chose:          <your choice>
 *      – prints: The computer chose: <computer choice>
 *      – prints: <result>
 */


