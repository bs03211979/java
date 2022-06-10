package bucky80;

import java.io.*;
import java.lang.*;
import java.util.*;

// Bucky 80

public class createfile {
	private Formatter x;
	public void openFile() {
		try {
			x=new Formatter("chinese.txt");
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
	public void addRecords() {
		x.format("%s%s%s", "20 ", "bucky ", "roberts\n");
		x.format("%s%s%s", "21 ", "roberto ", "clemente\n");
	}
	public void closeFile() {
		x.close();
	}
	
}
