package com.codingbat.recursion1;

public class BunnyEars {
	
	public int bunnyEars(int bunnies) {
		if(bunnies == 0) {
			return 0;
		}
		
		return (2 + bunnyEars(bunnies - 1));
	}
	
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BunnyEars test3 = new BunnyEars();
		System.out.println(test3.bunnyEars(0));
		System.out.println(test3.bunnyEars(1));
		System.out.println(test3.bunnyEars(2));
	}

}
