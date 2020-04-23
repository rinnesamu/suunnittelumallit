package iterator;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class OtherThread extends Thread {
	private List collection;
	private int shufles = 50;
	private final int MAX = 99;
	private final int MIN = 0;
	Random random = new Random();
	
	public OtherThread(List c) {
		this.collection = c;
	}

	public void run() {
		for (int i = 0; i < shufles; i++) {
			//Collections.swap(collection, random.nextInt(MAX - MIN + 1) + MIN, random.nextInt(MAX - MIN + 1) + MIN);
			collection.remove(2*i);
		}
	}
}
