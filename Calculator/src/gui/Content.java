package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class Content extends JPanel{
	public static final long serialVersionUID = 253246346;
	Font font = new Font("Monospace", Font.BOLD, 50);
	
	JButton add, subtract, multiply, divide;
	JButton sin, asin, cos, acos, tan, atan;
	JButton pow, nroot, percentage;
	
	public Content() {
		setBackground(new Color(100, 100, 120));
		setLayout(null);

		add(makeButton("+", 20, 20, 50, 50, new Color(220, 100, 100)));
		add(makeButton("-", 20, 90, 50, 50, new Color(220, 100, 100)));
		add(makeButton("x", 90, 20, 50, 50, new Color(220, 100, 100)));
		add(makeButton("÷", 90, 90, 50, 50, new Color(220, 100, 100)));
		add(makeButton("ⁿ√", 20, 160, 100, 100, new Color(100, 100, 220)));
		add(makeButton("%",90, 160 ,50 ,50 , new Color(200 ,120 ,120)));
		add(makeButton("x\u207F", 230, 230, 50, 50, new Color(220 ,100 ,100)));
		add(makeButton("sin", 20, 230, 50, 50, new Color(0,100,0)));
		add(makeButton("cos", 90, 230, 50, 50, new Color(0,100,0)));
		add(makeButton("tan", 160, 230, 50, 50, new Color(0,100,0)));
		add(makeButton("asin", 230, 20, 50, 50, new Color(0,100,0)));
		add(makeButton("acos", 230, 90, 50, 50, new Color(0,100,0)));
		add(makeButton("atan", 230, 160, 50, 50, new Color(0,100,0)));
	}
	
	private JButton makeButton(String text, int x, int y, int width, int height, Color color) {
		JButton b = new JButton(text);
		b.setBounds(x, y, width, height);
		b.setFont(font);
		b.setFocusable(false);
		b.setBackground(color);
		b.setVisible(true);
		b.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.white, Color.gray));
		
		return b;
	}
}
