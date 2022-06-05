package sw_arrayz_handle.work02;

public class SumCargo {

    public static double sum(double[] cargo) {
        double sum;
        sum = 0;
        for (double i : cargo) {
            sum += i;
        } return sum;
    }
}
