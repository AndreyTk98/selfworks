package sw_extends.order;

import sw_extends.order.controls.Controls;
import sw_extends.order.models.Cargo;
import sw_extends.order.models.FastOrder;
import sw_extends.order.models.Order;
import sw_extends.order.models.PostOrder;
import sw_extends.order.vievs.Input;
import sw_extends.order.vievs.OrderType;

public class App {

    static String name;
    static double [] weight;
    static double price;
    static int quantity;
    static double range;
    static int postType;
    static int deliveryType;
    static String orderType;

    public static void main(String[] args) {
        Cargo cargo = new Cargo(name);
        Order order = new Order(name, price, weight, quantity, orderType);
        FastOrder fastOrder = new FastOrder(name, price, weight, quantity, orderType, range);
        PostOrder postOrder = new PostOrder(name, price, weight, quantity, orderType, postType, deliveryType);
        OrderType orderType = new OrderType(order, fastOrder, postOrder);
        Input input = new Input(cargo, order, orderType, postOrder);
        Controls controls = new Controls(cargo, fastOrder, order, input, postOrder);
        controls.run();
    }
}
