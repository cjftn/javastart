package javastart;

import java.text.SimpleDateFormat;
import java.util.Date;//ctrl+shift+o�� ���� �� �ʿ��� ����Ʈ ����

public class zz8 {
	public static void main(String[] args) {
		Date today=new Date();
		SimpleDateFormat date =new SimpleDateFormat("y/m/d");
		//�⵵/��/��¥
		System.out.println(date.format(today));
		System.out.println(today);
	}
}
