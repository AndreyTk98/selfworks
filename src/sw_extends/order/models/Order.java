package sw_extends.order.models;

public class Order extends Cargo {

    private double price;
    private double [] weight;
    private int quantity;

    public Order (String name, double price, double [] weight, int quantity) {
        super(name);
        this.price = price;
        this.weight = weight;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double[] getWeight() {
        return weight;
    }

    public void setWeight(double[] weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
