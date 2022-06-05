package sw_arrayz_handle;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Work03A {

    static double[] sells;
    static double maxSells;
    static String roundingMaxSells;

    public static void main(String[] args) {
        arrSells();
        doInput();
        handelDate();
        showMaxSells();
    }

    private static void arrSells() {
        sells = new double[8];

    }
    private static void handelDate() {
        maxSells = findMaxSells(sells);
        roundingMaxSells = rounding(maxSells);
    }

    private static void doInput() {
        System.out.println("Ведите сумму продаж каждого сотрудника");
        Scanner info = new Scanner(System.in);
        int i;
        for (i = 0; i < 8; ++i)
        sells[i] = info.nextDouble();
    }

    private static double findMaxSells(double[] sells) {
        double maxValue = sells[0];
        for (int i = 1; i < sells.length; i++) {
            if (sells[i] > maxValue) {
                maxValue = sells[i];
            }
        } return maxValue;
    }
    private static void showMaxSells() {
        System.out.println("Самая большая продажа: " + roundingMaxSells);
    }
    public static String rounding(double value) {
        return new DecimalFormat("#.00").format(value);
    }
}
