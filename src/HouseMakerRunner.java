
public class HouseMakerRunner {

	public static void main(String[] args) {
		
		HouseMaker h = new HouseMaker();
		h.SetRobotInCorner();
		for (int i = 0; i < 9; i++) {
		h.DrawHouseWithGrass("large",10,100,52);
		
		}
	}
	
}
