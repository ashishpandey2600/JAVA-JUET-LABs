/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int Factorial(int f)
    {
        if(f==1 || f==0)
        return 1;
        
        return f*Factorial(f-1);
    }
	public static void main(String[] args) {
		System.out.println("Factorial Program in JAVA");
		Scanner sc= new Scanner(System.in);
	int a= sc.nextInt();
	int k=Factorial(a);
	   System.out.println(k);
		
		
	}
}
