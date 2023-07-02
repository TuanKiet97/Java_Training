package org.tuankiet;

/**
 * This is a class data access of the animal.
 */
public class Animal implements Sound {
    protected String name;
    protected double age;
    protected String sex;

    private final String EMPTY_VALUE = "";

    // Create the constructor
    public Animal() {
	this.name = EMPTY_VALUE;
	this.age = 0;
	this.sex = EMPTY_VALUE;
    }

    public Animal(String name, double age) {
	this.name = name;
	this.age = age;
    }

    public Animal(String name, double age, String sex) {
	this.name = name;
	this.age = age;
	this.sex = sex;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public double getAge() {
	return age;
    }

    public void setAge(double age) {
	this.age = age;
    }

    public String getSex() {
	return sex;
    }

    public void setSex(String sex) {
	this.sex = sex;
    }

    /**
     * Assign name of animal to object name in list animal.
     *
     * @return animal name
     */
    protected String assignName(){
	return "Animal";
    }

    @Override
    public String sound() {
	return null;
    }

    @Override
    public String toString() {
	return "Animal{" +
		"name='" + name + '\'' +
		", age=" + age +
		", sex='" + sex + '\'' +
		'}';
    }

}
