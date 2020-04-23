package iterator;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorThread extends Thread {
	private List collection;
	private Iterator iterator;
	private int threadNumber;
	static int nextNumber = 1;
	static int last;

	public IteratorThread(List c) {
		this.collection = c;
		this.iterator = collection.iterator();
		this.threadNumber = nextNumber;
		nextNumber++;
	}

	public IteratorThread(List c, Iterator i) {
		this.iterator = i;
		this.collection = c;
		this.threadNumber = nextNumber;
		last = threadNumber;
		nextNumber++;
	}

	public void run() {
		while (iterator.hasNext()) {
			print();
		}
	}

	private synchronized void print() {
		synchronized (this) {
			if (iterator.hasNext()) {
				//if (last != threadNumber) {
					//iterator.remove();
					System.out.println("Säikeen numero: " + threadNumber + ", listan elementti: " + iterator.next());
					last = threadNumber;
					this.notifyAll();
				}
			//}
		}

	}
}
