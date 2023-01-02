package HW_Sem_2.controller;

import HW_Sem_2.services.CoffeeServices;
import HW_Sem_2.view.GetCoffeeResponse;

public class CoffeeMachineController {
    
    private final CoffeeServices CoffeeServ;

    public CoffeeMachineController(CoffeeServices coffeeServ){
        this.CoffeeServ = coffeeServ;
    }

    public GetCoffeeResponse getCoffee(String name, boolean Milk) {
        return CoffeeServ.getCoffee(name);
    }
}
