package org.tuankiet.model;

public class Dog extends Animal{
    private static int totalDogAge = 0;
    private static int totalDogNum = 0;

    /**
     * The default constructor help to init attributes with default value.
     */
    public Dog() {
	super();
	Dog.totalDogNum++;
    }

    /**
     * The parameterized constructor help to init attributes with passed arguments.
     *
     * @param age: age of the dog
     * @param name: name of the dog
     * @param sex: gender of the dog
     */
    public Dog(int age, String name, boolean sex) {
	super(age, name, sex);
	Dog.totalDogNum++;
	Dog.totalDogAge += age;
    }

    /**
     * The static method help to calculate the average age of all dogs.
     *
     * @return The dog average age
     */
    public static double calcAverageAge() {
	return Dog.totalDogAge * 1.0 / Dog.totalDogNum;
    }

    /**
     * The override method to display the sound of the dog.
     */
    @Override
    public void sound() {
	System.out.println("Gau Gau");
    }
}
