/*70)	Write a Java program to convert a hash set to a List/Array List. */

package Module2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class M2_70 {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("Pal");
		set.add("Java");
		set.add(2023);
		System.out.println("Set: "+set);
		
		List list = new ArrayList(set);
		System.out.println("List: "+list);
	}
}
