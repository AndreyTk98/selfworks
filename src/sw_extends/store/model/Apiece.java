package sw_extends.store.model;

public class Apiece extends Product {

    private int quantity;

    public Apiece(double price, String name, int quantity) {
        super(price, name);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
