package org.tuankiet.model;

/**
 * This is a class data access of the display.
 */
public class Display {
    private Size size;
    private int numberOfColor;

    /**
     * The default constructor help to init attributes with default value.
     */
    public Display() {
	this.size = null;
	this.numberOfColor = 0;
    }

    /**
     * The parameterized constructor help to init attributes with passed arguments.
     *
     * @param size: size of display
     * @param numberOfColor: number colors of display
     */
    public Display(Size size, int numberOfColor) {
	this.size = size;
	this.numberOfColor = numberOfColor;
    }

    /**
     * The getter function help to get the size of the display.
     *
     * @return current size
     */
    public Size getSize() {
	return size;
    }

    /**
     * The setter function help to set the size of the display.
     *
     * @param size: new size of display
     */
    public void setSize(Size size) {
	this.size = size;
    }

    /**
     * The getter function help to get the number of colors of the display.
     *
     * @return current number colors
     */
    public int getNumberOfColor() {
	return numberOfColor;
    }

    /**
     * The setter function help to set the number of colors of the display.
     *
     * @param numberOfColor: new number of colors of display
     */
    public void setNumberOfColor(int numberOfColor) {
	this.numberOfColor = numberOfColor;
    }

    /**
     * The override function help to display the display info.
     *
     * @return The information of the display
     */
    @Override
    public String toString() {
	String res = "=================DISPLAY INFO=================\n";
	res += this.size;
	res += "Number of colors: " + this.numberOfColor + "\n";
	return res;
    }
}
