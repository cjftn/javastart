package javastart;


public class jstart {
	public static void main(String[] args) {
	
		char a='a';
		char b=(char)(a-32);
		System.out.println(a);
		System.out.println(b);
		��ü���� q=new ��ü����();//Ŭ���� ����
		q.r=10;
		q.t=20;
		q.���ϱ�();
		System.out.println(q.w);
		��ü����[] y= {
		new ��ü����(),new ��ü����(),new ��ü����(),new ��ü����()};
		System.out.println(y[0].w);
		y[0].r=10;
		y[0].���ϱ�();
		System.out.println(y[0].w);
	}
}
