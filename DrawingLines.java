package week2;

import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class DrawingLines extends GraphicsProgram {

	public void run() {
		addMouseListeners();
	}

	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
	    line = new GLine(x, y, x, y);
		add(line);
	}

	public void mouseDragged(MouseEvent e) {
		int x2 = e.getX();
		int y2 = e.getY();
		line.setEndPoint(x2, y2);
	}
	


	private GLine line;
}