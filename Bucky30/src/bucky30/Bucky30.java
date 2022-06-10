package bucky30;
import java.util.Random;
public class Bucky30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		// Bucky 30 will count freq of dice roll
		Random rand=new Random();
		int freq[]=new int[7];
		int roll;
		for (roll=1; roll<1000;roll++) {
			++freq[1+rand.nextInt(6)];
		}
		System.out.println("Face\t Freq");
		int face;
		for (face=1; face<freq.length; face++) {
			System.out.println(face+"\t"+freq[face]);
		}
		
		// Bucky 31 will sum array
		int brian[]= {3,4,6,7};
		int total=0;
		for (int x: brian) {
			total+=x;
		}
		System.out.println(total);
		
		// Bucky 32
		int brian[]= {3,4,5,6};
		change(brian);
		for(int y:brian)
			System.out.println(y);
	}
	public static void change(int x[]) {
	for (int counter=0; counter<x.length; counter++)
		x[counter]+=5;
	}
		
		// Bucky 33 goes with 34
		int firstarray[][]= {{8,9,10,11},{12,13,14,15}};
		int secondarray[][]= {{30,31,32,33},{43},{4,5,6}};
		System.out.println("First array: ");
		display(firstarray);
		System.out.println("Second array: ");
		display(secondarray);
	}
		//Bucky 34
	public static void display(int x[][]){
		int row;
		for (row=0;row<x.length;row++) {
			int column;
			for (column=0;column < x[row].length;column++) {
				System.out.print(x[row][column]+"\t");
			}
			System.out.println();
		}
		
		// Bucky 35
		System.out.println("Avg="+ avg(36,45,54,8,77));
	}
	public static int avg(int...num) {
		int total=0;
		for (int x:num) 
			total+=x;
		return total/num.length;
	}
		*/
		// Bucky 36
		tuna tunaObject=new tuna();
		System.out.println(tunaObject.toMilitary());
		tunaObject.setTime(13,27,6);
		System.out.println(tunaObject.toMilitary());
		/*
		// Bucky 37 goes with 36 (not 38-40)
		System.out.println(tunaObject.toString());
		*/
		// Bucky 38 goes with 36
		// use this.hour inside tuna method if private variables have same name
		
		// Bucky 39 overloaded constructors (goes with 36)
		
		// Bucky 40 goes with 36
		
	}	
}
