package chainofresponsibility;

public abstract class Handler implements IHandler {
	
	private Handler next;
	
	public Handler () {
		
	}
	public void setHandler(Handler n) {
		this.next = n;
	}
	
	public void askRaise(int amount) {
		if (next != null) {
			next.askRaise(amount);
		}
	}
	
	public void print(String s, int amount) {
		System.out.println(s + " gives you " + amount + "% raise!");
	}

}
