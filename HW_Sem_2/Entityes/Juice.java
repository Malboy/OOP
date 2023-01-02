package HW_Sem_2.Entityes;

public class Juice {
    private String name;
    private Integer price;
    private String taste;

    public Juice(Integer Price, String Name, String Taste) {
        this.price = Price;
        this.name = Name;
        this.taste = Taste;
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

    public String getTaste() {
        return taste;
    }

    public void setSugar(String Taste) {
        this.taste = Taste;
    }
}

