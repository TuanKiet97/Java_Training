package org.tuankiet;

public class Tomcat extends Cat{
    public Tomcat() {
	super();
    }
    public Tomcat(String name, double age) {
	super(name, age);
	super.sex = "Male";
    }
    @Override
    public String sound() {
	return "Sound of Tomcat is Mie Mie";
    }
    @Override
    public String assignName() {
	return "Tomcat";
    }
}
