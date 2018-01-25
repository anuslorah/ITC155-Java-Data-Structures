public class Rental {

	String movieTitle;
	String movieRating;
	int movieID;
	int customerID;
	int days = 5;
	
	public Rental(String rating, int id, String title){
		movieRating = rating;
		movieID = id;
		movieTitle = title;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(String movieRating) {
		this.movieRating = movieRating;
	}

	public int getMovieID() {
		return movieID;
	}

	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	
	public double calculateLateFees(double fee){
		double lateFee = fee * days;
		return lateFee;
	}
	
}