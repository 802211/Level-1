public class Friends {


	public static void main(String[] args){
    	//3. Create an instance of Classmate for each person in your class.
   	 Classmate Haris = new Classmate();
   	Classmate Lucas = new Classmate();
   	Classmate Vish = new Classmate();
   	Classmate David = new Classmate();
   	Classmate Keith = new Classmate();
    	//4. set descriptions for each Classmate
   	 Haris.setDescription("Haris is wearing a black sweatshirt and was late.");
   	Lucas.setDescription("Lucas is very annoying and doesn't read directions carefully.");
   	Vish.setDescription("Vish is wearing a striped shirt and works quickly.");
   	David.setDescription("David is absent.");
   Keith.setDescription("Keith is our wise teacher and likes to toss oranges in the air before dropping one.");
   	 //5. Use your getter to print out each description
   	 System.out.println(Haris.getDescription());
   	 System.out.println(Lucas.getDescription());
   	 System.out.println(Vish.getDescription());
   	 System.out.println(David.getDescription());
   	 System.out.println(Keith.getDescription());
	}





}
class Classmate{
	String description;
    
	//1. create a setter that sets a description for this person
void setDescription(String description){
	this.description = description;
}
	
	//2. create a getter that gets a description of this person
String getDescription(){
	return description;
}
}



