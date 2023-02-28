/*72)	Write a Java program to increase the size of an array list. */

package Module2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class M2_72 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(4);
		list.add("Lily");
		list.add("Iris");
		list.add("Aster");
		list.add("Lotus");
		
		System.out.println("Original List: \n"+list);
		list.ensureCapacity(6);
		list.add("Larkspur");
		list.add("Snowdrop");
		System.out.println("\nAfter Increcing Size List: \n"+list);
		}
}
