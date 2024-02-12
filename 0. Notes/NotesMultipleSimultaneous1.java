import java.util.ArrayList;

public class NotesMultipleSimultaneous1 {
    public static void printOver18(ArrayList<Integer> ageList, ArrayList<String> nameList) {
        for (int i = 0; i < ageList.size(); i++) {
            if (ageList.get(i) >= 18) {
                System.out.println(nameList.get(i));
            }
        }
    }
}
