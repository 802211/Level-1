

	import java.awt.Frame;
	import java.util.ArrayList;
	import java.util.Iterator;

	import javax.swing.Icon;
	import javax.swing.ImageIcon;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;

	public class CelebrityGuessingGame {

		// Get 3 celebrity photos from the internet, save them to your computer, and fill
		// in their paths here. To get the path, right click on the image, and copy its Location.
		String firstImage = "/Users/league/Desktop/Einstine 2.jpg";
		String secondImage = "/Users/league/Desktop/WoodieFlowers 2.jpg";
		String thirdImage = "/Users/league/Desktop/Trump 2.jpg";
		String fourthImage = "/Users/league/Desktop/Kamen 2.jpg";
		Frame window = new Frame();
		
		private void startQuiz() {
			// Set the size of the window so that you can only see part of the image.
				window.setSize(90,90);
			// Make an int variable to hold the score.
				int score = 0;
			// Ask the user who this person is and store their answer
				String Answer1 = JOptionPane.showInputDialog("Who is this??? (Last name!! And all Capitals!!!)");
			// If they got the answer right:
			// -- Tell them they are correct.
			// -- Increase the score by 1
				if (Answer1.equals("EINSTINE")){
					JOptionPane.showMessageDialog(null,"Correct!");
					
					score+=1;
					JOptionPane.showMessageDialog(null,score);
		
				}
				else {
					JOptionPane.showMessageDialog(null,"INCORRECT!!!!!!!!!!!!!");
					score+=0;
					JOptionPane.showMessageDialog(null,score);
				}
			// Otherwise:
			// -- Tell them they are wrong

			// Use the method below to show the next image
			// Show the score
			// .... repeat for all your images.....
				
				showNextImage();
				window.setSize(200, 200);
				String Answer2 = JOptionPane.showInputDialog("Who is this??? (Last name!! And all Capitals!!!)");
				if(Answer2.equals("FLOWERS")){
					JOptionPane.showMessageDialog(null,"Correct!");
					score+=1;
					JOptionPane.showMessageDialog(null,score)		;	
			
					
				}
				else {
					JOptionPane.showMessageDialog(null,"INCORRECT!!!!!!!!!!!!!");
					score+=0;
					JOptionPane.showMessageDialog(null,score);
				}
				showNextImage();
				window.setSize(100,100);
				String Answer3 = JOptionPane.showInputDialog("Who is this??? (Last name!! And all Capitals!!!)");
				if(Answer3.equals("TRUMP")){
					JOptionPane.showMessageDialog(null,"Correct!");
					
					score+=1;
					JOptionPane.showMessageDialog(null, score);
				
				}
				else {
					JOptionPane.showMessageDialog(null,"INCORRECT!!!!!!!!!!!!!");
					score+=0;
					JOptionPane.showMessageDialog(null,score);
				}
				showNextImage();
				window.setSize(200, 200);
				String Answer4 = JOptionPane.showInputDialog("Who is this??? (Last name!! And all Capitals!!!)");
				if(Answer4.equals("KAMEN")){
					JOptionPane.showMessageDialog(null,"Correct!");
					score+=1;
					JOptionPane.showMessageDialog(null,score)		;	
			
					
				}
				else {
					JOptionPane.showMessageDialog(null,"INCORRECT!!!!!!!!!!!!!");
					score+=0;
					JOptionPane.showMessageDialog(null,score);
					}
		}
		

		public void showNextImage() {
			window.removeAll();
			window.add(getNextImage());
			window.pack();
		}

		public static void main(String[] args) {
			CelebrityGuessingGame quiz = new CelebrityGuessingGame();
			quiz.initializeGui();
			quiz.startQuiz();
		}

		private void initializeGui() {
			initializeImageList();
			imageIterator = imageList.iterator();
			window.setVisible(true);
			showNextImage();
		}

		private JLabel loadImage(String fileName) {
			Icon icon = new ImageIcon(fileName);
			JLabel image = new JLabel(icon);
			return image;
		}

		ArrayList<JLabel> imageList = new ArrayList<JLabel>();
		Iterator<JLabel> imageIterator;

		private void initializeImageList() {
			JLabel imageLabel = loadImage(firstImage);
			imageList.add(imageLabel);
			imageLabel = loadImage(secondImage);
			imageList.add(imageLabel);
			imageLabel = loadImage(thirdImage);
			imageList.add(imageLabel);
		}

		private JLabel getNextImage() {
			if (imageIterator.hasNext())
				return imageIterator.next();
			window.dispose();
			return new JLabel();
		}
	}



