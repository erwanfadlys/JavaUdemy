import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
            System.out.println("\nLet's play tic tac toe");

            char [][] board = new char[3][3];

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    board[i][j] = '_';
                }
            }
            
            printBoard(board);

           
            

            for (int i = 0; i < 9; i++) { //there is 9 turn total as 3X3
                if (i % 2 == 0){
                    System.out.println("\nTurn: X");
                    System.out.println("Pick a row and column number: ");
                    int []spot = askuser(board);
                    board[spot[0]][spot[1]] = 'X';
                    printBoard(board);
                }else{
                    System.out.println("\nTurn: O");
                    System.out.println("Pick a row and column number: ");
                    int [] spot = askuser(board); //function askuser  will return single array that is stored
                    board[spot[0]][spot[1]] = 'O'; //initialised the array into board index [spot(1st value)][board(2 value)]
                    printBoard(board);
                }

                
                if (CheckWin(board) == 3) {
                    System.out.println("Congratulations X you are the winner");
                    break;
                }else if (CheckWin(board) == -3) {
                    System.out.println("O is the winner");
                    break;
                }
                
            }
            

        
            
            
            scan.close();
        
        }
        

        public static void printBoard(char x[][]) {
            for (int i = 0; i < x.length; i++) {
                System.out.print("\n\t\n\t");
                for (int j = 0; j < x[i].length; j++) {
                    System.out.print(x[i][j] +  " ");
                }
            }
        }
        
      
    public static int[] askuser (char [][] board) {
        
        int row = scan.nextInt();
        int column = scan.nextInt();

        while (board[row][column]!= '_') {
            System.out.println("Sorry, spot are not empty"); //spot is initialised with underscore char means its not x or O 
            row = scan.nextInt();   //scan again for value
            column = scan.nextInt();
        }
        int [] spot = {row, column};
        return spot;
    }
    /** Task 4 - Write a function that lets the user choose a spot
     * Function name – askUser
     * @param board (char[][] board)
     * @return spot (int[])
     * 
     * Inside the function
     *   1. Asks the user: - pick a row and column number: 
     *   2. Check if the spot is taken. If so, let the user choose again.
     *   3. Return the row and column in an int[] array.
     * 
     */

    public static int CheckWin (char board [][]){
        
        int count = 0;

        //this will check the first column or horizontally
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                    count++; //count each X as +1
                } else if (board[i][j] == 'O') { 
                    count--; //count each O as -1. 
                }
            }
            if (count == 3 || count == -3) {
                return count;
            } else {
                count = 0;
            }

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (board[j][i] == 'X') { //this will check the row or horizontally
                    count++; //count each X as +1
                } else if (board[j][i] == 'O') { 
                    count--; //count each O as -1. 
                }
            }
            if (count == 3 || count == -3) {
                return count;
            } else {
                count = 0;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (board[i][i] == 'X') { //this is checking diagonally from right to left, top to bottom
                count++; //count each X as +1
            } else if (board[i][i] == 'O') { 
                count--; //c    ount each O as -1. 
            }
        }

        if (count == 3 || count == -3) {
            return count;
        } else {
            count = 0;
        }

        for (int i = 0; i < 3; i++) { //this is checking diagonally from left to right btm to top
            if (board[i][2-i] == 'X') { 
                count++; //count each X as +1
            } else if (board[i][2-i] == 'O') { 
                count--; //count each O as -1. 
            }
        }
        return count;
    }
}
   


        //Task 1: Create an array with three rows of '_' characters.
        
        //Task 2: Call the function printBoard();
        
        /*
        {  Task 3: Loop through turns.
            
            if (X) turn {
                Task 4: call askUser(). 
                Task 5: populate the board using askUser's return value.
            } else {
                Task 4: call askUser(). 
                Task 5: populate the board using askUser's return value. Then, print it.
                
            }
            
            Task 6 - Call the function.
            if return value == 3 {
                print: X wins and break the loop
            } else if return value == -3 {
                print: O wins and break the loop
            }
            
        } 
        */
        
        /** Task 2 - Write a function that prints the board.
         * Function name - printBoard()
         * @param board (char[][])
         * 
         * Inside the function:
         *   1. print a new line.
         *   2. print the board.
         *      • separate each row by two lines. 
         *      • each row precedes a tab of space
         *      • each character in the grid has one space from the other character
         */        
        
        
     /** Task 6 - Write a function that determines the winner
     * Function name - checkWin 
     * @param board (char[][])
     * @return count (int)
     * 
     * Inside the function:
     *   1. Make a count variable that starts at 0.
     *   2. Check every row for a straight X or straight O (Task 7).
     *   3. Check every column for a straight X or straight O (Task 8).
     *   4. Check the left diagonal for a straight X or straight O (Task 9).
     *   5. Check the right diagonal for a straight X or straight O (Task 10).
     */