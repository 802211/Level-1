import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FigureOutTheWord implements ActionListener {
	String result = "";
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton submit = new JButton();
	JTextField tf = new JTextField();
	JTextField resulttf = new JTextField();

	public void addButtons() {
		tf.setPreferredSize(new Dimension(100, 23));
		resulttf.setPreferredSize(new Dimension(150, 25));
		f.setVisible(true);
		f.setSize(400, 300);
		f.add(p);
		p.add(b);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(tf);
		p.add(submit);
		p.add(resulttf);
		b.setText("g");
		b1.setText("i");
		b2.setText("s");
		b3.setText("p");
		submit.setText("submit");
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		submit.addActionListener(this);
		resulttf.addActionListener(this);

	}

	public static void main(String[] args) {
		FigureOutTheWord fotw = new FigureOutTheWord();
		fotw.addButtons();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == b) {
			result += b.getText();
			tf.setText(result);
			b.show(false);
		} else if (e.getSource() == b1) {
			result += b1.getText();
			tf.setText(result);
			b1.show(false);
		} else if (e.getSource() == b2) {
			result += b2.getText();
			tf.setText(result);
			b2.show(false);
		} else if (e.getSource() == b3) {
			result += b3.getText();
			tf.setText(result);
			b3.show(false);
			// tf.setText(b3.getText());
		} else if (e.getSource() == submit) {
			if (tf.getText().equals("pigs")) {
				resulttf.setText("Correct!WINNER!!!");
			} else {
				resulttf.setText("Incorrect!LOSER!!!");
				result = "";
				b.show(true);
				b1.show(true);
				b2.show(true);
				b3.show(true);
				f.setSize(500, 500);
			}
		}

	}

}
