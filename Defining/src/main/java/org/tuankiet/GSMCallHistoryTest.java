package org.tuankiet;

/**
 *  This is a class will test all functions
 * */
class GSMCallHistoryTest {
    /**
     * Add call to call history
     */
    public void addCall(String dateCall, String dialedPhone, int duration) {
	GSM gsm = new GSM();
	gsm.addCall(dateCall, dialedPhone, duration);
    }

    /**
     * Remove call longest in call history
     */
    public void removeCallLongest() {
	GSM gsm = new GSM();
	gsm.removeCallLongest();
    }

    /**
     * Print the total price of the calls in call history.
     */
    public void printTotalPrice(double pricePerMinute) {
	GSM gsm = new GSM();
	double totalPrice = gsm.totalPricePerMinute(pricePerMinute);
	System.out.format("The total price of calls is: %.2f %n", totalPrice);
    }

    /**
     * Clear all call in call history
     */
    public void clearCall(){
	GSM gsm = new GSM();
	gsm.clearCall();
    }

    /**
     * Show the call history
     */
    public void showCallHistory() {
	GSM gsm = new GSM();
	gsm.getCallHistory().forEach(System.out::println);
    }
}