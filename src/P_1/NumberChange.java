package P_1;

public class NumberChange {
		
		private int x = 1;
		private int y = 1;
	public void increase(){
		
		while(y<=50 &&!Thread.currentThread().isInterrupted()) {
			if(y % 2==0) {
			System.out.print(" "+y);
			
			}
			y++;
			
		}
		  
		}

	public void jishu() {
		
		while(x<=50&&!Thread.currentThread().isInterrupted()) {
			if(x % 2==1) {
			System.out.print(" "+x);
			
			}
			x++;
			
		}
		
	}
		public static void main(String [] args) {
			NumberChange num = new NumberChange();
			NumberChange JS = new NumberChange();
			//Thread count1 = new Counter(num, null);
			Thread count2 = new Counter(JS);
			//count1.start();
			count2.start();
			
		}
	
}
class Counter extends Thread{
	//private NumberChange num;
	private NumberChange JS;
	Counter(NumberChange JS){
		//this.num=num;
		this.JS = JS;
		
		
	}

	
	


	public void run() {
		try {
		
			
		//	num.increase();
			JS.jishu();
			
		
		}catch(NullPointerException e) {
			
			System.out.println(e.toString());
			
		}finally {
			 System.out.println("\nÏß³ÌÖÕÖ¹!");
		}
		
	}
}
