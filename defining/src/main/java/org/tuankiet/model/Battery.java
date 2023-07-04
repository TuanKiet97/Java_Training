package org.tuankiet.model;

/**
 * This is a class data access of the battery
 */

public class Battery {
    private String model;
    private int hoursIdle;
    private int hoursTalk;
    private BatteryType batteryType;

    /**
     * The default constructor help to init attributes with default value.
     */
    public Battery() {
	this.model = "";
	this.hoursIdle = 0;
	this.hoursTalk = 0;
	this.batteryType = null;
    }

    /**
     * The parameterized constructor help to init attributes with passed arguments.
     *
     * @param model       : the model of the battery
     * @param hoursIdle   : the hour idle of the battery
     * @param hoursTalk   : the hour talk of the battery
     * @param batteryType : the type of the battery (LIION, NIMH, NICD)
     */
    public Battery(String model, int hoursIdle, int hoursTalk, BatteryType batteryType) {
	this.model = model;
	this.hoursIdle = hoursIdle;
	this.hoursTalk = hoursTalk;
	this.batteryType = batteryType;
    }

    /**
     * The getter function help to get the model of the battery.
     *
     * @return The current model
     */
    public String getModel() {
	return model;
    }

    /**
     * The setter function help to set the model of the battery.
     *
     * @param model: the new model of the battery
     */
    public void setModel(String model) {
	this.model = model;
    }

    /**
     * The getter function help to get the hour idle of the battery.
     *
     * @return The current hour idle
     */
    public int getHoursIdle() {
	return hoursIdle;
    }

    /**
     * The setter function help to set the hour idle of the battery.
     *
     * @param hoursIdle: the new hour idle of the battery
     */
    public void setHoursIdle(int hoursIdle) {
	this.hoursIdle = hoursIdle;
    }

    /**
     * The getter function help to get the type of the battery.
     *
     * @return The current battery type
     */
    public int getHoursTalk() {
	return hoursTalk;
    }

    /**
     * The setter function help to set the hour talk of the battery.
     *
     * @param hoursTalk: the new hour talk of the battery
     */
    public void setHoursTalk(int hoursTalk) {
	this.hoursTalk = hoursTalk;
    }

    /**
     * The getter function help to get the type of the battery.
     *
     * @return The current battery type
     */
    public BatteryType getBatteryType() {
	return batteryType;
    }


    /**
     * The setter function help to set the type of the battery.
     *
     * @param batteryType: the new type of the battery
     */
    public void setBatteryType(BatteryType batteryType) {
	this.batteryType = batteryType;
    }

    /**
     * The override function help to display the battery info.
     *
     * @return The info of the battery
     */
    @Override
    public String toString() {
	String res = "==================BATTERY INFO==============\n";
	res += "Battery model: " + this.model + "\n";
	res += "Battery hour idle: " + this.hoursIdle + "\n";
	res += "Battery hour talk: " + this.hoursTalk + "\n";
	res += "Battery type: " + this.batteryType + "\n";
	return res;
    }
}
