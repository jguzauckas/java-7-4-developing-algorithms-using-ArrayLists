import java.util.ArrayList;

public class NotesReverse1 {
    public static void reverse(int[] nums) {
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }
    }
    
    public static void reverse(ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size() / 2; i++) {
            intList.set(i, intList.set(intList.size() - i - 1, intList.get(i)));
        }
    }
}
