package org.tuankiet;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a class data access of the gsm
 *
 * */
public class GSM {
    private String model;
    private String manufacturer;
    private Double price;
    private String owner;
    private Display display;
    private Battery battery;
    private static final String EMPTY_VALUE = "";
    private static final List<Call> callHistory = new ArrayList<>();

    // Create the constructor
    public GSM () {
	this.model = EMPTY_VALUE;
	this.manufacturer = EMPTY_VALUE;
	this.price = 0.0;
	this.owner = EMPTY_VALUE;
	this.display = null;
	this.battery = null;
    }

    public GSM(String model, String manufacturer, Double price, String owner, Display display, Battery battery) {
	this.model = model;
	this.manufacturer = manufacturer;
	this.price = price;
	this.owner = owner;
	this.display = display;
	this.battery = battery;
    }

    public String getModel() {
	return model;
    }

    public void setModel(String model) {
	this.model = model;
    }

    public String getManufacturer() {
	return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
    }

    public Double getPrice() {
	return price;
    }

    public void setPrice(Double price) {
	this.price = price;
    }

    public String getOwner() {
	return owner;
    }

    public void setOwner(String owner) {
	this.owner = owner;
    }

    public Display getDisplay() {
	return display;
    }

    public void setDisplay(Display display) {
	this.display = display;
    }

    public Battery getBattery() {
	return battery;
    }

    public void setBattery(Battery battery) {
	this.battery = battery;
    }

    public List<Call> getCallHistory() {
	return callHistory;
    }


    @Override
    public String toString() {
	return "GSM{" +
		"model='" + model + '\'' +
		", manufacturer='" + manufacturer + '\'' +
		", price=" + price +
		", owner='" + owner + '\'' +
		", display=" + display +
		", battery=" + battery +
		'}';
    }

    /**
     * Add a call to call history
     *
     * @param dataCall
     * @param dialedPhone
     * @param duration
     * */
     public void addCall(String dataCall, String dialedPhone, int duration) {
	this.getCallHistory().add(new Call(dataCall, dialedPhone, duration));
     }

    /**
     * Clear all call
     *
     * */
     public void clearCall() {
	this.getCallHistory().clear();
	 System.out.println("-------------------- The call history has been cleared --------------------");
     }

     /**
      * Calculate price per minute of call
      *
      * @return  price per minute of call
      * */
     public double totalPricePerMinute( double pricePerMinute) {
	 double priceCall = 0;
	 int minuteOfHour = 60;
	 for( Call call : this.getCallHistory()) {
	     priceCall +=call.getDuration();
	 }
	 return (priceCall / minuteOfHour) * pricePerMinute;
     }

     /**
      *  Get duration longest in the call history
      *
      * @return duration
      * */
    private int getCallDurationLongest() {
	int maxDuration = 0;
	for (Call call : this.getCallHistory()) {
	    if (call.getDuration() > 0)
	   	maxDuration =call.getDuration();
	}
	return maxDuration;
    }

    /**
     * 	Remove call longest in the call history
     *
     * */
    public void removeCallLongest() {
	this.getCallHistory().removeIf(call -> call.getDuration() == this.getCallDurationLongest());
	System.out.println("-------------------- Call longest has been removed --------------------");
    }

}
