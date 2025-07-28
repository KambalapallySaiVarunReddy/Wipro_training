package Day8;
class Ml3 implements Runnable{
		public void run(){
			for(int i=1;i<=10;i++) {
				System.out.println("My Wipro");
				try {
					Thread.sleep(10);
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	}
class Ml4 implements Runnable{
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
public class MultiThreadingTwo {
	public static void main(String[] args) {
		Runnable m1=new Ml3();
		Runnable m2=new Ml4();
		
		//System.out.println(m2.getPriority());
		//m2.setPriority(Thread.MAX_PRIORITY);
		
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m2);
		
		t1.start();
		t2.start();
		
	}

}
