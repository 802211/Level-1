package league_Invaders;

import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject{


	Alien(int ax, int ay, int aw, int ah){
		super(ax,ay, aw, ah);
		
	}
	
	void update(){
		super.update();
		//System.out.println("UPDATE!");
		y = y + 3;
	}
	void draw(Graphics g){
		g.setColor(Color.yellow);
		g.fillRect(x, y, w, h);

	}
}
