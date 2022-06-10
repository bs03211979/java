package bucky70;

import javax.swing.*;
import java.io.*;
import java.util.*;

public class Bucky70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Right click src; Properties; Library; 
		// Add Library; JRE Libraries; External environment; 
		// Java 1.7 or 17
/*
				//Bucky 70
				Gui go=new Gui();
				go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				go.setSize(300,200);
				go.setVisible(true);
				
		// Bucky 78
		File x=new File("C:\\test\\greg.txt"); // if it is C:\test\greg.txt
		if (x.exists())
			System.out.println(x.getName() + " exists");
		else 
			System.out.println(x.getName() + " does not exist");
		*/
		// Bucky 79
		final Formatter x;
		try {
			x=new Formatter("fred.txt");
			System.out.println("U did it");
		}
		catch(Exception e) {
			System.out.println("U got an error");
		}
	}
}
