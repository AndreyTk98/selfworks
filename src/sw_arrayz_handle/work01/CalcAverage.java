package sw_arrayz_handle.work01;

public class CalcAverage {

    public static double calcSum(double[] price) {
        double sum;
        sum = 0;
        for (double i : price) {
            sum += i;
        }
        return sum;
    }
    public static double average(double sum, double length) {
        double average;
        average = sum / length;
        return average;
    }
}
