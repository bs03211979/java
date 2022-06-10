package bucky60;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
// Right click src; Properties; Library; 
// Add Library; JRE Libraries; External environment; 
// Java 1.7 or 17


public class bucky60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		// Bucky 60
		String fn=JOptionPane.showInputDialog("Enter 1st number: ");
		String sn=JOptionPane.showInputDialog("Enter 2nd number: ");
		
		int num1=Integer.parseInt(fn);
		int num2=Integer.parseInt(sn);
		
		int sum=num1+num2;
		
		JOptionPane.showMessageDialog(null, "Answer: " + sum, "Title", JOptionPane.PLAIN_MESSAGE);;
	}
	
		animal[] thelist=new animal[2];
		Dog d=new Dog();
		Fish f=new Fish();
		thelist[0]=d;
		thelist[1]=f;
		for(animal x: thelist)
			x.noise();
		*/
		//Bucky 63
		Gui go=new Gui();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setSize(300,200);
		go.setVisible(true);
}
	
}