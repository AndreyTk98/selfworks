package sw_extends.store.model;

public class Product {

     private double price;
     private String name;

     public Product(String name, double price) {
          this.price = price;
          this.name = name;
     }

     public double getPrice() {
          return price;
     }

     public void setPrice(double price) {
          this.price = price;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }
}
