package league_Invaders;
import javax.swing.JFrame;

public class LeagueInvaders {

	LeagueInvaders(){
		f.setSize(WIDTH, HEIGHT);
		gp = new GamePanel();
		setup();
	}
	
	public static void main(String[] args) {
		LeagueInvaders LI = new LeagueInvaders();
		//LI.setup();
	}
	
	JFrame f = new JFrame();
	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;
	GamePanel gp;
	
	void setup() {
		f.add(gp);
	
		f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

gp.startGame();
	f.addKeyListener(gp);
	}
	
}
