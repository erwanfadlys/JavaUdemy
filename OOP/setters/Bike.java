//this is to demonstrate the setters method

public class Bike {
    //using private level of access so that field is secured
    private String name;
    private double value;
    private String color;
    private int passanger;
    //using getters to return the field value
    //getter is a function to return field value

    public Bike (String name, double value, String color, int passanger){

        this.name = name; // this make(field) is equal to make(parameter passed)
        this.value = value;// this value(field) is equal to value(parameter passed)
        this.color = color; // this color(field) is equal to color(parameter passed)
        this.passanger = passanger; //this passanger(field) is equal to passanger(parameter passed)
    }

    public Bike(Bike bMW) {
    }

    //here is the getters method
    //create for individual field
    public String getName() { return name; } //this can be removed as this. is just to differentiate between field and parameter passed
    public double getValue() { return this.value; }
    public String getColor() { return this.color; }
    public int getPassanger() { return this.passanger; }

    //here is the setters method
    //create for individual field and require parameter to update
    public String setName(String name) { this.name = name;
    return this.name;} //istantiate the field with parameter and return values
    public double setValue(double value) { this.value = value; return this.value; }
    public String setColor(String color) { this.color = color; return this.color; }
    public int setPassanger(int passanger) { this.passanger = passanger; return this.passanger; }

    }
