package bucky41;

import javax.swing.JFrame;

public class Bucky41 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		tuna41 brian = new tuna41();
		brian.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		brian.setSize(350,100);
		brian.setVisible(true);
		
		// Bucky 45
		// food brian = new tuna41() is a superclass
		food brian[]=new food[2];
		brian[0]=new potpie();
		brian[1]=new tuna41();
		
		for (int x=0; x<2; ++x) {
			brian[x].eat();
		}
		*/
		// Bucky 46
		fatty brian=new fatty();
		food fo=new food();
		food po=new potpie();
		brian.digest(fo);
		brian.digest(po);
		
		// Bucky 47 more polymorphism 
		// if main eat (under superclass) has 0 args
		// then other eat must have 0 args (same #)
		// note: public class tuna (sub) extends food (super) "inherits"
		// same methods and return types
		
}
}
