package week2;

import acm.graphics.GOval;
import acm.program.*;
import acm.util.RandomGenerator;

public class RandomCircles extends GraphicsProgram {

	int minRad = 5;
	int maxRad = 50;

	public void run() {
		for (int i = 0; i < 10; i++) {
			drawCircle();
		}
	}

	public void drawCircle() {
		int radius = rgen.nextInt(minRad, maxRad);
		int x = rgen.nextInt(0, getWidth() - radius * 2);
		int y = rgen.nextInt(0, getHeight() - radius * 2);
		GOval circle = new GOval(x, y, radius, radius);
		circle.setFilled(true);
		circle.setColor(rgen.nextColor());
		add(circle);

	}

	public RandomGenerator rgen = RandomGenerator.getInstance();
}
