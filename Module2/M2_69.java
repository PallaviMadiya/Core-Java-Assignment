/*69)	Write a Java program to convert a hash set to an array. */

package Module2;
import java.util.*;

public class M2_69 {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("Pallavi");
		set.add("Madiya");
		set.add("Java");
				
		System.out.println("Set :\n"+set);
		String[] array = new String[set.size()];
		set.toArray(array);
		System.out.println("\nForm set to array convertion:");
		for(String element : array) {
			System.out.println(element);
		}		
	}
}