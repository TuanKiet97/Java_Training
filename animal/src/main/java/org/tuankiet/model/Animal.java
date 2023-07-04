package org.tuankiet.model;

/**
 * This is a class data access of the animal.
 */
public abstract class Animal implements ISound {
    protected int age;
    protected String name;

    // Male: false, Female: true
    protected boolean sex;

    /**
     * The default constructor help to init attributes with default value.
     */
    public Animal() {
	this.age = 0;
	this.name ="";
	this.sex = false;
    }

    /**
     * The parameterized constructor help to init attributes with passed arguments.
     *
     * @param age: age of the animal
     * @param name: name of the animal
     * @param sex: gender of the animal
     */
    public Animal(int age, String name, boolean sex) {
	this.age = age;
	this.name = name;
	this.sex = sex;
    }

    /**
     * The getter function help to get the name of the animal.
     * @return The current name
     */
    public String getName() {
	return name;
    }

    /**
     * The setter function help to set the name of the animal.
     *
     * @param name: the new name of the animal
     */
    public void setName(String name) {
	this.name = name;
    }

    /**
     * The getter function help to get the age of the animal.
     *
     * @return The current age
     *
     */
    public double getAge() {
	return age;
    }

    /**
     * The setter function help to set the age of the animal.
     *
     * @param age: the new age of the animal
     *
     */
    public void setAge(int age) {
	this.age = age;
    }

    /**
     * The getter function help to get the gender of the animal.
     *
     * @return The current gender
     *
     * */
    public boolean getSex() {
	return this.sex;
    }

    /**
     * The setter function help to set the gender of the animal.
     *
     * @param sex: the new gender of the animal
     *
     * */
    public void setSex(boolean sex) {
	this.sex = sex;
    }

    /**
     * The override function help to display the animal information.
     *
     * @return The info of the animal
     */
    @Override
    public String toString() {
	String res = "";
	res += "Age: " + this.age + "\n";
	res += "Name: " + this.name + "\n";
	res += "Sex: " + (this.sex ? "Female" : "Male") + "\n";
	return res;
    }

    /**
     * The abstract function need to override to display the sound of the animal.
     */
    @Override
    public abstract void sound();
}
