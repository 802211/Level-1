import javax.swing.JOptionPane;

public class RunnerClassNetflix {

	public static void main(String[] args) {
		Movie a = new Movie ("HarryPotter", 4 );
		Movie b = new Movie ("Starwars I", 2 );
		Movie c = new Movie ("Starwars VII", 5 );
		Movie d = new Movie ("Frozen", -10000000 );
		Movie e = new Movie ("Divergent", 3 );
		
		NetflixQueue z = new NetflixQueue();
	z.addMovie(a);
	z.addMovie(b);		
	z.addMovie(c);
	z.addMovie(d);		
	z.addMovie(e);
	
	z.printMovies();
	System.out.println("the Best movie is"  + z.getBestMovie());
	z.sortMoviesByRating();
	System.out.println("the second Best movie is"  + z.getMovie(1));
	
	
	}}
