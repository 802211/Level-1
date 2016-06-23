import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
public static void main(String[] args) {

	FortuneCookie one = new FortuneCookie();
	
one.showButton();

	
}
 void showButton(){

//JOptionPane.showMessageDialog(null,"button test");

	 JFrame frame = new JFrame();
JButton a = new JButton();
a.setText("Click to read your fortune.");
frame.setVisible(true);
frame.setSize(1000, 1000);
frame.add(a);
a.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub

JOptionPane.showMessageDialog(null, "You will see your fortune. It was nice knowing you.");
int b = new Random().nextInt(5);
if(b == 0){
	JOptionPane.showMessageDialog(null, "You will live throught the night.");
}
else if(b == 1){
	JOptionPane.showMessageDialog(null, "You will not sleep tonight.");
}
else if(b == 2){
	JOptionPane.showMessageDialog(null, "You will not live throught the night.");
}
else if (b == 3){
	JOptionPane.showMessageDialog(null, "You will sleep tonight.");
}
else if (b == 4){
	JOptionPane.showMessageDialog(null, "You will eat rotton food between now and next month.");
}
}
 
}
