package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;

import math.Difference;
import math.Operator;
import math.Sum;

public class Content extends JPanel{
	public static final long serialVersionUID = 253246346;
	Font font = new Font("Monospace", Font.BOLD, 50);
	
	JButton add, subtract, multiply, divide;
	JButton sin, asin, cos, acos, tan, atan;
	JButton pow, nroot, percentage;
	JTextField output;
	float currentValue = 0;
	
	Stack<Operator> operators;
	
	public Content() {
		setBackground(new Color(100, 100, 120));
		setLayout(null);

		add(makeButton("+", 20, 20, 50, 50, new Color(220, 100, 100), new Sum()));
		add(makeButton("-", 20, 90, 50, 50, new Color(220, 100, 100), new Difference()));
		/*add(makeButton("x", 90, 20, 50, 50, new Color(220, 100, 100)));
		add(makeButton("÷", 90, 90, 50, 50, new Color(220, 100, 100)));
		add(makeButton("ⁿ√", 20, 220, 100, 70, new Color(100, 100, 220)));
		add(makeButton("%",90, 160 ,50 ,50 , new Color(200 ,120 ,120)));
		add(makeButton("x\u207F", 230, 230, 100, 50, new Color(220 ,100 ,100)));
		add(makeButton("sin", 20, 300, 150, 50, new Color(0,100,0)));
		add(makeButton("cos", 20, 370, 150, 50, new Color(0,100,0)));
		add(makeButton("tan", 20, 440, 150, 50, new Color(0,100,0)));
		add(makeButton("asin", 230, 20, 150, 50, new Color(0,100,0)));
		add(makeButton("acos", 230, 90, 150, 50, new Color(0,100,0)));
		add(makeButton("atan", 230, 160, 150, 50, new Color(0,100,0)));*/
		
		output = new JTextField();
		output.setBounds(20, 500, 200, 50);
		output.setText(currentValue + "");
		output.setFont(font);
		output.setEditable(false);
		
		add(output);
		setVisible(true);
	}
	
	/*
	 * Create a JButton with the given text, bounds, and Color
	 * 
	 * @param text the text to display in the button
	 * @param x the x-coordinate of the button 
	 * @param y the y-coordinate of the button
	 * @param width the button width
	 * @param height the button height
	 * @param Color the color of the background
	 */
	private JButton makeButton(String text, int x, int y, int width, int height, Color color, Operator operator) {
		JButton b = new JButton(text);
		b.setBounds(x, y, width, height);
		b.setFont(font);
		b.setFocusable(false);
		b.setBackground(color);
		b.setVisible(true);
		b.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.white, Color.gray));
		b.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						operator.a = currentValue;
						operator.b = 4;
						currentValue = operator.result();
						output.setText(currentValue + "");
					}
				});
		return b;
	}
}
