package javastart;

public class �ѱ� {
	public static void main(String[] args) {
		char[] arr = {'1', '2', '3', '4', '5'};
		for(int a=0;a<=4;a++)
			System.out.println(arr[a]);
		String a=new String(arr);
		System.out.println(a);
		char[] b=a.toCharArray();
		for(int c=0;c<=4;c++)
			System.out.println(b[c]);
		System.out.println("������ ����"+a.length());
		int ��=a.length();
		System.out.println(��);
		
	}
}
