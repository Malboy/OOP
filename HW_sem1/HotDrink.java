package HW_sem1;

public class HotDrink extends Product {
    public HotDrink(String name, Integer price, Integer temperature) {
        super(name, price);
        this.setTemperature(temperature);
    }

    private Integer temperature;

    public Integer getTemperature() {
        return temperature;
    }

    private void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("%s-%s", super.toString(), temperature);
    }
}
