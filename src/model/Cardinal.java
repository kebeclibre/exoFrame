package model;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import panels.North;

public class Cardinal extends JPanel {
	
	public Cardinal() {
		this.setLayout(new BorderLayout());
		this.add(new JButton("east") , BorderLayout.EAST);
		this.add(new JButton("west") , BorderLayout.WEST);
		this.add(new JButton("center") , BorderLayout.CENTER);
		this.add(new North() , BorderLayout.NORTH);
		this.add(new JButton("south") , BorderLayout.SOUTH);
	}

}
