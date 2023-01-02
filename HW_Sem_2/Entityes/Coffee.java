package HW_Sem_2.Entityes;

public class Coffee {
    
    private String name;
    private Integer price;
    private boolean withMilk;

    public Coffee(Integer Price, String Name, boolean Milk) {
        this.price = Price;
        this.name = Name;
        this.withMilk = Milk;
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

    public boolean getMilk() {
        return withMilk;
    }

    public void setMilk(boolean Milk) {
        this.withMilk = Milk;
    }
}
