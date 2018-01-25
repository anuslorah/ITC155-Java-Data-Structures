import java.util.InputMismatchException;
import java.util.Scanner;

public class CatchBlocks {

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
		int n1 = 0, n2 = 0;
		double r;
		boolean error;
		error = true;
		System.out.println("Enter two numbers.  I will compute the ratio.");
		while (error = true){
			do {
				try {
					error = false;
					System.out.println("Please enter the first number");
					n1 = scan.nextInt();
					System.out.println("Please enter the second number");	
					n2 = scan.nextInt();
				}
				catch (InputMismatchException e) 
				{
					error = true; 
					System.out.println("Error, please enter number again.");
					String temp = scan.nextLine(); //clear number from the buffer
				}
				catch (ArithmeticException ee){
					error = true; 
					System.out.println("Error. Second number can not be 0. Please try again");
					String temp = scan.nextLine(); //clear number from the buffer	
				}
			} while (error);
			if (n2 != 0) {
				r = (double) n1 / n2;
				System.out.println(n1 + "/" + n2 + " = " + r);
				break;
			}
			else {
				System.out.println("Second number can not be 0. Please try again");
				error = false;
			}
		}//while
		scan.close();
	}//main
}//class