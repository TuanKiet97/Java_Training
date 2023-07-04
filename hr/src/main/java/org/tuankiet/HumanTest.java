package org.tuankiet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/**
 * This class will test all of functions
 * */
public class HumanTest {
    /**
     * Create the list of human with all students and workers
     *
     * @return the list of human
     */
    public List<Human> createListHuman() {
	StudenTest studenTest = new StudenTest();
	WorkerTest workerTest = new WorkerTest();

	List<Human> humansList = new ArrayList<>();
	humansList.addAll(studenTest.getListStudents());
	humansList.addAll(workerTest.getListOfWorkers());

	return humansList;
    }
    /**
     * Sort the list human by first name and lastname ascending
     */
    private void sortByFirstNameAndLastNameAscending(List<Human> listName) {
	listName.sort(Comparator.comparing(human -> (human.getFirstName() + human.getLastName() )));
	listName.forEach(System.out::println);
    }
    /**
     * Show the list of humans
     */
    public void showHumanList() {
	sortByFirstNameAndLastNameAscending(this.createListHuman());
    }
}
