package org.tuankiet;

/**
 * This is a class data access of the call
 * */
public class Call {
    private String dateCall;
    private String dialedPhone;
    private int duration;

    // Create the constructor
    public Call(String dateCall, String dialedPhone, int duration) {
	this.dateCall = dateCall;
	this.dialedPhone = dialedPhone;
	this.duration = duration;
    }

    public String getDateCall() {
	return dateCall;
    }

    public void setDateCall(String dateCall) {
	this.dateCall = dateCall;
    }

    public String getDialedPhone() {
	return dialedPhone;
    }

    public void setDialedPhone(String dialedPhone) {
	this.dialedPhone = dialedPhone;
    }

    public int getDuration() {
	return duration;
    }

    public void setDuration(int duration) {
	this.duration = duration;
    }

    @Override
    public String toString() {
	return "Call{" +
		"dateCall='" + dateCall + '\'' +
		", dialedPhone='" + dialedPhone + '\'' +
		", duration=" + duration +
		'}';
    }
}
