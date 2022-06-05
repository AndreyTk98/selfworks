package sw_extends.store.calculations;

import sw_extends.store.base.CalcQuantityPrice;
import sw_extends.store.base.CalcWeightPrice;

public class Calc implements CalcQuantityPrice, CalcWeightPrice {

    public double calcQuantityCost(double price, int quntity) {
        return price * quntity;
    }

    public double CalcWeightCost (double price, double weight) {
        return price * weight;
    }

}