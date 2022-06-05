package sw_constructors.shop;

import sw_methods.avia.Rounder;

public class App {

    private static double allPrice;
    private static double priceWithTax;

    public static void main(String[] args) {
        processData();
        ShowInfo.showInfo(allPrice, priceWithTax);
    }
    private static void processData() {
        View view = new View();
        view.doInput();
        Calculating calculating = new Calculating();
        allPrice = calculating.calcPrice(view.getQunty(), view.getPrice());
        double lastTax = calculating.calcTax(allPrice, view.getTax());
        priceWithTax = calculating.calcPriceWithTax(allPrice, lastTax);
    }
}