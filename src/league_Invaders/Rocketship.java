package league_Invaders;

import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	int speed;
	boolean up;
	boolean down;
	boolean left;
	boolean right;

	Rocketship(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		speed = 5;
	}

	void update() {
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
		g.setColor(Color.BLUE);
		g.fillRect(x, y, w, h);

	}

}
