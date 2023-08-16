package sw_extends.store.controls;

import sw_extends.store.calculations.Calc;
import sw_extends.store.model.Apiece;
import sw_extends.store.model.ByWeight;
import sw_extends.store.model.Product;
import sw_extends.order.utilits.rounder.Rounder;
import sw_extends.store.views.Input;
import sw_extends.store.views.Output;

public class Controls {

    protected Product model;
    protected Apiece pieceModel;
    protected ByWeight weightModel;
    protected Input views;
    private final static String ROUND_PATTERN_MONEY = "0.00";
    private final static String ROUND_PATTERN_WEIGHT = "0.000";

    public Controls(Product model, Apiece pieceModel, ByWeight weightModel, Input views) {
        this.model = model;
        this.pieceModel = pieceModel;
        this.weightModel = weightModel;
        this.views = views;
    }

    public void run() {
        int choose;
        views.runInput();
        choose = views.getChoose();
        double cost;
        switch (choose) {
            case 1 -> {
                Calc calc = new Calc();
                cost = calc.calcQuantityCost(model.getPrice(), pieceModel.getQuantity());
                Output.getQuantityOutput(model.getName(), Rounder.rounder(cost, ROUND_PATTERN_MONEY),
                        pieceModel.getQuantity(), Rounder.rounder(model.getPrice(), ROUND_PATTERN_MONEY));
            }
            case 2 -> {
                Calc calc = new Calc();
                cost = calc.CalcWeightCost(model.getPrice(), weightModel.getWeight());
                Output.getWeightOutput(model.getName(), Rounder.rounder(cost, ROUND_PATTERN_MONEY),
                        Rounder.rounder(weightModel.getWeight(), ROUND_PATTERN_WEIGHT),
                        Rounder.rounder(model.getPrice(), ROUND_PATTERN_MONEY));
            }
        }
    }
}
