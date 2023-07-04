package org.tuankiet.model;

/**
 * The Date is the class that represent the date of the Call Class (day, month, year)
 */
public class Date {
    private int day;
    private int month;
    private int year;

    /**
     * The default constructor help to init attributes with default value.
     *
     */
    public Date() {
	this.day = 0;
	this.month = 0;
	this.year = 0;
    }

    /**
     * The parameterized constructor help to init attributes with passed arguments.
     *
     * @param day: day of the call
     * @param month: month of the call
     * @param year: year of the call
     */
    public Date(int day, int month, int year) {
	this.day = day;
	this.month = month;
	this.year = year;
    }

    /**
     * The override function help to display the day, month, year of the call.
     *
     * @return The info of the call's date
     */
    @Override
    public String toString() {
	String res = "";
	res += "Call date: " + this.day + "/" + this.month + "/" + this.year + "\n";
	return res;
    }

    /**
     * The getter function help to get the day of the call.
     *
     * @return The current day
     */
    public int getDay() {
	return this.day;
    }

    /**
     * The getter function help to get the month of the call.
     *
     * @return current month
     */
    public int getMonth() {
	return this.month;
    }

    /**
     * The getter function help to get the year of the call.
     *
     * @return current year
     *
     * */
    public int getYear() {
	return this.year;
    }

    /**
     * The setter function help to set the day of the call.
     *
     * @param day: new day of the call
     */
    public void setDay(int day) {
	this.day = day;
    }

    /**
     * The setter function help to set the month of the call.
     *
     * @param month: new month of the call
     */
    public void setMonth(int month) {
	this.month = month;
    }

    /**
     * The setter function help to set the year of the call.
     *
     * @param year: new year of the call
     */
    public void setYear(int year) {
	this.year = year;
    }
}
