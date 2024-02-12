import java.util.ArrayList;

public class NotesShift1 {
    public static void shiftLeft(int[] nums) {
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;
    }
    
    public static void shiftLeft(ArrayList<Integer> intList) {
        intList.add(intList.remove(0));
    }
    
    public static void shiftRight(ArrayList<Integer> intList) {
        intList.add(0, intList.remove(intList.size() - 1));
    }
}
