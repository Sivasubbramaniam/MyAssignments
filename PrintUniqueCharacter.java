package collectionsprogram;

import java.util.HashSet;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String InputName = "siva subbramaniam";
		
		//print all unique characters
		
		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
		
		
		char[] ch =  InputName.toCharArray();
		 
		HashSet<Character> setData = new HashSet<Character>();
		
		for (int i = 0; i < ch.length; i++) {
			setData.add(ch[i]);
			
		}
		System.out.println(setData);
		
		
		
	}

}
