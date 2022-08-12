
public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private int seatNumber;

    //constructor
    public Person (String name, String nationality, String dateOfBirth, int seatNumber) {
        
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;

    }

    //getter
    public String getName() {
        return this.name;
    }

    public String getNationality() {
        return this.nationality;
    }

    public String getdateOfBirth() {
        return this.dateOfBirth;
    }

    public int getseatNumber() {
        return this.seatNumber;
    }

    //setter
    public String setName (String name) { 
        this.name = name; 
        return this.name;
    }

    public String setNationality (String nationality){
        this.nationality = nationality;
        return this.nationality;
    }

    public String setDob (String dateofbirth) {
        this.dateOfBirth = dateofbirth;
        return this.dateOfBirth;
    }

    public int seatNumber(int seatNumber){
        this.seatNumber = seatNumber;
        return this.seatNumber;
    }

}
