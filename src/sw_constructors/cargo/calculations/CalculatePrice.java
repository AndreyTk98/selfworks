package sw_constructors.cargo.calculations;

import sw_constructors.cargo.base.CalcPrice;

public class CalculatePrice implements CalcPrice {

    public double calcPay(double quantity) {
        double price;
        if (quantity < 50) {
            price = 25;
        } else if (quantity >= 50 & quantity < 75) {
            price = 20;
        } else price = 15;
        return price;
    }
}
