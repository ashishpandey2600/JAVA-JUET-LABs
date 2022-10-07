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
	   
		System.out.println("mirror string ??");
		Scanner sc= new Scanner(System.in); 
 		String str= sc.nextLine();
 		String str2= sc.nextLine();
 		int k=str.length();
 		String rev="";
 		for(int i=k-1;i>=0;i--)
 		rev+=str.charAt(i);
 		if(rev.equals(str2))
 		System.out.println("Yes, both are mirror strings");
 		else 
 		System.out.println("No, both are not mirror strings");
	}
	
}
