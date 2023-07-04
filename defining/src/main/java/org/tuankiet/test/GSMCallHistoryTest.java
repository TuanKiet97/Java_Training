package org.tuankiet.test;

import org.tuankiet.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 *  This is a class will test all functions
 */
class GSMCallHistoryTest {
    private GSM gsm;

    /**
     * The default constructor help to init attributes to test the telephone history of GSM Class
     */
    public GSMCallHistoryTest() {
	Display display = new Display(new Size(1633, 768), 25);
	Battery battery = new Battery("PINCONO", 1500, 1000, BatteryType.LiIon);

	Call call1 = new Call(new Date(9,9,2023), new Time(20,15,30), "0763937123", 600);
	Call call2 = new Call(new Date(5,9,2023), new Time(21,16,39), "0763932125", 700);
	Call call3 = new Call(new Date(27,9,2023), new Time(22,10,20), "07639371696", 800);
	Call call4 = new Call(new Date(25,6,2023), new Time(15,30,30), "0763937125", 900);

	List<Call> callList = new ArrayList<>();
	callList.add(call1);
	callList.add(call2);
	callList.add(call3);
	callList.add(call4);

	this.gsm = new GSM("GSM1", "VietNam", 265.99, "BePhone", battery, display, callList);
    }

    /**
     * The function help to test the add operation of call history.
     */
    public void addFewCalls() {
	Call call1 = new Call(new Date(9,9,2023), new Time(20,15,30), "0763937123", 600);
	Call call2 = new Call(new Date(5,9,2023), new Time(21,16,39), "0763932125", 700);;
	List<Call> callList = new ArrayList<>();
	callList.add(call1);
	callList.add(call2);
	this.gsm.addCallHistory(callList);
    }

    /**
     * The function help to test the display information of the call history.
     */
    public void displayCallInformation() {
	List<Call> callList = this.gsm.getCallHistory();
	for (Call call : callList) {
	    System.out.println(call);
	}
    }

    /**
     * The function help to test the display total price of call history.
     */
    public void displayTotalPrice(double pricePerMinute) {
	double totalPrice = this.gsm.getTotalPriceOfCallHistory(pricePerMinute);
	System.out.println("The total price of call history: " + totalPrice);
    }

    /**
     * The function help to test the remove longest call
     */
    public void removeTheLongestCall() {
	this.gsm.removeTheLongestCall();
    }

    /**
     * The function help to test the clear operation of call history.
     */
    public void clearCallHistory() {
	this.gsm.clearCallHistory();
    }

}