package bucky80;

import java.util.*;

public class Sample {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x=1;
		do {
			
			try {
				System.out.println("Enter 1st num");
				int n1=input.nextInt();
				System.out.println("Enter 2nd num");
				int n2=input.nextInt();
				int ans= n1 / n2;
				System.out.println(ans);
				x=2; // so it will keep looping until user enters good nums
			}
			catch(Exception e) {
				System.out.println("You can't do that");
				
			}
		}
		while(x==1);
	}

}
