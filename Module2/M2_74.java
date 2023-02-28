/*74)	Write a Java program to print all the elements of an Array List using the position of the elements. */

package Module2;

import java.util.ArrayList;

public class M2_74 {
	public static void main(String[] atgs) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Lily");
		list.add("Iris");
		list.add("Aster");
		list.add("Lotus");
		
		System.out.println("Flower List: \n");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
	}
} 
