package org.tuankiet;

import java.util.ArrayList;
import java.util.List;
/**
 *  This is a class will test all of functions
 * */
public class GSMTest {
    /**
     * Create battery list with 3 rows information
     *
     * @return batteries list
     * */
    private List<Battery> createBatteryList() {
	List<Battery> batteriesList = new ArrayList<>();
	batteriesList.add(new Battery("LiOn",56,9, Battery.BatteryType.LiIon));
	batteriesList.add(new Battery("NiCd",56,9, Battery.BatteryType.NiCd));
	batteriesList.add(new Battery("NiMH",56,9, Battery.BatteryType.NiMH));
	return batteriesList;
    }
    /**
     * Create display list with 3 rows information
     *
     * @return displays
     *
     * */
    private List<Display> createDisplayList() {
	List<Display> displays = new ArrayList<>();
	displays.add(new Display(6, 3));
	displays.add(new Display(7, 6));
	displays.add(new Display(5, 5));
	return displays;
    }

    /**
     * Create list of GSM with 3 rows information
     * */
    private String[][] createListOfGSMInformation() {
	return new String[][]{
		{"Iphone 14 Pro Max", "Apple", "33.0", "Steve Job"},
		{"Nokia X", "Oppo", "25.0", "Bui Thi Xuan"},
		{"Kiet Devops Culi", "Test", "5.0", "Tieu Phong"}
	};
    }

    /**
     * Create the list of GSM
     *
     * @return List of GSM
     * */
    private List<GSM> createGSMList() {
	List<GSM> gsm = new ArrayList<>();
	// Check size of list
	int size = this.createBatteryList().size();
	for (int i = 0; i < size; i++) {
	    String model = String.valueOf(this.createListOfGSMInformation()[i][0]);
	    String manufacturer = String.valueOf(this.createListOfGSMInformation()[i][1]);
	    double price = Double.parseDouble(String.valueOf(this.createListOfGSMInformation()[i][2]));
	    String owner = String.valueOf(this.createListOfGSMInformation()[i][3]);
	    Battery battery = this.createBatteryList().get(i);
	    Display display = this.createDisplayList().get(i);

	    gsm.add(new GSM(model, manufacturer, price, owner, display, battery));
	}
	return gsm;
    }

    /**
     * Show the list of GSM
     */
    public void showGSM() {
	this.createGSMList().forEach(System.out::println);
    }

}