package sw_extends.order.models;

public class FastOrder extends Order {

    // fastDeliveryCharge - 0,01% за каждые 100м
    private double fastDeliveryCharge;
    private double range;

    public FastOrder(double price, double [] weight, int quantity, double fastDeliveryCharge, double range) {
        super(price, weight, quantity);
        this.fastDeliveryCharge = fastDeliveryCharge;
        this.range = range;
    }

    public double getFastDeliveryCharge() {
        return fastDeliveryCharge;
    }

    public void setFastDeliveryCharge(double fastDeliveryCharge) {
        this.fastDeliveryCharge = fastDeliveryCharge;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }
}
