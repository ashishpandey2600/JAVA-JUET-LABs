/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{    public static int Fact(int k)
{
    if (k==1 || k==0)
    return 1;
    
    return k*Fact(k-1);
}
	public static void main(String[] args) {
		System.out.println("Permutation and Combination Program NCR");
 		Scanner sc= new Scanner(System.in);
	    int nn= sc.nextInt();
	    int rr= sc.nextInt();
	    int n = Fact(nn);
	    int r=Fact(rr);
	    int k=Fact(n-r);
	    int c=(n/(k*r));
	    int  p=n/k;
	    System.out.println("Combination = " +c);
	     System.out.println("Permutation = " +p);
	}
}
