package org.tuankiet;

/**
 * This is a class data access of the battery
 *
 * */

public class Battery {
    /**
     * Create Battery Enum Types
     * */
    public enum BatteryType {
	LiIon, NiMH, NiCd;
    }
    private String model;
    private int hoursIdle;
    private int hoursTalk;
    private BatteryType batteryType;

    // Create the constructor
    public Battery(String model, int hoursIdle, int hoursTalk, BatteryType batteryType) {
	this.model = model;
	this.hoursIdle = hoursIdle;
	this.hoursTalk = hoursTalk;
	this.batteryType = batteryType;
    }

    public String getModel() {
	return model;
    }

    public void setModel(String model) {
	this.model = model;
    }

    public int getHoursIdle() {
	return hoursIdle;
    }

    public void setHoursIdle(int hoursIdle) {
	this.hoursIdle = hoursIdle;
    }

    public int getHoursTalk() {
	return hoursTalk;
    }

    public void setHoursTalk(int hoursTalk) {
	this.hoursTalk = hoursTalk;
    }

    public BatteryType getBatteryType() {
	return batteryType;
    }

    public void setBatteryType(BatteryType batteryType) {
	this.batteryType = batteryType;
    }

    @Override
    public String toString() {
	return "Battery{" +
		"model='" + model + '\'' +
		", hoursIdle=" + hoursIdle +
		", hoursTalk=" + hoursTalk +
		", batteryType=" + batteryType +
		'}';
    }
}
