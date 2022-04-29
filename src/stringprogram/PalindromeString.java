package stringprogram;

import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String value");
		String str = sc.next();
		String originalstr = str;
		
		String rev="";
		for(int i=str.length()-1;i>=0; i--)
		{
			char ch = str.charAt(i);
			rev= rev+ch;
			
		}
		if(originalstr.equals(rev))
		{
			System.out.println("giver string "+str+" is palindrome string");
			System.out.println(rev);
			System.out.println(originalstr);
			
		}
		else
		{
			System.out.println("giver string "+str+" is not palindrome string");
			System.out.println(rev);
			System.out.println(originalstr);
		}
	}

}
