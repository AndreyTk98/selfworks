package sw_extends.store.views;

import sw_extends.store.model.Apiece;
import sw_extends.order.utilits.validation.*;
import sw_extends.store.model.ByWeight;
import sw_extends.store.model.Product;

import java.util.Scanner;

public class Input {

    private Scanner scanner;
    protected Product model;
    protected ByWeight weightModel;
    protected Apiece apieceModel;
    private String title;
    private int choose;

    public Input(Product model, ByWeight weightModel, Apiece apieceModel) {
        this.model = model;
        this.weightModel = weightModel;
        this.apieceModel = apieceModel;
    }

    public void runInput() {
        doInput();
        makeChoose();
    }

    private void doInput() {

        scanner = new Scanner(System.in);
        title = "Название товара: ";
        System.out.println(title);
        String name = ValidateName.validateName(scanner);
        model.setName(name);

        title = "Цена: ";
        System.out.println(title);
        double price = ValidatePrice.validatePriceInput(scanner);
        model.setPrice(price);
    }

    private void makeChoose() {
        title = """
                Вид товара:
                1 - Поштучно
                2 - На развес
                """;
        System.out.println(title);
        choose = ValidateChose.validateChose(scanner);
        if (choose > 0 & choose < 3) {
                switch (choose) {
                    case 1 -> {
                        System.out.println("Количество: ");
                        int quantity = ValidateQuantity.validateQuantityInput(scanner);
                        apieceModel.setQuantity(quantity);
                    }
                    case 2 -> {
                        System.out.println("Вес(кг): ");
                        double weight = ValidateWeight.validateWeightInput(scanner);
                        weightModel.setWeight(weight);
                    }
                }
        } else makeChoose();
        scanner.close();
    }

    public int getChoose() {
        return choose;
    }
}
