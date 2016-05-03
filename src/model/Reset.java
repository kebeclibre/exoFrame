package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Reset implements ActionListener{
	
	private JLabel target = null;
	private JTextField input = null;
	
	Reset(JTextField field, JLabel target) {
		this.target = target;
		this.input = field;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		target.setText("");
		input.setText("");
		
	}
	 

}
