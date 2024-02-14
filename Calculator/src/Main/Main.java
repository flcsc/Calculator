package Main;

import gui.Window;
import math.Sum;

public class Main {
	public static void main(String[] args) {
		Window window = new Window();
		Sum x = new Sum(13, 5);
		System.out.println(x.result());
		while (window.isActive()) {}
	}
}
