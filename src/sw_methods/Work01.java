package sw_methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Work01 {

    static int amt;
    static double weight;
    static String products;
    static double totalWight;
    static String strTotalWight;
    static String mq;

    public static void main(String[] args) {
        doInpot();
        hamdelDate();
        showInfo();

    }
    private static void doInpot() {
        Scanner allInform = new Scanner(System.in);
        System.out.println("Введите количество товара:");
        amt = allInform.nextInt();
        System.out.println("Введите массу товара:");
        weight = allInform.nextDouble();
        System.out.println("Введите название товара:");
        products = allInform.next();
        System.out.println("Введите меру измерения");
        mq = allInform.next();
    }
    private static double calcTotalWeight(double amt, double weight) {
        return amt * weight;
    }

    private static void hamdelDate() {
        totalWight = calcTotalWeight(amt, weight);
        strTotalWight = rounding(totalWight);
    }
    public static String rounding(double variable) {
        return new DecimalFormat("#.00").format(variable);
    }
    private static void showInfo() {
        System.out.println("Общая масса " + products + ": " + strTotalWight + " " + mq);
    }
}

