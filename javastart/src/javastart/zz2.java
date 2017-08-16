package javastart;

public class zz2 {
	public static void main(String[] args) {
		System.out.println(Zz(2,3));
		AA(4);
	}
	static int Zz(int a,int b){
		return a+b;
	}
	static void AA(int n) {
		if(n==0) {
			return ;
		}
		System.out.println(n);
		AA(n--);
	}
}
