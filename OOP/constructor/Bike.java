//this is to demonstrate the constructor method

public class Bike {
    //insert fields into this class
    String name;
    double value;
    String color;
    int passanger;

    //create constructor here
    //must have level of access, class name,and parameters 
    //The class name must be the same as the constructor

    public Bike (String name, double value, String color, int passanger){
        //once we pass the parameter, need to set the command 

        this.name = name; // this make(field) is equal to make(parameter passed)
        this.value = value;// this value(field) is equal to value(parameter passed)
        this.color = color; // this color(field) is equal to color(parameter passed)
        this.passanger = passanger; //this passanger(field) is equal to passanger(parameter passed)
    }
}