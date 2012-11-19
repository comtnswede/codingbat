package com.codingbat.logic1;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * The squirrels in Palo Alto spend most of the day playing. 
 * In particular, they play if the temperature is between 60 and 90 (inclusive). 
 * Unless it is summer, then the upper limit is 100 instead of 90. 
 * Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.

squirrelPlay(70, false) → true
squirrelPlay(95, false) → false
squirrelPlay(95, true) → true
 */

public class SquirrelPlay {
	
	public boolean squirrelPlay(int temp, boolean isSummer) {
		if(isSummer == false && temp >= 60 && temp <= 90) {
			return true;
		}
		else if(isSummer == true && temp >= 60 && temp <= 100) {
			return true;
		}
		return false;
	}
	
	@Test
	public void testSquirrelPlay() {
		SquirrelPlay sp = new SquirrelPlay();
		assertTrue(sp.squirrelPlay(70, false));
		assertTrue(sp.squirrelPlay(95, true));
		assertTrue(sp.squirrelPlay(60, true));
		assertTrue(sp.squirrelPlay(100, true));
		assertTrue(sp.squirrelPlay(60, false));
		assertTrue(sp.squirrelPlay(90, false));
		
		assertFalse(sp.squirrelPlay(95, false));
		
		assertFalse(sp.squirrelPlay(-1, false));
		assertFalse(sp.squirrelPlay(-1, true));
		assertFalse(sp.squirrelPlay(101, false));
		assertFalse(sp.squirrelPlay(101, true));
		assertFalse(sp.squirrelPlay(50, false));
		assertFalse(sp.squirrelPlay(91, false));
		
	}
}
