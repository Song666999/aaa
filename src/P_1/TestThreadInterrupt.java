package P_1;

public class TestThreadInterrupt extends Thread{
	public void run() {
		try
		{
			int i = 1;
			while(i<=100&&!Thread.currentThread().isInterrupted()) {
				if(i % 2==1) {
				System.out.print(" "+i);
				
				}
				i++;
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			System.out.println(e.toString());
			
		}finally {
			System.out.println("\nÏß³ÌÖÕÖ¹!");
			
		}
	}
	public static void main(String [] args) throws Exception{
		TestThreadInterrupt thread = new TestThreadInterrupt();
		thread.start();
		thread.sleep(10000);
	}
}
