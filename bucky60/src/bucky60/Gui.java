package bucky60;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame {
	// Bucky 60-63
	/*
	private JButton reg;
	private JButton custom;
	
	public Gui() {
		super("Title");
		setLayout(new FlowLayout());
		
		reg=new JButton("reg Button");
		add(reg);
		// Icon b=new ImageIcon(getClass().getResource("b.png"));
		// Icon x=new ImageIcon(getClass().getResource("x.png"));
		custom=new JButton("Custom"); // custom=new JButton("Custom", b);
		// custom.setRolloverIcon(x); 
		add(custom);
		
		HandlerClass handler=new HandlerClass();
		reg.addActionListener(handler);
		custom.addActionListener(handler);
		
	
	}
	
	// Bucky 64
	private JTextField tf;
	private JCheckBox boldbox;
	private JCheckBox italicbox;
	
	public Gui() {
		super("title");
		setLayout(new FlowLayout());
		tf=new JTextField("Sentence",20);
		tf.setFont(new Font("Serif",Font.PLAIN,14));
		add(tf);
		boldbox=new JCheckBox("bold");
		italicbox=new JCheckBox("italics");
		add(boldbox);
		add(italicbox);
		HandlerClass handler=new HandlerClass();
		boldbox.addItemListener(handler);
		italicbox.addItemListener(handler);
	}
	private class HandlerClass implements ItemListener {
		public void itemStateChanged(ItemEvent event) {
			Font font=null;
			if(boldbox.isSelected()&&italicbox.isSelected())
				font=new Font("Serif",Font.BOLD+Font.ITALIC,14);
			else if (boldbox.isSelected())
				font=new Font("Serif",Font.BOLD,14);
			else if (italicbox.isSelected())
				font=new Font("Serif",Font.ITALIC,14);
			else
				font=new Font("Serif",Font.PLAIN,14);
			tf.setFont(font);
		}
	}
	
	// Bucky 60-63
	
	private class HandlerClass implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
		}
	}

	private JTextField tf;
	private Font pf;
	private Font bf;
	private Font itf;
	private Font bif;
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton ib;
	private JRadioButton bib;
	private ButtonGroup group;
	
	public Gui() {
		super("Title");
		setLayout(new FlowLayout());
		tf=new JTextField("Bucky is awesome",25);
		add(tf);
		
		pb=new JRadioButton("plain",true);
		bb=new JRadioButton("bold",true);
		ib=new JRadioButton("italic",false);
		bib=new JRadioButton("b and i",false);
		add(pb);
		add(bb);
		add(ib);
		add(bib);
		group=new ButtonGroup();
		group.add(pb);
		group.add(bb);
		group.add(ib);
		group.add(bib);
		pf=new Font("Serif",Font.PLAIN,14);
		bf=new Font("Serif",Font.BOLD,14);
		itf=new Font("Serif",Font.ITALIC,14);
		bif=new Font("Serif",Font.BOLD+Font.ITALIC,14);
		
		tf.setFont(pf);
		pb.addItemListener(new HandlerClass(pf));
		// wait for event to happen, pass in font object to constructor
		bb.addItemListener(new HandlerClass(bf));
		ib.addItemListener(new HandlerClass(itf));
		bib.addItemListener(new HandlerClass(bif));
	}
	private class HandlerClass implements ItemListener {
		private Font font;
	
		// font object get variable font
		public HandlerClass(Font f) {
			font=f;
		}// sets font to font obj that was passed in
	
		public void itemStateChanged(ItemEvent event) {
			tf.setFont(font);
	}
	
	}
	*/
	// Bucky 68
	private JComboBox box;
	private JLabel picture;
	// private static String[] filename = {"b.png","x.png"};
	// private Icon[] pics= {new ImageIcon(getClass().getResource(filename[0]))};
	
	public Gui() {
		super("Title");
		setLayout(new FlowLayout());
		box=new JComboBox(); // box=new JComboBox(filename);
		
		box.addItemListener(
				new ItemListener() {
					public void itemStateChanged(ItemEvent event) {
						// if(event.getStateChange()==ItemEvent.SELECTED)
							// picture.setIcon(pics[box.getSelectedIndex()]);
					}
				});
		add(box);
		// picture=new JLabel(pics[0]);
		// add(picture);
	}
	}
