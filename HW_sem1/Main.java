package HW_sem1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Automat robo1 = new Automat();
        System.out.println(robo1);

        List<Product> assortiment = new ArrayList<>();
        assortiment.add(new Product("Espresso", 1));
        assortiment.add(new Product("Latte", 5));
        assortiment.add(new HotDrink("Americano", 3, 38));


        Automat machine2 = new Automat(assortiment);
        System.out.println(machine2);

        System.out.println(machine2.findByName("Lat"));
        System.out.println(machine2.findByPrice(3));
        System.out.println(machine2.findByPriceRange(4,10));
    }
}
