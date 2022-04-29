package numberprogram;

import java.util.Scanner;

public class ReverseNumber2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		String str = String.valueOf(num);
		
		
		int length = str.length();
		
		for(int i=length-1;i>=0; i--)
		{
			char rev = str.charAt(i);
			System.out.print(rev);
		}
	}

}
