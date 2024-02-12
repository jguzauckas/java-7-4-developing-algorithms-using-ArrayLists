import java.util.ArrayList;

public class NotesNumberCriteria1 {
    public static int howManyOldPeople(Person[] people) {
        int count = 0;
        for (Person person : people) {
            if (person.getAge() > 60) {
                count++;
            }
        }
        return count;
    }
    
    public static int howManyOldPeople(ArrayList<Person> peopleList) {
        int count = 0;
        for (Person person : peopleList) {
            if (person.getAge() > 60) {
                count++;
            }
        }
        return count;
    }
}
