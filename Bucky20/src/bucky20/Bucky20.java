package bucky20;

import java.util.Scanner;
import java.util.Random;

public class Bucky20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int age=21;
		System.out.println(age > 50 ? "Old" : "Young");
		
		// Bucky 21
		Scanner input=new Scanner(System.in);
		int total=0;
		int grade;
		int avg;
		int counter=0;
		System.out.println("Enter 10 grades: ");
		while (counter<10) {
			grade=input.nextInt();
			total=total+grade;
			counter++;
		}
		avg=total/10;
		System.out.println("Avg=" + avg);
		
		// Bucky 22
		int counter;
		for(counter=1;counter<=10;counter++) {
				System.out.println(counter);
		}
		
		// Bucky 23
		double amt;
		double principal=10000;
		double rate = .01;
		for (int day=1; day<=20; day++) {
			amt=principal*Math.pow(1+rate, day);
			System.out.println(day+" "+amt);
		}
		
		// Bucky 24
		int counter=0;
		do {
			System.out.println(counter);
			counter++;
		} while (counter<=10);
		
		// Bucky 25
		System.out.println(Math.abs(-7.4));
		System.out.println(Math.ceil(7.4));
		System.out.println(Math.floor(7.4));
		System.out.println(Math.max(6,8));
		System.out.println(Math.min(6,8));
		System.out.println(Math.pow(5, 3));
		System.out.println(Math.sqrt(9));
		
		// Bucky 26
		Random dice=new Random();
		int num;
		for (int counter=1;counter<=10;counter++) {
			num=1+dice.nextInt(6);
			System.out.println(num + " ");	
		}
		
		// Bucky 27
		int brian[]=new int[10];
		
		brian[0]=87;
		brian[1]=71;
		brian[2]=17;
		brian[3]=78;
		brian[4]=79;
		brian[5]=3;
		brian[6]=21;
		brian[7]=82;
		brian[8]=89;
		brian[9]=543;
		System.out.println(brian[1]);
		
		// Bucky 27.2
		int brian[]= {2,3,5,9,7};
		System.out.println(brian[1]);
		
		// Bucky 28
		System.out.println("Index\tValue");
		int brian[]= {2,3,8,5};
		for (int counter=0;counter<brian.length;counter++) {
			System.out.println(counter +"\t"+ brian[counter]);
		}
		*/
		// Bucky 29
		int brian[]= {40,39,14,12,9};
		int sum=0;
		int counter;
		for (counter=0; counter<brian.length; counter++) {
			sum+=brian[counter];
		}
		System.out.println("Sum = "+sum);
	}

}
