package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Competition implements ActionListener {
String comp1;
String comp2;
	String Chloe = "Chloe";
	String Lucas = "Lucas";
	String Olivia = "Olivia";
	String Tina = "Tina";
	String Vish = "Vish";
	String David = "David";
	int r;
	int r2 = new Random().nextInt(1);
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JLabel q = new JLabel();
	JLabel score = new JLabel();
	JButton start = new JButton();
	JButton event = new JButton();
	JButton event2 = new JButton();
	JButton com = new JButton();
	JButton com2 = new JButton();
	JLabel result = new JLabel();
	JLabel correct = new JLabel();
	
	public static void main(String[] args) {
		Competition c = new Competition();
		c.set();
c.names();
	}
	
	public void set(){
		f.add(p);
		f.setVisible(true);
		f.setSize(500, 500);
		p.add(score);
		p.add(start);
		p.add(correct);
		p.add(event);
		p.add(result);
		p.add(event2);
		p.add(q);
		p.add(com);
		p.add(com2);
		com.setVisible(false);
		com2.setVisible(false);
		event.setText("Fastest to eat 10 fried spiders.");
		event2.setText("Fastest 5 mile runner.");
		event2.setVisible(false);
		event.setVisible(false);
		event2.addActionListener(this);
		event.addActionListener(this);
	 	start.setText("Start Competition");
	 	start.addActionListener(this);
	 	q.setText("Who will win?");
	 	q.setVisible(false);
	 	result.setVisible(false);
	 	com.addActionListener(this);
	 	com2.addActionListener(this);
			}


	
	public void names(){
		int r = new Random().nextInt(14);
		if(r == 0){
			comp1 = Chloe;
			comp2 = Lucas;
		}
		else if(r == 1){
			comp1 = Chloe;
			comp2 = Olivia;
		}
		else if(r == 2){
			comp1 = Chloe;
			comp2 = Tina; 
			
		}
		else if(r == 3){
			comp1 = Chloe;
			comp2 = Vish;
			
		}
		else if(r == 4){
			comp1 = Chloe;
			comp2 = David;
		
		}
		else if(r == 5){
			comp1 = Lucas;
			comp2 = Olivia;
		
		}
		else if(r == 6){
			comp1 = Lucas;
			comp2 = Tina; 
			
		}
		else if(r == 7){
			comp1 = Lucas;
			comp2 = Vish;
			
		}
		else if(r == 8){
			comp1 = Lucas;
			comp2 = David;
			
		}
		else if(r == 9){
			comp1 = Olivia;
			comp2 = Vish;
			
		}
		else if(r == 10){
			comp1 = Olivia;
			comp2 = Tina;
			
		}
		else if(r == 11){
			comp1 = Olivia;
			comp2 = David;
		
		}
		else if(r == 12){
			comp1 = Tina; 
			comp2 = Vish;
			
		}
		else if(r == 13){
			comp1 = Tina; 
			comp2 = David;

		}
		else if(r == 14){
			comp1 = Vish;
			comp2 = David;
		
		
		}

		
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if ((JButton)e.getSource() == start){
			start.setVisible(false);
			event.setVisible(true);
			q.setVisible(true);
			com.setText(comp1);
			com2.setText(comp2);
			com.setVisible(true);
			com2.setVisible(true);
		}
		else if ((JButton) e.getSource() == com2 && r2 == 1){
			q.setVisible(false);
				result.setVisible(true);
				result.setText("The winner is . . . " + comp2);
		}
		else if ((JButton) e.getSource() == com2 && r2 == 0){
			q.setVisible(false);
			result.setVisible(true);
			result.setText("The winner is . . . " + comp1);
		}
		else if ((JButton) e.getSource() == com && r2 == 1){
			q.setVisible(false);
			result.setVisible(true);
			result.setText("The winner is . . . " + comp2);
		}
		else if ((JButton) e.getSource() == com && r2 == 0){
			q.setVisible(false);
			result.setVisible(true);
			result.setText("The winner is . . . " + comp1);		}
		
	if((JButton) e.getSource() == event && r2 == 1){
		event.setVisible(false);
		event2.setVisible(true);
		result.setVisible(true);
		result.setText("The winner is . . . " + comp2);
	}
	
	
	}
}
