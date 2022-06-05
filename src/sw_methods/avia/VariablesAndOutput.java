package sw_methods.avia;

import java.util.Scanner;

public class VariablesAndOutput {

    static double weight;
    static double toPay;
    static double rate;
    static String roundingToPay;
    private final static String ROUND_PATERN = "0.00";

    public static void main(String[] args) {
        doInput();
        handleDate();
        rounding();
        showInfo();
    }
    private static void handleDate() {
        rate = Calculation.calculateRate(weight);
        toPay = Calculation.calculatePay(rate,weight);
    }
    private static void rounding() {
        roundingToPay = Rounder.formatValue(toPay, ROUND_PATERN);
    }

    private static void doInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Baggage weight(kg):");
        weight = Validation.validate(input);
    }
    private static void showInfo() {
        System.out.println("To pay:" + roundingToPay + " USD");
    }

}
