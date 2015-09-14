package com.psl.assignment.string;

public class ReverseWords {

	/**
	 * @param args
	 */
	
	static String makeReverse(String str){
		
		String revdString = "";
		
		String words[] = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			for (int j = words[i].length(); j > 0; j--) {
				revdString += words[i].charAt(j-1);
			}
			revdString += " ";
		}
		return revdString;
	}
	
	public static void main(String[] args) {
		
		String str = "To be or not to be";
		System.out.println("Start");
		System.out.println(makeReverse(str));
		System.out.println("End");

	}

}
