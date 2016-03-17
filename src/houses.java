import java.awt.Color;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class houses {
	public static void main(String[] args) {
		
		Tortoise.show();
		Tortoise.setSpeed(10);
		Tortoise.penUp();
		Tortoise.turn(270);	
		Tortoise.move(300);
		Tortoise.turn(90);
		Tortoise.penDown();
		
		drawHouse("small","blue");
		drawHouse("medium","red");		
		drawHouse("large","green");
		drawHouse("small","yellow");
		drawHouse("medium","orange");
		drawHouse("large","purple");
		drawHouse("small","pink");
		drawHouse("medium", "black");
		
		drawHouse("medium","blue");
		
	}

	private static void drawHouse(String height, String color) {
		int length = 0;
		if(height.equals("small")){
			length = 60;
		}
		else if(height.equals("medium")){
			length = 120;
		}
		else if(height.equals("large")){
			length = 250;
		}
		if (color.equals("blue")){
		Tortoise.setPenColor(Color.BLUE);
		}
		else if(color.equals("red")){
			Tortoise.setPenColor(Color.RED);
		}
		else if(color.equals("green")){
			Tortoise.setPenColor(Color.green);
		}
		else if(color.equals("orange")){
			Tortoise.setPenColor(Color.orange);
		}
		else if(color.equals("yellow")){
			Tortoise.setPenColor(Color.yellow);
		}
		else if(color.equals("purple")){
			Tortoise.setPenColor(Color.MAGENTA);
		}
		else if(color.equals("pink")){
			Tortoise.setPenColor(Color.pink);
		}
		else{
			Tortoise.setPenColor(Color.BLACK);
		}
		Tortoise.move(length);
		Tortoise.turn(45);
		Tortoise.move(45);
		Tortoise.turn(90);
		Tortoise.move(45);
		Tortoise.turn(45);
		Tortoise.move(length);
		Tortoise.turn(270);
		Tortoise.setPenColor(Colors.Greens.Green);
		Tortoise.move(65);
		
		Tortoise.turn(270);
	}
}
