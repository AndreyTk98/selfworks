package sw_extends.warehouse.calculations;

import sw_extends.warehouse.base.CalcQuntyCost;
import sw_extends.warehouse.base.CalcWeightCost;

public class Calc implements CalcQuntyCost, CalcWeightCost {

    @Override
    public double calcQuntyCost(double price, int qunty) {
        return price * qunty;
    }

    @Override
    public double calcWeightCost(double price, double weight) {
        return price * weight;
    }
}
