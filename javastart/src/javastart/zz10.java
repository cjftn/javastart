package javastart;
class aa{
	static int a=0;
	int b=0;
	{
		++a;
		b=a;
	}
	aa(){}
}
public class zz10 {
	public static void main(String[] args) {
		aa a=new aa();
		aa a1=new aa();
		aa a2=new aa();
		System.out.println(a.b);
		System.out.println(a1.b);
		System.out.println(a2.b);
		System.out.println(aa.a);//static 변수라 출력가능
		//System.out.println(aa.b);//인스턴스 변수는 출력 불가능
	}
}
