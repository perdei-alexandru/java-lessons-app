package isp.lab5.exercise2;


public interface  Chargeable {

    int MAX_BATTERY_LEVEL = 100;

    void charge(int durationInMinutes);

    int getBatteryLevel();
}
