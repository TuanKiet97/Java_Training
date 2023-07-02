package org.tuankiet;

public class Main {
    public static void main(String[] args) {
	StudenTest studenTest = new StudenTest();
	WorkerTest workerTest = new WorkerTest();
	HumanTest humanTest = new HumanTest();


	System.out.println("----Test for student by Ascending----");
	studenTest.showListStudentsByAscending();

	System.out.println("----Test for worker by Descending----");
	workerTest.showWorkers();

	System.out.println("----Test for human by Name----");
	humanTest.showHumanList();
    }
}