import java.util.ArrayList;

public class NotesAverage1 {
    public static double findAverage(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (double) sum / nums.length;
    }
    
    public static double findAverage(ArrayList<Integer> intList) {
        int sum = 0;
        for (int num : intList) {
            sum += num;
        }
        return (double) sum / intList.size();
    }
}
