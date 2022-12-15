package HW_sem1;

public class Product {
    private String name;
    private Integer price;

    public Product(String name, Integer price) {
        this.setName(name);
        this.setPrice(price);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String toString() {
        return String.format("%s-%d", name, price);
    }
}
