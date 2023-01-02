package HW_Sem_2.Entityes;

public class EnegryDrink {
    
    private String name;
    private Integer price;
    private double volume;

    public EnegryDrink(Integer Price, String Name, double Volume) {
        this.price = Price;
        this.name = Name;
        this.volume = Volume;
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

    public double getVolume() {
        return volume;
    }

    public void setSugar(double Volume) {
        this.volume = Volume;
    }
}
