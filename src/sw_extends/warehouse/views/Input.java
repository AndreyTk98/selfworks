package sw_extends.warehouse.views;

import sw_extends.warehouse.model.ByWeight;
import sw_extends.warehouse.model.PieceByPiece;
import sw_extends.warehouse.model.Product;
import sw_extends.warehouse.utils.Validator;

import java.util.Scanner;

public class Input {

    private String title;
    private Scanner scanner;
    protected Product model;
    protected PieceByPiece pieceModel;
    protected ByWeight weightModel;
    private int choose;

    public Input(Product model, PieceByPiece pieceModel, ByWeight weightModel) {
        this.model = model;
        this.pieceModel = pieceModel;
        this.weightModel = weightModel;
    }

    public void getInput() {

        scanner = new Scanner(System.in);

        title = "Название: ";
        System.out.println(title);
        String name = Validator.validateName(scanner);
        model.setName(name);

        title = "Цена: ";
        System.out.println(title);
        double price = Validator.validatePriceInput(scanner);
        model.setPrice(price);
    }

    public void makeChoose() {
        title = """
                Вид товара:
                1 - Поштучно
                2 - На развес
                """;

        System.out.println(title);
        choose = Validator.validateChoose(scanner);
        if (choose > 0 & choose < 3 ) {
            switch (choose) {
                case 1 -> {
                    System.out.println("Количество: ");
                    int qunty = Validator.validateQuantityInput(scanner);
                    pieceModel.setQuantity(qunty);
                }
                case 2 -> {
                    System.out.println("Вес(кг): ");
                    double wright = Validator.validatePriceInput(scanner);
                    weightModel.setWeight(wright);
                }
            }
        } else makeChoose();
        scanner.close();
    }

    public int getChoose() {
        return choose;
    }
}
