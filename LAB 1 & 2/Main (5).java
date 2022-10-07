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
	   
		System.out.println("reverse String");
 		String str="Ashish";
 		int k=str.length();
 		String rev="";
 		for(int i=k-1;i>=0;i--)
 		rev+=str.charAt(i);
 		System.out.println(rev);
	}
	
}
