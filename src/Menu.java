import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Menu {

	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton();
	JLabel Item1 = new JLabel();
	JLabel Item2 = new JLabel();
	JLabel Item3 = new JLabel();
	JLabel Item4 = new JLabel();
	JLabel Item5 = new JLabel();
	JTextField tf = new JTextField(20);

	public Menu() {
		f.setVisible(true);
		f.setSize(500, 500);
		f.add(p);
		p.add(b);
		p.add(Item1);
		p.add(Item2);
		p.add(Item3);
		p.add(Item4);
		p.add(Item5);
		p.add(tf);
		b.setText("done");
	}

	void pack(){
	f.pack();
	}
	
	void setItem1(String menuItem1){
		Item1.setText(menuItem1);
	}
	void setItem2(String menuItem2){
		Item2.setText(menuItem2);
	}
	void setItem3(String menuItem3){
		Item3.setText(menuItem3);
	}
	void setItem4(String menuItem4){
		Item4.setText(menuItem4);
	}
	void setItem5(String menuItem5){
		Item5.setText(menuItem5);
	}
	
	void addListener(ActionListener controller){
		b.addActionListener(controller);
		
	}
	
}
