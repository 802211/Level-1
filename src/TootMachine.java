

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TootMachine implements ActionListener {

	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	
	void set(){
		f.add(p);
		f.setSize(100, 200);
		f.setVisible(true);
		p.add(b);
		p.add(b2);
		p.add(b3);
		b.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b.setText("fart");
		b2.setText("long");
		b3.setText("Short");
	}
	
	public static void main(String[] args) {
		 TootMachine t = new TootMachine();
		 t.set();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == b){
			playSound("fart1.wav");
		}
		else if (e.getSource() == b2){
			playSound("fart2.wav");
		}
		else if (e.getSource() == b3){
			playSound("fart3.wav");
		}
		
	}
	
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	
}
