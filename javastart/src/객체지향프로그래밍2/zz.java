package 객체지향프로그래밍2;

class zz0{
	/*protected*/ int d;//클래스 명령어는 안됨
	static int a;
}
class zz1 extends zz0{//2개의 클래스는 이제 하나다!
	static int b;
}
class zz2{
	int c;
}

public class zz extends zz1{//3개의 클래스는 이제 하나다!!
	public static void main(String args[]) {
		//d=10;//클래스 변수라서 오류뜬다
		a=10;
		b=20;
		zz2 z=new zz2();
		z.c=30;//아...불편 데스
		System.out.println("a는 "+a+"그리고 b는 "+b+"그리고 c는"+z.c);
		
	}
	
}
