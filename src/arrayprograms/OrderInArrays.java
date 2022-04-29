package arrayprograms;

import java.util.Arrays;
import java.util.TreeSet;

public class OrderInArrays {
	
	public static void main(String[] args) {
		
		String s []  = {"kishor", "rahul","avinash", "akshay", "vishwa"};
		
		TreeSet<String> ts = new TreeSet<String>(Arrays.asList(s));
		System.out.println(ts);
		
		
	}

}
