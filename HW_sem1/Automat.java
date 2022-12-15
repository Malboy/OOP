package HW_sem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Automat {
    private List<Product> products;
    private static List<Product> DEFAULT = new ArrayList<>(Arrays.asList(new Product("Cappucino", 7)));

    public Automat(List<Product> products) {
        this.products = products;
    }

    public Automat() {
        this(DEFAULT);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        products.forEach(i -> result.append(i.toString() + "\n"));
        return result.toString();
    }

    public List<Product> findByName(String name) {
        List<Product> result = new ArrayList<>();
        products.forEach(i -> {
            if (i.getName().contains(name))
                result.add(i);
        });
        return result;
    }
    public List<Product> findByPrice(double price) {
        List<Product> result = new ArrayList<>();
        products.forEach(i -> {
            if (i.getPrice() == price)
                result.add(i);
        });
        return result;
    }
    public List<Product> findByPriceRange(double p1, double p2) {
        List<Product> result = new ArrayList<>();
        products.forEach(i -> {
            if (i.getPrice()>p1 && i.getPrice()<p2)
                result.add(i);
        });
        return result;
    }
}