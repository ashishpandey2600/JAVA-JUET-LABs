import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Check palindrome");
 		Scanner sc= new Scanner(System.in);
 		String str=sc.nextLine();
 		int l=str.length();
 		String r="";
 		for (int i=l-1;i>=0 ;i-- )
 		{ char c= str.charAt(i);
 		    r=r+c;
 		}
	    System.out.println(r); 
        if(r.equals(str))
        {
           System.out.println("Yes this number is palindrome"); 
        }
        else
        System.out.println("Not palindrome");}}

