package collectionsprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
		
		int[] data = {11,12,14,15,16,17,18,19,20};
		
		Set<Integer> setData = new TreeSet<Integer>();
		
		for (int i = 0 ; i < data.length; i++) {
			setData.add(data[i]);
		}
		
		System.out.println(setData);
		
		List<Integer> listData = new ArrayList<Integer>(setData);
		
		for (int j = 1; j < listData.size(); j++) {
			
			//12 - (12-1) = 1
			if((listData.get(j)- listData.get(j - 1)) == 1) {
				
				//j = 12-1 =11 will sub with j=11 , if returns 1 then increment
				continue;
			}
			else{
				//
				System.out.println("Missing number is"+ (listData.get(j)-1));
			}
		}
		
		
		
		
	}

}
