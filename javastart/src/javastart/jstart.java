package javastart;


public class jstart {
	public static void main(String[] args) {
	
		char a='a';
		char b=(char)(a-32);
		System.out.println(a);
		System.out.println(b);
		객체지향 q=new 객체지향();//클래스 참조
		q.r=10;
		q.t=20;
		q.더하기();
		System.out.println(q.w);
		객체지향[] y= {
		new 객체지향(),new 객체지향(),new 객체지향(),new 객체지향()};
		System.out.println(y[0].w);
		y[0].r=10;
		y[0].더하기();
		System.out.println(y[0].w);
	}
}
