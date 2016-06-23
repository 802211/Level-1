import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	
	JButton b = new JButton();	
	JButton c = new JButton();
	
public static void main(String[] args) {
	
	 ChuckleClicker a = new ChuckleClicker();
	a.makeButtons();

}

void makeButtons(){
	//JOptionPane.showMessageDialog(null, "test button");
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setSize(300, 100);
	JPanel panel = new JPanel();
	frame.add(panel);
	
	b.setSize(100, 40);
	
	c.setSize(150, 40);
	panel.add(b);
	panel.add(c);
	b.setText("Joke");
	c.setText("Punchline");
	b.addActionListener(this);
	c.addActionListener(this);

}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	//JOptionPane.showMessageDialog(null, "hi");
	if(e.getSource() == b){
		JOptionPane.showMessageDialog(null, "What does Homework equal?");
	}
	else if(e.getSource() == c){
		JOptionPane.showMessageDialog(null, "Half Of My Energy Wasted On Random Knowledge");
	}
}}