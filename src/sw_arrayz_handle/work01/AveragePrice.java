package sw_arrayz_handle.work01;

import sw_methods.avia.Rounder;

import java.util.Scanner;

public class AveragePrice {

    private static double[] price;
    private static double average;
    private final static String ROUND_PATERN = "0.00";
    private static String roundingAverage;

    public static void main(String[] args) {
        arrInit();
        doInput();
        calcAverage();
        rounding();
        showInfo();

    }

    private static void calcAverage() {
        double sum;
        sum = CalcAverage.calcSum(price);
        average = CalcAverage.average(sum, price.length);
    }

    private static void arrInit() {
        price = new double[10];
    }

    private static void doInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Цена на товар за прошедшие 10 дней:");
        int i;
        for (i = 0; i < 10; ++i)
            price[i] = PriceValidation.validatePrice(input);
    }

    private static void rounding() {
        roundingAverage = Rounder.formatValue(average, ROUND_PATERN);
    }
    private static void showInfo() {
        System.out.println("Средняя цена: " + roundingAverage);
    }

}
