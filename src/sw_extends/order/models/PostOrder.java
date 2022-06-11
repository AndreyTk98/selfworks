package sw_extends.order.models;

public class PostOrder extends Order {

    private double PostalRate;
    private int PostType;

    public PostOrder(double price, double [] weight, int quantity, double postalRate, int deliveryRegion) {
        super(price, weight, quantity);
        PostalRate = postalRate;
        this.PostType = deliveryRegion;
    }

    public double getPostalRate() {
        return PostalRate;
    }

    public void setPostalRate(double postalRate) {
        PostalRate = postalRate;
    }

    public int getPostType() {
        return PostType;
    }

    public void setPostType(int postType) {
        this.PostType = postType;
    }
}
