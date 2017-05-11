package league_Invaders;
import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {

	int x;
	int y;
	int w;
	int h;
	boolean isAlive = true;
	Rectangle collisionBox;
	
	GameObject(int x, int y, int w, int h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		collisionBox = new Rectangle(x, y, w, h);

	}

	void update(){
		collisionBox.setBounds(x, y, w, h);
	}
	
	void draw(Graphics g){
	
	}
	
}
