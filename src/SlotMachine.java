import java.util.Random;

import javax.swing.JOptionPane;

public class SlotMachine {
	String Q;
	int rN1;
	int rN2;
	int rN3;
	int money = 500;

	public void howMuchBet() {
		String Q = JOptionPane.showInputDialog("How much do you want to bet?");

	}

	public int winCondition(int[] nums){
		if (nums[0] == 0 && nums[1] == 0 && nums[2] == 0){
		int newQ = Integer.parseInt(Q);
			money = money-newQ;
			JOptionPane.showMessageDialog(null,"Loser! You lost " + Q + " dollars");
		}
		
		return money;
	}
	
	public void play() {
		String p = JOptionPane
				.showInputDialog("Do you want to play slotMachine with " + Q + " of your money? Reply yes or no.");
		if (p.equals("yes")) {
			winCondition(randomNums());
			playAgain();
		} else if (p.equals("no")) {
			howMuchBet();
			play();
		}
	}

	public void playAgain() {
		String pA = JOptionPane.showInputDialog("Would you like to play again? Reply yes or no.");
	if (pA.equals("yes")){
		play();
	}
	else if (pA.equals("no")){
		JOptionPane.showMessageDialog(null, ":(");
	}
	}

	public int[] randomNums() {
		int rN1 = new Random().nextInt(3);
		int rN2 = new Random().nextInt(3);
		int rN3 = new Random().nextInt(3);
		int[] nums = new int[3];
		nums[0] = rN1;
		nums[1] = rN2;
		nums[2] = rN3;
		System.out.println(rN1);
		System.out.println(rN2);
		System.out.println(rN3);

		return nums;

	}

}
