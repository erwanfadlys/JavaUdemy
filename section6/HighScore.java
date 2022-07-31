import java.util.Arrays;

public class HighScore {
    public static void main(String[] args) {
        
        int highScore = 0;
        int highScoreList[] = new int[10]; 

        for (int i = 0; i <highScoreList.length; i++) {
            highScoreList[i] = randomNumber(); //generate rand number and initialise that number to array[index]
            System.out.println(highScoreList[i]);
        }

        Arrays.sort(highScoreList); //import arrays lib and sort the highscore list ascending. means the highest is last index
        System.out.println(highScoreList[highScoreList.length - 1] + " is the highest number in the list.");
        }

    public static int randomNumber(){
        double random = Math.random() * 50000;
        return ((int) random);
    }
}

/** Task 1
 * Function name – randomNumber
 * @return random number (int)
 * 
 * Inside the function
 *  - returns a random number between 0 and 50000
 */
/** Task 2 
 *
 *    1. Create an array that stores 10 random numbers
 *    2. Using a for loop, print the array elements on the same line.
 *         Example – Here are the scores: 14775 48328 7928 27102 21787 21063 38096 42711 32863 23707
 */

/** Task 3
 *  
*   1. Using a for loop, find the highest score in the array and update the highScore.
*   2. println("\n\nThe highest score is: <>. Give that man a cookie!");

*/
