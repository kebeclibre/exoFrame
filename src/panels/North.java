package panels;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class North extends JPanel {
	public North() {
		this.setLayout(new FlowLayout());
		this.add(new JButton("1"));
		this.add(new JButton("2"));
		this.add(new JButton("3"));
	}
}
