public class Action extends Movie{
	double fee = 3;
	
	public Action(){
	super();
	}
	
	@Override
	public double CalculateLateFees(int days){
		double latefee =  fee* days;
		return latefee;
	}
}
