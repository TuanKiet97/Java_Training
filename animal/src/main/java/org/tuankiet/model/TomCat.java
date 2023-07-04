package org.tuankiet.model;

/**
 * The TomCat is the subclass (inherit from Cat) that represent the info of a tomcat.
 */
public class TomCat extends Cat{
    /**
     * The default constructor help to init attributes with default value.
     *
     */
    public TomCat() {
	super();
    }

    /**
     * The parameterized constructor help to init attributes with passed arguments.
     *
     * @param age: the age of the tomcat
     * @param name: the name of the tomcat
     * @param sex: The gender of the tomcat
     */
    public TomCat(int age, String name, boolean sex) {
	// Tomcat must be only male
	super(age, name, false);
	if (sex) {
	    System.out.println("Tomcats can be only male");
	}
    }

    /**
     * The override method to display the sound of the tomcat.
     *
     */
    @Override
    public void sound() {
	System.out.println("Tomcat: Meow Meow");
    }
}
