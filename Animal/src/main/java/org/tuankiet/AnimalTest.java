package org.tuankiet;

import java.util.ArrayList;
import java.util.List;

/**
 * This class will create list of all animal
 */
public class AnimalTest {
    private final List<Animal> animalList;

    /**
     * Constructor with list of all types animal.
     */
    public AnimalTest() {
	List<Animal> animals = new ArrayList<>();
	animals.addAll(this.createCatList());
	animals.addAll(this.createDogList());
	animals.addAll(this.createFrogList());
	animals.addAll(this.createKittensList());
	animals.addAll(this.createTomcatList());

	this.animalList = animals;
    }

    public List<Animal> getAnimalList() {
	return animalList;
    }

    /**
     * Show all types animal
     */
    public void showAnimal() {
	this.getAnimalList().forEach(System.out::println);
    }

    /**
     * Create list of cat with 4 cat.
     *
     * @return list of cat
     */
    private List<Cat> createCatList() {
	List<Cat> cats = new ArrayList<>();
	cats.add(new Cat("British Longhair", 1.5, "female"));
	cats.add(new Cat("Munchkin", 0.8, "male"));
	cats.add(new Cat("Rag Doll", 1.7, "male"));
	cats.add(new Cat("Scottish Fold", 3.2, "female"));

	return cats;
    }

    /**
     * Show cats in list of cat
     */
    public void showCats() {
	this.createCatList().forEach(System.out::println);
    }

    /**
     * Show sound of cat
     */
    public void showCatSound() {
	Cat cat = new Cat();
	System.out.println(cat.sound());
    }

    /**
     * Show average age of cat
     */
    public void showCatAverageAge() {
	Cat cat = new Cat();
	System.out.format("Average age of cat is: %.2f %n", cat.getAvgAge());
    }

    /**
     * Create list of dog with 4 dogs.
     *
     * @return list of dog
     */
    private List<Dog> createDogList() {
	List<Dog> dogs = new ArrayList<>();
	dogs.add(new Dog("Yorkshire", 3, "female"));
	dogs.add(new Dog("Bully", 2.5, "male"));
	dogs.add(new Dog("Dachshund", 3.1, "male"));
	dogs.add(new Dog("Poodle", 1.9, "female"));

	return dogs;
    }

    /**
     * Show dogs in list of dog
     */
    public void showDogs() {
	this.createDogList().forEach(System.out::println);
    }

    /**
     * Show sound of dog
     */
    public void showDogSound() {
	Dog dog = new Dog();
	System.out.println(dog.sound());
    }

    /**
     * Show average age of dog
     */
    public void showDogAverageAge() {
	Dog dog = new Dog();
	System.out.format("Average age of dog is: %.2f %n", dog.getAvgAge());
    }

    /**
     * Create list of frog with 4 frogs.
     *
     * @return list of frog
     */
    private List<Frog> createFrogList() {
	List<Frog> frogs = new ArrayList<>();
	frogs.add(new Frog("Red Backed", 0.1, "female"));
	frogs.add(new Frog("Strawberry Dart", 0.3, "male"));
	frogs.add(new Frog("Splash Poison", 1.7, "male"));
	frogs.add(new Frog("Phantasmal Poison", 2.5, "female"));

	return frogs;
    }

    /**
     * Show frogs in list of frog
     */
    public void showFrogs() {
	this.createFrogList().forEach(System.out::println);
    }

    /**
     * Show sound of frog
     */
    public void showFrogSound() {
	Frog frog = new Frog();
	System.out.println(frog.sound());
    }

    /**
     * Show average age of frog
     */
    public void showFrogAverageAge() {
	Frog frog = new Frog();
	System.out.format("Average age of frog is: %.2f %n", frog.getAvgAge());
    }

    /**
     * Create list of kittens with 4 kitten.
     *
     * @return list of kittens
     */
    private List<Kitten> createKittensList() {
	List<Kitten> kittens = new ArrayList<>();
	kittens.add(new Kitten("Himalayan", 0.5));
	kittens.add(new Kitten("Exotic", 0.9));
	kittens.add(new Kitten("Na Uy", 0.4));
	kittens.add(new Kitten("Sphinx", 0.7));

	return kittens;
    }

    /**
     * Show kittens in list of kitten
     */
    public void showKittens() {
	this.createKittensList().forEach(System.out::println);
    }

    /**
     * Show sound of kittens
     */
    public void showKittensSound() {
	Kitten kittens = new Kitten();
	System.out.println(kittens.sound());
    }

    /**
     * Show average age of kittens
     */
    public void showKittensAverageAge() {
	Kitten kittens = new Kitten();
	System.out.format("Average age of kittens is: %.2f %n", kittens.getAvgAge());
    }

    /**
     * Create list of tomcats with 4 tomcats.
     *
     * @return list of tomcat
     */
    private List<Tomcat> createTomcatList() {
	List<Tomcat> tomcats = new ArrayList<>();
	tomcats.add(new Tomcat("Sphinx", 0.2));
	tomcats.add(new Tomcat("Na Uy", 0.3));
	tomcats.add(new Tomcat("Exotic", 0.4));
	tomcats.add(new Tomcat("Himalayan", 0.5));

	return tomcats;
    }

    /**
     * Show tomcats in list of tomcat
     */
    public void showTomcat() {
	this.createTomcatList().forEach(System.out::println);
    }

    /**
     * Show sound of tomcat
     */
    public void showTomcatsSound() {
	Tomcat tomcats = new Tomcat();
	System.out.println(tomcats.sound());
    }

    /**
     * Show average age of tomcat
     */
    public void showTomcatsAverageAge() {
	Tomcat tomcats = new Tomcat();
	System.out.format("Average age of tomcats is: %.2f %n", tomcats.getAvgAge());
    }
}
