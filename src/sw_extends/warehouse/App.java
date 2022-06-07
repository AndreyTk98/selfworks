package sw_extends.warehouse;

import sw_extends.warehouse.controls.ProductControls;
import sw_extends.warehouse.model.ByWeight;
import sw_extends.warehouse.model.PieceByPiece;
import sw_extends.warehouse.model.Product;
import sw_extends.warehouse.views.Input;

public class App {

     protected static String name;
     protected static double price;
     protected static int qunty;
     protected static double weight;

    public static void main(String[] args) {
        Product product = new Product(name, price);
        PieceByPiece piece = new PieceByPiece(name, price, qunty);
        ByWeight byWeight = new ByWeight(name,price,weight);
        Input views = new Input(product,piece,byWeight);
        ProductControls controls = new ProductControls(product, views, piece, byWeight);
        controls.run();

    }
}
