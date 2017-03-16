package calculator;

public class Calculator_model {

	String firstNum = "";
	String operator = "";
	String secondNum = "";
	String answer = "";
	boolean operatorPressed;
	boolean clear;

	void addADigit(String num) {

		if (clear == true){
			firstNum = "";
			operator = "";
			secondNum = "";
			answer = "";
			operatorPressed = false;
			clear = false;
		}
		
		if (num.equals("x") || num.equals("-") || num.equals("/") || num.equals("+")) {
			operator = num;
			operatorPressed = true;
		} else if (num.equals("c")) {
			firstNum = "";
			operator = "";
			secondNum = "";
			answer = "";
			operatorPressed = false;
		} else if (num.equals("=")) {
			// answer = firstNum + secondNum;
			performOperation();
			clear = true;
		} else if (operatorPressed == true) {
			secondNum = secondNum + num;
		} else if (operatorPressed == false) {
			firstNum = firstNum + num;
		}
		System.out.println("firstNum " + firstNum);
		System.out.println("secondNum " + secondNum);
		System.out.println("operator " + operator);
	}

	public void performOperation() {
		int a = 0;
			int fn = Integer.parseInt(firstNum);
			int sn = Integer.parseInt(secondNum);
			if (operator.equals("+")) {
				a = fn + sn;
			}
			else if(operator.equals("-")){
				a = fn - sn;
			}
			else if(operator.equals("x")){
				a = fn * sn;
			}
			else if(operator.equals("/")){
		a = fn / sn;	}
			
			answer = "" + a;
	}

	public String getFirstNum() {
		return firstNum;
	}

	public String getOperator() {
		return operator;
	}

	public String getSecondNum() {
		return secondNum;
	}

	public String getAnswer() {
		return answer;
	}
}
