import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld2 {
public static void main(String[] args) {
	//SmileyFace();
	Checkers();
	
}

static void Checkers(){
	
	World w2 = new World();
	
//	int z = 1;
	BoundedGrid bg = new BoundedGrid(10,10);
	w2.setGrid(bg);
	w2.show();

	for (int a = 0; a < 10; a=a+2) {
		
	
for (int i = 0; i < 10; i++) {
if(i%2 == 0){
	Flower flo = new Flower();
	Location loc = new Location (i,a);
	w2.add(loc, flo);
}
}	}
}

static void SmileyFace(){
	World w = new World();
	w.show();
Location l = new Location(5,7);
Bug b = new Bug();
w.add(l, b);
Location l2 = new Location(6,6);
Bug b2 = new Bug();
w.add(l2, b2);
Location l3 = new Location(7,5);
Bug b3 = new Bug();
w.add(l3, b3);
Location l4 = new Location(7,4);
Bug b4 = new Bug();
w.add(l4, b4);
Location l5 = new Location(6,3);
Bug b5 = new Bug();
w.add(l5, b5);
Location l6 = new Location(5,2);
Bug b6 = new Bug();
w.add(l6, b6);
Location l7 = new Location(5,3);
Bug b7 = new Bug();
w.add(l7, b7);
Location l8 = new Location(5,4);
Bug b8 = new Bug();
w.add(l8, b8);
Location l9 = new Location(5,5);
Bug b9 = new Bug();
w.add(l9, b9);
Location l10 = new Location(5,6);
Bug b10 = new Bug();
w.add(l10, b10);
Location la = new Location(2,3);
Flower f1 = new Flower();
w.add(la,f1);
Location lb = new Location(3,3);
Flower fb = new Flower();
w.add(lb,fb);
Location lc = new Location(2,6);
Flower fc = new Flower();
w.add(lc,fc);
Location ld = new Location(3,6);
Flower fd = new Flower();
w.add(ld,fd);
}
}