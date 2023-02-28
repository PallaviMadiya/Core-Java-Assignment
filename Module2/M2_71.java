/*71)	Write a Java program to check whether a map contains key-value mappings (empty) or not. */
package Module2;

import java.util.HashMap;
import java.util.Map;

public class M2_71 {
	public static void main(String[] args) {
		Map map = new HashMap();
//		map.put("Name","Pallavi");
//		map.put("Course", "Java");
		
		if(map.isEmpty()) {
			System.out.println("Map is empty");
		}
		else {
			System.out.println("Map is not empty.");
			System.out.println("Map: \n"+map);
		}
	}
}
