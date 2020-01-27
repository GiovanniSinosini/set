package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program_Demo1 {
	public static void main(String[] args) {
		
	//	Set<String> set = new HashSet<>();  more fast, but does not guarantee order
		
	//	Set<String> set = new TreeSet<>();  // sort the content
		
		Set<String> set = new LinkedHashSet<>(); // maintain insertion order
		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");
		
		
		
	// System.out.println(set.contains("Notebook"));  
	
		set.removeIf(x -> x.charAt(0) == 'T');
		
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}