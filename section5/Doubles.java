public class Doubles {
    public static void main(String[] args) {

        /* Task 2
            1. Call the rollDice() function twice.
            2. Store the return values in dice1 and dice2.   
        
        */
        
        int dice1 = (diceRoll());
        int dice2 = (diceRoll());


        while (dice1 != dice2) {
            dice1 = (diceRoll());
            dice2 = (diceRoll());
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
            if (dice1 == dice2) {
                System.out.println("You rolled doubles!\n");
            }else{
                System.out.println("Bummers, again!\n");
            }
        }

   //      System.out.println("Dice 1: " + dice1);
   //      System.out.println("Dice 2: " + dice2 + "\n");

        /* Task 3
            1. Set up a loop that keeps running while the two dice aren't the same.
            2. During each run, re-roll the dice and print the two values. 
         */


        // Task 4: After they roll doubles, print: You rolled doubles!
    }

    public static int diceRoll() {
        double randomNumber = Math.random() * 6;
        return ((int)randomNumber+1);
    }
    /** Task 1 
     * Function name: rollDice – rolls a dice between 1 and 6
     * @return randomNumber (int)
     * 
     */

}





