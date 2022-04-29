package numberprogram;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	int originalnum = num;
	int rev = 0;
	while(num!=0)
	{
		int rem = num%10;
		 rev = rev*10 +rem;
		num = num/10;
		
		
	}
//	System.out.println("the rever number is: "+rev);
	if(originalnum==rev)
	{
		System.out.println("the number: "+originalnum +" is palindrome");
	}
	else
	{
		System.out.println("The number: "+originalnum+" not palindrome");
	}
	
	}
}
