package org.tuankiet.test;

import org.tuankiet.model.*;

import java.util.ArrayList;
import java.util.List;
/**
 *  This is a class will test all of functions
 * */
public class GSMTest {

    List<GSM> gsmList;

    public GSMTest() {
	// Create battery list with 3 rows information
	Battery battery1 = new Battery("PINCONO", 1500, 1000, BatteryType.LiIon);
	Battery battery2 = new Battery("PINCONMEO", 2500, 2000, BatteryType.NiCd);
	Battery battery3 = new Battery("PINCONTHO", 4000, 6000, BatteryType.NiMH);
	// Create display list with 3 rows information
	Display display1 = new Display(new Size(1633, 768), 25);
	Display display2 = new Display(new Size(1080, 920), 20);
	Display display3 = new Display(new Size(1090, 1024), 15);

	Call call1 = new Call(new Date(9,9,2022), new Time(20,15,30), "0763937123", 600);
	Call call2 = new Call(new Date(5,9,2022), new Time(21,16,39), "0763932125", 700);
	Call call3 = new Call(new Date(27,9,2022), new Time(22,10,20), "07639371696", 800);
	Call call4 = new Call(new Date(25,6,2022), new Time(15,30,30), "0763937125", 900);

	List<Call> callList1 = new ArrayList<>();
	callList1.add(call1);
	callList1.add(call2);
	callList1.add(call3);

	List<Call> callList2 = new ArrayList<>();
	callList2.add(call3);
	callList2.add(call4);

	List<Call> callList3 = new ArrayList<>();
	callList3.add(call1);
	callList3.add(call2);
	callList3.add(call3);
	callList3.add(call4);

	this.gsmList = new ArrayList<>();
	this.gsmList.add(new GSM("GSM1", "VietNam", 265.99, "Bephone", battery1, display1, callList1));
	this.gsmList.add(new GSM("GSM2", "NhatBan", 1500, "Nokia", battery2, display2, callList2));
	this.gsmList.add(new GSM("GSM3", "HanQuoc", 8000, "SamSung", battery3, display3, callList3));
    }


    /**
     * The function help to test the display phone device's info in telephone list.
     */
    public void display() {
	for (GSM gsm : gsmList) {
	    System.out.println(gsm);
	}
    }
}