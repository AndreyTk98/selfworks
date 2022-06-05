package sw_methods;

import java.util.Scanner;

public class Work03 {

    static double[] costs;
    static double sumCost;
    static double averageCost;

    public static void main(String[] args) {

    }
    private static void doInputs () {
        int i;
        Scanner inputs = new Scanner(System.in);
        System.out.println("Введите стоимость товара за 10 дней");
        for (i = 0; i < 10; i++)
            costs[i] = inputs.nextDouble();
    }

    private double findSumCost(double[] costs) {
        double sum;
        sum = 0;
        for (double nums : costs) {
            sum += nums;
        }
        return sum;
    }

//    private double findAverageCost (double[] costs) {
//        double sumAverage;
//        double average;
//        for (double nums : costs) {
//            sumAverage += nums;
//            average =sumAverage/ costs.length;
//        }return average;
//    }

}
