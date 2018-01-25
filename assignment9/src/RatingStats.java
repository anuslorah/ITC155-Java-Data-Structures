public class RatingStats {

	private int numRatings;
	private int sumRatings;
	
	public RatingStats(){
		numRatings = 0;
		sumRatings = 0;
	}

	public int getNumRatings() {
		return numRatings;
	}

	public void setNumRatings(int numRatings) {
		this.numRatings = numRatings;
	}

	public int getSumRatings() {
		return sumRatings;
	}

	public void setSumRatings(int sumRatings) {
		this.sumRatings = sumRatings;
	}
	
	public void addRating(int rating){
		numRatings++;
		sumRatings+= rating;
	}
}
