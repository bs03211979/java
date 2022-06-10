package bucky10;

public class tuna {
	/* 
	// Bucky 14
	public void simpleMessage(String name) {
		System.out.println("Tuna");
	
	// Bucky 15
	public void simpleMessage(String name) {
			System.out.println("Hi " + name);
	
	// Bucky 16
		private String girlName;
		public void setName(String name) {
			girlName = name;
	}
		public String getName() {
			return girlName;
		}
		public void saying() {
			System.out.printf("You're first girl friend was %s", getName());
		}
	*/
	// Bucky 17
	private String girlName;
	public tuna(String name) {
		girlName = name;
	}
	public void setName(String name) {
		girlName = name;
	}
	public String getName() {
		return girlName;
	}
	
	public void saying() {
		System.out.printf("You're girl friend was %s. ", getName());
	}
}
