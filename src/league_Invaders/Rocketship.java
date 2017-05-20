package league_Invaders;

import java.awt.Graphics;

public class Rocketship extends GameObject {
	int speed;
	boolean up;
	boolean down;
	boolean left;
	boolean right;

	Rocketship(int x, int y, int w, int h) {
		super(x, y, w, h);

		speed = 5;
	}

	void update() {
		super.update();
		if (up) {
			y = y - speed;
		}
		if (down) {
			y = y + speed;
		}
		if (left) {
			x = x - speed;
		}
		if (right) {
			x = x + speed;
		}
	}

	void draw(Graphics g) {
		// g.setColor(Color.BLUE);
		// g.fillRect(x, y, w, h);
		g.drawImage(GamePanel.rocketImg, x, y, w, h, null);

	}

}
