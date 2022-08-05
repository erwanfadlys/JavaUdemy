

public class RandomNumbers {
    public static void main(String[] args) {
        int[][] numbers = new int [100][10];
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = randomNumbers();
            }
        }
        print2dArray(numbers);
    }

    public static int randomNumbers() {
        double rand = Math.random() * 100;
        return (int)rand + 1;
    }

    public static void print2dArray(int[][] x) {
        for (int i = 0; i < x.length ; i++){
            System.out.print("\n |Row : " + (i + 1) + " | ");
            for (int j = 0 ; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
        }
    }
}