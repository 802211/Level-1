import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JButton ducks = new JButton();
	JButton frog = new JButton();
	JButton fluff = new JButton();
public static void main(String[] args) {
	
	CutenessTV TV = new CutenessTV();
	TV.getTV();
	
}

private void getTV() {
	JFrame frame = new JFrame();
	JPanel pane = new JPanel();
	frame.add(pane);
	frame.setVisible(true);
	frame.setSize(1000, 1000);
	pane.add(ducks);
	pane.add(frog);
	pane.add(fluff);
	ducks.addActionListener(this);
	frog.addActionListener(this);
	fluff.addActionListener(this);
	ducks.setText("Ducks");
	frog.setText("Frogs");
	fluff.setText("Fluffy Unicorns");
}
	
	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}
	
	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
	URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(ducks.getText());
		if(e.getSource() ==(ducks)){
			System.out.println("ducks");
			showDucks();
		}
		else if(e.getSource() == frog){
			showFrog();
		}
		else if(e.getSource() == fluff){
			showFluffyUnicorns();
		}
	
	}


	
	
}
