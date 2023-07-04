package org.tuankiet.model;

/**
 * The Kitten is the subclass (inherit from Cat) that represent the info of a kitten.
 */
public class Kitten extends Cat {
    /**
     * The default constructor help to init attributes with default value.
     *
     */
    public Kitten() {
	super();
	this.sex = true;
    }

    /**
     * The parameterized constructor help to init attributes with passed arguments.
     *
     * @param age: the age of the kitten
     * @param name: the name of the kitten
     * @param sex: The gender of the kitten
     *
     */
    public Kitten(int age, String name, boolean sex) {
	// Kitten must be only female
	super(age, name, true);
	if (!sex) {
	    System.out.println("Kittens can be only female");
	}
    }

    /**
     * The override method to display the sound of the kitten.
     *
     */
    @Override
    public void sound() {
	System.out.println("Kitten: Meow Meow");
    }
}
