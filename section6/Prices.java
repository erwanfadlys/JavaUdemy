public class Prices {
    public static void main(String[] args) {
        //Task 1 - Create a 2D array that can store 3 rows and 5 columns of double values.
        

        double[][] values= {
            {12.99, 8.99, 9.99, 10.49, 11.99},
            {0.99, 1.99, 2.49, 1.49, 2.99},
            {8.99,7.99 , 9.49,9.99, 10.99 }
        };

        for (int i = 0; i <values.length; i++) { //this loop will access row indices
            switch (i) {
                case 0:
                System.out.print("\nBaking: ");
                break;
                case 1:
                System.out.print("\nCake: ");
                break;
                case 2: 
                System.out.print("\nCandy: ");
            }
            for (int j = 0; j < values[i].length; j++) { //this loop will access columns based on row indices
                System.out.print(values[i][j] + " ");

            }
        }
    }
}
// for (int i = 0; i < values.length; i++){
//         System.out.println(values[i] + " " + values);
//         for (int j = 0; j < values.length; j++){
    //             System.out.println("1");
    //         }