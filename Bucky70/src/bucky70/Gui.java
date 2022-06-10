package bucky70;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame {
	/*
	private JList list;
	private static String[] colornames= {"black","blue","white"};
	private static Color[] colors= {Color.BLACK,Color.BLUE,Color.WHITE};
	public Gui () {
		super("Title");
		setLayout(new FlowLayout());
		list = new JList(colornames);
		list.setVisibleRowCount(3);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));
		
		list.addListSelectionListener(
				new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent event) {
						getContentPane().setBackground(colors[list.getSelectedIndex()]);
					}
				}
				);
					
	// Bucky 72
	private JList leftlist;
	private JList rightlist;
	private JButton movebutton;
	private static String[] foods = {"bacon","wings","ham","morebacon"};
	public Gui() {
		super("title");
		setLayout(new FlowLayout());
		leftlist=new JList(foods);
		leftlist.setVisibleRowCount(3);
		leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(leftlist));
		
		movebutton=new JButton("Move->");
		movebutton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						rightlist.setListData(leftlist.getSelectedValues());
					}
				});
		add(movebutton);
		
		rightlist=new JList();
		rightlist.setVisibleRowCount(3);
		rightlist.setFixedCellWidth(100);
		rightlist.setFixedCellHeight(15);
		rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(rightlist));
	}
	
	// Bucky 74
	private JPanel mousepanel;
	private JLabel statusbar;
	public Gui() {
		super("title");
		mousepanel=new JPanel();
		mousepanel.setBackground(Color.WHITE);
		add(mousepanel, BorderLayout.CENTER);
		statusbar=new JLabel("deafault");
		add(statusbar, BorderLayout.SOUTH);
		Handlerclass handler=new Handlerclass();
		mousepanel.addMouseListener(handler);
		mousepanel.addMouseMotionListener(handler);
	}
	
	private class Handlerclass implements MouseListener, MouseMotionListener {
	public void MouseClicked(MouseEvent event) {
		statusbar.setText(String.format("Clicked @ %d, %d", event.getX()));
		statusbar.setText(String.format("Clicked @ %d, %d", event.getY()));
	}
	
	public void MousePressed(MouseEvent event) {
		statusbar.setText("You pressed");
	}
	
	public void MouseReleased(MouseEvent event) {
		statusbar.setText("You released");
	}
	
	public void MouseEntered(MouseEvent event) {
		statusbar.setText("You entered");
		mousepanel.setBackground(Color.RED);
	}
	
	public void MouseExited(MouseEvent event) {
		statusbar.setText("You exited");
		mousepanel.setBackground(Color.WHITE);
	}
	
	// Bucky 76
	public void MouseDragged(MouseEvent event) {
		statusbar.setText("You're dragging");
	}
	
	public void MouseMoved(MouseEvent event) {
		statusbar.setText("You're moving");
	}
}
*/
	// Bucky 77
	private String details;
	private JLabel statusbar;
	public Gui() {
		super("title");
		statusbar=new JLabel("deafault");
		add(statusbar, BorderLayout.SOUTH);
		addMouseListener(new Mouseclass());
	}
	
	private class Mouseclass extends MouseAdapter {
		public void mouseClicked(MouseEvent event) {
			details=String.format("U clicked %d", event.getClickCount());
			
			if (event.isMetaDown()) 
				details += "with r mouse button";
			else if(event.isAltDown())
				details += "ctr mous button";
			else 
				details += "w/left mouse button";
			statusbar.setText(details);
		}
	}
	
}