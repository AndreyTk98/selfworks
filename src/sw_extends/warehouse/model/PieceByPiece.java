package sw_extends.warehouse.model;

public class PieceByPiece extends Product {

    protected int quantity;

    public PieceByPiece(String name, double price, int quantity) {
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
