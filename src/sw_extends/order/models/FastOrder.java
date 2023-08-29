package sw_extends.order.models;

public class FastOrder extends Order {

    // fastDeliveryCharge - 0,01% за каждые 100м
    private double range;

    public FastOrder(String name, double price, double [] weight, int quantity, double range) {
        super(name, price, weight, quantity);
        this.range = range;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }
}
