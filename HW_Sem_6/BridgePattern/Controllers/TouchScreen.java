package HW_Sem_6.BridgePattern.Controllers;

import HW_Sem_6.BridgePattern.Device;

public class TouchScreen extends RemoteController {

    public TouchScreen(Device device) {
      super(device);
    }
  
    @Override
    public void changeChanel() {
      System.out.println("Swipe left");
      device.nextChannel();
    }
  
    public void mute() {
      device.setVolume(0);
    }
  }
