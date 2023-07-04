package org.tuankiet.model;

public class Time {
    private int second;
    private int minute;
    private int hour;

    /**
     * The default constructor help to init attributes with default value.
     */
    public Time() {
	this.hour = 0;
	this.minute = 0;
	this.second = 0;
    }

    /**
     * The parameterized constructor help to init attributes with passed arguments.
     *
     * @param second: second of call
     * @param minute: minute of call
     * @param hour: hour of call
     */
    public Time(int hour, int minute, int second) {
	this.hour = hour;
	this.minute = minute;
	this.second = second;
    }

    /**
     * The getter function help to get the second of the call.
     *
     * @return current second
     */
    public int getSecond() {
	return this.second;
    }


    /**
     * The setter function help to set the second of the call.
     *
     * @param second: new second of call
     */
    public void setSecond(int second) {
	this.second = second;
    }


    /**
     * The getter function help to get the minute of the call.
     *
     * @return current minute
     */
    public int getMinute() {
	return this.minute;
    }


    /**
     * The setter function help to set the minute of the call.
     *
     * @param minute: new minute of call
     */

    public void setMinute(int minute) {
	this.minute = minute;
    }

    /**
     * The getter function help to get the hour of the call.
     *
     * @return current hour
     */

    public int getHour() {
	return this.hour;
    }

    /**
     * The setter function help to set the hour of the call.
     *
     * @param hour: new hour of call
     */
    public void setHour(int hour) {
	this.hour = hour;
    }

    /**
     * The override function display the second/minute/hour of the call.
     *
     * @return The information of the call's time
     */
    @Override
    public String toString() {
	String res = "";
	res += "Call time: " + this.hour + ":" + this.minute + ":" + this.second + "\n";
	return res;
    }
}
