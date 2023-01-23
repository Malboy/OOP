package HW_Sem_6.BridgePattern.Controllers;

import HW_Sem_6.BridgePattern.Device;

public class SimpleConsole extends RemoteController {

    public SimpleConsole(Device device) {
      super(device);
    }
  
    @Override
    public void changeChanel() {
      System.out.println("Twist the wheel");
      device.nextChannel();
    }
  }
