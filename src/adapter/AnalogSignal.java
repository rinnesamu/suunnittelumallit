package adapter;

public class AnalogSignal implements IAnalogSignal {
	
	private String picture;
	
	public AnalogSignal() {
		this.picture = "An another picture";
	}

	@Override
	public String getPicture() {
		return this.picture;
	}

}
