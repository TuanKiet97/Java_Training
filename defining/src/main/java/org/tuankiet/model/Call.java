package org.tuankiet.model;

/**
 * This is a class data access of the call
 * */
public class Call {
    private Date date;
    private Time time;
    private String telephone;
    private int duration;

    /**
     * The default constructor help to init attributes with default value.
     */
//    public Call() {
//	this.date = null;
//	this.time = null;
//	this.telephone = "";
//	this.duration = 0;
//    }

    /**
     * The parameterized constructor help to init attributes with passed arguments.
     *
     * @param date: the date of the call
     * @param time: the time of the call
     * @param telephone: the phone of the call
     * @param duration: the duration of the call
     *
     * */
    public Call(Date date, Time time, String telephone, int duration) {
	this.date = date;
	this.time = time;
	this.telephone = telephone;
	this.duration = duration;
    }



    /**
     * The getter function help to get the date of the call.
     *
     * @return The current date
     */
    public Date getDate() {
	return date;
    }

    /**
     * The setter function help to set the time of the call.*
     */
    public void setDate(Date date) {
	this.date = date;
    }

    /**
     * The getter function help to get the time of the call.
     *
     * @return The current time
     */
    public Time getTime() {
	return time;
    }

    /**
     * The setter function help to set the time of the call.
     *
     * @param time: the new time of the call
     */
    public void setTime(Time time) {
	this.time = time;
    }

    /**
     * The getter function help to get the telephone of the call.
     *
     * @return The current telepphone
     */
    public String getTelephone() {
	return telephone;
    }

    /**
     * The setter function help to set the telephone of the call.
     *
     * @param telephone: the new telephone of the call
     */
    public void setTelephone(String telephone) {
	this.telephone = telephone;
    }

    /**
     * The getter function help to get the duration of the call.
     *
     * @return The current duration
     */
    public int getDuration() {
	return duration;
    }

    /**
     * The setter function help to set the duration of the call.
     *
     * @param duration: the new duration of the call
     */
    public void setDuration(int duration) {
	this.duration = duration;
    }

    /**
     * The override function help to display the call info.
     *
     * @return The information of the call
     */
    @Override
    public String toString() {
	String res = "";
	res += this.date;
	res += this.time;
	res += "Phone: " + this.telephone + "\n";
	res += "Duration: " + this.duration + "\n";
	return res;
    }
}
