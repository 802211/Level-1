
	import java.awt.Component;
	import java.awt.event.KeyAdapter;
	import java.awt.event.KeyEvent;
	import java.net.URL;
	import java.util.Date;
	import java.util.HashMap;
	import java.util.Random;
	import javax.swing.Icon;
	import javax.swing.ImageIcon;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import java.io.IOException;
	public class SimonSays extends KeyAdapter {
	 
	 // Complete steps 1 - 7 before you test
	 // 1. Make a JFrame variable 
		 int z ;
		JFrame y;
		int score =0;
	 	HashMap<Integer,String> images = new HashMap<Integer, String>();
	 	private int imageIndex;
	 	private int tries = 0;
	 	private int simonSays = 0;
	 	Date timeAtStart;
	 	private  void makeAlbum() {
	 // 2. add 4 images which match keyboard keys like this: images.put(new Integer(KeyEvent.VK_UP), "image.jpg");
	 		images.put(new Integer(KeyEvent.VK_LEFT), "left arrow 2.png");
			images.put(new Integer(KeyEvent.VK_DOWN), "down arrow 2.png");
			images.put(new Integer(KeyEvent.VK_UP), "up arrow 2.png");
			images.put(new Integer(KeyEvent.VK_RIGHT), "right arrow.png");
	 // 3. Tell the user to "Press the matching key when 'Simon says' otherwise press a different key"
	 JOptionPane.showMessageDialog(null, "Press the matching key when 'Simon says' otherwise press a different key.");
	 // 4. call the method to show an image
showImage();
	 	}
		public void keyPressed(KeyEvent e) {
	    	int keyCode = e.getKeyCode();
	    	// 16. make a points variable to track the score. tell the user their score at the end.
	   
	    	//17. if the keyCode matches the imageIndex and "Simon says..."  increase their score
	    	if (keyCode == imageIndex && z == 1 ){
	    		score++;
	    		speak("Correct!");
	    	}
	    	else if(keyCode != imageIndex && z ==0){
	    		score++;
	    		speak("Correct!");
	    	}
	    	else if(keyCode != imageIndex && z == 1){
	    		speak ("incorrect");
	    	}
	    	else if(keyCode == imageIndex && z == 0){
	    		speak ("incorrect");
	    	}
	    	
	    	//18.   if the keyCode doesn't match the imageIndex and "Simon didn't say..."  increase their score	
	    	//19. Use the speak method to tell the user if they were correct or not
	    	//13. increment tries by 1
	  	int n = 0;
	 n ++;
	    	//14. if tries is greater than 9 (or however many you want)
	    	if (n > 3){
	    		JOptionPane.showMessageDialog(null, score);
	    		System.exit(0);
	    	}
	    	else {}
	    	//15.    	exit the program

	    	//11. dispose of the frame
	    	y.dispose();
	   	
	    	//12. call the method to show an image
	    	showImage();
		System.out.println(score);
		}
		private void showImage() {
	    	//5. initialize your frame to a new JFrame()
		  y = new JFrame();
	    	//6. set the frame to visible
		y.setVisible(true);
	  	 //frame.add(getNextRandomImage()); //7. rename to the name of your frame
	    	y.add(getNextRandomImage());
	    	// 8. set the size of the frame 
	     	y.setSize(100, 100);
	    	// 9. add a key listener to the frame
	     	y.addKeyListener(this);
	   	 //10. Use the speak method to either say "Simon says press this key" or "Press this key"
	    	//Hint: use the simonSays int and a random number
	   z = new Random().nextInt(2);
	   if (z == 1){
		   speak("Simon says press this key.");
	   }
	   else if(z == 0){
		   speak("Press this key.");
	   }
		}
		private Component getNextRandomImage() {
	    	this.imageIndex = new Random().nextInt(4) + 37;
	    	System.out.println(this.imageIndex);
	    	return loadImage(images.get(imageIndex));
		}
		private JLabel loadImage(String fileName) {
	    	URL imageURL = getClass().getResource(fileName);
	    	Icon icon = new ImageIcon(imageURL);
	    	return new JLabel(icon);
		}
	  void speak(String words) {
	  	  try {
	  	   Runtime.getRuntime().exec("say " + words).waitFor();
	  	  } catch (Exception e) {
	  	   e.printStackTrace();
	  	  }
	   	}
		public static void main(String[] args) throws Exception {
		 new SimonSays().makeAlbum();
		}
	}

	/* 
	* 20. add a timer
	* ~~~ where the code starts running ~~~
	* timeAtStart = new Date();
	*
	* ~~~ where the code ends ~~~
	* Date timeAtEnd = new Date();
	* System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);
	* System.exit(0);
	*/



