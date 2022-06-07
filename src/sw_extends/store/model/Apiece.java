package sw_extends.store.model;

public class Apiece extends Product {

    private int quantity;

    public Apiece(String name, double price, int quantity) {
        super(name, price);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
