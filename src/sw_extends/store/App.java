package sw_extends.store;

import sw_extends.store.controls.controls;
import sw_extends.store.model.Apiece;
import sw_extends.store.model.ByWeight;
import sw_extends.store.model.Product;
import sw_extends.store.views.Input;

public class App {

    protected static String name;
    protected static double price;
    protected static int quantity;
    protected static double weight;

    public static void main(String[] args) {
        Product product = new Product(name, price);
        Apiece apiece = new Apiece(name, price, quantity);
        ByWeight byWeight = new ByWeight(name, price, weight);
        Input views = new Input(product, byWeight, apiece);
        controls controls = new controls(product, apiece, byWeight, views);
        controls.run();
    }
}
