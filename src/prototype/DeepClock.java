package prototype;

public class DeepClock implements Cloneable {
	private Pointer pointer;

	public DeepClock() {
		this.pointer = new Pointer();
	}

	public void setTime(int seconds) {
		pointer.setTime(seconds);
	}

	public int getSeconds() {
		return pointer.getSeconds();
	}

	public Object clone() {
		DeepClock c = null;
		try {
			c = (DeepClock) super.clone();
			c.pointer = (Pointer) pointer.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return c;
	}


}
