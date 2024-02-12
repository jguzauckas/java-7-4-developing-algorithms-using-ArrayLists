import java.util.ArrayList;

public class NotesInsert1 {
    public static void add5(ArrayList<Integer> intList) {
        boolean isMissing = true;
        for (int num : intList) {
            if (num == 5) {
                isMissing = false;
            }
        }
        if (isMissing) {
            intList.add(5);
        }
    }
}
