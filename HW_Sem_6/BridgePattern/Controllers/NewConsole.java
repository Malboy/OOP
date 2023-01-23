package HW_Sem_6.BridgePattern.Controllers;

import HW_Sem_6.BridgePattern.Device;

public class NewConsole extends RemoteController {

    public NewConsole(Device device) {
      super(device);
    }
  
    @Override
    public void changeChanel() {
      System.out.println("Click button");
      device.nextChannel();
    }
  
    public void mute() {
      device.setVolume(0);
    }
  }
