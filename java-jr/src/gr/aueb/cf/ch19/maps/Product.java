package gr.aueb.cf.ch19.maps;

public class Product
//    implements Comparable<Product>
//}
{

    private String id;
    private String description;
    private double price;
    private int quantity;

    public Product() {}

    public Product(String description, double price, int quantity, String id) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.id = id;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "product{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", id=" + id +
                '}';
    }


    public int compareTo(Product that) {
        return this.description.compareTo(that.description);
  }
//
//    @Override
//    public int compareTo(Product o) {
//        return this.quantity - o.quantity;
//    }

//    @Override
//    public int compareTo(Product o) {
//        return Double.compare(this.price, o.price);
//    }
}

