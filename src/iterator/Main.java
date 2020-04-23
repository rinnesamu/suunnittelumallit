package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			list.add(i);
		}
		Iterator iterator = list.iterator();
		IteratorThread thread1 = new IteratorThread(list, iterator);
		IteratorThread thread2 = new IteratorThread(list, iterator);
		OtherThread swapper = new OtherThread(list);
		thread1.start();
		//thread2.start();
		//swapper.start();
		//swapper.join();
		thread1.join();
		//thread2.join();
	}

}
