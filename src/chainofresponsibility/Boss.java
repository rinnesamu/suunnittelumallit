package chainofresponsibility;

public class Boss extends Handler {
	private final int LIMIT = 5;

	@Override
	public void askRaise(int amount) {
		if (amount <= LIMIT) {
			super.print("Boss", amount);
		}else {
			super.askRaise(amount);
		}
	}

}
