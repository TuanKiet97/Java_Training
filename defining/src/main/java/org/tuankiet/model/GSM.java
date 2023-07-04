package org.tuankiet.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a class data access of the gsm
 */
public class GSM {
    private String model;
    private String manufacturer;
    private double price;
    private String owner;
    private Display display;
    private Battery battery;
    private List<Call> callHistory;

    /**
     * The constructor help to init attributes which is mandatory, the other init with default value.
     *
     * @param model: the model of the phone device
     * @param manufacturer: the manufacturer of the phone device
     */
    public GSM(String model, String manufacturer) {
	this.model = model;
	this.manufacturer = manufacturer;
	this.price = 0;
	this.owner = "";
	this.display = new Display();
	this.battery = new Battery();
	this.callHistory = null;
    }

    /**
     * The parameterized constructor help to init attributes with passed arguments.
     *
     * @param model: model of telephone
     * @param manufacturer: manufacturer of telephone
     * @param price: price of telephone
     * @param owner: owner of telephone
     * @param display: display of telephone
     * @param battery: battery of tof telephone
     * @param callHistory: list of call history of telephone
     *
     * */
    public GSM(String model, String manufacturer, double price, String owner, Battery battery, Display display, List<Call> callHistory) {
	this.model = model;
	this.manufacturer = manufacturer;
	this.price = price;
	this.owner = owner;
	this.display = display;
	this.battery = battery;
	this.callHistory = callHistory;
    }

    /**
     * The function help to add the list of call to the call history
     *
     * @param call:list of call
     */
    public void addCallHistory(List<Call> call) {
	this.callHistory.addAll(call);
    }

    /**
     * The function help to remove the list of call from the call history
     *
     * @param call: list of call
     */
    public void removeCallHistory(List<Call> call) {
	this.callHistory.removeAll(call);
    }

    /**
     * The function help to remove the longest call
     */
    public void removeTheLongestCall() {
	int theLongestDuration = -1;
	Call longestCall = null;
	for (Call call : this.callHistory) {
	    int callDuration = call.getDuration();
	    if (callDuration > theLongestDuration) {
		longestCall = call;
		theLongestDuration = callDuration;
	    }
	}
	this.callHistory.remove(longestCall);
    }

    /**
     * The function help to clear all calls
     */
    public void clearCallHistory() {
	this.callHistory.clear();
    }

    /**
     * The function help to calculate the total price of the call history.
     *
     * @param pricePerMinute: price per minute of the call
     *
     * @return The total price of the call history
     */
    public double getTotalPriceOfCallHistory(double pricePerMinute) {
	double total = 0;
	for (Call call : this.callHistory) {
	    int callDuration = call.getDuration();
	    // convert the phone duration from second to minute
	    total += (callDuration / 60) * pricePerMinute;
	}
	return total;
    }

    /**
     * The getter function help to get the price of telephone.
     *
     * @return current price
     */
    public double getPrice() {
	return price;
    }

    /**
     * The setter function help to set the price of telephone.
     *
     * @param price: new price of the telephone
     */
    public void setPrice(double price) {
	this.price = price;
    }

    /**
     * The getter function help to get the owner of the telephone.
     *
     * @return The current owner
     */
    public String getOwner() {
	return owner;
    }

    /**
     * The setter function help to set the owner of telephone.
     *
     * @param owner: new owner of telephone
     */
    public void setOwner(String owner) {
	this.owner = owner;
    }

    /**
     * The getter function help to get the display of telephone.
     *
     * @return current display
     *
     * */
    public Display getDisplay() {
	return display;
    }

    /**
     * The setter function help to set the display of telephone
     *
     * @param display: the new play of telephone
     */
    public void setDisplay(Display display) {
	this.display = display;
    }

    /**
     * The getter function help to get the battery of telephone
     *
     * @return current battery
     */
    public Battery getBattery() {
	return battery;
    }

    /**
     * The setter function help to set the battery of telephone
     *
     * @param battery: new battery of telephone
     */
    public void setBattery(Battery battery) {
	this.battery = battery;
    }

    /**
     * The getter function help to get the call history of telephone
     *
     * @return current call history
     */
    public List<Call> getCallHistory() {
	return callHistory;
    }

    /**
     * The setter function help to set the call history of telephone
     *
     * @param callHistory: the new call history of telephone
     */
    public void setCallHistory(List<Call> callHistory) {
	this.callHistory = callHistory;
    }

    /**
     * The getter function help to get the model of telephone
     *
     * @return current model
     */
    public String getModel() {
	return model;
    }

    /**
     * The setter function help to set the model of telephone
     *
     * @param model: new model of telephone
     */
    public void setModel(String model) {
	this.model = model;
    }

    /**
     * The getter function help to get the manufacturer of telephone.
     *
     * @return current manufacturer
     */
    public String getManufacturer() {
	return manufacturer;
    }

    /**
     * The setter function help to set the manufacturer of telephone
     *
     * @param manufacturer: new manufacturer of telephone
     */
    public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
    }
    /**
     * The override function help to display the telephone.
     *
     * @return The information of telephone
     *
     * */
    @Override
    public String toString() {
	String res = "";
	res += "Telephone model: " + this.model + "\n";
	res += "Telephone manufacturer: " + this.manufacturer + "\n";
	res += "Telephone price: " + this.price + "\n";
	res += "Telephone owner: " + this.owner + "\n";
	res += this.display;
	res += this.battery;
	res += "===============CALL HISTORY INFORMATION==============\n";
	for (Call call : this.callHistory)
	    res += call + "\n";
	return res;
    }
}
