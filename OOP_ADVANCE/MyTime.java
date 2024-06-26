package OOP;

import java.time.OffsetTime;

public class MyTime {
	
	private int hour;
	private int minute;
	private int second;
	
	public MyTime(int hour,int minute,int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		setTime(hour, minute, second);
		
	}
	
	public void setTime(int hour, int minute, int second) {
		if(hour >= 0 && hour < 24 || minute >= 0 && minute < 60 || second >= 0 && second < 60) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;}
		else {
			throw new IllegalArgumentException("Invalid hour,minute, or second");
		}
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
//	public String toString() {
//		return this.hour+":"+this.minute+":"+this.second;
//	}
	public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
	
	public MyTime nextSecond() {
		second++;
		if(second == 60) {
			second = 0;
			minute++;
			if(minute == 60) {
				minute = 0;
				hour++;
				if(hour == 24) {
					hour = 0;
				}
			}
		}
		return this;
	}
	 public MyTime nextMinute() {
	        minute++;
	        if (minute == 60) {
	            minute = 0;
	            hour++;
	            if (hour == 24) {
	                hour = 0;
	            }
	        }
	        return this;
	    }
	  public MyTime nextHour() {
	        hour++;
	        if (hour == 24) {
	            hour = 0;
	        }
	        return this;
	    }
	  
	  public MyTime previousSecond() {
	        second--;
	        if (second == -1) {
	            second = 59;
	            minute--;
	            if (minute == -1) {
	                minute = 59;
	                hour--;
	                if (hour == -1) {
	                    hour = 23;
	                }
	            }
	        }
	        return this;
	    }
	  
	  public MyTime previousMinute() {
	        minute--;
	        if (minute == -1) {
	            minute = 59;
	            --hour;
	            if (hour == -1) {
	                hour = 23;
	            }
	        }
	        return this;
	    }
	  public MyTime previousHour() {
	        hour--;
	        if (hour == -1) {
	            hour = 23;
	        }
	        return this;
	    }

}
