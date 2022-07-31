import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        intro();
        
        String enterkey = scan.nextLine();

        int randomCard1, randomCard2;
        String cardPlayer1, cardPlayer2, faceDown;
        randomCard1 = drawRandomCard();
        cardPlayer1 = cardString(randomCard1);
        randomCard2 = drawRandomCard();
        cardPlayer2 = cardString(randomCard2);
        faceDown = faceDown();
        
        System.out.println("\nYou get a \n" + cardPlayer1 + "\n and a \n" + cardPlayer2);
        System.out.println("Your total hand is " + (randomCard1 +  randomCard2));
        enterkey = scan.nextLine();
        
        int dealerCard1, dealerCard2;
        String cardDealer1, cardDealer2;
        dealerCard1 = drawRandomCard();
        dealerCard2 = drawRandomCard();
        cardDealer1 = cardString(dealerCard1);
        cardDealer2 = cardString(dealerCard2);
        System.out.println("The dealer shows \n" + cardDealer1 + "\n and has a card facing down \n" + faceDown());

        int sumDealer, sumPlayer;

        sumDealer = dealerCard1 + dealerCard2;
        sumPlayer = randomCard1 + randomCard2;
        String userChoice = hitOrStay();
  
        while (userChoice.equals("hit")){
            randomCard1 = drawRandomCard();
            cardPlayer1 = cardString(randomCard1);
            System.out.println(cardPlayer1);
            sumPlayer += randomCard1;
            System.out.println("Total hand of player " + sumPlayer);
            
            if (sumPlayer >= 27){
                System.out.println("You lose, your total hand is "+ sumPlayer + ".");
                System.out.println("Thanks for playing.");
                System.exit(1);
            }else{
                userChoice = hitOrStay();
            }
        }

        while (sumDealer <= 17){
            dealerCard1 = drawRandomCard();
            cardDealer1 = cardString(dealerCard1);
            sumDealer += dealerCard1;
            System.out.println(cardDealer1);
            System.out.println(sumDealer);
        }
        
        System.out.println(compareTotalHand(sumPlayer, sumDealer));
        scan.close();
    }

    public static int drawRandomCard(){
        double randomNumber = Math.random() * 13;
        return ((int)randomNumber+1);
    }
    
    public static String cardString (int cardNumber){
        switch (cardNumber) {
            case 1:
            return 
            "    _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n";
            case 2:
            return  
            "   _____\n"+              
            
            "  |2    |\n"+ 
            "  |  o  |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____Z|\n";        
            case 3:
            return  
            "   _____\n" +
            "  |3    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____E|\n";      
            case 4:
            return  
            "   _____\n" +
            "  |4    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  | o o |\n"+
            "  |____h|\n";
            case 5:
            return  
            "   _____ \n" +
            "  |5    |\n" +
            "  | o o |\n" +
            "  |  o  |\n" +
            "  | o o |\n" +
            "  |____S|\n";     
            case 6:
            return  
            "   _____ \n" +
            "  |6    |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  |____6|\n";
            case 7:
            return  
            "   _____ \n" +
            "  |7    |\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |____7|\n";
            case 8:
            return  
            "   _____ \n" +
            "  |8    |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  |____8|\n";
            case 9:
            return  
            "   _____ \n" +
            "  |9    |\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |____9|\n";
            case 10:
            return  
            "   _____ \n" +
            "  |10  o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |___10|\n";

            case 11:
            return 
            "   _____\n" +
            "  |J  ww|\n"+ 
            "  | o {)|\n"+ 
            "  |o o% |\n"+ 
            "  | | % |\n"+ 
            "  |__%%[|\n";
            
            case 12:
            return  
            "   _____\n" +
            "  |Q  ww|\n"+ 
            "  | o {(|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%O|\n";

            case 13:
            return 
            "   _____\n" +
            "  |K  WW|\n"+ 
            "  | o {)|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%>|\n";

            default:
            return "404";
        }
    }


    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    

    public static String hitOrStay (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to hit or stay?");
        String userInput = scan.nextLine();

        while (!userInput.equals("hit") && !userInput.equals("stay")){
            System.out.println("Please choose between hit or stay.");
            userInput = scan.nextLine();
        }
        return userInput;
    }
    
    public static void intro () { 
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
    }

    public static String compareTotalHand (int sumPlayer, int sumDealer) {
        if (sumPlayer > sumDealer){
            String winningStatements = ("Player win the game!\nPlayer hand is " + sumPlayer + " and dealer hand is " + sumDealer + ".");
            return winningStatements;
        }else if(sumDealer > sumPlayer) {
            String winningStatements = ("Dealer win the game!\nDealer hand is " + sumDealer + " and player hand is " + sumPlayer + ".");
            return winningStatements;
        }else{
            String tieStatements = ("Game tie, I need to code another program but the card need to be compared through ranks. Will revisit this prgram later. Ciao. \n29 July 2022.");
            return tieStatements;
        }
    }
}
/** Task 1 – make a function that returns a random number between 1 and 13
 * Function name – drawRandomCard
 * @return (int)
 *
 * Inside the function:
 *   1. Gets a random number between 1 and 13.
 *   2. Returns a card.
 */

/** Task 2 – make a function that returns a String drawing of the card.
 * Function name – cardString
 * @param cardNumber (int)
 * @return (String)
 *
 * Inside the function:
 *   1. Returns a String drawing of the card.
 */

//Task 3 – Wait for the user to press enter.


//Task 4 – Get two random cards.

//       – Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>

//Task 5 – Print the sum of your hand value.
//       – print: your total is: <hand value>


//Task 6 – Get two random cards for the dealer.
//       – Print: The dealer shows \n" + <first card> + "\nand has a card facing down \n" + <facedown card>
//       – Print: \nThe dealer's total is hidden

//     String userInput = "";
//    while ((!userInput.equals("stay")) && (!userInput.equals("hit"))) {
//     userInput = hitOrStay();

/** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */

//Task 8 – Keep asking the player to hit or stay (while loop).
//       1. Every time the player hits
//             – draw a new card.
//             – calculate their new total.
//             – print: (new line) You get a (new line) <show new card>.
//             - print: your new total is <total>

//       2. Once the player stays, break the loop. 


//For tasks 9 to 13, see the article: Blackjack Part II.