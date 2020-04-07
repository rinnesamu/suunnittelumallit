package chainofresponsibility;

public class Main {

	public static void main(String[] args) {
		CEO c = new CEO();
		Boss b = new Boss();
		Manager m = new Manager();
		m.setHandler(b);
		b.setHandler(c);
		m.askRaise(2);
		m.askRaise(5);
		m.askRaise(10);
		m.askRaise(11);
		

	}

}
