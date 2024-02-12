import java.util.ArrayList;

public class NotesSum1 {
    public static int sumAges(Person[] people) {
        int sum = 0;
        for (Person person : people) {
            sum += person.getAge();
        }
        return sum;
    }
    
    public static int sumAges(ArrayList<Person> peopleList) {
        int sum = 0;
        for (Person person : peopleList) {
            sum += person.getAge();
        }
        return sum;
    }
}
