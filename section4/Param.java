public class Param {
    public static void main(String[] args){
        //calc area of triangle

        measureRectangle (2.2, 4.4);


    }


    public static void measureRectangle(double length, double width){
        double area = length * width;
        System.out.println("The are of the rectangle is " + (int)area + ".\n");
    }


}