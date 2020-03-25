package singleton;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer printer = Printer.getPrinter();
		Device dev1 = new Device("Tietokone");
		Device dev2 = new Device("Puhelin");
		Thread t1 = new Thread(dev1);
		Thread t2 = new Thread(dev2);
		t1.start();
		t2.start();
	}

}
