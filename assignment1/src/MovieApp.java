import java.text.NumberFormat;

public class MovieApp {

	public static void main(String[] args) {
			
		System.out.println("Assignment part 1, late fees for all classes:");
		System.out.println();
		Action a = new Action();
		Comedy c = new Comedy();
		Drama d = new Drama();
		
		int days = 5;
		
		System.out.println("Late fee for " + days + " days for an action movie: $" + a.CalculateLateFees(days));
		System.out.println("Late fee for " + days + " days for a comedy movie: $" + c.CalculateLateFees(days));
		System.out.println("Late fee for " + days + " days for a drama movie: $" + d.CalculateLateFees(days));
		System.out.println();

		System.out.println("Assignment part 2, going through an array of movies and calculating late fee:");
		System.out.println();
		Rental rentals[] = new Rental[3];	
		rentals [0] = new Rental ("R", 7, "The Bourne Ultimatum");
		rentals [1] = new Rental ("R", 4, "Casino Royale");
		rentals [2] = new Rental ("R", 3, "The Avengers");
				
		for(Rental r : rentals){
			if(r.movieTitle == "The Bourne Ultimatum"){
				r.calculateLateFees(a.fee);				}
					
			System.out.println("Late fee for " + days + " days for the movie 'The Bourne Ultimatum' is: " + NumberFormat.getCurrencyInstance().format(r.calculateLateFees(a.fee)));
			break;
			}
		
		System.out.println("Bye!");
	
	}
}
