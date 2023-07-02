package org.tuankiet;

/**
 * This is a class data access of the display.
 */
public class Display {
    private int size;
    private int numberOfColor;

    // Create the constructor
    public Display(int size, int numberOfColor) {
	this.size = size;
	this.numberOfColor = numberOfColor;
    }

    public int getSize() {
	return size;
    }

    public void setSize(int size) {
	this.size = size;
    }

    public int getNumberOfColor() {
	return numberOfColor;
    }

    public void setNumberOfColor(int numberOfColor) {
	this.numberOfColor = numberOfColor;
    }

    @Override
    public String toString() {
	return "Display{" +
		"size=" + size +
		", numberOfColor=" + numberOfColor +
		'}';
    }
}
