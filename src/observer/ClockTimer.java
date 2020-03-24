package observer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Observable;

public class ClockTimer extends Observable implements Runnable {
	private int lastSendSeconds;
	
	SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");  
    Date date; //new Date();  
    //System.out.println(formatter.format(date));  
	public ClockTimer() {
		this.date = new Date();
		this.lastSendSeconds = date.getSeconds();
	}
	@Override
	public void run() {
		while (true) {
			date = new Date();
			if (lastSendSeconds != date.getSeconds()) {
				setChanged();
				notifyObservers();
				lastSendSeconds = date.getSeconds();
			}
		}
		
	}
	
	public String getSeconds() {
		String seconds = Integer.toString(date.getSeconds());
		if (seconds.length() == 1) {
			seconds = 0 + seconds;
		}
		return seconds;
	}
	public String getMinutes() {
		String minutes = Integer.toString(date.getMinutes());
		if (minutes.length() == 1) {
			minutes = 0 + minutes;
		}
		return minutes;
	}
	public String getHours() {
		String hours = Integer.toString(date.getHours());
		if (hours.length() == 1) {
			hours = 0 + hours;
		}
		return hours;
	}

}
