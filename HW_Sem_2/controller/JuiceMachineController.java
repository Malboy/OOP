package HW_Sem_2.controller;

import HW_Sem_2.services.JuiceServices;
import HW_Sem_2.view.GetJuiceResponse;

public class JuiceMachineController {
    
    private final JuiceServices JuiceService;

    public JuiceMachineController(JuiceServices JuiceServ){
        this.JuiceService = JuiceServ;
    }

    public GetJuiceResponse getJuce(String name, String taste) {
        return JuiceService.getJuice(name);
    }
}
