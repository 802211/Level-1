package league_Invaders;

import java.awt.Color;
import java.awt.Graphics;

public class Projectiles extends GameObject{

	int speed;

	
	Projectiles(int px, int py, int pw, int ph){
		super(px,py,pw,ph);
		
		speed = 10;
	}
	
	
	void update(){
		super.update();
	y = y - speed;
	if(y < 0){
		isAlive = false;
	}
	}
	
	void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y,w, h);
	}
	
}
