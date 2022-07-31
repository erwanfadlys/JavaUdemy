import java.util.Scanner;
import java.util.Arrays;
public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        
        String name = "Name";
        String dateOfBirth = "Date of Birth";
        String occupation = "Occupation";
    
        int number = scan.nextInt();
        
        String [][] lists = new String [number][3];
        scan.nextLine();
        
        for (int i = 0; i < lists.length; i++) {

            System.out.println("\n\t Figure " + (i + 1));
            
            for (int j = 0; j < lists[i].length; j++) {
                
                switch (j){
                case 0: 
                    System.out.print("\t " + name + ": ");
                    lists[i][j] = scan.nextLine();
                    break;
                case 1: 
                    System.out.print("\t " + dateOfBirth + ": ");
                    lists[i][j] = scan.nextLine();
                    break;
                case 2: 
                System.out.print("\t " + occupation + ": ");
                    lists[i][j] = scan.nextLine();
                    break;
                }
            }
        } 
        
        print2DArray(lists);

        System.out.println("\n\nThese are the values you stored:"); 
        System.out.print("\nWho do you want information on? ");  
        String searchName = scan.nextLine();

        searchArray(lists, searchName);

        scan.close();
    }

    //scan the first row to check if the value return same then proceed.
    public static String[][] print2DArray(String[][] lists){
        for (int i = 0; i < lists.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < lists[i].length; j++) {
                System.out.print("\t" + lists[i][j] + " ");
            }
        }
        return lists;
    }
    
    public static void searchArray(String temp[][], String searchName) {
        String [][] result; 
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {//instead of searching just the first column, i searched all column because why noot. Time complexion is longer but just in case.
                if(temp[i][j].equals(searchName)) { //why is this not working
                    System.out.println("\nName : " + temp[i][j] );
                    System.out.println("Date of Birth : " + temp[i][j + 1] );
                    System.out.println("Occupation : " + temp[i][j + 2] + "\n");
                }
            }
        }
    }
    
}
