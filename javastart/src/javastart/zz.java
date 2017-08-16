package javastart;

public class zz {

	public static void main(String[] args) {
		int i[][]= {{123,456,789},{789,456,123},{147,258,369},{369,258,147}};
		int o[]= {1,2,3,4,5};
		int s=0;
		for(int e:o)
			System.out.println(e);
		for(int[] a:i) {
			for(int b:a) {
				System.out.println(b);
				s+=b;
			}
		}
		System.out.println(s);
	}

}
