import java.util.ArrayList;

public class NotesDuplicates1 {
    public static boolean areDuplicates(double[] vals) {
        for (double val1 : vals) {
            int tempTimes = 0;
            for (double val2 : vals) {
                if (val1 == val2) {
                    tempTimes++;
                }
            }
            if (tempTimes >= 2) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean areDuplicates(ArrayList<Double> doubleList) {
        for (double val1 : doubleList) {
            int tempTimes = 0;
            for (double val2 : doubleList) {
                if (val1 == val2) {
                    tempTimes++;
                }
            }
            if (tempTimes >= 2) {
                return true;
            }
        }
        return false;
    }
}
