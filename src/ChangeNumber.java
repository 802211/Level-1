import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;





public class ChangeNumber implements ActionListener {
	int x = new Random().nextInt(11);
	int y = new Random().nextInt(11);
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JLabel jl = new JLabel();

	
	void Create(){
	JFrame f = new JFrame();
	f.setVisible(true);
	f.setSize(500, 500);
	JPanel p = new JPanel();
	f.add(p);	
	p.add(b1);
	p.add(b2);
	p.add(b3);
	p.add(jl);
	b1.setText("ADD");
	b2.setText("SUB");
	b3.setText("RAND");
	jl.setText("" + x);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	}
	
	
	public static void main(String[] args) {
		ChangeNumber cn = new ChangeNumber();
		cn.Create();
	}
	
 void 	addToX(){
		
	}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if(e.getSource() == b1){
		x = x+1;
		jl.setText("" + x);
	}
	else if(e.getSource() == b2){
		x = x-1;
		jl.setText("" + x);
	}
	else if(e.getSource() == b3){
		x = new Random().nextInt(11);
		jl.setText("" + x);
	}
	
}
	
}
