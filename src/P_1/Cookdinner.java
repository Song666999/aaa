package P_1;

public class Cookdinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] a1 = new String[5];
		String [] a2 = new String[5];
		a1[0]="�������";
		a1[1]="�͸�";
		a1[2]="��ï���";
		a1[3]="�����";
		a2[0]="�������";
		a2[1]="�͸�";
		a2[2]="��ï���";
		a2[3]="�����";
		
		int x=(int)(Math.random()*4);
		int y=(int)(Math.random()*4);
		while(x != y) {
		System.out.println("��������***"+a1[x]+"***��⿣���");
		
		System.out.println("��������***"+a2[y]+"***�����֣���");
		break;
		}
		
	}

}
