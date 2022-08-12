//this is to demonstrate the setters method

public class Bike {
    private String name;
    private double value;
    private String color;
    private int passanger;

    public Bike (String name, double value, String color, int passanger){
        this.name = name; 
        this.value = value;
        this.color = color; 
        this.passanger = passanger;
    }

    //Constructor overload copy value passed value into new object
    //ideal way to copy value into new object
    public Bike(Bike source) {
        this.name = source.name;
        this.value = source.value;
        this.color = source.color;
        this.passanger = source.passanger;
    }

    public String getName() { return name; } 
    public double getValue() { return this.value; }
    public String getColor() { return this.color; }
    public int getPassanger() { return this.passanger; }

    public String setName(String name) { this.name = name;
    return this.name;} 
    public double setValue(double value) { this.value = value; return this.value; }
    public String setColor(String color) { this.color = color; return this.color; }
    public int setPassanger(int passanger) { this.passanger = passanger; return this.passanger; }

    }
