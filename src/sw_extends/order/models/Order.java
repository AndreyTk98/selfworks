package sw_extends.order.models;

public class Order extends Cargo {

    private double price;
    private double[] weight;
    private int quantity;
    private String orderType;

    public Order(String name, double price, double[] weight, int quantity, String orderType) {
        super(name);
        this.price = price;
        this.weight = weight;
        this.quantity = quantity;
        this.orderType = orderType;
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

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}
