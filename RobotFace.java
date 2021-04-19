package week2;

import acm.program.GraphicsProgram;
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class RobotFace extends GraphicsProgram {

	public void run() {
		int x = (getWidth() - HEAD_WIDTH) / 2;
		int y = (getHeight() - HEAD_HEIGHT) / 2;
		GRect head = new GRect(x, y, HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled(true);
		head.setColor(Color.GRAY);
		add(head);
		
		double a1 = (getWidth()/2) - (HEAD_WIDTH/4) - EYE_RADIUS; 
		double b1 = y + y*.25 + EYE_RADIUS; 
		GOval eyeLeft = new GOval(a1, b1, EYE_RADIUS, EYE_RADIUS);
		eyeLeft.setFilled(true);
		eyeLeft.setFillColor(Color.YELLOW);
		add(eyeLeft);
		
		double a2 = (getWidth()/2) + (HEAD_WIDTH/4); 
		double b2 = y + y*.25 + EYE_RADIUS; 
		GOval eyeRight = new GOval(a2, b2, EYE_RADIUS, EYE_RADIUS);
		eyeRight.setFilled(true);
		eyeRight.setFillColor(Color.YELLOW);
		add(eyeRight);
		
		double c = (x + HEAD_WIDTH/6);
		double d = y + 318.75 ;
		GRect mouth = new GRect(c, d, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setFillColor(Color.WHITE);
		add(mouth);
	}

	private static final int HEAD_WIDTH =  250;
	private static final int HEAD_HEIGHT =  425;
	private static final int EYE_RADIUS =  HEAD_WIDTH / 5;
	private static final int MOUTH_WIDTH = 175;
	private static final int MOUTH_HEIGHT = 50;
}
