public class RingAnnouncer {
    public static void main(String[] args) {
        String[] record = {"WIN", "LOSS", "WIN", "LOSS", "WIN", "WIN", "LOSS"};

        int winCount = 0;
        int lossCount = 0;
        for (int i = 0; i < record.length; i++) {
            if (record[i].equals("WIN")) {
                winCount++;
            }else if (record[i].equals("LOSS")){
                lossCount++;
            }
        }

        System.out.println("Win : " + winCount + "\nLoss : " + lossCount);
    }
}
/** Task 1 
 * 
 *   Using a for loop:
 *       count Java's wins and store the result in a variable: wins. 
 *       count Java's losses and store the result in a variable: losses.
 *
 * 
 * 
 */

/** Task 2
 * Print:
 *     • \nWith a professional record of <wins> Wins and <losses> losses. 
 *     • He is the pride of oracle: Java Fury!
 *
 * 
 */        
