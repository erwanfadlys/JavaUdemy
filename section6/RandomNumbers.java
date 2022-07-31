import java.util.Arrays;

public class RandomNumbers {
    public static void main(String[] args) {
        // Task 3 – Create a 2D array with 100 rows and 10 columns.
        int [][] twoDArray = new int[100][10];
        
        for (int i = 0; i <twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {

                twoDArray[i][j] = randomNumber(); //use [][] for 2d arrays
            }
        }
        print2DArray(twoDArray);
        /** Task 4
         * 
         * 1. Using a nested loop, populate the array with random numbers. 
         * 2. Then, pass the updated array into print2DArray.  
         * 
         */


        
    }


    public static int randomNumber(){

        double d = Math.random() * 100;
        
        int a  = (int)d + 1; //cast double d to int and then initialised to array
        return a;
    }
    /** Task 1
     * Function name: randomNumber.
     * 
     * @return randomNumber (int)
     * 
     * Inside the function:
     *    1. return a random number between 1 and 100. 
     */

    public static void print2DArray(int twoDArray [][]){
        for (int i = 0; i < twoDArray.length; i++){
            System.out.println("\n\nRow :" + (i + 1) +  " ");
            for (int j = 0; j < twoDArray[i].length; j++){
                System.out.print (twoDArray[i][j] + " ");
                //System.out.println(Arrays.toString(twoDArray[i])); //this will only print the reference to the array. Kinda pointer in C
            }
        }
    }
    /** Task 2
     * Function name: print2DArray
     * @param array ( int[][] )
     *
     * Inside the function:
     *
     *   1. prints the array such that:
     *        • Each row takes up one line.
     *        • There's a space between each value.
     */
}
