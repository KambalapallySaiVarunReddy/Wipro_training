package Day5;
import java.util.*;
import java.util.Scanner;
interface NameSorter{
	void sortAndDisplay();
}
class NameSortingApp implements NameSorter{
	public void sortAndDisplay() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total count:");
		int n = sc.nextInt();
		String[] names = new String[n];
		for(int i = 0; i<n;i++) {
			System.out.println("Enter the person" +(i+1)+" name :");
			names[i] = sc.next();
		}
		Arrays.sort(names);
		System.out.println("Sorted names:");
		for (String str : names) {
			System.out.println(str);
		}
		
	}
}
public class SortingNames {
	public static void main(String[] args) {
		NameSorter sorter = new NameSortingApp();
		sorter.sortAndDisplay();
	}

}
