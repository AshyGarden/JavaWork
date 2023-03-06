package oop.encap.good;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyBirth my = new MyBirth();
//		my.year = 200051;
		my.setYear(1994);
		my.setMonth(2);
		my.setDay(6);
		System.out.printf("내 생일은 %d년 %d월 %d일입니다. \n", my.getYear("abc1234"),my.getMonth(),my.getDay());
	}

}
