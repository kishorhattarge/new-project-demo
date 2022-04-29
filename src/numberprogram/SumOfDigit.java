package numberprogram;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int sum =0;
		while(num!=0)
		{
			if(num<0)
			{
				num =Math.abs(num);  // to convert negative num into positive.
			}
			int rem = num%10;
			sum =rem+sum;
			num = num/10;
			
		}
		System.out.println("the sum of count is: "+sum);
	}

}
