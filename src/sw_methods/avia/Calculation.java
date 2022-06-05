package sw_methods.avia;

public class Calculation {

    public static double calculateRate(double wight) {
        double rate;
        if (wight < 25) {
            rate = 0.05;
        } else if (wight >= 25 & wight <= 50) {
            rate = 0.1;
        } else {
            rate = 0.15;
    }
        return rate;
    }
    public static double calculatePay(double rate, double wight) {
        double toPay;
        toPay = wight * rate;
        return toPay;
    }
}