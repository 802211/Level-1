import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class X_BugsGridWorld {
	
	public static void main(String[] args) {
		
	

	World two = new World ();
	two.show();
	
/* Bug bug1 = new Bug ();
  Location locBug = new Location (0,0);
	two.add(locBug, bug1);
	Bug bug2 = new Bug ();
	  Location locBug2 = new Location (1,1);
		two.add(locBug2, bug2);
		Bug bug3 = new Bug ();
		  Location locBug3 = new Location (2,2);
			two.add(locBug3, bug3);
Bug bu4 = new Bug ();
			  Location locBug4 = new Location (0,0);
				two.add(locBug4, bug4);
				Bug bug2 = new Bug ();
				  Location locBug2 = new Location (1,1);
					two.add(locBug2, bug2);
					Bug bug3 = new Bug ();
					  Location locBug3 = new Location (2,2);
						two.add(locBug3, bug3);*/
					


	Bug bug1 = new Bug ();
	
	for (int i = 0; i < 10; i++) {
		
			

			  //Location locBug = ;
				two.add(new Location (i,i), bug1);
				
				
			
		}
	
	for (int j = 10; j > 0; j--) {
	
		two.add(new Location (j,j), bug1);
	}
	
	
	
	
	
	
}
}