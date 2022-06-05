package sw_constructors.warehouse;

import java.util.Scanner;

public class View {

    Product product;
    double weight;
    double qunty;

    public View(Product product) {
        this.product = product;
    }

    void doInput() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Вес (кг):");
        weight = Validation.validate(scr);
        product.setWeight(weight);
        System.out.println("Количество:");
        qunty = Validation.validate(scr);
        product.setQunty(qunty);
    }
}
