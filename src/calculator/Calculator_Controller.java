package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Calculator_Controller implements ActionListener {
	
Calculator_View cv;
Calculator_model cm;

Calculator_Controller(Calculator_View cv, Calculator_model cm){
	this.cv = cv;
	this.cm = cm;
	cv.actionlisteners(this);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub

JButton b1 = (JButton)(e.getSource());
	String text = b1.getText();
	System.out.println("buttn pressed "+ text);
	cm.addADigit(text);

	cv.update();

}

}
