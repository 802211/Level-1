import javax.swing.JOptionPane;

public class MethodMaker {
	void go() {
		// 2. Call the method created in step 1

		userRocks();
		
		// 4. Call the method you created in step 3 with an int parameter that
		// tells
		// how old you will be by the end of this year

		age(12);
		
		// 6. Call the method created in step 5 with a String and an int
		// parameter

		print("chicken", 52);
		
		// 8. Call the method created in step 7 with 2 integers, multiply these
		// numbers and display the result.
		multiply(5,3);
	}

	// 1. Create a method that asks the user's name and says they ROCK!
	// Hint: void yourMethodName() {
	// }
	void userRocks() {

		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, name + " rocks!");

	}

	// 3. Create a method that has an int parameter for how old you will be by
	// the end of this year,
	// and creates a pop-up that tells you what year you were born.
	// Hint: void yourMethodName(int age) {
	// }

	void age(int age){
		int yrBornIn = 2017 - age;
		JOptionPane.showMessageDialog(null, "You were born in " + yrBornIn);
	}
	
	// 5. Create a method with a String parameter and an int parameter
	// "numTimes" which
	// prints the String parameter "numTimes".
	// No more hints for creating methods!
	// Copy what you did in steps 1 & 3, but with different parameter types.
	void print(String word, int times){
		for (int i = 0; i < times; i++) {
			System.out.println(word);
		}
	}
	// 7. Create a method that multiplies 2 numbers that are passed in as
	// parameters
	// and displays the results in a pop-up.
	
	void multiply(int num1, int num2){
	//	int num1 = JOptionPane.showInputDialog("pick a number");
		int answer = num1 * num2;
		JOptionPane.showMessageDialog(null, answer + " ");
	}

	public static void main(String[] args) {
		new MethodMaker().go();
	}
}
