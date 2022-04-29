package numberprogram;

public class PrimeNoInRange {
	public static void main(String[] args) {
		
	
	int temp =0;
	for(int i=1; i<=100;i++)//to find out prime no between 100.
	{
		for(int j=2; j<=i-1; j++)
		{
			if(i%j==0)
			{
				temp = temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println(i);
		}
		else
		{
			temp=0;
			
		}
	}
System.out.println();
}
}
