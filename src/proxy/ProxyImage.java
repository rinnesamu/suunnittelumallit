package proxy;

public class ProxyImage implements Image {

	private final String filename;
	private RealImage image;
	private String name;

	public ProxyImage(String filename, String name) {
		this.filename = filename;
		this.name = name;
	}

	@Override
	public void displayImage() {
		if (image == null) {
			image = new RealImage(filename, name);
		}
		image.displayImage();
	}

	@Override
	public void showData() {
		System.out.println(this.name);
	}

}
