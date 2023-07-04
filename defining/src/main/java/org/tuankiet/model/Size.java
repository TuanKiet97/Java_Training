package org.tuankiet.model;

public class Size {
    private int width;
    private int height;

    /**
     * The default constructor.
     */
    public Size() {
	this.width = 0;
	this.height = 0;
    }

    /**
     * The parameterized constructor help to init attributes with passed arguments.
     *
     * @param width:  width of display
     * @param height: height of display
     */
    public Size(int width, int height) {
	this.width = width;
	this.height = height;
    }

    /**
     * The getter function help to get the width of the display.
     *
     * @return The current width
     */
    public int getWidth() {
	return width;
    }

    /**
     * The setter function help to set the width of the display.
     *
     * @param width: width of display
     */
    public void setWidth(int width) {
	this.width = width;
    }

    /**
     * The getter function help to get the height of the display.
     *
     * @return current height
     */
    public int getHeight() {
	return height;
    }

    /**
     * The setter function help to set the height of the display.
     *
     * @param height: height of the display
     */
    public void setHeight(int height) {
	this.height = height;
    }

    /**
     * The override function help to display the width, height of the display.
     *
     * @return The information of the display's size
     */
    @Override
    public String toString() {
	String res = "";
	res += "Display width: " + this.width + "\n";
	res += "Display height: " + this.height + "\n";
	return res;
    }
}
