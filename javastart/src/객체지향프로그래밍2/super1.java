package 객체지향프로그래밍2;

class super2 {
	int a;
	int x=10;
	int c=40;
	
}
class super3 extends super2{
	int x=20;
	void m(){
		System.out.println(x);
		System.out.println(this.x);//지금의 클래스 변수를 자져온다
		System.out.println(super.x);//조상 클래스의 변수를 가져온다
		System.out.println(this.x+super.x);//당근 더한다
		
		
		
		
	}
	
}

public class super1 extends super3 {
	
	public static void main(String[] args) {
		//System.out.println(super.x+ this.x);//안돼....
		super3 s=new super3();
		s.m();
		
		
		
	}

	
}
