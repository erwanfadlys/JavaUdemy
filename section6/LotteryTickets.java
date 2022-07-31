import java.util.Arrays;

public class LotteryTickets {
    public static void main(String[] args) {
        int[] ticket = {34, 43, 45, 65, 21, 54};
        //Task 1 - Copy the elements of ticket into ticket2, but change the third value to 54. 
        int[] newTickets = new int[ticket.length];
        
        for (int i = 0; i < newTickets.length; i++){
            newTickets[i] = ticket[i];
        }

        newTickets[2] = 54;

        System.out.print("Ticket 1 numbers: ");
        printTicketNumbers(ticket);
       
    
        //Task 3 - Call printTicketNumbers for int[] ticket.   

        System.out.print("\n\nTicket 2 numbers: ");

        printTicketNumbers(newTickets);
        //Task 3 - Call printTicketNumbers for int[] ticket2.   
    }
    public static void printTicketNumbers (int[] ticket) {
        for (int i = 0; i< ticket.length; i++) {
            System.out.print(ticket[i] + "  ");
        }
    }
    /** Task 2
     * Function name – printTicketNumbers
     * @param ticket ( int[] )
     * 
     * Inside the function:
     *   1.   print the numbers in one line. 
     *        i.e  1 4 6 3 2 6 
     *   2.   print a new line   
     */
    
}

