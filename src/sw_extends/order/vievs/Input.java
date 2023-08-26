package sw_extends.order.vievs;

import sw_extends.order.models.Cargo;
import sw_extends.order.models.Order;
import sw_extends.order.utilits.validation.*;

import java.util.Scanner;

public class Input {

    private Scanner scanner;
    protected Cargo cargo;
    protected Order order;
    private String title;
    private int deliveryType;
    private final OrderType orderType;

    public Input(Cargo cargo, Order order, OrderType orderType) {
        this.cargo = cargo;
        this.order = order;
        this.orderType = orderType;
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
        int quantity = ValidateIntValue.validateIntValue(scanner, 2);
        double[] weights = new double[quantity];
        order.setQuantity(quantity);

        title = "Вес каждой посылки: ";
        System.out.println(title);
        for (i = 0; i < quantity; ++i) {
            System.out.println("Посылка №" + (1 + i));
            weights[i] = ValidateDoubleValue.validateDoubleValue(scanner, 2);
            order.setWeight(weights);
        }
    }

    private void chooseOrder() {
        title = """
                Выберете доставщика:
                1 - Национальная почта, 5$ за кг груза
                2 - Курьер, 6$ за кг + процент от дальности доставки(только в Рамках города(не более 20км)
                3 - Частная почтовая организация, внутри страны(8$ а кг) + наценка за расстояние
                    Межнациональная доставка(10$ за кг) + наценка в зависимости от континента
                """;
        System.out.println(title);
        deliveryType = ValidateIntValue.validateIntValue(scanner, 1);
        scanner.close();
        if (deliveryType > 0 & deliveryType <=3) {
            orderType.makeSwitchOrder(scanner, deliveryType);
        } else {
            title = "Выберете 1, 2 или 3";
            System.out.println(title);
            chooseOrder();
        }
    }

    public int getDeliveryType() {
        return deliveryType;
    }
}
