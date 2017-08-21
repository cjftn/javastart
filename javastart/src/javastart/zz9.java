package javastart;
public class zz9 {

	static int[] aa=new int[10];
	static {
		for(int i=0;i<aa.length;i++) {//aa배열이 끝날때까지
			aa[i]=(int)(Math.random()*10)+1;//10자리 램덤 정수를 저장
		}
	}


	
	public static void main(String[] args) {
	
		for(int a:aa) {//aa배열의 모든 숫자를 정수형a로 저장
			System.out.println(a);
		}
		System.out.println(Math.random()*10);//10의자리의 실수를 출력
	}
}
