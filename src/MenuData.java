import javax.swing.JOptionPane;

public class MenuData {

	String menuItem1 = "Pizza";
	String menuItem2 = "Chicken";
	String menuItem3 = "Fried Spider";
	String menuItem4 = "Burrito";
	String menuItem5 = "Steak";
	
	String getMenuItem1(){
		return menuItem1;
	}
	String getMenuItem2(){
		return menuItem2;
	}
	String getMenuItem3(){
		return menuItem3;
	}
	String getMenuItem4(){
		return menuItem4;
	}
	String getMenuItem5(){
		return menuItem5;
	}
/*	if(tf.getText() == "Pizza"){
			JOptionPane.showMessageDialog(null, "Your pizza is served.");
		}*/
	
	void checkMenu (String Order){
	
		if(Order.equals("Pizza")){
			JOptionPane.showMessageDialog(null, "Your pizza is served. Please have $500 ready and $50 tip.");
		}
		else if(Order.equals("Chicken")){
			JOptionPane.showMessageDialog(null, "Your Chicken is served. Please have $550 ready and $50 tip.");
		}
		else if(Order.equals("Fried Spider")){
			JOptionPane.showMessageDialog(null, "Your Fried Spider is served. Please have $900 ready and $50 tip.");
		}
		else if(Order.equals("Burrito")){
			JOptionPane.showMessageDialog(null, "Your Burrito is served. Please have $650 ready and $50 tip.");
		}
		else if(Order.equals("Steak")){
			JOptionPane.showMessageDialog(null, "Your Steak is served. Please have $600 ready and $50 tip.");
		}
		else {
			JOptionPane.showMessageDialog(null, "That item is not on the menu, $1,000 service fee.");
		}
	
	//return Order;	
	}
	
}
