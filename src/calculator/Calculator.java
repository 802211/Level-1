package calculator;

public class Calculator {

	
	
	public static void main(String[] args) {
	
		Calculator_model cm = new Calculator_model();
		Calculator_View cv = new Calculator_View(cm);
		Calculator_Controller cc = new Calculator_Controller(cv,cm);
		
		
		
		//Calculator c = new Calculator();
	}
	/*
	void create(){
		JFrame f = new JFrame();
		JButton b9 = new JFrame
		
	}
	*/
	
	
	
}
