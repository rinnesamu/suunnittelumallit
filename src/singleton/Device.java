package singleton;

import java.util.ArrayList;
import java.util.List;

public class Device implements Runnable {
	private final int MAX = 1000;
	private Printer printer;
	private String name;
	private List<String> list;
	
	public Device(String name) {
		this.name = name;
		this.printer = printer.getPrinter();
		this.list = new ArrayList<String>();
		for (int i = 0; i < MAX; i++) {
			list.add(this.name + i);
		}
		
	}

	@Override
	public void run() {
		printer.addToQueue(list);
		
	}
	
	

}
