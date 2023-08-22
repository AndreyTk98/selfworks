package sw_extends.order.controls;

import sw_extends.order.models.Cargo;
import sw_extends.order.models.FastOrder;
import sw_extends.order.models.Order;
import sw_extends.order.models.PostOrder;
import sw_extends.order.vievs.Input;
import sw_extends.order.vievs.OrderType;

public class Controls {

    protected Cargo cargoModel;

    protected Order orderModel;

    protected FastOrder fastOrder;

    protected PostOrder postOrder;

    protected Input views;

    protected int deliveryType;

    protected OrderType choose;
    private final static String ROUND_PATTERN_MONEY = "0.00";

    private final static String ROUND_PATTERN_WEIGHT = "0.000";

    public Controls(Cargo cargoModel, Order orderModel, FastOrder fastOrder,
                    PostOrder postOrder, Input views, int deliveryType, OrderType choose) {
        this.cargoModel = cargoModel;
        this.orderModel = orderModel;
        this.fastOrder = fastOrder;
        this.postOrder = postOrder;
        this.views = views;
        this.deliveryType = deliveryType;
        this.choose = choose;
    }

    public void run () {
        views.runInput();
        int deliveryType = views.getDeliveryType();
        int postType = choose.getPostType();
    }
}
