public class Main {
    public static void main(String[] args) {
        

        Bike BMW1 = new Bike("Kapuk", 12000, "Black", 2);
        
        Bike BMW = new Bike("BMW", 13000, "white", 1);
        
        Bike Kawasaki = new Bike("Kawai", 13000, "black", 2);

       
        Kawasaki.setName("ZX10R");
        BMW.setName("S1000R");
        
        //best way to copy object
        Bike Triumph = new Bike(BMW);
        Triumph.setName("Triumph");

        double newPrice = (BMW.getValue()-( BMW.getValue() * 0.5));
        BMW.setValue(newPrice);

        System.out.println("The bike that I am going to buy is "+BMW.getName()+ " which will cost me USD" + BMW.getValue() + ". The color would be " + BMW.getColor() + " and the passanger capacity is " + BMW.getPassanger() + ".");

        System.out.println("The bike that I am going to buy is "+Kawasaki.getName()+ " which will cost me USD" + Kawasaki.getValue() + ". The color would be " + Kawasaki.getColor() + " and the passanger capacity is " + Kawasaki.getPassanger() + ".");
        
        System.out.println("The bike that I am going to buy is "+Triumph.getName()+ " which will cost me USD" + Triumph.getValue() + ". The color would be " + Triumph.getColor() + " and the passanger capacity is " + Triumph.getPassanger() + ".");



    }
}