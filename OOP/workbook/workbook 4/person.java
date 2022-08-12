public class person{
    String name;
    String nationality;
    String dateOfBirth;
    int seatNumber;
    
    public person(String name, String nationality, String dateOfBirth, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
    }

    public person(String name, String nationality, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.seatNumber = seatNumber;
    }

    public person (person Source){
        //should i add the field or leave it open??
        //update, yes you should you silly goose
        this.name = Source.name; //pass the person class field
        this.nationality = Source.nationality;
        this.dateOfBirth = Source.dateOfBirth;
        this.seatNumber = Source.seatNumber;
    };

    public String getName(){return name;}
    public String getNationality(){return nationality;}
    public String getDateOfBirth(){return dateOfBirth;}
    public int getSeatNumber(){return seatNumber;}

    public String setName(String name){this.name = name; return this.name;}
    public String setNationality(String name){this.nationality = name; return this.nationality;}
    public String setDateOfBirth(String dateOfBirth){this.dateOfBirth = dateOfBirth; return this.dateOfBirth;}
    public int setSeatNumber(int seatNumber){this.seatNumber = seatNumber; return this.seatNumber;}


}