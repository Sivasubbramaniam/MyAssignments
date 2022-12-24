package collectionsprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		//input
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		//output should be 7
		
		
		
		/*
		 * Pseudo Code: 
		 * a) Create a empty Set Using TreeSet
		 * b) Declare for loop iterator from 0 to data.length and add into Set 
		 * c) converted Set into List
		 * d) Print the second last element from List
		 * 
		 * 
		 */
		
		//created treeset
		Set<Integer> mentors = new TreeSet<Integer>();
		
		for (int i = 0; i < data.length; i++) {
		
			mentors.add(data[i]);
			
		}
		
		System.out.println("Treeset "+ mentors);
		
		//convert set into list
		
		List<Integer> listData = new ArrayList<Integer>(mentors);
		int a = listData.size();
		System.out.println(a);
		System.out.println(listData.get(4));
		
		
		
		
		
		
	}

	private static void addAll() {
		// TODO Auto-generated method stub
		
	}

	private static void add() {
		// TODO Auto-generated method stub
		
	}
}
