package sw_constructors.shop;

import sw_constructors.warehouse.Validation;

import java.util.Scanner;

public class View {

    private double qunty;
    private double price;
    private double tax;
    Product product;
    Scanner scanner;

    void doInput() {
        product = new Product(qunty, price);
        scanner = new Scanner(System.in);
        System.out.println("Количество товара:");
        qunty = Validation.validate(scanner);
        System.out.println("Цена:");
        price = Validation.validate(scanner);
        System.out.println("Процент налога с продаж:");
        tax = Validation.validate(scanner);
        scanner.close();
    }

    public double getQunty() {
        return qunty;
    }

    public double getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }
}
