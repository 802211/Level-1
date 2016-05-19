
import java.util.Random;

import javax.swing.JFrame;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "http://yexplore.travel/wp-content/uploads/2013/03/910.jpg";
		// 1. Create a frame & make it visible
		JFrame Turtles = new JFrame();
		Turtles.setVisible(true);
		Turtles.setSize(1000, 1000);
		// 2. Add the panel to the frame
		Turtles.add(panel);
		// 3. Set the background image of the panel to the Galapagos Islands
		panel.setBackgroundImage(galapagosIslands);
		// 4. Instantiate a Turtle
		for (int i = 0; i < 5100; i++) {
			int x = new Random().nextInt(1001);
			int y = new Random().nextInt(1001);
			Turtle turtle = new Turtle();
			panel.addTurtle(turtle);
			turtle.setX(x);
			turtle.setY(y);
		}

		// 5. Add the turtle to the panel

		// 6. Put 50 Turtles on the beach

	}
}
