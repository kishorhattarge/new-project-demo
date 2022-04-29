package numberprogram;

public class CountOfEvenAndOdd {
	
	public static void main(String[] args) {
		
		int num = -45123;
		int evencount =0;
		int oddcount = 0;
		while(num!=0)
		{
			int rem = num%10;
			if(rem%2==0)
			{
				evencount++;
				
				
			}
			else
			{
				oddcount++;
				
			}
			num = num/10;
		}
		System.out.println("even count is: "+evencount);
		System.out.println("odd count is: "+oddcount);

	}

}
