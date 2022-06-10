package bucky80;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Bucky 84 & 86
public class Peach extends JPanel {
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		g.setColor(Color.BLUE);
		/*
		// Bucky 84
		g.fillRect(25, 25, 100, 30);
		g.setColor(new Color(190,81,215));
		g.fillRect(25, 65, 100, 30);
		g.setColor(Color.RED);
		g.drawString("Text", 25, 120);
		*/
		g.drawLine(10, 25, 200, 45); // x1,y1,x2,y2
		
		g.setColor(Color.RED);
		g.drawRect(10,50,100,30); // x, y, w, h
		
		g.setColor(Color.GREEN);
		g.fillOval(10, 95, 100, 30); // x, y, w, h
		
		g.setColor(Color.ORANGE);
		g.fill3DRect(10, 160, 100, 50, true);
	}

}
/*
// Bucky 85
public class Peach extends JFrame {
	private JButton b;
	private Color color=(Color.WHITE);
	private JPanel panel;
	public Peach() {
		super("title");
		panel=new JPanel();
		panel.setBackground(color);
		
		b = new JButton("Choose color");
		b.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						color = JColorChooser.showDialog(null, "Pick color", color);
						if (color==null)
							color=(Color.WHITE);
						panel.setBackground(color);
			}
		}
	);
		add(panel, BorderLayout.CENTER);
		add(b, BorderLayout.SOUTH);
		setSize(425,150);
		setVisible(true);
	}
}
*/