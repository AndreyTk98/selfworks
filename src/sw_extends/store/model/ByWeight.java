package sw_extends.store.model;

public class ByWeight extends Product {

    private double weight;

    public ByWeight(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
