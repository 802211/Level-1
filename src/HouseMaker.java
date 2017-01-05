import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class HouseMaker {

	Robot r2d2 = new Robot();
	
	
public void SetRobotInCorner(){
r2d2.setX(50);	
	r2d2.setY(850);
}
int height;
int a;
int b;
int c;
public void DrawHouseWithGrass(String heightS,int c1,int c2,int c3){
	r2d2.penDown();
	r2d2.setPenColor(c1,c2,c3);
	r2d2.setSpeed(9);
	if (heightS.equals("small")){
		height = 60;
		a = 45;
		b = 25;
		c = 90;
		drawPointyRoof();
	}
	else if (heightS.equals("medium")){
		height = 120;
		a = 45;
		b = 25;
		c = 90;
		drawPointyRoof();
	}
	else if (heightS.equals("large")){
		height = 250;
		a = 90;
		b = 18;
		c = 0;
		drawFlatRoof();
	}
	/*r2d2.penDown();
	r2d2.setPenColor(c1,c2,c3);
	r2d2.setSpeed(9);
	*/
	/*
	r2d2.move(height);
	r2d2.turn(a);
	r2d2.move(b);
	r2d2.turn(c);
	r2d2.move(b);
	r2d2.turn(a);
	r2d2.move(height);
	r2d2.turn(-90);
	r2d2.setPenColor(Color.GREEN);
	r2d2.move(50);
	r2d2.turn(-90);
	//r2d2.
	*/
}
public void drawPointyRoof() {
	r2d2.move(height);
	r2d2.turn(45);
	r2d2.move(25);
	r2d2.turn(90);
	r2d2.move(25);
	r2d2.turn(45);
	r2d2.move(height);
	r2d2.turn(-90);
	r2d2.setPenColor(Color.GREEN);
	r2d2.move(50);
	r2d2.turn(-90);
	
	
}

public void drawFlatRoof() {
	
	r2d2.move(height);
	r2d2.turn(90);
	r2d2.move(35);
	r2d2.turn(90);
	r2d2.move(height);
	r2d2.turn(-90);
	r2d2.setPenColor(Color.GREEN);
	r2d2.move(50);
	r2d2.turn(-90);
	
}




}