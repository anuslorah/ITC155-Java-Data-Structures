
public class Comedy extends Movie{
	double fee = 2.5;
	public Comedy (){
		super();
	}
	@Override
	public double CalculateLateFees(int days){
		double latefee =  fee* days;
		return latefee;
	}
}
