package ��ü�������α׷���2;

class super2 {
	int a;
	int x=10;
	int c=40;
	
}
class super3 extends super2{
	int x=20;
	void m(){
		System.out.println(x);
		System.out.println(this.x);//������ Ŭ���� ������ �����´�
		System.out.println(super.x);//���� Ŭ������ ������ �����´�
		System.out.println(this.x+super.x);//��� ���Ѵ�
		
		
		
		
	}
	
}

public class super1 extends super3 {
	
	public static void main(String[] args) {
		//System.out.println(super.x+ this.x);//�ȵ�....
		super3 s=new super3();
		s.m();
		
		
		
	}

	
}
