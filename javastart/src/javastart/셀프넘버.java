package javastart;

public class ¼¿ÇÁ³Ñ¹ö {
	public static void main (String[] args) {
		int a=0,b=0;
		for(int i=0;i<=4999;++i) {
			b=i+i;
			if(b%2!=0) {
				a+=i;
			}
		}
		System.out.println(a);
	}
}
