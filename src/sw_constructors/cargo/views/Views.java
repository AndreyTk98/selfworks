package sw_constructors.cargo.views;

import sw_constructors.cargo.model.Cargo;
import sw_constructors.cargo.utils.Validator;

import java.util.Scanner;

public class Views {
    String title;
    String name;
    double quantity;
    Scanner scanner;
    Cargo model;

    public Views(Cargo model) {
        this.model = model;
    }

    public void getInputs() {

        scanner = new Scanner(System.in);

        title = "Название: ";
        System.out.println(title);
        name = Validator.validateName(scanner);
        model.setName(name);

        title = "Вес (кг): ";
        System.out.println(title);
        quantity = Validator.validateQuntyInput(scanner);
        model.setQuantity(quantity);

        scanner.close();
    }
}
