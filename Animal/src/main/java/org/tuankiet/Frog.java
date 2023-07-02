package org.tuankiet;

public class Frog extends Animal implements Sound{
    private static int numFrogs;
    private static double totalAge;

    public Frog() {
	numFrogs++;
    }

    public Frog(String name, double age) {
	super(name, age);
	numFrogs++;
	totalAge += age;
    }

    public Frog(String name, double age, String sex) {
	super(name, age, sex);
	numFrogs++;
	totalAge+=age;
    }

    public static int getNumFrogs() {
	return numFrogs;
    }

    public static void setNumFrogs(int numFrogs) {
	Frog.numFrogs = numFrogs;
    }

    public static double getTotalAge() {
	return totalAge;
    }

    public static void setTotalAge(double totalAge) {
	Frog.totalAge = totalAge;
    }
    @Override
    public String sound() {
	return "Sound of the frog is Meow Meow";
    }
    /**
     * Assign name of animal to object name in list animal.
     *
     * @return animal name
     */
    @Override
    public String assignName() {
	return "Cat";
    }

    /**
     * Calculate average age of frog
     *
     * @return average age of frog
     */
    public static double calculateAvgAge(double totalAge, int numFrogs) {
	return totalAge / numFrogs;
    }

    /**
     * Get average age of frog
     *
     * @return average age of frog
     */
    public double getAvgAge() {
	return calculateAvgAge(getTotalAge(), getNumFrogs());
    }
}
