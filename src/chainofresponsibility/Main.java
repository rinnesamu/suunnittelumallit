package chainofresponsibility;

public class Main {

	public static void main(String[] args) {
		Handler c = new CEO();
		Handler b = new Boss();
		Handler m = new Manager();
		m.setHandler(b);
		b.setHandler(c);
		m.askRaise(2);
		m.askRaise(5);
		m.askRaise(10);
		m.askRaise(11);
	}

}
