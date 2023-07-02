package org.tuankiet;

/**
 * This is a class will test all functions
 *
 * */
public class Main {
    public static void main(String[] args) {
        // Create new object for testing
        GSMTest gsmTest = new GSMTest();
        GSMCallHistoryTest gsmCallHistoryTest = new GSMCallHistoryTest();

        System.out.println("---------------------------------- GSM ----------------------------------");
        gsmTest.showGSM();

        System.out.println("------------------------- GSM call history -------------------------------");
        gsmCallHistoryTest.addCall("23/04/2023", "0123456789 ", 50);
        gsmCallHistoryTest.addCall("15/01/2023", "0987123456", 60);
        gsmCallHistoryTest.addCall("22/06/2022", "0987123456", 700);

        // Show call history
        gsmCallHistoryTest.showCallHistory();


        // Remove call longest in call history
        gsmCallHistoryTest.removeCallLongest();
        gsmCallHistoryTest.showCallHistory();

        gsmCallHistoryTest.printTotalPrice(0.37);

        // Clear all call
        gsmCallHistoryTest.clearCall();

        // Show call history
        gsmCallHistoryTest.showCallHistory();
    }
}
