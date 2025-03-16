package stream;

public class SimpleItem {
    private final Product product;
    private final int quantity;

    public SimpleItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getValue() {
        return product.getPrice() * quantity;
    }

    public Product getProduct() {
        return product;
    }
}
