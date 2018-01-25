//Anu Slorah

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {
	static int count = 0;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean error;
		error = true;
		
		System.out.println("Fibonacci Numbers");
		System.out.println();
		do {
			try {
				error = false;
				System.out.println("How many Fibonacci numbers would you like to see?");
				count = scan.nextInt();
			}
			catch (InputMismatchException e) 
			{
				error = true; 
				System.out.println("Error, please enter number again.");
				String temp = scan.nextLine(); //clear number from the buffer
			}
		} while (error);
		System.out.println();   
		System.out.println("Calculating Fibonacci numbers..");   
		
		for (int i = 1; i <= count+1; i++){
			System.out.println("Fibonacci number " + (i-1) + " is: " + fibonacci(i));   
		}

		System.out.println();
		System.out.println("The " + (count) + ordinal(count) + " Fibonacci number is " + fibonacci(count+1) + ".");   
 
	}//main
		//calculate the Fibonacci numbers
		public static int fibonacci(int count){    
			int f1 = 1;
		    int f2 = 1;
		    int fn = 0;
			
			if(count == 0 ){
		    	return 1;
		    }
		    else if (count == 1 || count == 2) {
		    	return 1;
		    }
		    
		    for (int i = 3; i <= count; i++){
		    	fn = f1 + f2;
		    	f1 = f2;
		    	f2 = fn;
		     }
	        return fn;    
		}
		
		//make count ordinal
		public final static String ordinal(int count) {
			if (count >= 11 && count <= 13) { 
		        	return "th"; 
		    }
			count = count % 10;
		    String add = "";
		    switch(count) {
		    	case 1:     
		        	add = "st";
		            break;
		        case 2:     
		        	add = "nd";
		            break;
		        case 3:     
		        	add = "rd";
		            break;
		        default: 
		        	add = "th";             
		    }
		        return add;  
		}//ordinal
}//class