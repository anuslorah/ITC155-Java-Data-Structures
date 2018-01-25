//Anu Slorah
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MovieRatingsApp {

	public static void main(String[] args) {

		HashMap<String, RatingStats> ratings = new HashMap<String, RatingStats>();
		
		try {
			//access file
			Scanner inputStream = new Scanner(new FileInputStream("ratings.txt"));
			
			//get number of ratings
			int numRatings = 0;
			String line = inputStream.nextLine();
			numRatings = Integer.parseInt(line);
			
			//read movie title and rating
			for (int i = 0; i < numRatings; i++){
				String movieName = inputStream.nextLine();
				line = inputStream.nextLine();
				int rating = Integer.parseInt(line);
				
				//add movies to hashmap
				if(!ratings.containsKey(movieName)){
					RatingStats rs = new RatingStats();
					rs.addRating(rating);
					ratings.put(movieName, rs);
				}
				else{
					RatingStats rs = ratings.get(movieName);
					rs.addRating(rating);
				}
			}
			inputStream.close();
		}
		catch(FileNotFoundException e){
			System.out.println("File not found or it is not possible to open it.");
		}
		catch(IOException e){
			System.out.println("Error reading from file.");
		}
		//iterate through hashmap
		Set<String> movies = ratings.keySet();
		for(String m : movies){
			RatingStats rs = ratings.get(m);
			double avg = Math.round(rs.getSumRatings()/(double)rs.getNumRatings()*10d)/10d;
			System.out.println(m + ": " + rs.getNumRatings() + " reviews, average of " + avg + "/5");
		}
	}
}
