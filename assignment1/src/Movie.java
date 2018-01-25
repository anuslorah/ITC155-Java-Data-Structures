public class Movie {
//rating, id number, title
	private String title;
	private String category;
	private String rating;
	private int IDNumber;
	
	private double fee = 2;
	
	public Movie (){
		
	}
	public Movie(String title, String category) {
        this.title = title;
        this.category = category;
    }
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
		public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public int getIDNumber() {
		return IDNumber;
	}
	public void setIDNumber(int iDNumber) {
		IDNumber = iDNumber;
	}

	public double CalculateLateFees(int days){
		double latefee =  fee* days;
		return latefee;
	}
}

