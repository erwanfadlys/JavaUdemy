import java.util.Scanner;

public class Dealership {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println(" Welcome to Java Dealership");
        System.out.println("\nSelect option A to buy a car");
        System.out.println("\nSelect option B to sell a car");

        String option = scan.nextLine();
        switch (option) {
            case "A": System.out.println("You choose option "+ option); 
            break;
            case "B": System.out.println("You choose option "+ option);
            break;
            default: System.out.println("Invalid Option!!");
        }
        scan.close();
    }
}