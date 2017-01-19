import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Whack_a_mole {
JButton b = new JButton();
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton();
		JButton b5 = new JButton();
		JButton b6 = new JButton();
		JButton b7 = new JButton();
		JButton b8 = new JButton();
		JButton b9 = new JButton();
		JButton b10 = new JButton();
		JButton b11 = new JButton();
		JButton b12 = new JButton();
		JButton b13 = new JButton();
		JButton b14 = new JButton();
		JButton b15 = new JButton();
		JButton b16 = new JButton();
		JButton b17 = new JButton();
		JButton b18 = new JButton();
		JButton b19 = new JButton();
		JButton b20 = new JButton();
		JButton b21 = new JButton();
		JButton b22 = new JButton();
		JButton b23 = new JButton();

	public static void main(String[] args) {
		Whack_a_mole Wam = new Whack_a_mole();
		Wam.drawButton();
		Wam.randomButton();
		Wam.speak("dork");
	}

	public void drawButton(){
		
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		f.setSize(500, 600);
		f.setVisible(true);
		f.add(p);
		//p.setVisible(true);

		
		
		
		p.add(b);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);
		p.add(b11);
		p.add(b12);
		p.add(b13);
		p.add(b14);
		p.add(b15);
		p.add(b16);
		p.add(b17);
		p.add(b18);
		p.add(b19);
		p.add(b20);
		p.add(b21);
		p.add(b22);
		p.add(b23);
	
		f.pack();
		
	}
	
	public void randomButton(){
		
		JButton[] intOfArray = new JButton[24];
	
		intOfArray[0] = b;
		intOfArray[1] = b1;
		intOfArray[2] = b2;
		intOfArray[3] = b3;
		intOfArray[4] = b4;
		intOfArray[5] = b5;
		intOfArray[6] = b6;
		intOfArray[7] = b7;
		intOfArray[8] = b8;
		intOfArray[9] = b9;
		intOfArray[10] = b10;
		intOfArray[11] = b11;
		intOfArray[12] = b12;
		intOfArray[13] = b13;
		intOfArray[14] = b14;
		intOfArray[15] = b15;
		intOfArray[16] = b16;
		intOfArray[17] = b17;
		intOfArray[18] = b18;
		intOfArray[19] = b19;
		intOfArray[20] = b20;
		intOfArray[21] = b21;
		intOfArray[22] = b22;
		intOfArray[23] = b23;
		
		
		int r = new  Random().nextInt(24);
	//	System.out.println(r);
		intOfArray[r].setText("MOLE!!!");
	}
	
	void speak(String words) {
		try {
		Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
		e.printStackTrace();
		}
		}

	
}
