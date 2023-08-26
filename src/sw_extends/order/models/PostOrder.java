package sw_extends.order.models;

public class PostOrder extends Order {

    private double postalRate;
    private int deliveryRegion;
    private int postsType;


    public PostOrder
            (String name, double price, double [] weight, int quantity, double postalRate, int deliveryRegion, int postsType) {
        super(name, price, weight, quantity);
        this.postalRate = postalRate;
        this.deliveryRegion = deliveryRegion;
        this.postsType = postsType;
    }

    public double getPostalRate() {
        return postalRate;
    }

    public void setPostalRate(double postalRate) {
        this.postalRate = postalRate;
    }

    public int getDeliveryRegion() {
        return deliveryRegion;
    }

    public void setDeliveryRegion(int deliveryRegion) {
        this.deliveryRegion = deliveryRegion;
    }

    public int getPostsType() {
        return postsType;
    }

    public void setPostsType(int postsType) {
        this.postsType = postsType;
    }
}
