package HW_Sem_2.Entityes;

public class Product {
    
    private String name;
    private Integer price;

    public Product(Integer Price, String Name) {
        this.price = Price;
        this.name = Name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
