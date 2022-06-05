package sw_constructors.warehouse;

public class Product {

    protected double qunty;
    protected double weight;

    public Product(double qunty, double weight) {
        this.qunty = qunty;
        this.weight = weight;
    }

    public void setQunty(double qunty) {
        this.qunty = qunty;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getQunty() {
        return qunty;
    }

    public double getWeight() {
        return weight;
    }
}