package HW_Sem_2.services;

import HW_Sem_2.Entityes.Coffee;
import HW_Sem_2.repos.CatalogRepository;
import HW_Sem_2.view.GetCoffeeResponse;


public class CoffeeServices {
    private final CatalogRepository catalogRepository;

    public CoffeeServices(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    public GetCoffeeResponse getCoffee(String name) {
        Coffee coffee = catalogRepository.getCoffeeByName(name);
        if(coffee == null) {
            return new GetCoffeeResponse(true, "Этот кофе закончился", null);
        }
        return new GetCoffeeResponse(false, null, coffee);
    }

    public Boolean addCoffee(Coffee coffee) {
        return catalogRepository.addCoffee(coffee);
    }
}
