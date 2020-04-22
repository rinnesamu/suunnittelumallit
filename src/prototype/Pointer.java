package prototype;

public class Pointer implements Cloneable {

	private int seconds;

	public Pointer() {
		this.seconds = 0;
	}

	public void setTime(int seconds) {
		this.seconds = seconds;
	}

	public int getSeconds() {
		return this.seconds;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
