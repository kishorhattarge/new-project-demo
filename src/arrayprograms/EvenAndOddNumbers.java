package arrayprograms;

public class EvenAndOddNumbers {
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9};
	
		System.out.println("the even numbers are-----------");
		for(int num:a)
		{
			if(num%2==0)
			{
				System.out.println(num);
			}
			
		}
		
		System.out.println("the odd numbers are----------");
		for(int num=0; num<=a.length; num++)
		{
			if(num%2==1)
			{
				System.out.println(num);
			}
			
		}
	}

}
