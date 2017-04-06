
public class Rocket {
	int fuel;
String name;
	
	public Rocket(int fuel, String name){
		this.fuel = fuel;
		this.name = name;
System.out.println("Constructing Rocket " + name);		
		
	}
	
	void Launch(){
		for (int i = 0; fuel > i; fuel = fuel -1) {
			System.out.println(fuel);
			if(fuel == 1){
				System.out.println("out of fuel");
			}
		}
	}
}
