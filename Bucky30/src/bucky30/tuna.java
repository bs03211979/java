package bucky30;

public class tuna {
	private int hr;
	private int min;
	private int sec;
	
	public tuna() {
		this(0,0,0);
	}
	public tuna(int h) {
		this(h,0,0);
	}
	public tuna(int h, int m) {
		this(h,m,0);
	}
	public tuna(int h, int m, int s) {
		setTime(h,m,s);
	}
/*
	// Bucky to 38
public void setTime(int h, int m, int s) {
	hr=((h>=0&&h<24)?h:0);
	min=((m>=0&&m<60)?m:0);
	sec=((s>=0&&s<60)?s:0);
}
public String toMilitary() {
	return String.format("%02d:%02d:%02d",hr,min,sec);
}
public String toString() {
	return String.format("%d:%02d:%02d %s",(hr==0||hr==12)?12:hr%12,min,sec,(hr<12?"am":"pm"));
	
}
*/
	// Bucky 39 goes with 40
	public void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	
	// Bucky 40
	public void setHour(int h) {
		hr=((h>=0&&h<24)?h:0);
	} 
	public void setMinute(int m) {
		min=((m>=0&&m<60)?m:0);
	}
	public void setSecond(int s) {
		sec=((s>=0&&s<60)?s:0);
	}
	public int getHour() {
		return hr;
	}
	public int getMinute() {
		return min;
	}
	public int getSecond() {
		return sec;
	}
	public String toMilitary() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
}
