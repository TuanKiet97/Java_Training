package org.tuankiet.model;

/**
 * The Cat is the subclass (inherit from Animal) that represent the info of a cat.
 */

public class Cat extends Animal {

    private static int totalCatAge = 0;
    private static int totalCatNum = 0;

    /**
     * The default constructor help to init attributes with default value.
     */
    public Cat() {
	super();
	Cat.totalCatNum++;
    }

    /**
     * The parameterized constructor help to init attributes with passed arguments.
     *
     * @param age: age of the cat
     * @param name: name of the cat
     * @param sex: gender of the cat
     */
    public Cat(int age, String name, boolean sex) {
	super(age, name, sex);
	Cat.totalCatNum++;
	Cat.totalCatAge++;
    }

    /**
     * The static method help to calculate the average age of all cats.
     *
     * @return The cat average age
     */
    public static double calcAverageAge() {
	return Cat.totalCatAge * 1.0 / Cat.totalCatNum;
    }

    /**
     * The override method to display the sound of the cat.
     */
    @Override
    public void sound() {
	System.out.println("Meow Meow");
    }

}
