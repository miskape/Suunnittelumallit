/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author miskape
 */
public class ClockTimer extends Observable  {
	private int hour = 0, minute = 0, second = 0;
	Timer timer;
	TimerTask task;
	public ClockTimer() {
		timer = new Timer();
		task = new TimerTask() {
			@Override
			public void run() {
				tick();
			}
		};
		timer.scheduleAtFixedRate(task, 1000, 1000);
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	
	
	void tick() {
            if(second == 59){
                if(minute == 59){
                    if(hour == 23){
                        hour = 0;
            }
            else hour++;
                minute = 0;
            }
            else minute++;
            second = -1;
        }
            second++;
            setChanged();
            notifyObservers();
	}
}

