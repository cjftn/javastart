package javastart;

public class zz3 {
	public static void main(String[] args) {

		ZZZ(10);
	}
	static void ZZZ(int a) {
		if(a==0) {
			return;
		}
		System.out.println(a);
		ZZZ(--a);
	}
}
