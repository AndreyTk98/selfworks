package sw_constructors.cargo.controls;

import sw_constructors.cargo.calculations.CalculateCost;
import sw_constructors.cargo.calculations.CalculatePrice;
import sw_constructors.cargo.model.Cargo;
import sw_constructors.cargo.views.GetOutput;
import sw_constructors.cargo.views.Views;

public class CargoControls {
    Cargo model;
    Views view;

    public CargoControls(Cargo model, Views view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        view.getInputs();
        String name = model.getName();
        CalculatePrice calculatePrice = new CalculatePrice();
        double price = calculatePrice.calcPay(model.getQuantity());
        CalculateCost calculateCost = new CalculateCost();
        double cost = calculateCost.calcCost(price, model.getQuantity());
        model.setCost(cost);
        GetOutput.getOutput(name, model.getCost(), model.getQuantity(), price);
    }
}
