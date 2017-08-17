package javastart;

public class zz7 {
	class zz1{
		String a;
		String b;
		int c;
		zz1(){
			this("a", "b", 4);
		}
		zz1(String a){
			this(a, "auto", 4);
		}
		zz1(String a,String b, int c){
			this.a=a;
			this.b=b;
			this.c=c;
			
		}
	}
	public static void main(String[] args) {
		//zz1 z=new zz1();
		zz1 z1=new zz1("blue");
		//System.out.println(z.a+z.b+z.c);
		System.out.println(z1.a+z1.b+z1.c);
	}
}
