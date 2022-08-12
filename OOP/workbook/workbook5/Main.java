public class Main{
    public static void main(String[] args) {

        person twinOne = new person("Rayan Slim", "Canadian", "01/01/1111", 10 );

        //use setter method to update
        //using copy constructor created earlier, can pass 3 field or the source itself.
        person twinTwo = new person(twinOne);
        
        twinTwo.setName("Jad Slim");
        twinTwo.setSeatNumber(3);
        
        System.out.println("Name : " + twinOne.getName() + "\nNationality :" + twinOne.getNationality() + "\nDate of birth :" + twinOne.getDateOfBirth() + "\nSeat Number :" + twinOne.getSeatNumber() + "\n\n"); 
        
        System.out.println("Name : " + twinTwo.getName() + "\nNationality :" + twinTwo.getNationality() + "\nDate of birth :" + twinTwo.getDateOfBirth() + "\nSeat Number :" + twinTwo.getSeatNumber());
    }
}