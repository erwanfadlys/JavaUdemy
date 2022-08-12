
public class Main{
    public static void main(String[] args) {
        

        //constructor demonstration
        Person Erwan = new Person("Erwan", "Malaysian", "21/12/1988", 30);

        Person Danny = new Person("Danny", "English" , "21/12/1988", 31);


        //getter demonstration
        System.out.println("My name is " + Erwan.getName() + " and I am a " + Erwan.getNationality() + ". \n I am born " + Erwan.getdateOfBirth() + " and my seat is " + Erwan.getseatNumber() + ".");
        
        System.out.println("\n\n");


        //setter demonstration
        String newName = "Mohd Erwan";
        Erwan.setName(newName);

        int newSeat = Erwan.getseatNumber() - 1;
        Erwan.seatNumber(newSeat);

        System.out.println("My name is " + Erwan.getName() + " and I am a " + Erwan.getNationality() + ". \n I am born " + Erwan.getdateOfBirth() + " and my seat is " + Erwan.getseatNumber() + ".");

    }
}