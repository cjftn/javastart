package javastart;

public class 배수의합 {
	public static void main(String[] args) {
		
		int a=1;
		long b=0,c=0;
		for(int i=2;i<=1000;i++) {
			++a;
			if(a%3==0) {
				b+=a;
			}if(a%5==0){
				c+=a;
			}
	
		}
		System.out.println(b);
		System.out.println(c);
		System.out.println(b+c);
	}
}
