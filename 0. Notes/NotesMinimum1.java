import java.util.ArrayList;

public class NotesMinimum1 {
    public static double findMinimum(double[] arr) {
        double minimum = arr[0];
        for (double val : arr) {
            if (val < minimum) {
                minimum = val;
            }
        }
        return minimum;
    }
    
    public static double findMinimum(ArrayList<Double> list) {
        double minimum = list.get(0);
        for (double val : list) {
            if (val < minimum) {
                minimum = val;
            }
        }
        return minimum;
    }
}
