import java.util.ArrayList;

public class NotesInsert2 {
    public static void addWorld(ArrayList<String> strList) {
        for (int i = 0; i < strList.size(); i++) {
            if (strList.get(i).equals("Hello")) {
                if (i + 1 >= strList.size() || !strList.get(i + 1).equals("World")) {
                    strList.add(i + 1, "World");
                }
            }
        }
    }
}
