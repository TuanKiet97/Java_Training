package org.tuankiet;

public class Cat extends Animal {

    private static int numCats;
    private static double totalAge;

    public Cat() {
	numCats++;
    }

    public Cat(String name, double age) {
	super(name, age);
	numCats++;
	totalAge += age;
    }

    public Cat(String name, double age, String sex) {
	super(name, age, sex);
	numCats++;
	totalAge += age;
    }

    public static int getNumCats() {
	return numCats;
    }

    public static void setNumCats(int numCats) {
	Cat.numCats = numCats;
    }

    public static double getTotalAge() {
	return totalAge;
    }

    public static void setTotalAge(double totalAge) {
	Cat.totalAge = totalAge;
    }
    @Override
    public String sound() {
	return "Sound of the cat is Meow meow";
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
     * Calculate average age of cat
     *
     * @return average age of cat
     */
    private static double calculateAvgAge(double totalAge, int numCats) {
	return totalAge / numCats;
    }
    /**
     * Get average age of cat
     *
     * @return average age of cat
     */
    public double getAvgAge() {
	return calculateAvgAge(getTotalAge(),getNumCats());
    }
}
