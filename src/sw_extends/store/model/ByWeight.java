package sw_extends.store.model;

public class ByWeight extends Product {

    private double weight;

    public ByWeight(double price, String name, double weight) {
        super(price, name);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
