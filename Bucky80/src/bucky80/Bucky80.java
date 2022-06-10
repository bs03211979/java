package bucky80;

import javax.swing.*;

public class Bucky80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		createfile g=new createfile();
		g.openFile();
		g.addRecords();
		g.closeFile(); // R-Click to refresh top Bucky80 to show chinese.txt
		
		// Bucky 81
		readfile r=new readfile();
		r.openFile();
		r.readfile();
		r.closefile();
		
		// Bucky 83
		Layout l=new Layout();
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l.setSize(300,100);
		l.setVisible(true);
		
		// Bucky 84
		JFrame f=new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Peach p=new Peach();
		f.add(p);
		f.setSize(400,250);
		f.setVisible(true);
		*/
		// Bucky 87
		String a="apples";
		String b="brian";
		String c="BRIAN";
		System.out.println(a.length());
		if(a.equals("apples")) {
			System.out.println("Yes");
		}
		if(b.equalsIgnoreCase(c)) { // "no" w/o "IgnoreCase"
			System.out.println("Brian matches");
		}
		if(b.equals(c)) {
			System.out.println("Brian still matches");
		}
		else
			System.out.println("BRIAN doesn't match");
	}

}
