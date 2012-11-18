package com.codingbat.array3;

public class LinearIn {
	
	public boolean linearIn(int[] outer, int[] inner) {
		if(inner.length == 0) {
			return true;
		}
		
		int numberFound = 0;
		int j = 0;
		for(int i = 0; i < outer.length; i++) {
			if(outer[i] == inner[j]) {
				numberFound++;
				j++;
			} else if(outer[i] > inner[j]) {
				return false;
			}
			
			if(numberFound == inner.length) {
				return true;
			}
		}
		
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}

}
