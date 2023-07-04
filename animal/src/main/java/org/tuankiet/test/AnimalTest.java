package org.tuankiet.test;

import org.tuankiet.model.*;

/**
 * The AnimalTest is the class that test the operation on Animal class.
 */

public class AnimalTest {
    private Animal[] animals;

    /**
     * The default constructor help to init attributes to test the operation on animal array by creating objects manually.
     */
    public AnimalTest() {
	// False: male, True: female
	animals = new Animal[10];
	animals[0] = new Dog(9, "Lisa", false);
	animals[1] = new Cat(6, "Sin", false);
	animals[2] = new Frog(13, "Luffy", true);
	animals[3] = new Dog(12, "Zoro", true);
	animals[4] = new Kitten(6, "Chopper", false);
	animals[5] = new Frog(7, "Usop", true);
	animals[6] = new Dog(4, "Franky", true);
	animals[7] = new TomCat(5, "Roger", false);
	animals[8] = new Frog(3, "RayLaygh", true);
	animals[9] = new Dog(4, "Kane", false);
    }

    /**
     * The function help to calculate the average age of all dogs in array.
     *
     * @return The dog average age
     */
    public double getDogAverageAge() {
	return Dog.calcAverageAge();
    }

    /**
     * The function help to calculate the average age of all cats in array.
     *
     * @return The cat average age
     */
    public double getCatAverageAge() {
	return Cat.calcAverageAge();
    }

    /**
     * The function help to calculate the average age of all frogs in array.
     *
     * @return The frog average age
     */
    public double getFrogAverageAge() {
	return Frog.calcAverageAge();
    }

    /**
     * The function help to display info of all animals in array.
     */
    public void display() {
	for (Animal animal : animals) {
	    System.out.println(animal);
	}
    }

    /**
     * The function help to display the sound of all animals in array.
     */
    public void sound() {
	for (Animal animal : animals) {
	    animal.sound();
	}
    }
}
