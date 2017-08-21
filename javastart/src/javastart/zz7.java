package javastart;


class xx1{
	String a;
	String b;
	int c;
	xx1(){
		this("a", "b", 4);//this.다른 생성자를 호출할대 사용
	}
	xx1(String a){
		this(a, "auto", 4);//클래스 변수 는 사용 불가
	}
	xx1(String a,String b, int c){
		this.a=a;//인스턴스 변수 호출
		this.b=b;
		this.c=c;
			
	}
}
public class zz7 {
	public static void main(String[] args) {
		xx1 z=new xx1();
		xx1 z1=new xx1("blue");
		xx1 z2=new xx1("안녕 "+"객체지향 "+10);//메소드 결정
		System.out.println(z.a+z.b+z.c);
		System.out.println(z1.a+z1.b+z1.c);
		System.out.println(z2.a+z2.b+z2.c);
	}
}

