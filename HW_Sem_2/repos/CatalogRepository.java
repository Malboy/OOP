package HW_Sem_2.repos;

import java.util.ArrayList;

import HW_Sem_2.Entityes.Coffee;
import HW_Sem_2.Entityes.EnegryDrink;
import HW_Sem_2.Entityes.Juice;


public class CatalogRepository {
    
    private ArrayList<Coffee> coffees = new ArrayList<>();
    private ArrayList<EnegryDrink> energy_drinks = new ArrayList<>();
    private ArrayList<Juice> juices = new ArrayList<>();

    public Coffee getCoffeeByName(String name) {
        for (Coffee cof : coffees) {
            if (cof.getName().equals(name)) {
                coffees.remove(cof);
                return cof;
            }
        }
        return null;
    }

    public boolean addCoffee(Coffee coffee) {
        for(Coffee cof : coffees) {
            if(cof.getName().equals(coffee.getName())) return false;
        }
        coffees.add(coffee);
        return true;
    }

    public EnegryDrink getEnergyDrinkbyName(String name) {
        for (EnegryDrink enDr : energy_drinks) {
            if (enDr.getName().equals(name)) {
                energy_drinks.remove(enDr);
                return enDr;
            }
        }
        return null;
    }

    public boolean addEnergyDrink(EnegryDrink EnDrink) {
        for(EnegryDrink enDr : energy_drinks) {
            if(enDr.getName().equals(EnDrink.getName())) return false;
        }
        energy_drinks.add(EnDrink);
        return true;
    }

    public Juice getJuiceByName(String name) {
        for (Juice juc : juices) {
            if (juc.getName().equals(name)) {
                juices.remove(juc);
                return juc;
            }
        }
        return null;
    }

    public boolean addJuice(Juice juce) {
        for(Juice juc : juices) {
            if(juc.getName().equals(juce.getName())) return false;
        }
        juices.add(juce);
        return true;
    }
}
