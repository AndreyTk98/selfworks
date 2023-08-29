package sw_extends.order.models;

public class PostOrder extends Order {
    private int postsType;
    private int deliveryType;
    public PostOrder
            (String name, double price, double [] weight, int quantity, String orderType,
             int postsType, int deliveryType) {
        super(name, price, weight, quantity, orderType);
        this.postsType = postsType;
        this.deliveryType = deliveryType;
    }

    public int getPostsType() {
        return postsType;
    }

    public void setPostsType(int postsType) {
        this.postsType = postsType;
    }

    public int getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(int deliveryType) {
        this.deliveryType = deliveryType;
    }
}
