package HW_Sem_2.services;

import HW_Sem_2.Entityes.Juice;
import HW_Sem_2.repos.CatalogRepository;
import HW_Sem_2.view.GetJuiceResponse;

public class JuiceServices {
    private final CatalogRepository catalogRepository;

    public JuiceServices(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    public GetJuiceResponse getJuice(String name) {
        Juice juce = catalogRepository.getJuiceByName(name);
        if(juce == null) {
            return new GetJuiceResponse(true, "Этот сок закончился", null);
        }
        return new GetJuiceResponse(false, null, juce);
    }

    public Boolean addJuice(Juice juc) {
        return catalogRepository.addJuice(juc);
    }
}
