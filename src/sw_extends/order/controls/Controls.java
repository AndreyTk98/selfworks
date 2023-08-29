package sw_extends.order.controls;

import sw_extends.order.calculations.Calc;
import sw_extends.order.models.Cargo;
import sw_extends.order.models.FastOrder;
import sw_extends.order.models.Order;
import sw_extends.order.models.PostOrder;
import sw_extends.order.utilits.rounder.Rounder;
import sw_extends.order.vievs.*;

public class Controls {

    private final Cargo cargo;
    private final FastOrder fastOrder;
    private final Order order;
    private final Input input;
    private final OrderType orderType;
    private final PostOrder postOrder;
    private final static String ROUND_PATTERN = "0.00";
    private final static String ROUND_PATTERN_WEIGHT = "0.000";

    public Controls(Cargo cargo, FastOrder fastOrder, Order order, Input input, OrderType orderType,
                    PostOrder postOrder) {
        this.cargo = cargo;
        this.fastOrder = fastOrder;
        this.order = order;
        this.input = input;
        this.orderType = orderType;
        this.postOrder = postOrder;
    }

    public void run (){
        input.runInput();
        double cost;
        double fullCost;
        double rate;
        Calc calc = new Calc();
        switch (postOrder.getDeliveryType()) {
            case 1 -> {
                cost = calc.calcCost(order.getWeight(), order.getPrice());
                Outputs.getOutputsSimpleOrder(cargo.getName(), orderType.getOrderType(), order.getQuantity(),
                        Rounder.rounder(calc.getAllWeight(), ROUND_PATTERN_WEIGHT),
                        Rounder.rounder(cost, ROUND_PATTERN));
            }
            case 2 -> {
                cost = calc.calcCost(order.getWeight(), order.getPrice());
                rate = calc.calcCourierOrderCountryRate(fastOrder.getRange());
                fullCost = calc.calcFinalDeliveryCost(cost, rate);
                Outputs.getOutputsSimpleOrder(cargo.getName(), orderType.getOrderType(), order.getQuantity(),
                        Rounder.rounder(calc.getAllWeight(), ROUND_PATTERN_WEIGHT),
                        Rounder.rounder(fullCost, ROUND_PATTERN));
            }
            case 3 -> {

                switch (postOrder.getPostsType()) {
                    case 1 -> {
                        CountryOrderType countryOrderType = new CountryOrderType();
                        cost = calc.calcCost(order.getWeight(), order.getPrice());
                        countryOrderType.doSwitchCountryOrderType();
                        rate = calc.findsCountryPostRate(countryOrderType.getChoose());
                        fullCost = calc.calcFinalDeliveryCost(cost, rate);
                        Outputs.getOutputsComplexOrder(cargo.getName(), orderType.getOrderType(),
                                countryOrderType.getDeliveryRegion(), order.getQuantity(),
                                Rounder.rounder(calc.getAllWeight(), ROUND_PATTERN_WEIGHT),
                                Rounder.rounder(fullCost, ROUND_PATTERN));
                    }
                    case 2 -> {
                        ContinentsType continentsType = new ContinentsType();
                        cost = calc.calcCost(order.getWeight(), order.getPrice());
                        continentsType.doSwitchContinents();
                        rate = calc.findContinentsPostRate(continentsType.getChoose());
                        fullCost = calc.calcFinalDeliveryCost(cost, rate);
                        Outputs.getOutputsComplexOrder(cargo.getName(), orderType.getOrderType(),
                                continentsType.getDeliveryRegion(), order.getQuantity(),
                                Rounder.rounder(calc.getAllWeight(), ROUND_PATTERN_WEIGHT),
                                Rounder.rounder(fullCost, ROUND_PATTERN));
                    }
                }
            }
        }
    }


}
