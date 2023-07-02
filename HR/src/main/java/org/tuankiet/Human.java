package org.tuankiet;
/**
 * This is a class for data access of human
 */
public class Human {
    protected String firstName;
    protected String lastName;

    // Create the constructor
    protected Human() {
	this.firstName = "";
	this.lastName = "";
    }

    protected Human(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }
}
