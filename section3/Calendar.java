public class Calendar {
    public static void main(String[] args) {
        String day = "Monday"; //Can be any day.
        System.out.println("Hey, are you free on " + day + "? \n");


        System.out.println("Hmm, let me check my calendar.");
        
        //Check calendar here:
        switch (day){
            case "Friday": System.out.println("I'm free!!");
            break;
            case "Saturday": System.out.println("It's Saturday");
            break;
            default: System.out.println("Nevermind");
            break;
        }
            //  "Monday": print ("Sorry, I have to stay at work late."); 
            //  "Tuesday": print ("It looks like I have meetings all day."); 
            //  "Wednesday": print ("I have a dentist appointment. Some other time!"); 
            //  "Thursday": print ("Sorry, thursday is date night!"); 
            //  "Friday": print ("I'm free!!"); 
            //  "Saturday": print ("I'm free!!"); 
            //  "Sunday": print ("I'm free!!"); 
            //  "otherwise": print ("that's not a day."); 

        
        

    }
}