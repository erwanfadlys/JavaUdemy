public class Tip {

    public static void main(String[] args) {
        double bill = 53.5;
        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Thank you!");
        
        
        System.out.println("Your service was wonderful! Please, accept this tip: " + tipTheWaiter(bill));
        //Task 2: Call a function that tips the waiter.
    }



    
    //Task 1: Make a function here. See the doc comment for details.  
    public static double tipTheWaiter (double bill) {
        double tip = (bill * 0.15);
        return tip;
    }
    /**
     * Function name: tipTheWaiter - calculates a tip and prints it.
     * 
     * Inside the function:
     *  1. Calculates a tip that's 15 percent of bill.
     *  2. Prints: Your service was wonderful! Please, accept this tip: $<tip>
     */

}