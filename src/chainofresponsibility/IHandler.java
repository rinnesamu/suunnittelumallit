package chainofresponsibility;

public interface IHandler {
	public void askRaise(int amount);
	public void print(String s, int amount);
	public void setHandler(Handler n);

}
