package numberprogram;

import java.util.Scanner;

public class PrimeNo {
	// prime no is that no which is divisible by 1 and itself 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int no = sc.nextInt();
		
//		int no = 11;
		int temp=0;
		for(int i =2; i<=no-1; i++)
		{if(no%i==0)
		{
			temp= temp+1;
		}
		}
		
		if( temp>0)
		{
			System.out.println("the number is not prime");
			
		}
		else
		{
			System.out.println("the number is prime");
		}
	}

}
