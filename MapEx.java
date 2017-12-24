package Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MapEx {
	public static <T> void main(String[] args) {

		//Example 1 to use addAll collections method
		//Create list1 and list2
		ArrayList<Integer> list1  = new ArrayList<>();
		ArrayList<Double> list2 = new ArrayList<>();
		
		//add some values in list1 and list2
		list1.add(1);
		list1.add(2);
		list2.add(3.0);
		list2.add(4.0);
		
		//Create a 3rd collection list
		Collection all = new ArrayList();
		//add / merge 1st and 2nd list
		all.addAll(list1);
		all.addAll(list2);
		
		System.out.println(all.toString());
		
		//Example 2 : using Arrays
		List<Integer> numList1 = Arrays.asList(1,2,-1);
	    List<Integer> numList2 = Arrays.asList(4,5,6);

	    List<Integer> allNum = new ArrayList<Integer>();
	    allNum.addAll(numList1);
	    allNum.addAll(numList2);
	    System.out.println(allNum);
	    
	    //Example 3 : 
	    Collections.addAll(all,"10","20","30");
	    System.out.println(all.toString());
	    
	   
	    Collections.shuffle(list1);
	    
	    System.out.println(list1.toString());
	    
	}
}
