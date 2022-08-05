import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6}
        }; 
 
        numbers[1][1] = 7;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++){
                System.out.println(numbers[i][j]);
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}