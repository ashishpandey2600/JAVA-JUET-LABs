/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Calculator Program in JAVA");
		Scanner sc= new Scanner(System.in);
		double a= sc.nextInt();
		char ch=sc.next().charAt(0);
		double b=sc.nextInt();
	    switch(ch){
	        case '+': System.out.println(a+b);
	                 break;
	         case '-': System.out.println(a-b);
	                 break;
	          case '*':System.out.println(a*b);
	                 break;
	          case '/':System.out.println(a/b);
	                  break;
	          default: 	System.out.println(" Not applicable") ;       
	                 
	    }
		
		
		
	}
}
