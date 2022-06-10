package bucky49;

public class DogList {
	private Dog[] thelist=new Dog[5];
	private int x=0;
	
	public void add(Dog d) {
		if (x<thelist.length) {
			thelist[x]=d;
			System.out.println("Dog added @ index " + x);
			x++;
		}
	}
}
