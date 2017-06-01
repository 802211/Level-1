package league_Invaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

import javazoom.jl.player.advanced.AdvancedPlayer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer t;
	Font titleFont;
	Font start;
	Font instructions;
	Font gameOver;
	Font score;
	int finalScore;
	int specialPower;
	public static BufferedImage alienImg;
	public static BufferedImage rocketImg;
	public static BufferedImage bulletImg;
	Song S2 = new Song("ding.mp3");
	Song S1 = new Song("longLazer.mp3");

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
		finalScore = om.getScore();
		finalScore = finalScore - specialPower;

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
		g.drawString("Press SPACE to fire", 115, 400);
		g.setFont(instructions);
		g.setColor(Color.WHITE);
		g.drawString("Press d to fire to make game easier", 50, 500);
		g.setColor(Color.WHITE);
		g.setFont(instructions);
		g.drawString("Game will become harder as you keep dying.", 0, 600);
		g.setFont(instructions);
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
			S2.play();
			om.addObject(new Projectiles(r.x + 22, r.y + 22, 10, 10));
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			S1.play();
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
			specialPower = specialPower + 1;
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

	class Song {

		private int duration;
		private String songAddress;
		private AdvancedPlayer mp3Player;
		private InputStream songStream;

		/**
		 * Songs can be constructed from files on your computer or Internet
		 * addresses.
		 * 
		 * Examples: <code> 
		 * 		new Song("everywhere.mp3"); 	//from default package 
		 * 		new Song("/Users/joonspoon/music/Vampire Weekend - Modern Vampires of the City/03 Step.mp3"); 
		 * 		new	Song("http://freedownloads.last.fm/download/569264057/Get%2BGot.mp3"); 
		 * </code>
		 */
		public Song(String songAddress) {
			this.songAddress = songAddress;
		}

		public void play() {
			loadFile();
			if (songStream != null) {
				loadPlayer();
				startSong();
			} else
				System.err.println("Unable to load file: " + songAddress);
		}

		public void setDuration(int seconds) {
			this.duration = seconds * 100;
		}

		public void stop() {
			if (mp3Player != null)
				mp3Player.close();
		}

		private void startSong() {
			Thread t = new Thread() {
				public void run() {
					try {
						if (duration > 0)
							mp3Player.play(duration);
						else
							mp3Player.play();
					} catch (Exception e) {
						System.out.println("start song fail");
					}
				}
			};
			t.start();
		}

		private void loadPlayer() {
			try {
				this.mp3Player = new AdvancedPlayer(songStream);
			} catch (Exception e) {
				System.out.println("loadPlayer fail");
			}
		}

		private void loadFile() {
			if (songAddress.contains("http"))
				this.songStream = loadStreamFromInternet();
			else
				this.songStream = loadStreamFromComputer();
		}

		private InputStream loadStreamFromInternet() {
			try {
				return new URL(songAddress).openStream();
			} catch (Exception e) {
				System.out.println("loadStreamfromInternet");
				return null;

			}
		}

		private InputStream loadStreamFromComputer() {
			try {
				return new FileInputStream(songAddress);
			} catch (FileNotFoundException e) {
				System.out.println("should be called- loadStreamFromComputer");
				return this.getClass().getResourceAsStream(songAddress);
			}
		}
	}
}