package sw_constructors.shop;

import sw_methods.avia.Rounder;


public class ShowInfo {

    private final static String ROUND_PATTERN = "0.00";

    public static void showInfo(double allPrice, double priceWithTax) {
        String roundAllPrice = Rounder.formatValue(allPrice, ROUND_PATTERN);
        String roundPriceWithTax = Rounder.formatValue(priceWithTax, ROUND_PATTERN);
        String info = "Чистая прибыль: " + roundAllPrice + "\n" + "Прибыль с учётом налога: " +
                roundPriceWithTax;
        System.out.println(info);
    }
}
