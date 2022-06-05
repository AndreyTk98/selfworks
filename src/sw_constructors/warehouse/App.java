package sw_constructors.warehouse;

public class App {

    private final static String ROUND_PATERN = "0.000";

    protected static double qunty;
    protected static double weight;

    public static void main(String[] args) {
        Product product = new Product(qunty, weight);
        View view = new View(product);
        view.doInput();
        Calculate calculate = new Calculate();
        weight = product.getWeight();
        qunty = product.getQunty();
        double allWeight = calculate.calculate(qunty, weight);
        String ruondAllWaight = Rounder.formatValue(allWeight, ROUND_PATERN);
        String info = "Вес всего товара (кг): " + ruondAllWaight;
        ShowInfo showInfo = new ShowInfo();
        showInfo.show(info);
    }
}
