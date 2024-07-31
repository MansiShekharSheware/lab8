package lab9;

import java.util.*;

class Product implements Comparable<Product> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product1", 100.0));
        products.add(new Product("Product2", 50.0));
        products.add(new Product("Product3", 150.0));

        Collections.sort(products);

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
