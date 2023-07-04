package org.tuankiet.main;

import org.tuankiet.test.AnimalTest;

/**
 * The main function that run the Test classes (AnimalTest).
 */

public class Main {
    public static void main(String[] args) {
        AnimalTest animalTest = new AnimalTest();
        System.out.println("==============The list of Animal=============");
        animalTest.display();
        System.out.println("===========The list Sound of Animal==========");
        animalTest.sound();
        System.out.println("===========The average age of Animal=========");
        System.out.println("Dog average age: " + animalTest.getDogAverageAge());
        System.out.println("Cat average age: " + animalTest.getCatAverageAge());
        System.out.println("Frog average age: " + animalTest.getFrogAverageAge());
    }
}