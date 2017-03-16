package calculator;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculator_View {


	
		JFrame f = new JFrame();
		JPanel p = new JPanel();
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
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		JLabel l3 = new JLabel();
		JLabel l4 = new JLabel();
		private Calculator_model cm;
		Calculator_View(Calculator_model cm){
			this.cm = cm;
			add();
			textSet();
		}
		
		void update(){
			l1.setText(cm.getFirstNum());
			l2.setText(cm.getOperator());
			l3.setText(cm.getSecondNum());
			l4.setText(cm.getAnswer());
		}
		
	void add(){
	f.add(p);
	p.add(l1);
	p.add(l2);
	p.add(l3);
	p.add(l4);
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
	
	
	f.setVisible(true);
	f.setSize(500, 500);
	p.setLayout(new GridLayout (5,4));
	}
	Calculator_Controller cc2;
	
	void actionlisteners(Calculator_Controller cc2){
		b1.addActionListener(cc2);
		b2.addActionListener(cc2);
		b3.addActionListener(cc2);
		b4.addActionListener(cc2);
		b5.addActionListener(cc2);
		b6.addActionListener(cc2);
		b7.addActionListener(cc2);
		b8.addActionListener(cc2);
		b9.addActionListener(cc2);
		b10.addActionListener(cc2);
		b11.addActionListener(cc2);
		b12.addActionListener(cc2);
		b13.addActionListener(cc2);
		b14.addActionListener(cc2);
		b15.addActionListener(cc2);
		b16.addActionListener(cc2);
	}
	
	void textSet(){
		b1.setText("7");
		b2.setText("8");
		b3.setText("9");
		b4.setText("/");
		b5.setText("4");
		b6.setText("5");
		b7.setText("6");
		b8.setText("x");
		b9.setText("1");
		b10.setText("2");
		b11.setText("3");
		b12.setText("-");
		b13.setText("0");
		b14.setText("c");
		b15.setText("+");
		b16.setText("=");
		
	}
	
}
