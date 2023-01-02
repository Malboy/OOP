package HW_Sem_2.controller;

import HW_Sem_2.services.EnDrServices;
import HW_Sem_2.view.GetEnDrResponse;

public class EnergyDrinksMachineController {
    
    private final EnDrServices EnDrServ;

    public EnergyDrinksMachineController(EnDrServices EnDrServ){
        this.EnDrServ = EnDrServ;
    }

    public GetEnDrResponse getEnergyDrink(String name, double Volume) {
        return EnDrServ.getEnergyDrink(name);
    }
}
