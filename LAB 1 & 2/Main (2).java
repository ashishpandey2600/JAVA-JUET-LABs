/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void Fb(int f)
    { 	int a= 0;
    	int b=1;
     	int c=0;
       
       for(int i=0;i<f;i++){
           System.out.println(a);
       c=a+b;
       a=b;
       b=c;
       }
    }
	public static void main(String[] args) {
		System.out.println("Factorial Program in JAVA");
 		Scanner sc= new Scanner(System.in);
	int a= sc.nextInt();
     Fb(a);
	}
}
