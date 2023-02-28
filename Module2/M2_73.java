/*73)	Write a Java program to replace the second element of an Array List with the specified element. */

package Module2;

import java.util.ArrayList;

public class M2_73 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Lily");
		list.add("Iris");
		list.add("Aster");
		list.add("Lotus");
		
		System.out.println("Flower List: \n"+list);
		System.out.println("\nReplacing Second 'Iris' Element with 'Larkspur' ");
		list.set(1, "Larkspur");
		System.out.println("Flower List After Change: \n"+list);
	}
}
