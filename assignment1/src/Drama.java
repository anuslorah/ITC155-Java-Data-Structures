
public class Drama extends Movie{
	double fee = 2;
	
	public Drama (){
		super();
	}
	
	@Override
	public double CalculateLateFees(int days){
		double latefee =  fee* days;
		return latefee;
	}
}
