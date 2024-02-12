import java.util.ArrayList;

public class NotesOneElementCondition1 {
    public static boolean containsEven(int[] nums) {
        for (int num : nums) {
            if (num % 2 == 0) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean containsEven(ArrayList<Integer> intList) {
        for (int num : intList) {
            if (num % 2 == 0) {
                return true;
            }
        }
        return false;
    }
}
