/*75)	Write a Java program to compare two sets and retain elements which are same on both sets. */

package Module2;

import java.util.HashSet;
import java.util.Set;

public class M2_75 {
	public static void main(String[] args) {
		Set set1= new HashSet();
		Set set2 = new HashSet();
		
		set1.add(123);
		set1.add("java");
		set1.add("P");
		
		System.out.println("Set One: "+set1);
		
		set2.add("Java");
		set2.add(123);
		set2.add("H");
		
		System.out.println("Set Two: "+set2);
		set1.retainAll(set2);
		System.out.println("Set: "+set1);
	}
}
