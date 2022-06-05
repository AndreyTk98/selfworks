package sw_constructors.cargo.views;

import sw_constructors.cargo.utils.Rounder;

public class GetOutput {

    private final static String ROUND_PATTERN = "0.00";
    private final static String ROUND_PATTERN_QUNTY = "0.000";

    public static void getOutput(String name, double cost, double quantity, double price) {
        String roundCost = Rounder.rounder(cost, ROUND_PATTERN);
        String roundQuantity = Rounder.rounder(quantity, ROUND_PATTERN_QUNTY);
        String roundPrice = Rounder.rounder(price, ROUND_PATTERN);
        String show = name + ":" + "\n"
                + "К оплате: " + roundCost + " грн" + "\n"
                + "Вес вашего груза: " + roundQuantity + " кг" + "\n"
                + "Цена за кг: " + roundPrice + " грн";
        System.out.println(show);
    }
}
