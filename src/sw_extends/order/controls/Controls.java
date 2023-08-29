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

    public void run() {
        input.runInput();
        Calc calc = new Calc();
        switch (postOrder.getDeliveryType()) {
            case 1 -> Outputs.getOutputsSimpleOrder(cargo.getName(), orderType.getOrderType(), order.getQuantity(),
                    Rounder.rounder(calc.calcAllWeight(order.getWeight()), ROUND_PATTERN_WEIGHT),
                    Rounder.rounder(calc.calcCost(calc.calcAllWeight
                            (order.getWeight()), order.getPrice()), ROUND_PATTERN));
            case 2 -> Outputs.getOutputsSimpleOrder(cargo.getName(), orderType.getOrderType(), order.getQuantity(),
                    Rounder.rounder(calc.calcAllWeight(order.getWeight()), ROUND_PATTERN_WEIGHT),
                    Rounder.rounder(calc.calcFinalDeliveryCost(calc.calcCost
                                    (calc.calcAllWeight(order.getWeight()), order.getPrice()),
                            calc.calcCourierOrderCountryRate(fastOrder.getRange())), ROUND_PATTERN));
            case 3 -> {

                switch (postOrder.getPostsType()) {
                    case 1 -> {
                        CountryOrderType countryOrderType = new CountryOrderType();
                        countryOrderType.doSwitchCountryOrderType();
                        Outputs.getOutputsComplexOrder(cargo.getName(), orderType.getOrderType(),
                                countryOrderType.getDeliveryRegion(), order.getQuantity(),
                                Rounder.rounder(calc.calcAllWeight(order.getWeight()), ROUND_PATTERN_WEIGHT),
                                Rounder.rounder(calc.calcFinalDeliveryCost
                                                (calc.calcCost(calc.calcAllWeight(order.getWeight()), order.getPrice()),
                                                        calc.findsCountryPostRate(countryOrderType.getChoose())),
                                        ROUND_PATTERN));
                    }
                    case 2 -> {
                        ContinentsType continentsType = new ContinentsType();
                        continentsType.doSwitchContinents();
                        Outputs.getOutputsComplexOrder(cargo.getName(), orderType.getOrderType(),
                                continentsType.getDeliveryRegion(), order.getQuantity(),
                                Rounder.rounder(calc.calcAllWeight(order.getWeight()), ROUND_PATTERN_WEIGHT),
                                Rounder.rounder(calc.calcFinalDeliveryCost
                                                (calc.calcCost(calc.calcAllWeight(order.getWeight()), order.getPrice()),
                                                        calc.findContinentsPostRate(continentsType.getChoose())),
                                        ROUND_PATTERN));
                    }
                }
            }
        }
    }


}
