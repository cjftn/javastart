package javastart;

class zzzz{
	int aa;
	int bb;
	String cc;
	String dd;
	zzzz(int a,int b,String c,String d){
		aa=a;
		bb=b;
		cc=c;
		dd=d;
	}
}

class z{
	String aa;
	String bb;
	int cc;
	z(String a,String b,int c){
		aa=a;
		bb=b;
		cc=c;
	}
}
public class zz6 {
	public static void main(String[] args) {
		zzzz zz=new zzzz(10,20,"�ȳ�","��");
		z z=new z("�ȳ�"," ��",20);
		System.out.println(z.aa+z.bb + z.cc);
		System.out.println(zz.aa+""+ zz.bb+zz.cc+zz.dd);//���ڴ� ���ع���
	}
	
	
}
