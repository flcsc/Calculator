package gui;

import javax.swing.JFrame;
import java.awt.Color;

public class Window extends JFrame {
	public static final long serialVersionUID = 34098234;
	
	public Window() {
		setTitle("Calculator");
		setBounds(0, 0, 500, 1000);
		setBackground(new Color(100, 100, 120));
		setVisible(true);
	}
}
