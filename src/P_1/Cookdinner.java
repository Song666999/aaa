package P_1;

public class Cookdinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] a1 = new String[5];
		String [] a2 = new String[5];
		a1[0]="è÷º½´ó³ø";
		a1[1]="ÃÍ¸ç";
		a1[2]="¼ÑÃ¯´ó³ø";
		a1[3]="¿µ´ó³ø";
		a2[0]="è÷º½´ó³ø";
		a2[1]="ÃÍ¸ç";
		a2[2]="¼ÑÃ¯´ó³ø";
		a2[3]="¿µ´ó³ø";
		
		int x=(int)(Math.random()*4);
		int y=(int)(Math.random()*4);
		while(x != y) {
		System.out.println("½ñÌìÓÐÇë***"+a1[x]+"***Åëâ¿£¡£¡");
		
		System.out.println("½ñÌìÓÐÇë***"+a2[y]+"***´òÏÂÊÖ£¡£¡");
		break;
		}
		
	}

}
