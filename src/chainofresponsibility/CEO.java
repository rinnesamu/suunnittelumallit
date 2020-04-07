package chainofresponsibility;

public class CEO extends Handler {

	private final int LIMIT = 10;

	@Override
	public void askRaise(int amount) {
		if (amount <= LIMIT) {
			super.print("CEO", amount);
		}else {
			System.out.println("You asked too much!\nYou are fired!");
		}
	}

}
