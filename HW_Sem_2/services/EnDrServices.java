package HW_Sem_2.services;

import HW_Sem_2.Entityes.EnegryDrink;
import HW_Sem_2.repos.CatalogRepository;
import HW_Sem_2.view.GetEnDrResponse;

public class EnDrServices {
    private final CatalogRepository catalogRepository;

    public EnDrServices(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    public GetEnDrResponse getEnergyDrink(String name) {
        EnegryDrink EnDr = catalogRepository.getEnergyDrinkbyName(name);
        if(EnDr == null) {
            return new GetEnDrResponse(true, "Этот кофе закончился", null);
        }
        return new GetEnDrResponse(false, null, EnDr);
    }

    public Boolean addEnergyDrink(EnegryDrink EnDr) {
        return catalogRepository.addEnergyDrink(EnDr);
    }
}
