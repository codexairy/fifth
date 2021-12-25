package fifth;
import java.util.*;
public class StopWatch {
	
	private long startTime;
	private long endTime;
	
	public StopWatch() {
		Date date = new Date();
		startTime = date.getTime();
	}
	
	public void start(long startTime) {
		this.startTime = startTime;
	}
	
	public void stop(long endTime) {
		this.endTime = endTime;
	}
	
	public long getElapsedTime() {
		Date time = new Date();
		return time.getTime();
	}
	
	public long getStartTime() {
		return startTime;
	}
	
	public long getEndTime() {
		return endTime;
	}
}
