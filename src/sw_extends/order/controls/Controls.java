package sw_extends.order.controls;

import sw_extends.order.calculations.Calc;
import sw_extends.order.models.Cargo;
import sw_extends.order.models.FastOrder;
import sw_extends.order.models.Order;
import sw_extends.order.models.PostOrder;
import sw_extends.order.vievs.CountryOrderType;
import sw_extends.order.vievs.Input;
import sw_extends.order.vievs.OrderType;
import sw_extends.order.vievs.Outputs;

public class Controls {

    private final Cargo cargo;
    private final FastOrder fastOrder;
    private final Order order;
    private final PostOrder postOrder;
    private final Input input;
    private final OrderType orderType;

    public Controls(Cargo cargo, FastOrder fastOrder, Order order, PostOrder postOrder,
                    Input input, OrderType orderType) {
        this.cargo = cargo;
        this.fastOrder = fastOrder;
        this.order = order;
        this.postOrder = postOrder;
        this.input = input;
        this.orderType = orderType;
    }

    public void run (){
        input.runInput();
        double cost;
        double fullCost;
        double fastDeliveryRate;
        Calc calc = new Calc();
        switch (input.getDeliveryType()) {
            case 1 -> {
                cost = calc.calcCost(order.getWeight(), order.getPrice());
                Outputs.getOutputsSimpleOrder(cargo .getName(), orderType.getOrderType(), order.getQuantity(),
                        calc.getAllWeight(), cost);
            }
            case 2 -> {
                cost = calc.calcCost(order.getWeight(), order.getPrice());
                fastDeliveryRate = calc.calcCourierOrderCountryRate(fastOrder.getRange());
                fullCost = calc.calcFinalDeliveryCost(cost, fastDeliveryRate);
                Outputs.getOutputsSimpleOrder(cargo.getName(), orderType.getOrderType(), order.getQuantity(),
                        calc.getAllWeight(), fullCost);
            }
            case 3 -> {

                switch (orderType.getPostType()) {
                    case 1 -> {
                        CountryOrderType countryOrderType = new CountryOrderType();
                        cost = calc.calcCost(order.getWeight(), order.getPrice());
                        countryOrderType.doSwitchCountryOrderType();


                    }
                }
            }
        }
    }


}
