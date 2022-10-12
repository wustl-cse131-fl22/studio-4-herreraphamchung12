package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(.5, .5, 0.5, .4);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(.5,.5,.2);
	}
}