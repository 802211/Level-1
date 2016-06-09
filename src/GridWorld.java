import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
public static void main(String[] args) {
	
World one = new World ();
	one.show();
	
 Bug bug1 = new Bug ();
  Location locBug = new Location (5,5);
	one.add(locBug, bug1);
	
	Bug bug2 = new Bug ();
	  Location locBug2 = new Location (6,8);
		bug2.setColor(Color.BLUE);  
		bug2.turn();
		bug2.turn();
		one.add(locBug2, bug2);
		
		Flower f7 = new Flower ();
		Location Lf7 = new Location (6,7);
		one.add(Lf7, f7);
		Flower f9 = new Flower ();
		Location Lf9 = new Location (6,9);
		one.add(Lf9, f9);
	
		//Flower a1 = new Flower ();
		//Location La1 = new Location (1,1);
		//one.add(La1, a1);
		/*Flower a2 = new Flower ();
		Location La2 = new Location (1,2);
		one.add(La2, a2);
		Flower a3 = new Flower ();
		Location La3 = new Location (1,3);
		one.add(La3, a3);
		Flower a4 = new Flower ();
		Location La4 = new Location (1,4);
		one.add(La4, a4);
		Flower a5 = new Flower ();
		Location La5 = new Location (1,5);
		one.add(La5, a5);
	*/
		for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10; j++) {
		if (i%2 == 1){
			
		Flower a1 = new Flower ();
		Location La1 = new Location (i,j);
		a1.setColor(Color.red);
		one.add(La1, a1);
		}
		if (i%2 == 0){
			
			Flower a2 = new Flower ();
			Location La2 = new Location (i,j);
			a2.setColor(Color.white);
			one.add(La2, a2);
		}}
	
					}
		}
		
	
	
}
