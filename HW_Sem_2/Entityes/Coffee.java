package HW_Sem_2.Entityes;

public class Coffee extends Product {
    
    private String name;
    private Integer price;
    private boolean withMilk;

    public Coffee(Integer Price, String Name, boolean Milk) {
        super(Price, Name);
        this.withMilk = Milk;
    }

    @Override
    public Integer getAttractiveness() {
        return Integer.valueOf(price);
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
