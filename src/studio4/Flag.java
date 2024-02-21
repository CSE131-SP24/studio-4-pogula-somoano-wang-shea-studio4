package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(0.5, 0.5, 0.41,0.31);
		Color purple = new Color(204,153,255);
		StdDraw.setPenColor(purple);
		StdDraw.filledRectangle(0.5, 0.5, 0.4,0.3);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(0.20, 0.3, 0.1);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(0.80, 0.3, 0.1);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(0.80, 0.7, 0.1);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(0.20, 0.7, 0.1);
		Color pink = new Color(255,0,127);
		StdDraw.setPenColor(pink);
		StdDraw.filledCircle(0.50, 0.5, 0.3);
	}
}