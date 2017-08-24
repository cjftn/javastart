package javastart;

import java.text.SimpleDateFormat;
import java.util.Date;//ctrl+shift+o를 누를 면 필요한 임폴트 선언

public class zz8 {
	public static void main(String[] args) {
		Date today=new Date();
		SimpleDateFormat date =new SimpleDateFormat("y/m/d");
		//년도/분/날짜
		System.out.println(date.format(today));
		System.out.println(today);
	}
}
