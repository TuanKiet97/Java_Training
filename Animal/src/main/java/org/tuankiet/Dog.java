package org.tuankiet;

public class Dog extends Animal{
    private static int numDogs;
    private static double totalAge;

    public Dog() {
	numDogs++;
    }

    public Dog(String name, double age) {
	super(name, age);
	numDogs++;
	totalAge += age;
    }

    public Dog(String name, double age, String sex) {
	super(name, age, sex);
	numDogs++;
	totalAge += age;
    }

    public static int getNumDogs() {
	return numDogs;
    }

    public static void setNumDogs(int numDogs) {
	Dog.numDogs = numDogs;
    }

    public static double getTotalAge() {
	return totalAge;
    }

    public static void setTotalAge(double totalAge) {
	Dog.totalAge = totalAge;
    }
    @Override
    public String sound() {
	return "Sound of the dog is gau gau";
    }

    /**
     * Assign name of animal to object name in list animal.
     *
     * @return animal name
     */
    @Override
    public String assignName() {
	return "Dog";
    }
    /**
     * Calculate average age of dog
     *
     * @return average age of dog
     */
    public static double calculateArgAge(double totalAge, int numDogs) {
	return totalAge / numDogs;
    }
    /**
     * Get average age of dog
     *
     * @return average age of dog
     */
    public double getAvgAge() {
	return calculateArgAge(getTotalAge(), getNumDogs());
    }
}
