package proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(final String[] arguments) {
		List<Image> images = new ArrayList<Image>();
		Image image1 = new ProxyImage("HiRes_10MB_Photo1", "Kuva 1");
		Image image2 = new ProxyImage("HiRes_10MB_Photo2", "Kuva 2");
		images.add(image1);
		images.add(image2);
		/*
		image1.displayImage(); // loading necessary
		image1.displayImage(); // loading unnecessary
		image2.displayImage(); // loading necessary
		image2.displayImage(); // loading unnecessary
		image1.displayImage(); // loading unnecessary
		*/
		System.out.println("Album includes:");
		for (Image i : images) {
			i.showData();
		}
		System.out.println("Loading images");
		for (Image i : images) {
			i.displayImage();
		}
	}

}
