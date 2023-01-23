package HW_Sem_6.BridgePattern;

public interface Device {
    
    int getVolume();

    void setVolume(int volume);

    int getChannel();

    void nextChannel();

    boolean isEnable();

    void disable();

    void enable();
}
