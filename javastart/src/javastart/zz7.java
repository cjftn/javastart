package javastart;


class xx1{
	String a;
	String b;
	int c;
	xx1(){
		this("a", "b", 4);//this.�ٸ� �����ڸ� ȣ���Ҵ� ���
	}
	xx1(String a){
		this(a, "auto", 4);//Ŭ���� ���� �� ��� �Ұ�
	}
	xx1(String a,String b, int c){
		this.a=a;//�ν��Ͻ� ���� ȣ��
		this.b=b;
		this.c=c;
			
	}
}
public class zz7 {
	public static void main(String[] args) {
		xx1 z=new xx1();
		xx1 z1=new xx1("blue");
		xx1 z2=new xx1("�ȳ� "+"��ü���� "+10);//�޼ҵ� ����
		System.out.println(z.a+z.b+z.c);
		System.out.println(z1.a+z1.b+z1.c);
		System.out.println(z2.a+z2.b+z2.c);
	}
}

