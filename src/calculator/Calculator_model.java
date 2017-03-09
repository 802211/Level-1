package calculator;

public class Calculator_model {

	String firstNum = "";
	String operator;
	String secondNum = "";
	int answer;
	boolean operatorPressed;
	
	void addADigit(String num){
	
		System.out.println("firstNum " + firstNum);
		System.out.println("secondNum " + secondNum);
		System.out.println("operator " + operator);
		if(num.equals ("x") || num.equals("-") || num.equals("/") || num.equals("+")){
			operator = num;
			operatorPressed = true;
					}
		else if(operatorPressed = false){
				firstNum = firstNum + num;
		}
	}
	
}
