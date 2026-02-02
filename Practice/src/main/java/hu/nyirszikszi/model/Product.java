package hu.nyirszikszi.model;

public class Product {
    private final String sku;
    private final String name;
    private Category category;
    private final int price;

    public Product(Category category, String sku, String name, int price) {
        this.category = category;
        this.sku = sku;
        this.name = name;
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "sku='" + sku + '\'' +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", price=" + price +
                '}';
    }
}
