import javax.swing.JOptionPane;

public class Coffee {

	int temp;
	String brewType;
	boolean isDecaf;
	String name;
	
	public static void main(String[] args) {
		Coffee c = new Coffee();
		c.serve("Keith", "chicken");
	}
	
	public Coffee(){
	brewType = "chicken";
	name = "Person";
	} 
	
	void serve(String name, String brewType){
this.name = nam0e;
this.brewType = brewType;

System.out.println(name + "'s " + brewType + " coffee is served.");
		
	}
	
}
