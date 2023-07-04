package org.tuankiet.model;

public class Frog extends Animal implements ISound {
    private static int totalFrogAge = 0;
    private static int totalFrogNum = 0;

    /**
     * The default constructor help to init attributes with default value.
     */
    public Frog() {
	super();
	Frog.totalFrogNum++;
    }

    /**
     * The parameterized constructor help to init attributes with passed arguments.
     *
     * @param age: age of the frog
     * @param name: name of the frog
     * @param sex: gender of the frog
     */
    public Frog(int age, String name, boolean sex) {
	super(age, name, sex);
	Frog.totalFrogNum++;
	Frog.totalFrogAge += age;
    }

    /**
     * The static method help to calculate the average age of all frogs.
     *
     * @return The frog average age
     */
    public static double calcAverageAge() {
	return Frog.totalFrogAge * 1.0 / Frog.totalFrogNum;
    }

    /**
     * The override method to display the sound of the frog.
     */
    @Override
    public void sound() {
	System.out.println("Oop Oop");
    }
}
