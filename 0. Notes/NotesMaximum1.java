import java.util.ArrayList;

public class NotesMaximum1 {
    public static double findMaximum(double[] vals) {
        double maximum = vals[0];
        for (double val : vals) {
            if (val > maximum) {
                maximum = val;
            }
        }
        return maximum;
    }
    
    public static double findMaximum(ArrayList<Double> list) {
        double maximum = list.get(0);
        for (double val : list) {
            if (val > maximum) {
                maximum = val;
            }
        }
        return maximum;
    }
}
