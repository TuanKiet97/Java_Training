package org.tuankiet;

import java.util.ArrayList;
import java.util.List;

/**
 * This class will test all function of project
 */
public class WorkerTest {

    /**
     * Create the list of workers with 10 members
     *
     * @return the list of workers
     */

    private List<Worker> createListOfWorkers() {
	List<Worker> workerList = new ArrayList<>();
	workerList.add(new Worker("Ho","Kiet",5000000,8));
	workerList.add(new Worker("Ho","Thu",1800000,5));
	workerList.add(new Worker("Ho","Ly",2400000,6));
	workerList.add(new Worker("Thien","Ly",6500000,7));
	workerList.add(new Worker("An","Ky",7000000,6));
	workerList.add(new Worker("Chau","Lam",4500000,7));
	workerList.add(new Worker("Tran","Long",2500000,8));
	workerList.add(new Worker("Le","Thanh",2500000,7));
	workerList.add(new Worker("Ha","Tuan",1600000,7));
	return workerList;
    }
    /**
     * Get the list of workers
     *
     * @return List of workers
     */
    public List<Worker> getListOfWorkers() {
	return this.createListOfWorkers();
    }

    /**
     * Sort worker list by money per hour descending
     */
    private void sortByMoneyPerHourDescending (List<Worker> listName) {
	listName.sort((a1,a2)->(int)(a2.calculateMoneyPerHour(a2.getWeekSalary(), a2.getWorkHourPerDay())-(a1.calculateMoneyPerHour(a1.getWeekSalary(), a1.getWorkHourPerDay()))));
	listName.forEach(System.out::println);
    }
    
    /**
     * Show the list of workers
     */
    public void showWorkers() {
	sortByMoneyPerHourDescending(this.createListOfWorkers());
    }

}
