package sw_constructors.shop;

public class Calculating implements CalcPrice, CalcTax, CalcPriceWithTax {
    @Override
    public double calcPrice(double qunty, double price) {
        return qunty * price;
    }

    @Override
    public double calcTax(double price, double tax) {
        return (tax/100) * price;
    }
    @Override
    public double calcPriceWithTax(double price, double tax) {
        return price - tax;
    }
}
