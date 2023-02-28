/*76) Write a java program to get a collection view of the values contained in this map.*/
package Module2;

import java.util.HashMap;
import java.util.Map;

public class M2_76 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("Name", "Pallavi");
		map.put("Course", "Java");
		map.put("Marks", 85);
		System.out.println("Student Detail: \n"+map);
	}
}
