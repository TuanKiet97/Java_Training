package org.tuankiet;

/**
 * This is a class data access for functions
 */
public class Worker extends Human {
    private double weekSalary;
    private double workHourPerDay;

    // Create the constructor
    public Worker(String firstName, String lastName, int weekSalary, int workHourPerDay) {
	super(firstName, lastName);
	this.weekSalary = weekSalary;
	this.workHourPerDay = workHourPerDay;
    }

    public double getWeekSalary() {
	return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
	this.weekSalary = weekSalary;
    }

    public double getWorkHourPerDay() {
	return workHourPerDay;
    }

    public void setWorkHourPerDay(double workHourPerDay) {
	this.workHourPerDay = workHourPerDay;
    }

    /**
     * Calculate money per hour of day
     *
     * @return salary of 1 hour
     */
    public double calculateMoneyPerHour(double weekSalary, double weekHourPerDay) {
	double daySalary = weekSalary / 6;
	return daySalary / weekHourPerDay;
    }

    @Override
    public String toString() {
	return "Worker{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", WeekSalary=" + weekSalary + ", WorkHoursPerDay=" + workHourPerDay + '}';
    }
}
