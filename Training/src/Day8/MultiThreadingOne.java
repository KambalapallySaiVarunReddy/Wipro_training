package Day8;
class Ml1 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Wipro");
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e){
			e.printStackTrace();
		}
		}
	}
}
class Ml2 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Training");
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class MultiThreadingOne {
public static void main(String[] args) {
	Ml1 m1=new Ml1();
	Ml2 m2=new Ml2();
	//System.out.println(m2.getPriority());
	//m2.setPriority(Thread.MAX_PRIORITY);
	m1.start();
	try {
		Thread.sleep(5);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
		
	}
	m2.start();
	
}
}
