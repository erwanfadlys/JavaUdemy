import java.util.Scanner;

public class sec2Capstone{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Hello. What is your name? ");
        String name = scan.nextLine();

                           
        //add new a line before asking next question. 
        System.out.print("\nHi "+ name + "! I'm Javabot. Where are you from? ");
        //Pick up user's home and store it. 
        String home = scan.nextLine();


        //add new a line before asking next question.
        System.out.println("\nI hear it's beautiful at " + home + "! I'm from a place called Oracle");
        System.out.print("How old are you? ");
        //Pick up age and store it.
        int age = scan.nextInt();
        scan.nextLine();

        //add new a line before asking next question.
        System.out.println("\nSo you're " + age + ", cool! I'm 400 years old.");
        System.out.println("This means I'm " + (400 / age) + " times older than you.");
        System.out.print("\nEnough about me. What's your favourite language? (just don't say Python)");

        //Pick up language and store it. 
        String newLanguage = scan.nextLine();


        //add new a line here.


        System.out.println("\n" + newLanguage + ", that's great! Nice chatting with you " + name + ". I have to log off now. See ya!");
        
        scan.close();

        
    }
}
