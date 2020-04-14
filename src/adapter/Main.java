package adapter;

public class Main {

	public static void main(String[] args) {
		IDigitalSignal signal = new DigitalSignal();
		IDigitalSignal adaptedSignal = new Adapter();
		Tv tv = new Tv(signal);
		tv.drawPicture();
		tv.setSignal(adaptedSignal);
		tv.drawPicture();

	}

}
