package sw_extends.order.vievs;

import sw_extends.order.models.FastOrder;
import sw_extends.order.models.Order;
import sw_extends.order.models.PostOrder;
import sw_extends.order.utilits.validation.ValidateDoubleValue;
import sw_extends.order.utilits.validation.ValidateIntValue;

import java.util.Scanner;

public class OrderType {

    protected Order order;
    protected FastOrder fastOrder;
    protected PostOrder postOrder;
    private String title;
    private double price;
    private int titleType;


    public OrderType(Order order, FastOrder fastOrder, PostOrder postOrder) {
        this.order = order;
        this.fastOrder = fastOrder;
        this.postOrder = postOrder;
    }

    // Основное Разветвление
    public void makeSwitchOrder(Scanner scanner, int deliveryType) {

        switch (deliveryType) {
            // Стандартный заказ
            case 1 -> {
                price = 5;
                order.setPrice(price);
                order.setOrderType("Национальная почта");
            }
            // Заказ Курьером
            case 2 -> {
                price = 6;
                order.setPrice(price);
                title = "Введите расстояние(км): ";
                System.out.println(title);
                titleType = 3;
                double range = ValidateDoubleValue.validateDoubleValue(scanner, titleType);
                if (range >= 40) {
                    title = "Слишком далеко, выберете другой тип доставки";
                    System.out.println(title);
                    makeSwitchOrder(scanner, deliveryType);
                }
                fastOrder.setRange(range);
                order.setOrderType("Курьерская доставка");
            }
            // Срочный заказ
            case 3 -> {
                // Разбитие на типы по дальности(страна или континент)
                SwitchPostType switchPostType = new SwitchPostType();
                switchPostType.makePostType(scanner);
                order.setOrderType("Частная почтовая организация");
            }
        }
    }

    class SwitchPostType {

        // Реализация срочной доставки
        public void makePostType(Scanner scanner) {
            title = """
                    1 - Внутри страны (8$ за кг)
                    2 - Межнациональная доставка (10$ за кг)
                    """;
            System.out.println(title);
            titleType = 1;
            int postType = ValidateIntValue.validateIntValue(scanner, titleType);
            postOrder.setPostsType(postType);
            if (postType > 0 & postType < 3) {
                switch (postType) {
                    case 1 -> {
                        price = 8;
                        order.setPrice(price);
                    }
                    case 2 -> {
                        price = 10;
                        order.setPrice(price);
                    }
                }
            } else {
                title = "Выберите меду 1 и 2";
                System.out.println(title);
                makePostType(scanner);
            }
        }
    }


}
