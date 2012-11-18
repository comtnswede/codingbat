package com.codingbat.string1;

public class LastTwo {
	
	public String lastTwo(String str) {
		if(str.length() < 2) {
			return str;
		}
		
		String allButLastTwoChars = str.substring(0, str.length()-2);
		char lastChar = str.charAt(str.length()-1);
		char secondToLastChar = str.charAt(str.length()-2);
		return new String(allButLastTwoChars + lastChar + secondToLastChar);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LastTwo test5 = new LastTwo();
		System.out.println(test5.lastTwo("coding"));
		System.out.println(test5.lastTwo("cat"));
		System.out.println(test5.lastTwo("ab"));
		
		System.out.println(test5.lastTwo("a"));
		System.out.println(test5.lastTwo(""));
		
	}

}
