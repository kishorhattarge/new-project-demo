package arrayprograms;

import java.util.Arrays;

public class ArrayEqualsCheck {
	
	public static void main(String[] args) {
		
		int a1[] = {1,2,3,4,5,6};
		int a2[] = {1,2,3,4,5,6,};
		
//		approach 1
		/*boolean isequal = Arrays.equals(a1,a2);
		if(isequal==true)
		{
			System.out.println("arrays are equals");
		}
		else
		{
			System.out.println("arrays are not equals");
		}*/
		
//		approch 2
		boolean status = true;
		if(a1.length == a2.length)
		{
			for(int i=0; i<a1.length; i++)
			{
				if(a1[i]!=a2[i])
				{
					status = false;
				}
				
			}
		}
		else
		{
			status = false;
		}
		if(status == true)
		{
			System.out.println("arrays are equals");
		}
		else
		{
			System.out.println("arrays are not equals");
		}
		
	}

}
