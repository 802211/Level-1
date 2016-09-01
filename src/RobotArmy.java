import java.util.Random;

public class RobotArmy {
	public static void main(String[] asd){
	
		Random x = new Random();
		int y = x.nextInt(10);
		int z = x.nextInt(10);
		
		//1. create a new human
		Human man = new Human("bob", y); 
		
		
		
		//2. create a new Robot army of good and evil robots.
		Robot a = new Robot("a", true, z);
		
		
		
		
		//3. command your robot army to destroy a human
		a.destroy(man);
		
	}
}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;
	int Strength;
	
	public Human(String name, int Strength){
		this.name = name;
		this.isAlive = true;
		this.Strength = Strength;
	}
	public String getName() {
		return name;
	}
	public void die(){
		isAlive = false;
	}
	public int getStrength() {
		return Strength;
	}
}

/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;
	int Strength;
	
	public Robot(String name, boolean isEvil, int Strength){
		this.name = name;
		this.isEvil = isEvil;
		this.Strength = Strength;
	}
	
	public void destroy(Human man){
		if(Strength > man.getStrength()){
			System.out.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		}
		else if (Strength < man.getStrength()){
			System.out.println("Oh no! The  man "+ man.getName() + " blasted " + name + "'s head off!");
		}
	}
}

