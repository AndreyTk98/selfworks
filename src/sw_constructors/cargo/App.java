package sw_constructors.cargo;

import sw_constructors.cargo.controls.CargoControls;
import sw_constructors.cargo.model.Cargo;
import sw_constructors.cargo.views.Views;

public class App {
    public static void main(String[] args) {
        Cargo model = new Cargo();
        Views views = new Views(model);
        CargoControls controls = new CargoControls(model, views);
        controls.run();
    }
}
