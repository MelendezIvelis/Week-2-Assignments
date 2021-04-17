package week2;

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class RobotFace extends GraphicsProgram {
	public void run() {

		int screenWidth = getWidth();
		int screenHeight = getHeight();
		int newX = screenWidth / 2 - 50;
		int newY = screenHeight / 2 - 75;
		GRect rect = new GRect(newX, newY, 100, 150);
		rect.setFilled(true);
		rect.setFillColor(Color.GRAY);
		add(rect);

		int newLeftEyeX = screenWidth / 2 - 100 / 4 - 20 / 2;
		int newLeftEyeY = screenHeight / 2 - 150 / 4 - 20 / 2;
		GOval ovalL = new GOval(newLeftEyeX, newLeftEyeY, 20, 20);
		ovalL.setFilled(true);
		ovalL.setColor(Color.YELLOW);
		add(ovalL);

		int newRightEyeX = screenWidth / 2 + 100 / 4 - 20 / 2;
		int newRightEyeY = screenHeight / 2 - 150 / 4 - 20 / 2;
		GOval oval = new GOval(newRightEyeX, newRightEyeY, 20, 20);
		oval.setFilled(true);
		oval.setColor(Color.YELLOW);
		add(oval);

		int newMouthX = screenWidth / 2 - 30;
		int newMouthY = screenHeight / 2 + 10;
		GRect rectM = new GRect(newMouthX, newMouthY, 60, 20);
		rectM.setFilled(true);
		rectM.setColor(Color.WHITE);
		add(rectM);

	}

}
