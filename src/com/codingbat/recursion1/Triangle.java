package com.codingbat.recursion1;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 We have triangle made of blocks. 
 The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. 
 Compute recursively (no loops or multiplication) the total number of blocks in such a triangle 
 with the given number of rows.

triangle(0) → 0
triangle(1) → 1
triangle(2) → 3
 */

public class Triangle {
	
	public int triangle(int rows) {
		if(rows == 0) {
			return 0;
		}
		if(rows == 1) {
			return 1;
		}
		return rows+triangle(rows-1);
	}
	
	@Test
	public void testTriangle() {
		assertEquals(0, triangle(0));
		assertEquals(1, triangle(1));
		assertEquals(10, triangle(4));
	}
}
