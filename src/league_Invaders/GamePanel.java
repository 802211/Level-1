package league_Invaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer t;
	Font titleFont;
	Font start;
	Font instructions;
	Font gameOver;
	Font score;
	public static BufferedImage alienImg;
	public static BufferedImage rocketImg;
	public static BufferedImage bulletImg;

	Rocketship r = new Rocketship(250, 700, 50, 50);
	ObjectManager om = new ObjectManager();

	GamePanel() {
		t = new Timer(1000 / 60, this);
		// go = new GameObject();
		titleFont = new Font("Arial", Font.PLAIN, 48);
		start = new Font("Arial", Font.PLAIN, 25);
		instructions = new Font("Arial", Font.PLAIN, 25);
		gameOver = new Font("Arial", Font.BOLD, 48);
		score = new Font("Arial", Font.PLAIN, 25);
		om.addObject(r);
		try {
			alienImg = ImageIO.read(this.getClass().getResourceAsStream("alien.png"));
			rocketImg = ImageIO.read(this.getClass().getResourceAsStream("rocket.png"));
			bulletImg = ImageIO.read(this.getClass().getResourceAsStream("bullet.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;

	void updateMenuState() {

	}

	void updateGameState() {
		om.update();
		om.manageEnemies();
		om.checkCollision();
		if (r.isAlive == false) {
			currentState = END_STATE;
			om.reset();
			System.out.println("hi");
			r = new Rocketship(250, 700, 50, 50);
			om.addObject(r);
		}
		om.getScore();

	}

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.yellow);
		g.drawString("LEAGUE INVADERS", 20, 200);
		g.setFont(start);
		g.setColor(Color.WHITE);
		g.drawString("Press ENTER to start", 115, 300);
		g.setFont(instructions);
		g.setColor(Color.WHITE);
		g.drawString("Press SPACE for instructions", 75, 400);
	}

	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		om.draw(g);
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setColor(Color.yellow);
		g.setFont(gameOver);
		g.drawString("GAME OVER", 100, 300);
		g.setColor(Color.yellow);
		g.setFont(score);
		g.drawString("" + om.getScore() + " aliens killed", 180, 400);
	}

	void startGame() {
		t.start();
	}

	public void paintComponent(Graphics g) {
		// go.draw(g);
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		// go.update();
		repaint();

		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hi typed");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("hi pressed");
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			currentState = currentState + 1;
			if (currentState > END_STATE) {
				currentState = MENU_STATE;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			r.up = true;
			// System.out.println("up");
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			r.down = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			r.left = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			r.right = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			/* Projectiles p = new Projectiles(r.x, r.y, 10, 10); */
			om.addObject(new Projectiles(r.x + 22, r.y + 22, 10, 10));
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			om.addObject(new Projectiles(r.x, r.y + 22, 10, 10));
			om.addObject(new Projectiles(r.x + 10, r.y + 22, 10, 10));
			om.addObject(new Projectiles(r.x + 20, r.y + 22, 10, 10));
			om.addObject(new Projectiles(r.x + 30, r.y + 22, 10, 10));
			om.addObject(new Projectiles(r.x + 40, r.y + 22, 10, 10));
			om.addObject(new Projectiles(r.x + 50, r.y + 22, 10, 10));
			om.addObject(new Projectiles(r.x + 60, r.y + 22, 10, 10));
			om.addObject(new Projectiles(r.x + 70, r.y + 22, 10, 10));
			om.addObject(new Projectiles(r.x + 80, r.y + 22, 10, 10));
			om.addObject(new Projectiles(r.x + 90, r.y + 22, 10, 10));
			om.addObject(new Projectiles(r.x + 100, r.y + 22, 10, 10));
			om.addObject(new Projectiles(r.x + 110, r.y + 22, 10, 10));
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("hi released");
		r.up = false;
		r.down = false;
		r.left = false;
		r.right = false;
	}

}
