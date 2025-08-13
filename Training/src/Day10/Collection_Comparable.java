package Day10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Collection_Comparable {
	public static void main(String[]args) {
		Comparator<Integer> c1 =new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				if(i > j) 
					return 1;
				else
					return -1;
			}
		};
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(15);
		l1.add(23);
		l1.add(61);
		l1.add(10);
		l1.add(70);
		System.out.println(l1);
		Collections.sort(l1,c1);
		System.out.println(l1);
	}
}
