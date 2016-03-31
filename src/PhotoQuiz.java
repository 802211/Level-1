
// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the
		// image, and select “Copy Image URL”)
		String Bella = "http://vignette2.wikia.nocookie.net/twilightsaga/images/a/a4/Bella-306318_429619423747956_93621998_n.jpg/revision/latest?cb=20130824013830";
		// 2. create a variable of type "Component" that will hold your image
		Component cullen1;
		// 3. use the "createImage()" method below to initialize your Component
		cullen1 = createImage(Bella);
		// 4. add the image to the quiz window
		quizWindow.add(cullen1);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String BellaName = JOptionPane.showInputDialog("Who is this?");
		// 7. print "CORRECT" if the user gave the right answer

		if (BellaName.equals("Bella")) {
			JOptionPane.showMessageDialog(null, "CORRECT!!!!!!");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT!!!!!!!!!!!!!");
		}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(cullen1);
		// 10. find another image and create it (might take more than one line of code)
		String Wolf = "http://eileenrockefeller.com/wp-content/uploads/2013/10/Two-Wolves-Oct-29-2013-2.jpg";
		Component wolf;
		wolf = createImage(Wolf);

		// 11. add the second image to the quiz window
		quizWindow.add(wolf);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String creature = JOptionPane.showInputDialog("Is this animal dangerous and scary?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (creature.equals("no")) {
			JOptionPane.showMessageDialog(null, "CORRECT!!!!!!!");
		} else if (creature.equals("yes")) {
			JOptionPane.showMessageDialog(null, "INCORRECT!!!!!! (I don't like you!)");
		} else {
			JOptionPane.showMessageDialog(null, "I Don't like your answer.");
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener())

}
