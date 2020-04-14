package adapter;

public class Tv {

	private IDigitalSignal s;

	public Tv(IDigitalSignal s) {
		this.s = s;
	}

	public void drawPicture() {
		try {
			String picture = s.getPicture();
			String[] bytesStr = picture.toString().split(" ");
			for (String c : bytesStr) {
				System.out.print((char) Byte.parseByte(c, 2));
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println("Cannot read this type of signal!");
		}
	}
	
	public void setSignal(IDigitalSignal s) {
		this.s = s;
	}

}
