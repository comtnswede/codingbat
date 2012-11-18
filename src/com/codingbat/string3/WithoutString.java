package com.codingbat.string3;

public class WithoutString {
	
	public String withoutString(String base, String remove) {
		return base.replaceAll("(?i)" + remove, "");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WithoutString test4 = new WithoutString();
		System.out.println(test4.withoutString("Hello there", "llo")); //"He there"
		System.out.println(test4.withoutString("Hello there", "e")); //"Hllo thr"
		System.out.println(test4.withoutString("Hello there", "x")); //"Hello there"
		
		System.out.println(test4.withoutString("xxx", "xx"));
		
		System.out.println(test4.withoutString("This is a FISH", "is")); //Th a FH
		System.out.println(test4.withoutString("This is a FISH", "iS")); //Th a FH
		System.out.println(test4.withoutString("This is a FISH", "IS")); //Th a FH
//		System.out.println(test4.withoutString("a", "a")); 
		
// This got typed from the vnc client on the nook :-)
		
	}

}
