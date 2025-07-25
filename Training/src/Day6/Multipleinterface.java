package Day6;
interface Interface1{
	static void show() {
		System.out.println(" Static interface1");	
	}
	default void show(double a) {
		System.out.println("Default interface1");
	}
}
interface Interface2{
	final int a=10;
	void show(int a);
}
class Task1 implements Interface1,Interface2{
	public void show() {
		System.out.println("Task1 implementing interface1");
	}
	public void show(int a) {
		System.out.println("Task1 implementing interface2");
	}
	
}
public class Multipleinterface {
	public static void main(String[] args) {
		Interface1.show();
		Task1 ts= new Task1();
		ts.show(10);
		ts.show();
		System.out.println(ts.a);
	}
}

