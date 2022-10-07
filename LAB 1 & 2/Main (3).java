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
		System.out.println("Check palindrome");
 		Scanner sc= new Scanner(System.in);
	    int a= sc.nextInt();
	    int b=a;
	    int c,d,e=0,f;
        while(a!=0)
        {  c=a%10;
            a=a/10;
            e=e*10+c;
            
        }
        if(e==b)
        {
           System.out.println("Yes this number is palindrome"); 
        }
        else
        System.out.println("Not palindrome");
	}
}
