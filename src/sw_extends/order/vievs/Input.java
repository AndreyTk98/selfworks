package sw_extends.order.vievs;

import sw_extends.order.models.Cargo;
import sw_extends.order.models.FastOrder;
import sw_extends.order.models.Order;
import sw_extends.order.models.PostOrder;
import sw_extends.order.utilits.validation.ValidateChose;
import sw_extends.order.utilits.validation.ValidateName;
import sw_extends.order.utilits.validation.ValidateQuantity;
import sw_extends.order.utilits.validation.ValidateWeight;

import java.util.Scanner;

public class Input {

    private Scanner scanner;
    protected Cargo cargo;
    protected Order order;
    protected FastOrder fastOrder;
    protected PostOrder postOrder;
    private String title;
    private int deliveryType;
    double [] weights;

    public Input(Cargo cargo, Order order, FastOrder fastOrder, PostOrder postOrder) {
        this.cargo = cargo;
        this.order = order;
        this.fastOrder = fastOrder;
        this.postOrder = postOrder;
    }

    private void doInput() {
        int i;

        scanner = new Scanner(System.in);
        title = "Названия посылки: ";
        System.out.println(title);
        String name = ValidateName.validateName(scanner);

        title = "Количество посылок: ";
        int quantity = ValidateQuantity.validateQuantityInput(scanner);
        weights = new double [quantity];
        order.setQuantity(quantity);

        title = "Вес каждой посылки: ";
        for (i = 0; i < quantity; ++i) {
            System.out.println("Посылка №" + (1 + i));
            weights[i] = ValidateWeight.validateWeightInput(scanner);
            order.setWeight(weights);
            title = """
                Выберете доставщика:
                1 - Стандартная, 5$ за кг груза
                2 - Курьер, стандпртная оплата + процент от дальности доставки(только в Рамках города)
                3 - Частная почта, внутри страны(8$ а кг) + наценка за расстоние
                    Межнациональная доставка(10$ за кг) + наценка в зависимости от континента
                """;
            deliveryType = ValidateChose.validateChose(scanner);
        }
    }

    public int getDeliveryType() {
        return deliveryType;
    }
}
