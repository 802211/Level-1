import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RiddleTest implements ActionListener {

	JFrame F = new JFrame();
	JPanel P = new JPanel();
	JLabel L = new JLabel();
	JButton B1 = new JButton();
	JButton B2 = new JButton();
	JTextField TF = new JTextField();
	
	public static void main(String[] args) {
		
		RiddleTest RT1 = new RiddleTest();
		RT1.frame();
		
	}



void frame(){
	
	
	P.add(L);
	P.add(B1);
	P.add(B2);
	P.add(TF);
	F.add(P);
	F.setVisible(true);
	F.setSize(1800, 800);
	L.setText("What gets wetter as it dries?");
	B1.setText("Submit");
	B2.setText("Hint");
	B1.addActionListener(this);
	B2.addActionListener(this);
	
	
}



@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
if (e.getSource() == B1){
	
	
}	
}
if (e.getSource() == B2){
JOptionPane.showMessageDialog(null, " 'Dries' is an action done by the object.");
}}

