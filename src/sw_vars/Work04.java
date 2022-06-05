package sw_vars;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Work04 {

    static double hours;
    static double htRate;
    static double premium;
    static double salary;
    static String roundSalary;
    static String roundPremium;

    public static void main(String[] args) {

        doInput();
        handleDate();
        showInfo();
    }

    private static void doInput() {
        Scanner feedback = new Scanner(System.in);
        System.out.println("Отработанные часы:");
        hours = feedback.nextDouble();
        System.out.println("Тарифная ставка:");
        htRate = feedback.nextDouble();
    }

    private static double findSalary(double hours, double htRate, double premium) {
        return hours * htRate + premium;
    }

    private static double findPremium(double hours) {
        premium = (hours <= 160) ? 300 : 1500;
        return premium;
    }

    private static void handleDate() {
        premium = findPremium(hours);
        salary = findSalary(hours, htRate, premium);
        roundPremium = rounding(premium);
        roundSalary = rounding(salary);
    }

    private static void showInfo () {
        System.out.println("Полная ЗП: " + roundSalary + "грн." + "\nПремия: " + roundPremium + "грн.");
    }

    public static String rounding(double value){
        return new DecimalFormat("#.00").format(value);
    }
}
