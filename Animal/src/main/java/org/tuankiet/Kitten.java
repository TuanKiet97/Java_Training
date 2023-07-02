package org.tuankiet;

public class Kitten extends Cat{
    public Kitten() {
	super();
    }
    // Create the constructor
    public Kitten(String name, double age) {
	super(name, age);
	this.sex = "Female";
    }

    /**
     * Assign name of animal to object name in list animal.
     *
     * @return animal name
     */
    @Override
    public String assignName() {
	return "Kitten";
    }

    /**
     * Create sound of the kitten
     *
     * @return sound of kitten
     */
    @Override
    public String sound() {
	return "Sound of the Kitten is: Mia Mia";
    }

}
