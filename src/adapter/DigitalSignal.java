package adapter;

public class DigitalSignal implements IDigitalSignal {
	
	private String picture;
	
	public DigitalSignal() {
		this.picture = "01000001 00100000 01110000 01101001 01100011 01110100 01110101 01110010 01100101 ";
	}

	@Override
	public String getPicture() {
		return this.picture;
	}

}
