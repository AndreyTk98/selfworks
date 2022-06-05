package sw_extends.warehouse.controls;

import sw_extends.warehouse.calculations.Calc;
import sw_extends.warehouse.model.ByWeight;
import sw_extends.warehouse.model.PieceByPiece;
import sw_extends.warehouse.model.Product;
import sw_extends.warehouse.views.GetOutput;
import sw_extends.warehouse.views.Views;
import sw_extends.warehouse.utils.Rounder;


public class ProductControls {

    protected Product model;
    protected Views views;
    protected PieceByPiece pieceModel;
    protected ByWeight weightModel;
    protected int choose;
    private final static String ROUND_PATTERN = "0.00";
    private final static String ROUND_PATTERN_WEIGHT = "0.00";

    public ProductControls(Product model, Views views, PieceByPiece pieceModel, ByWeight weightModel) {
        this.model = model;
        this.views = views;
        this.pieceModel = pieceModel;
        this.weightModel = weightModel;
    }


    public void run() {
        views.getInput();
        views.makeChoose();
        choose = views.getChoose();
        double cost;
        switch (choose) {
            case 1 -> {
                Calc calc = new Calc();
                cost = calc.calcQuntyCost(model.getPrice(), pieceModel.getQuantity());
                GetOutput.getQuntyOutput(model.getName(),  Rounder.rounder(cost, ROUND_PATTERN),
                        pieceModel.getQuantity(), Rounder.rounder(model.getPrice(), ROUND_PATTERN_WEIGHT));
            }
            case 2 ->{
                Calc calc = new Calc();
                cost = calc.calcWeightCost(model.getPrice(), weightModel.getWeight());
                GetOutput.getWeightOutput(model.getName(), Rounder.rounder(cost, ROUND_PATTERN),
                        Rounder.rounder(weightModel.getWeight(), ROUND_PATTERN_WEIGHT),
                        Rounder.rounder(model.getPrice(), ROUND_PATTERN_WEIGHT));
            }
        }
    }
}
