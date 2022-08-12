public class AppleStore {
    public static void main(String[] args) {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;


        System.out.println("You picked 500 apples from an apple orchard");
        numOfApples += 500;
        //Update number of apples.      
        
        System.out.println("Time for business! You're selling each apple for 40 cents");
        double pricePerApples = 0.4;
        //Make a price variable. Set it equal to 40 cents. 
        
        System.out.println("One customer walked in. He bought 4 apples!");
        numOfApples -= 4;
        System.out.println("number of apple " + numOfApples);
        //Update number of apples.
        numOfCustomers++;
        System.out.println("numofcustomer " + numOfCustomers);
        //Update number of customers;
        profit = 4 * pricePerApples;
        System.out.println("profit " + profit);
        //Update profit

        System.out.println("Another customer walked in. He bought 20 apples!");
        numOfCustomers++;
        System.out.println(numOfCustomers);
        numOfApples -= 20;
        profit += (pricePerApples * 20);
        System.out.println(profit); ;
        //Update number of apples;
        //Update number of customers;
        //Update profit

        System.out.println("Another customer walked in. She bought 200 apples!");
        //Update number of apples;
        numOfApples -= 200;
        //Update number of customers;
        numOfCustomers ++;
        //Update profit
        profit += (pricePerApples * 200);
        System.out.println(profit);

        System.out.println("Wow! So far, you made: $" + profit + ".");
        System.out.println(numOfCustomers + " customers love your apples.");
        System.out.println("You have " + numOfApples + " apples left. We'll sell more tomorrow!");




    }

}