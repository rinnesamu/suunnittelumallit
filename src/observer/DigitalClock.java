package observer;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {
	private ClockTimer timer; 
	
	public DigitalClock(ClockTimer timer) {
		this.timer = timer;
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(timer.getHours() + ":" + timer.getMinutes() + ":" + timer.getSeconds());

	}

}
