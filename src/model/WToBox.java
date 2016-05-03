package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class WToBox implements ActionListener{
	private String received = null;
	private JLabel target = null;

	public WToBox(String st, JLabel jl) {
		received = st;
		target = jl;
	}
	
	public void actionPerformed(ActionEvent e) {
		target.setText(received);
		
	}
	
	

}
