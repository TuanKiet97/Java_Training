package org.tuankiet;
/**
 * This is a class data access and build functions of student
 */
public class Student extends Human{
    private String grade;

    private final String EMPTY_VALUE = "";

    public Student() {
	super();
	this.grade = EMPTY_VALUE;
    }

    public Student(String firstName, String lastName, String grade) {
	super(firstName, lastName);
	this.grade = grade;
    }

    public String getGrade() {
	return grade;
    }

    public void setGrade(String grade) {
	this.grade = grade;
    }

    @Override
    public String toString() {
	return "Student{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", grade='" + grade + '\'' + '}';
    }
}
