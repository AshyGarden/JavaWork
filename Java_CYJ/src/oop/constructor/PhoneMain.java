package oop.constructor;

public class PhoneMain {

	public static void main(String[] args) {
		
		
		Phone basic = new Phone();
		
//		basic.model = "폴더폰";
//		basic.color = "회색";
//		basic.price = 200000;	
		basic.showSpec();
		
		System.out.println("------------------------------------");
		Phone galaxy23 = new Phone("갤럭시23"); //문자열 호출o
		galaxy23.showSpec();
		
		System.out.println("------------------------------------");
		Phone iPhone14 = new Phone("아이폰14", "SpaceGrey"); //문자열 호출o
		iPhone14.showSpec();
		
	}

}
