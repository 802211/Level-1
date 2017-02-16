import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JPanel;

public class MatchingGame implements ActionListener {

	public static void main(String[] args) {
		MatchingGame mg = new MatchingGame();
		mg.set();
	}

	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JButton counter = new JButton();
	String t1 = "";
	String t2 = "";
	int c = 0;

	void set() {

		f.setVisible(true);
		f.setSize(200, 200);
		f.add(p);
		p.setVisible(true);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(counter);
		b1.setText("lion");
		b2.setText("wolf");
		b3.setText("lion");
		b4.setText("wolf");
		counter.setText("" + c);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b1.show(true);
		b2.show(true);
		b3.show(true);
		b4.show(true);
		// p.repaint();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		

		if (e.getSource() instanceof JButton) {
			c = c + 1;
			counter.setText("" + c);
			if (c % 2 == 1) {
			t1 = ((JButton) e.getSource()).getText();
			}	
		
		else if (c%2 == 0) {
			t2 = ((JButton) e.getSource()).getText();
			((JButton) e.getSource()).show(true);
		}

	}}

}