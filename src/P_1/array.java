package P_1;

import java.util.Random;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] i = new int[10];
		int j,h,t;
		
		for(j=0;j<i.length;j++) {
			int ss =new Random().nextInt(10)+1;
			i[j]=ss;
			System.out.print(i[j]+",");
		}
		//for(j=0;i[j]>i;j++) {
			
		//}
	}

}
