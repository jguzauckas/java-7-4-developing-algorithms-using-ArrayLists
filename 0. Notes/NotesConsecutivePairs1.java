import java.util.ArrayList;

public class NotesConsecutivePairs1 {
    public static boolean isIncreasing(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isIncreasing(ArrayList<Integer> intList) {
        for (int i = 1; i < intList.size(); i++) {
            if (intList.get(i) < intList.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
