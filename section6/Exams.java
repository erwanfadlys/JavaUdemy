import java.util.ArrayList;
public class Exams {
    public static void main(String[] args) {
        
        System.out.println("It's time to take your 5th year exams. Please, take your seats.\n");
        String arrayList[] = {"Harry",  "Neville", "Ron", "Hermione", "Seamus"};

        for (int i = 0; i < arrayList.length; i++) {
            System.out.println(arrayList[i] + ", you will seat at seat number " + (i+1));
        }
    }
}