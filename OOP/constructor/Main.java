public class Main {
    public static void main(String[] args) {
        
        //this new bike will become error if we added the constructor at bike class. Because there is no parameters
        Bike BMW = new Bike("BMW", 13000, "white", 1);
        //constructor run as soon as thhis object created, therefore whatever command set at bike class will be called.
        Bike Kawasaki = new Bike("Kawai", 13000, "black", 2);


        System.out.println("The bike that I am going to buy is "+BMW.name+ " which will cost me USD" + BMW.value + ". The color would be " + BMW.color + " and the passanger capacity is " + BMW.passanger + ".");

        System.out.println("The bike that I am going to buy is "+Kawasaki.name+ " which will cost me USD" + Kawasaki.value + ". The color would be " + Kawasaki.color + " and the passanger capacity is " + Kawasaki.passanger + ".");



    }
}