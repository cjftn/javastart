package ��ü�������α׷���2;

class zz0{
	/*protected*/ int d;//Ŭ���� ��ɾ�� �ȵ�
	static int a;
}
class zz1 extends zz0{//2���� Ŭ������ ���� �ϳ���!
	static int b;
}
class zz2{
	int c;
}

public class zz extends zz1{//3���� Ŭ������ ���� �ϳ���!!
	public static void main(String args[]) {
		//d=10;//Ŭ���� ������ �������
		a=10;
		b=20;
		zz2 z=new zz2();
		z.c=30;//��...���� ����
		System.out.println("a�� "+a+"�׸��� b�� "+b+"�׸��� c��"+z.c);
		
	}
	
}
