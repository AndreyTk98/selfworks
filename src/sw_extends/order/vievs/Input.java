package sw_extends.order.vievs;

import sw_extends.order.models.Cargo;
import sw_extends.order.models.Order;
import sw_extends.order.models.PostOrder;
import sw_extends.order.utilits.validation.*;

import java.util.Scanner;

public class Input {

    private Scanner scanner;
    protected Cargo cargo;
    protected Order order;
    private String title;
    private final OrderType orderType;
    private final PostOrder postOrder;

    private int titleType;

    public Input(Cargo cargo, Order order, OrderType orderType, PostOrder postOrder) {
        this.cargo = cargo;
        this.order = order;
        this.orderType = orderType;
        this.postOrder = postOrder;
    }

    public void runInput() {
        doInput();
        chooseOrder();
    }

    private void doInput() {

        int i;

        scanner = new Scanner(System.in);
        title = "Наименование посылок: ";
        System.out.println(title);
        String name = ValidateName.validateName(scanner);
        cargo.setName(name);

        title = "Количество посылок: ";
        System.out.println(title);
        titleType = 2;
        int quantity = ValidateIntValue.validateIntValue(scanner, titleType);
        double[] weights = new double[quantity];
        order.setQuantity(quantity);

        title = "Вес каждой посылки: ";
        System.out.println(title);
        for (i = 0; i < quantity; ++i) {
            System.out.println("Посылка №" + (1 + i));
            weights[i] = ValidateDoubleValue.validateDoubleValue(scanner, titleType);
            order.setWeight(weights);
        }
    }

    private void chooseOrder() {
        title = """
                Выберете доставщика:
                1 - Национальная почта, 5$ за кг груза
                2 - Курьер, 6$ за кг + процент от дальности доставки(только в Рамках города(не более 40км)
                3 - Частная почтовая организация, внутри страны(8$ а кг) + наценка за расстояние
                    Межнациональная доставка(10$ за кг) + наценка в зависимости от континента
                """;
        System.out.println(title);
        titleType = 1;
        int deliveryType = ValidateIntValue.validateIntValue(scanner, titleType);
        postOrder.setDeliveryType(deliveryType);
        if (deliveryType > 0 & deliveryType <= 3) {
            orderType.makeSwitchOrder(scanner, deliveryType);
        } else {
            title = "Выберете 1, 2 или 3";
            System.out.println(title);
            chooseOrder();
            scanner.close();
        }
    }
}
