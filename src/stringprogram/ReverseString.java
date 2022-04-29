package stringprogram;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string value");
		
		
		String str = sc.next();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			char rev = str.charAt(i);
			System.out.print(rev);
		}
	
	}

}
