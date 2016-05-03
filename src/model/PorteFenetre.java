package model;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PorteFenetre extends JFrame {
	
	public PorteFenetre() {
		initial();
		this.setSize(400, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
	public void initial() {
		Container container = this.getContentPane();
		container.add(makePanel());
		
	}
	
	public JPanel makePanel() {
		JPanel pilluleRouge = new JPanel();
		pilluleRouge.add(new JLabel("Morpheus"));
		pilluleRouge.add(new JTextField("What'sUpDoc",30));
		JRadioButton zion = new JRadioButton("zion");
		JRadioButton machineCity = new JRadioButton("machineCity");
		ButtonGroup destination = new ButtonGroup();
		destination.add(machineCity);
		destination.add(zion);
		pilluleRouge.add(machineCity);
		pilluleRouge.add(zion);
		pilluleRouge.add(new JButton("GO !"));
		return pilluleRouge;
	}
}

