import java.util.ArrayList;

public class NotesAllElementsCondition1 {
    public static boolean allNegative(int[] nums) {
        for (int num : nums) {
            if (num >= 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean allNegative(ArrayList<Integer> intList) {
        for (int num : intList) {
            if (num >= 0) {
                return false;
            }
        }
        return true;
    }
}
