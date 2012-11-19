package com.codingbat.logic1;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * You are driving a little too fast, and a police officer stops you. 
 * Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. 
 * If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. 
 * If speed is 81 or more, the result is 2. 
 * Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.

caughtSpeeding(60, false) → 0
caughtSpeeding(65, false) → 1
caughtSpeeding(65, true) → 0
 */

public class CaughtSpeeding {
	
	public int caughtSpeeding(int speed, boolean isBirthday) {
		if(speed < 1) {
			return 0;
		}
		if(isBirthday) {
			speed = speed-5;
		}
		if(speed <= 60) {
			return 0;
		}
		else if(speed >= 61 && speed <= 80) {
			return 1;
		}
		else if(speed >= 81) {
			return 2;
		}
		
		return 0;
	}
	
	@Test
	public void testCaughtSpeeding() {
		CaughtSpeeding cs = new CaughtSpeeding();
		
		assertEquals(cs.caughtSpeeding(60, false), 0);
		assertEquals(cs.caughtSpeeding(65, false), 1);
		assertEquals(cs.caughtSpeeding(65, true), 0);
		
		assertEquals(cs.caughtSpeeding(-1, false), 0);
		assertEquals(cs.caughtSpeeding(85, true), 1);
		assertEquals(cs.caughtSpeeding(86, true), 2);
		assertEquals(cs.caughtSpeeding(85, false), 2);
		assertEquals(cs.caughtSpeeding(86, true), 2);
	}
}
