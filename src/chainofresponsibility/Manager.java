package chainofresponsibility;

public class Manager extends Handler {
	private final int LIMIT = 2;

	@Override
	public void askRaise(int amount) {
		if (amount <= LIMIT) {
			super.print("Manager", amount);
		}else {
			super.askRaise(amount);
		}
		
	}
	

}
