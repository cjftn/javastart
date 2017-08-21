package javastart;

class ax{
	static int a=0;
	String b;
	ax(){
		this("없음" + ++a);
	}
	ax(String n){
		this.b=n;
		System.out.println(this.b);
	}
}
public class z11 {
	public static void main(String args[]) {
		ax a=new ax();
		ax a1=new ax("자바.txt");
		ax a2=new ax();
	}
}
