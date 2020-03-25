package singleton;

import java.util.ArrayList;
import java.util.List;

public class Printer {
	private static Printer INSTANCE = null;
	private List<String> printQueue;
	
	private Printer() {
		this.printQueue = new ArrayList<String>();
		// lisäksi yhteys printteriin etc.
	}
	
	public static synchronized Printer getPrinter() {
		if (INSTANCE == null) {
			INSTANCE = new Printer();
		}
		return INSTANCE;
	}
	
	public void addToQueue(List<String> a) {
		printQueue.addAll(a);
		print();
		
	}
	
	private synchronized void print() {
		while (printQueue.size() != 0) {
			System.out.println(printQueue.remove(0));
		}
	}
}
