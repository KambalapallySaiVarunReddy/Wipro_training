package Day9;

import java.util.ArrayList;
import java.util.List;

public class Collection_List {
	public static void main(String [] args) {
		List<Integer> data = new ArrayList<Integer>();
		data.add(10);
		data.add(11);
		data.add(12);
		data.add(13);
		System.out.println(data.get(2));
		System.out.println(data.indexOf(13));
		for(Object i :data) {
			int data1 = (Integer) i;
			System.out.println(data1);
		}
	}
}
