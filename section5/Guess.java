import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {
        double doubleSec = Math.random() * 6;
        int secret = (int)doubleSec;
        System.out.println(secret);
       /* Task 1 
            1. Store a "secret" number between 1 and 5. 
            2. Then, prompt the user to enter a guess.
       */
       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        
       Scanner scan = new Scanner(System.in);
       int userInput = scan.nextInt();
       while (userInput != secret){
        System.out.print("Guess again: ");
        userInput = scan.nextInt();
       }
       System.out.println("You got it!");

        /* Task 2 
            1. Set up a loop that keeps running while the user is incorrect
               Every time they get it wrong, write 'Guess again: '

            2. Once they guess it, print: You got it!
        */        
        scan.close();
    }

}
