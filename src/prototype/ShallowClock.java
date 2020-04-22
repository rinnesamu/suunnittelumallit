package prototype;

public class ShallowClock implements Cloneable {

	private Pointer pointer;

	public ShallowClock() {
		this.pointer = new Pointer();
	}

	public void setTime(int seconds) {
		pointer.setTime(seconds);
	}

	public int getSeconds() {
		return pointer.getSeconds();
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
