package model;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentListener;

public class Raam extends JFrame{
	public Raam() {
		initial();
		this.setSize(400, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	private JPanel makePanel() {
		JPanel pane = new Cardinal();
		
/*		JTextField entree = new JTextField("Write smth here");
		JLabel sortie = new JLabel("");
	

		JButton go = new JButton("GO");
		go.addActionListener(new WToBox(entree.getText(), sortie));
		
		JButton reset = new JButton("reset");
		reset.addActionListener(new Reset(entree,sortie));
		
		pane.add(entree);
		pane.add(sortie);
		pane.add(go);
		pane.add(reset);*/
		return pane;
	}
	
	public void initial() {
		Container container = this.getContentPane();
		container.add(makePanel());
		
	}

	
	
	
}
