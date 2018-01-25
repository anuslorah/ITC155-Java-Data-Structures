Absolute Java 6th Ed, Ch 9, p. 577, ex. 2

Here is a snippet of code that inputs two integers and divides them:

Scanner scan = new Scanner(System.in);
int n1, n2;
double r;
n1 = scan.nextInt();
n2 = scan.nextInt();
r = (double) n1 / n2;

Place this code into a try-catch block with multiple catches so that different error messages are printed if we attempt to divide by zero or if the user enters textual data instead of integers (java.util.InputMismatchException). If either of these conditions occurs, then the program should loop back and let the user enter new data.

Sample Output: 

Enter two numbers.  I will compute the ratio.
ten
You must enter an integer.  Try again.
Enter two numbers.  I will compute the ratio.
2
0
There was an exception: Divide by zero.  Try again.
Enter two numbers.  I will compute the ratio.
2
3
The ratio r = 0.6666666666666666

