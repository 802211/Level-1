import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController implements ActionListener{

	Menu m;
	MenuData md;
	
	MenuController(Menu m, MenuData md){
		this.m = m;
		this.md = md;
		setup();
		m.addListener(this);
		}
	
	void setup(){
		
		
		String item1= md.getMenuItem1();
		m.setItem1(item1);
		
		String item2= md.getMenuItem2();
		m.setItem2(item2);
		
		String item3= md.getMenuItem3();
		m.setItem3(item3);
		
		String item4= md.getMenuItem4();
		m.setItem4(item4);
		
		String item5= md.getMenuItem5();
		m.setItem5(item5);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		
	}
	
}
