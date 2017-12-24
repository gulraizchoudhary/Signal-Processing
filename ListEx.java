package Examples;

import java.util.Arrays;
import java.util.List;

class ListEx {
	public static void main(String[] args) {
		  System.out.println("Demonstration of removeIf");
	        List<String> list1 = generateAList();
	        
	        // remove all items which contains an "A"
	        list1.removeIf(s-> s.toLowerCase().contains("A"));
	        list1.forEach(s->System.out.println(s));
	}

	private static List<String> generateAList() {
		 return Arrays.asList("A", "B", "A", "C");
	}

}
