package isp.lab5.exercise2;

public class SmartWatch implements Chargeable {
    private int batteryLevel = 0;
    private final int chargeRate = 2;

    @Override
    public void charge(int durationInMinutes) {
        batteryLevel = chargeRate * durationInMinutes;
        if (batteryLevel > MAX_BATTERY_LEVEL)
            batteryLevel = MAX_BATTERY_LEVEL;
        System.out.println("SmartWatch charged to " + this.batteryLevel + "% in " + durationInMinutes + " minutes.");
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }
}
