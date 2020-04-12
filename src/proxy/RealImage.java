package proxy;

public class RealImage implements Image {
	private final String filename;
	private String name;

	public RealImage(String filename, String name) {
		this.filename = filename;
		this.name = name;
		loadImageFromDisk();
	}

	@Override
	public void displayImage() {
		System.out.println("Displaying " + filename);
	}

	@Override
	public void showData() {
		System.out.println(this.name);

	}

	private void loadImageFromDisk() {
		System.out.println("Loading   " + filename);
	}

}
