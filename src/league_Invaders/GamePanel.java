package league_Invaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer t;
	Font titleFont;
	Font start;
	Font instructions;
	Rocketship r = new Rocketship(250, 700, 50, 50);

	GamePanel() {
		t = new Timer(1000 / 60, this);
		// go = new GameObject();
		titleFont = new Font("Arial", Font.PLAIN, 48);
		start = new Font("Arial", Font.PLAIN, 25);
		instructions = new Font("Arial", Font.PLAIN, 25);
	}

	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;

	void updateMenuState() {

	}

	void updateGameState() {
		r.update();
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
		r.draw(g);
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);

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
		System.out.println("hi pressed");
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			currentState = currentState + 1;
			if (currentState > END_STATE) {
				currentState = MENU_STATE;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_UP){
			r.up = true;
		//	System.out.println("up");
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN){
			r.down = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT){
			r.left = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT){
			r.right = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hi released");
	}

}
