package sw_extends.order.vievs;

import sw_extends.order.models.Cargo;
import sw_extends.order.models.FastOrder;
import sw_extends.order.models.Order;
import sw_extends.order.models.PostOrder;
import sw_extends.order.utilits.validation.*;

import java.util.Scanner;

public class Input {

    private Scanner scanner;
    protected Cargo cargo;
    protected Order order;
    protected FastOrder fastOrder;
    protected PostOrder postOrder;
    private String title;
    private int deliveryType;
    double[] weights;

    public Input(Cargo cargo, Order order, FastOrder fastOrder, PostOrder postOrder) {
        this.cargo = cargo;
        this.order = order;
        this.fastOrder = fastOrder;
        this.postOrder = postOrder;
    }

    public void runInput() {
        doInput();
        chooseOrder();
    }

    private void doInput() {
        int i;

        scanner = new Scanner(System.in);
        title = "Названия посылки: ";
        System.out.println(title);
        String name = ValidateName.validateName(scanner);
        cargo.setName(name);

        title = "Количество посылок: ";
        int quantity = ValidateIntValue.validateIntValue(scanner, 2);
        weights = new double[quantity];
        order.setQuantity(quantity);

        title = "Вес каждой посылки: ";
        for (i = 0; i < quantity; ++i) {
            System.out.println("Посылка №" + (1 + i));
            weights[i] = ValidateDoubleValue.validateDoubleValue(scanner, 2);
            order.setWeight(weights);
        }
    }

    private void chooseOrder() {
        double price;
        int postType;
        title = """
                Выберете доставщика:
                1 - Национальная почта, 5$ за кг груза
                2 - Курьер, стандпртная оплата + процент от дальности доставки(только в Рамках города(не более 20км)
                3 - Частная почта, внутри страны(8$ а кг) + наценка за расстоние
                    Межнациональная доставка(10$ за кг) + наценка в зависимости от континента
                """;
        deliveryType = ValidateIntValue.validateIntValue(scanner, 1);
        if (deliveryType > 0 & deliveryType <=3) {
            switch (deliveryType) {
                case 1 -> {
                    price = 5;
                    order.setPrice(price);
                }
                case 2 -> {
                    price = 5;
                    fastOrder.setPrice(price);
                    title = "Введите расстояние(км): ";
                    double range = ValidateDoubleValue.validateDoubleValue(scanner, 3);
                    if (range > 20) {
                        title = "Слишком далеко, выберете другой тип доставки";
                        System.out.println();
                        chooseOrder();
                    }
                    fastOrder.setRange(range);
                }
                case 3 -> {
                    title = """
                            1 - Внутри страны
                            2 - Межнациональная доставка
                            """;
                    postType = ValidateIntValue.validateIntValue(scanner, 1);
                    postOrder.setPostsType(postType);
                    switch (postType) {
                        case 1 -> {
                            price = 8;
                            postOrder.setPrice(price);
                        }
                        case 2 -> {
                            price = 10;
                            postOrder.setPrice(price);
                        }
                    }
                }
            }
        }
    }

    public int getDeliveryType() {
        return deliveryType;
    }
}
