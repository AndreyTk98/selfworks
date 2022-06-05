package sw_constructors.cargo.calculations;

import sw_constructors.cargo.base.CalcCost;

public class CalculateCost implements CalcCost {
    public double calcCost(double price, double quantity) {
        return price * quantity;
    }
}
