package com.example.timer;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TaskScheduler {
	Timer timer;
 
	public TaskScheduler(int seconds) {
		timer = new Timer();
		timer.schedule(new MyTimerTask(), seconds * 1000);
	}
 
	class MyTimerTask extends TimerTask {
		public void run() {
			System.out.println("function calling at "+new Date());
			terminateTimer();
			
		}

		private void terminateTimer() {
			System.out.println("terminating calling at "+new Date());
			timer.cancel(); 
		}
	}
 
	public static void main(String args[]) {
		new TaskScheduler(5);
		System.out.println("Timer Started for 5 seconds at "+ new Date());
		
	}
}