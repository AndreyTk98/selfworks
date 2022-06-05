package sw_arrayz_handle.work02;

import sw_methods.avia.Rounder;

import java.util.Scanner;

public class Cargo {

    private static double[] goods;
    private static double goodsSum;
    private final static String ROUND_PATERN = "0.000";
    private static String roundingGoodsSum;

    public static void main(String[] args) {
        initArr();
        doInput();
        calcSum();
        rounding();
        shoeInfo();
    }

    private static void initArr() {
        goods = new double[10];
    }

    private static void doInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Вес груза за прошедшие 10 дней(кг):");
        int i;
        for (i = 0; i < 10; ++i)
            goods[i] = CargoValidation.validateCargo(input);
    }
    private static void calcSum() {
        goodsSum = SumCargo.sum(goods);
    }
    private static void rounding() {
        roundingGoodsSum = Rounder.formatValue(goodsSum, ROUND_PATERN);
    }
    private static void shoeInfo() {
        System.out.println("Масса груза за 10 дней(кг): " + roundingGoodsSum);
    }

}
