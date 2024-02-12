import java.util.ArrayList;

public class NotesRemove1 {
    public static void removeNegatives(ArrayList<Double> doubleList) {
        for (int i = 0; i < doubleList.size(); i++) {
            if (doubleList.get(i) < 0) {
                doubleList.remove(i);
                i--;
            }
        }
    }
}
