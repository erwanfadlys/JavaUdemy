public class Points {
    public static void main(String[] args) {
        int points = 0;

        System.out.println("Harry was caught wandering the halls. -50 points for Gryffindor");
        points = points - 50;
        //update points here
        System.out.println("Harry was being cheeky in class. -3 points for Gryffindor");
        points = points - 3;
        //update points here
        System.out.println("Hermione got full marks on Lockhart's quiz. 30 points for Gryffindor");
        points += 30;
        //update points here
        System.out.println("Ron won the underground chess game. 100 points for Gryffindor");
        points += 100;
        //update points here
        System.out.println("Harry defeated Quirrell. 60 points for Gryffindor");
        points += 60;
        //update points here
        System.out.println(points + " points");
        //Print the variable
    }
}

