package numberprogram;

import java.util.Random;

public class RandomNumber {
	
	public static void main(String[] args) {
		
		Random  rand = new Random();
		int randint = rand.nextInt(1452);
		System.out.println(randint);
	}

}
