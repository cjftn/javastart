package javastart;
public class zz9 {

	static int[] aa=new int[10];
	static {
		for(int i=0;i<aa.length;i++) {//aa�迭�� ����������
			aa[i]=(int)(Math.random()*10)+1;//10�ڸ� ���� ������ ����
		}
	}


	
	public static void main(String[] args) {
	
		for(int a:aa) {//aa�迭�� ��� ���ڸ� ������a�� ����
			System.out.println(a);
		}
		System.out.println(Math.random()*10);//10���ڸ��� �Ǽ��� ���
	}
}
