package com.codingbat.logic2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MakeBricks {
	
	public boolean makeBricks(int small, int big, int goal) {
		
		  if (goal > small + big * 5) {
		    return false;
		  }

		  int bigBricksToUse = Math.min(big, (goal / 5) );
		  return goal - (bigBricksToUse * 5) <= small;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MakeBricks test1 = new MakeBricks();
		
		System.out.println(test1.makeBricks(1, 4, 12));
		System.out.println(test1.makeBricks(1, 4, 11));
		
		System.out.println(test1.makeBricks(3, 1, 8));
		System.out.println(test1.makeBricks(3, 1, 9));
		System.out.println(test1.makeBricks(3, 2, 10));
		
		System.out.println(test1.makeBricks(20, 20, 120));
		
		
		
	}
	
	@Test
	public void testMakeBricks() {
		MakeBricks test1 = new MakeBricks();
		assertTrue(test1.makeBricks(1, 4, 11));
	}
	
	

}
