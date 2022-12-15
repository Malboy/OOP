package HW_sem1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksAutomat extends Automat {
    
    private List<HotDrink> HotDri;

    public List<HotDrink> getProduct(String name, double price, int temperature) {
        List<HotDrink> result = new ArrayList<>();
        HotDri.forEach(i -> {
            if (i.getName().contains(name) && i.getPrice() == price && i.getTemperature() == temperature)
                result.add(i);
        });
        return result;
    }

}
