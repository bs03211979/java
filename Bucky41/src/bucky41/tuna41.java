package bucky41;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

// public class tuna41 extends JFrame { // Bucky 41-44
public class tuna41 extends food { // Bucky 45
	/*
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordField;
	
	// Bucky 41 only
	 private JLabel item1;
	
	public tuna41() {
		super("Title Bar");
		setLayout(new FlowLayout());
		
		item1=new JLabel("example");
		item1.setToolTipText("Display on hover");
		add(item1);
	
	// Bucky 42
	public tuna41() {
		super("Title Bar");
		setLayout(new FlowLayout());
		
		item1=new JTextField(10);
		add(item1);
		item2=new JTextField("Enter text here: ");
		add(item2);
		item3=new JTextField("uneditable", 20);
		item3.setEditable(false);
		add(item3);
		
		passwordField=new JPasswordField("pass");
		add(passwordField);
		
		// Bucky 43 goes with 42
		
		thehandler handler=new thehandler();
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		passwordField.addActionListener(handler);
	}
	private class thehandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String string="";
			
			if(event.getSource()==item1)
				string=String.format("field1: %s", event.getActionCommand());
			else if(event.getSource()==item2)
				string=String.format("field2: %s", event.getActionCommand());
			else if(event.getSource()==item3)
				string=String.format("field3: %s", event.getActionCommand());
			else if(event.getSource()==passwordField)
				string=String.format("password field is %s", event.getActionCommand());
			
			// Bucky 44 goes with 42-43
			JOptionPane.showMessageDialog(null, string);
		}
	}
	*/
	// Bucky 45
	void eat() {
		System.out.println("This tuna is great. ");
	}
}