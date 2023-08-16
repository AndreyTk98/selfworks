package sw_extends.order.vievs;

import sw_extends.order.models.FastOrder;
import sw_extends.order.models.Order;
import sw_extends.order.models.PostOrder;
import sw_extends.order.utilits.validation.ValidateDoubleValue;
import sw_extends.order.utilits.validation.ValidateIntValue;

import java.util.Scanner;

public class SwitchOrder {

    protected Order order;

    protected FastOrder fastOrder;

    protected PostOrder postOrder;

    private String title;

    private int postType;

    public SwitchOrder(Order order, FastOrder fastOrder, PostOrder postOrder) {
        this.order = order;
        this.fastOrder = fastOrder;
        this.postOrder = postOrder;
    }

    public void makeSwitchOrder(Scanner scanner, int deliveryType) {
        double price;
        int postType;
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
                    System.out.println(title);
                    makeSwitchOrder(scanner, deliveryType);
                }
                fastOrder.setRange(range);
            }
            case 3 -> {
                SwitchPostType switchPostType = new SwitchPostType();
                switchPostType.makePostType(scanner);
                }
            }
        }
        class SwitchPostType {
            public void makePostType(Scanner scanner) {
                title = """
                        1 - Внутри страны
                        2 - Межнациональная доставка
                        """;
                System.out.println(title);
                postType = ValidateIntValue.validateIntValue(scanner, 1);
                postOrder.setPostsType(postType);
                double price;
                if (postType > 0 & postType < 3) {
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
            } else {
                    title = "Выберите меду 1 и 2";
                    System.out.println(title);
                    makePostType(scanner);
                }
        }
    }

    public int getPostType() {
        return postType;
    }
}
