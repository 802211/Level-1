import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SensitiveKeyboard implements KeyListener {
	
	
	public static void main(String[] args) {
		
		SensitiveKeyboard k = new SensitiveKeyboard();
	k.getkey();
	}

	private void getkey() {
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		f.add(p);
		f.setVisible(true);
		f.setSize(500, 500);
		f.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
			JOptionPane.showMessageDialog(null, "OUCH!!!!!!!!!!!!!!!!!!!!!!!!!");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
