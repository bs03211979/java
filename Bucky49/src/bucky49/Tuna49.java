package bucky49;
/*
public class Tuna49 {
	
		private int hr;
		private int min;
		private int sec;
		
		public Tuna49() {
			this(0,0,0);
		}
		public  Tuna49(int h) {
			this(h,0,0);
		}
		public  Tuna49(int h, int m) {
			this(h,m,0);
		}
		public  Tuna49(int h, int m, int s) {
			setTime(h,m,s);
		}
		
		public void setTime(int h, int m, int s) {
			setHour(h);
			setMinute(m);
			setSecond(s);
		}
		
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
	
	// Bucky 53
	private String name;
	private potpie birthday;
	
	public Tuna49(String theName, potpie theDate) {
		name=theName;
		birthday=theDate;
	}
	public String toString() {
		return String.format("My name's %s, birthday's %s", name, birthday);
	}
}

// Bucky 54
	public enum Tuna49 {
		bucky("nice", "22"),
		kelsey("cute", "10"),
		julia("big mistake","12"),
		// Bucky 55
		nicole("italian","13"),
		candy("different","14"),
		erin("wish","16");
		
		// Bucky 54-55
		
		private final String desc;
		private final String year;
		
		Tuna49(String description, String birthday) {
			desc=description;
			year=birthday;
		}
		public String getDesc() {
			return desc;
		}
		public String getYear() {
			return year;
		}
		
// Bucky 56
	public class Tuna49 {
		private String first;
		private String last;
		private static int members = 0;
	
		public Tuna49(String fn, String ln) {
			first=fn;
			last=ln;
			members++;
			System.out.printf("Constructor for %s %s, members in the club: %d\n", first, last, members);
		}
		
		// Bucky 57
		public String getFirst() {
			return first;
		}
		public String getLast() {
			return last;
		}
		public static int getMembers() {
			return members;
		}
		
		public class Tuna49 {
			private int sum;
			private final int NUM;
			
			public Tuna49(int x) {
			NUM=x;
			}
			
			public void add() {
				sum+=NUM;
			}
			public String toString() {
				return String.format("sum = %d\n", sum);
			}
			}
		*/
		// Bucky 59 only public methods can inherit like this
		public class Tuna49 extends potpie { // inherits potpie, which inherits food
			public void eat() {
			System.out.println("I overrode the other method");
	}
}